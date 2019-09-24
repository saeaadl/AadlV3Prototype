package org.osate.graph.TokenTrace.util;

import static org.osate.aadlv3.util.AIv3API.getInstanceObjectPath;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.aadlv3.aadlv3.EOperator;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.NamedElement;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.aadlv3.util.AIv3API;
import org.osate.aadlv3.util.Aadlv3Util;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.graph.TokenTrace.Event;
import org.osate.graph.TokenTrace.EventType;
import org.osate.graph.TokenTrace.LogicOperation;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTraceFactory;

public class TokenTraceUtil {

	public static TokenTrace getTokenTrace(Token t) {
		return (TokenTrace)t.eContainer();
	}
	
	public static String buildName(InstanceObject io,  TypeReference typeref) {
		String identifier;
		if (io == null) {
			return "Null Component Reference";
		}

		identifier = getInstanceObjectPath(io);

		if (typeref == null) {
//			identifier+="-notypes";
		} else if (typeref.getType().getName() != null) {
			identifier += "-" + typeref.getType().getName();
		} else {
			identifier += "-" + Aadlv3Util.getName(typeref);
		}
//		identifier = identifier.replaceAll("\\{", "").replaceAll("\\}", "").toLowerCase();
		return identifier;
	}

	public static Token initializeToken(Token newToken, InstanceObject io, TypeReference type) {
		String name = buildName(io, type);
		newToken.setName(name);
		newToken.setRelatedInstanceObject(io);
		newToken.setRelatedType(type);
		return newToken;
	}
	
	static int uniqueCount = 0;
	
	private static String getUniqueName() {
		uniqueCount = uniqueCount+1;
		return "Event-"+uniqueCount;
	}

	public static Token createToken(TokenTrace tt, InstanceObject io, TypeReference type) {
		Token newToken = TokenTraceFactory.eINSTANCE.createToken();
		initializeToken(newToken, io, type);
		tt.getTokens().add(newToken);
		return newToken;
	}

	public static void addToken(Token parent, InstanceObject io, TypeReference type) {
		Token newToken = createToken(getTokenTrace(parent),io, type);
		getTokenTrace(parent).getTokens().add(newToken);
		parent.getTokens().add(newToken);
	}

	public static Event createEvent(TokenTrace tt, InstanceObject io, TypeReference type, EventType et) {
		Event newToken = TokenTraceFactory.eINSTANCE.createEvent();
		initializeToken(newToken, io, type);
		newToken.setType(et);
		tt.getTokens().add(newToken);
		return newToken;
	}

	public static Event createEvent(TokenTrace tt, ConstrainedInstanceObject outcio, EventType et) {
		Event newToken = TokenTraceFactory.eINSTANCE.createEvent();
		initializeToken(newToken, outcio.getInstanceObject(), (TypeReference)outcio.getConstraint());
		newToken.setType(et);
		tt.getTokens().add(newToken);
		return newToken;
	}
	
	public static Event createEvent(TokenTrace tt,ConstrainedInstanceObject outcio, MultiLiteralConstraint mlc) {
		Event newToken = TokenTraceFactory.eINSTANCE.createEvent();
		initializeToken(newToken, outcio.getInstanceObject(), (TypeReference)outcio.getConstraint() );
		newToken.setType(EventType.INTERMEDIATE);
		newToken.setOperator(mlc.getOperator());
		newToken.setK(mlc.getK());
		tt.getTokens().add(newToken);
		return newToken;
	}

	public static Event createUniqueIntermediateEvent(TokenTrace tt, EOperator op, InstanceObject io) {
		Event newToken = TokenTraceFactory.eINSTANCE.createEvent();
		newToken.setName(getUniqueName());
		newToken.setOperator(op);
		newToken.setRelatedInstanceObject(io);
		tt.getTokens().add(newToken);
		return newToken;
	}


	public static Token findToken(TokenTrace tt, ConstrainedInstanceObject cio) {
		for (Token token : tt.getTokens()) {
			if (token.getRelatedInstanceObject() == cio.getInstanceObject() && token.getRelatedType().sameAs(cio.getConstraint())) {
				return token;
			}
		}
		return null;
	}

	public static Event findSharedEventSubtree(TokenTrace tokenTrace, Iterable<Event> tokens, EOperator optype, InstanceObject io) {
		for (Token token : tokenTrace.getTokens()) {
			if (((Event) token).getType() == EventType.INTERMEDIATE && token.getOperator() == optype
					&& io == token.getRelatedInstanceObject() && !token.getTokens().isEmpty()) {
				for (Event t : tokens) {
					if (!token.getTokens().contains(t)) {
						continue;
					}
				}
				return (Event) token;
			}
		}
		return null;
	}

	public static List<Token> copy(TokenTrace tokenTrace, List<Token> alts) {
		LinkedList<Token> altscopy = new LinkedList<Token>();
		for (Token alt : alts) {
			Token newalt = EcoreUtil.copy(alt);
			altscopy.add(newalt);
			tokenTrace.getTokens().add(newalt);
		}
		return altscopy;
	}

	public static boolean sameToken(Token e1, Token e2) {
		return e1.getName().equalsIgnoreCase(e2.getName());
	}

	public static String getDescription(Token token) {
		return getInstanceDescription(token) + " " + token.getMessage() != null ? token.getMessage() : "";
	}

	public static String getInstanceDescription(Token token) {
		InstanceObject io = (InstanceObject) token.getRelatedInstanceObject();
		String description = "";
		if (io instanceof ComponentInstance) {
			description = "'" + AIv3API.getInstanceObjectPath((ComponentInstance) io) + "'";
		} else if (io instanceof AssociationInstance) {
			description = "Connection '" + ((AssociationInstance) io).getName() + "'";
		}
		return description;
	}

	
	// methods dealing with reference count in TokenTrace.
	// TokenTrace is the equivalent of a Graph
	// Should take the graph and convert to a TokenTrace object so it can be persisted and used in Sirius.
	private static void redoCount(TokenTrace tokenTrace) {
		for (Token ev : tokenTrace.getTokens()) {
			ev.setReferenceCount(0);
		}
		doCount(tokenTrace.getRoot());
	}

	private static void doCount(Token ev) {
		ev.setReferenceCount(ev.getReferenceCount() + 1);
		for (Token subev : ev.getTokens()) {
			doCount(subev);
		}
	}

	public static void removeTokenOrphans(TokenTrace tokenTrace) {
		redoCount(tokenTrace);
		List<Token> toRemove = new LinkedList<Token>();
		for (Token token : tokenTrace.getTokens()) {
			if (token.getReferenceCount() == 0) {
				toRemove.add(token);
			}
		}
		tokenTrace.getTokens().removeAll(toRemove);
	}

	public static boolean hasSharedTokens(TokenTrace tokenTrace) {
		for (Token ev : tokenTrace.getTokens()) {
			if (isASharedToken(ev)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isASharedToken(Token token) {
		return token.getReferenceCount() > 1;
	}


}

package org.osate.graph.TokenTrace.util;

import static org.osate.aadlv3.util.AIv3API.getInstanceObjectPath;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.aadlv3.aadlv3.EOperator;
import org.osate.aadlv3.aadlv3.Generator;
import org.osate.aadlv3.aadlv3.MultiLiteralConstraint;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.aadlv3.util.AIv3API;
import org.osate.aadlv3.util.Aadlv3Util;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.BehaviorRuleInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.ConstrainedInstanceObject;
import org.osate.av3instance.av3instance.FeatureInstance;
import org.osate.av3instance.av3instance.GeneratorInstance;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.av3instance.av3instance.StateInstance;
import org.osate.graph.TokenTrace.Event;
import org.osate.graph.TokenTrace.EventType;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTraceFactory;

public class TokenTraceUtil {

	public static TokenTrace getTokenTrace(Token t) {
		return (TokenTrace)t.eContainer();
	}
	
	public static String buildName(InstanceObject io,  TypeReference typeref) {
		String identifier = io!=null?getInstanceObjectPath(io):getUniqueName();

		if (typeref == null) {
			// no type added
		} else if (typeref.getType().getName() != null) {
			identifier += "-" + typeref.getType().getName();
		} else {
			identifier += "-" + Aadlv3Util.getName(typeref);
		}
		return identifier;
	}

	
	static int uniqueCount = 0;
	
	private static String getUniqueName() {
		uniqueCount = uniqueCount+1;
		return "Event_"+uniqueCount;
	}
	
	// token creation

	public static Token createToken(TokenTrace tt, InstanceObject io, TypeReference type) {
		Token newToken = TokenTraceFactory.eINSTANCE.createToken();
		String name = buildName(io, type);
		newToken.setName(name);
		newToken.setRelatedInstanceObject(io);
		newToken.setRelatedType(type);
		tt.getTokens().add(newToken);
		return newToken;
	}

	public static void addToken(Token parent, InstanceObject io, TypeReference type) {
		Token newToken = createToken(getTokenTrace(parent),io, type);
		getTokenTrace(parent).getTokens().add(newToken);
		parent.getTokens().add(newToken);
	}
	
	// Event creation

	/**
	 * create Event and initialize io and type.
	 * unique name if io is null
	 * @param tt
	 * @param io
	 * @param type
	 * @param et
	 * @return
	 */
	public static Event createEvent(TokenTrace tt, InstanceObject io, TypeReference type, EventType et) {
		Event newToken = TokenTraceFactory.eINSTANCE.createEvent();
		String name = buildName(io, type);
		newToken.setName(name);
		newToken.setType(et);
		newToken.setRelatedInstanceObject(io);
		newToken.setRelatedType(type);
		tt.getTokens().add(newToken);
		return newToken;
	}
	

// dealing with shared tokens

	public static Token findToken(TokenTrace tt, ConstrainedInstanceObject cio) {
		for (Token token : tt.getTokens()) {
			if (token.getRelatedInstanceObject() == cio.getInstanceObject() && 
					((token.getRelatedType() == null &&  cio.getConstraint() == null) || (token.getRelatedType() != null && token.getRelatedType().sameAs(cio.getConstraint())))) {
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

	

	public static BigDecimal BigZero = new BigDecimal(0.0);
	public static BigDecimal BigOne = new BigDecimal(1.0);

	/**
	 * return spec probability, i.e., probability assigned by property
	 * @param context
	 * @return
	 */
	public static String getSpecifiedProbability(EObject context) {
		Event ev = (Event) context;
		if (ev.getAssignedProbability() == null || ev.getAssignedProbability().compareTo(BigZero) == 0) {
			return "";
		}
		return String.format("%1$.1e", ev.getAssignedProbability()) + getScale(context);
	}

	/**
	 * return computed probability
	 * @param context
	 * @return
	 */
	public static String getCalculatedProbability(EObject context) {
		Event ev = (Event) context;
		if (ev.getComputedProbability() == null || ev.getComputedProbability().compareTo(BigZero) == 0) {
			return "";
		}
		return String.format("%1$.1e", ev.getComputedProbability()) + getScale(context);
	}


	// return scaling factor if different from 1.0, otherwise empty string
	public static String getScale(EObject context) {
		Event ev = (Event) context;
		if (ev.getScale() == null || ev.getScale().compareTo(BigOne) == 0) {
			return "";
		}
		return String.format(" * %1$.1f", ev.getScale());
	}
	
	public static String getInstanceDescription(Event event) {
		InstanceObject io = (InstanceObject) event.getRelatedInstanceObject();
		if (io == null) {
			return event.getName();
		}
		ComponentInstance ci = AIv3API.containingComponentInstanceOrSelf(io);
		String cipath = AIv3API.getInstanceObjectPath(ci);
		String label = io instanceof FeatureInstance ? (Aadlv3Util.isOutgoing(((FeatureInstance)io).getDirection()) ? "out" : "in"):(io instanceof StateInstance?"state":io instanceof GeneratorInstance?"event":io instanceof BehaviorRuleInstance?"rule":"");
		return io == ci ? " '" +cipath+ "'":
			" '"+cipath+"' "+label+ " '"+io.getName()+ "'";
	}


}

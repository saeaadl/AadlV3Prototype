package org.osate.aadlv3.design;

import static org.osate.aadlv3.util.AIv3API.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.osate.av3instance.av3instance.AssociationInstance;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.av3instance.av3instance.InstanceObject;
import org.osate.av3instance.av3instance.PathInstance;
import org.osate.graph.TokenTrace.TokenType;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.util.TokenTraceUtil;

/**
 * The services class used by VSM.
 */
public class Services {
    

	static String selected;
	static InstanceObject io;

	public static void setSelection(InstanceObject eo) {
		String target = getInstanceObjectPath(eo);
		if (selected != null && selected.equals(target)) {
			selected = null;
			io = null;
		} else {
			selected = getInstanceObjectPath(eo);
			io = eo;
		}
		Session session = SessionManager.INSTANCE.getSession(eo); // the semantic EObject
		TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		Command cmd = new RefreshRepresentationsCommand(domain, null, allRepresentations); // view.getOwnedRepresentations()
		domain.getCommandStack().execute(cmd);
	}

	public static boolean isSelection(InstanceObject eo) {
		return (selected != null && selected.equals(getInstanceObjectPath(eo)));
	}

	public static boolean isETEFElement(InstanceObject eo) {
		if (io instanceof PathInstance) {
			PathInstance etefi = (PathInstance) io;
			for (InstanceObject efel : etefi.getElements()) {
				if (efel == eo) {
					return true;
				}
				if (isFlowSpec(efel)) {
					if (efel.eContainer() == eo) {
						return true;
					}
				}
			}

		}
		return false;
	}
	
	public Collection<ComponentInstance> getNeighbors(ComponentInstance ci){
		 ComponentInstance root = getRoot(ci);
		 List<AssociationInstance> connis = getAllConnections(root);
		 Collection<ComponentInstance> neighbors = new ArrayList<ComponentInstance>();
		 neighbors.add(ci);
		 for (AssociationInstance conni : connis) {
				ComponentInstance srcci = containingComponentInstanceOrSelf(conni.getSource());
				ComponentInstance dstci = containingComponentInstanceOrSelf(conni.getDestination());
			if (srcci == ci) {
				neighbors.add(dstci);
			} else if (dstci == ci) {
				neighbors.add(srcci);
			}
		}
		return neighbors;
	}
	
	// Fault Graph services
	

	public Collection<Token> getTokens(EObject context) {
		Collection<Token> eventsToReturn = new ArrayList<Token>();
		if (context instanceof TokenTrace) {
			eventsToReturn.add((Token)((TokenTrace) context).getRoot());
		} else if (context instanceof Token) {
			for (Token token : ((Token) context).getTokens()) {
				eventsToReturn.add((Token)token);
			};
		}
		return eventsToReturn;
	}

	public String getTokenTarget(EObject context) {
		return TokenTraceUtil.getInstanceDescription((Token) context);
	}

	public String getPropagatedType(EObject context) {
		return TokenTraceUtil.getTokenLiteral((Token) context);
	}

	public String getSpecifiedProbability(EObject context) {
		return TokenTraceUtil.getSpecifiedProbability(context);
	}

	public String getCalculatedProbability(EObject context) {
		return TokenTraceUtil.getCalculatedProbability(context);
	}


	public String getDependentEventLabel(EObject context) {
		return TokenTraceUtil.isASharedToken((Token) context) ? "yes" : "no";
	}


	public String getTokenKindOperator(EObject context) {
		Token ev = (Token) context;
		if (ev.getTokenType() == TokenType.INTERMEDIATE) {
			if ( ev.getTokens().size() > 1) {
				return ev.getOperator().getName() ;
			} 
		}
		return ev.getTokenType().getName() ;
	}


}

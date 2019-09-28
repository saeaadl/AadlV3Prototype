package org.osate.graph.TokenTrace.util;

import static org.osate.aadlv3.util.AIv3API.getInstanceObjectPath;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.aadlv3.aadlv3.EOperator;
import org.osate.aadlv3.aadlv3.Generator;
import org.osate.aadlv3.aadlv3.Literal;
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
import org.osate.graph.TokenTrace.TokenType;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTraceFactory;

public class TokenTraceUtil {

	public static TokenTrace getTokenTrace(Token t) {
		return (TokenTrace)t.eContainer();
	}
	
	public static String buildName(InstanceObject io,  Literal typeref) {
		String identifier = io!=null?getInstanceObjectPath(io):getUniqueName();

		if (typeref == null) {
			// no type added
		} else {
			identifier += "-" + typeref.toString();
		}
		return identifier;
	}

	
	static int uniqueCount = 0;
	
	private static String getUniqueName() {
		uniqueCount = uniqueCount+1;
		return "Event_"+uniqueCount;
	}
	
	
	// Token creation

	/**
	 * create Event and initialize io and type.
	 * unique name if io is null
	 * @param tt
	 * @param io
	 * @param type
	 * @param et
	 * @return
	 */
	public static Token createToken(TokenTrace tt, InstanceObject io, Literal type, TokenType et) {
		Token newToken = TokenTraceFactory.eINSTANCE.createToken();
		String name = buildName(io, type);
		newToken.setName(name);
		newToken.setTokenType(et);
		newToken.setRelatedInstanceObject(io);
		newToken.setRelatedLiteral(type);
		tt.getTokens().add(newToken);
		return newToken;
	}
	

// dealing with shared tokens

	public static Token findToken(TokenTrace tt, InstanceObject io, Literal lit) {
		for (Token token : tt.getTokens()) {
			if (token.getRelatedInstanceObject() == io && 
					((token.getRelatedLiteral() == null &&  lit == null) || (token.getRelatedLiteral() != null && token.getRelatedLiteral().sameAs(lit)))) {
				return token;
			}
		}
		return null;
	}

	public static Token findSharedEventSubtree(TokenTrace tokenTrace, Iterable<Token> tokens, EOperator optype, InstanceObject io) {
		for (Token token : tokenTrace.getTokens()) {
			if (isIntermediate(token) && token.getOperator() == optype
					&& io == token.getRelatedInstanceObject() && !token.getTokens().isEmpty()) {
				for (Token t : tokens) {
					if (!token.getTokens().contains(t)) {
						continue;
					}
				}
				return token;
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

	public static boolean isIntermediate(Token token) {
		return !token.getTokens().isEmpty();
	}

	

	public static BigDecimal BigZero = new BigDecimal(0.0);
	public static BigDecimal BigOne = new BigDecimal(1.0);

	/**
	 * return spec probability, i.e., probability assigned by property
	 * @param context
	 * @return
	 */
	public static String getSpecifiedProbability(EObject context) {
		Token ev = (Token) context;
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
		Token ev = (Token) context;
		if (ev.getComputedProbability() == null || ev.getComputedProbability().compareTo(BigZero) == 0) {
			return "";
		}
		return String.format("%1$.1e", ev.getComputedProbability()) + getScale(context);
	}


	// return scaling factor if different from 1.0, otherwise empty string
	public static String getScale(EObject context) {
		Token ev = (Token) context;
		if (ev.getScale() == null || ev.getScale().compareTo(BigOne) == 0) {
			return "";
		}
		return String.format(" * %1$.1f", ev.getScale());
	}
	
	public static String getInstanceDescription(Token event) {
		InstanceObject io = (InstanceObject) event.getRelatedInstanceObject();
		if (io == null) {
			return event.getName();
		}
		ComponentInstance ci = AIv3API.containingComponentInstanceOrSelf(io);
		String cipath = AIv3API.getInstanceObjectPath(ci);
		String label = io instanceof FeatureInstance ? (Aadlv3Util.isOutgoing(((FeatureInstance)io).getDirection()) ? "out" : "in"):(io instanceof StateInstance?"state":io instanceof GeneratorInstance?"source":io instanceof BehaviorRuleInstance?"rule":"");
		return io == ci ? " '" +cipath+ "'":
			" '"+cipath+"' "+label+ " '"+io.getName()+ "'";
	}

	/**
	 * return sum of probabilities of direct subevents.
	 * @param event
	 * @return double
	 */
	public static BigDecimal getSubeventProbabilities(Token event) {
		if (!event.getTokens().isEmpty()) {
			switch (event.getOperator()) {
			case ALL: {
				return pANDEvents(event);
			}
			case ONEOF: {
				// P(1of(A,B,..) = SUM (PEi)*P(Ek k <>i k in 1..n)
				return p1OFEvents(event);
			}
			case ANY: {
				return pOREvents(event);
			}
			case KORMORE: {
				return pORMOREEvents(event);
			}

			default: {
				System.out.println("[Utils] Unsupported operator for now: " + event.getOperator());
				return BigOne;
			}
			}
		} else {
			return getScaledProbability(event);
		}
	}

	public static BigDecimal pOREvents(Token event) {
		// From equation (VI-17) from NRC guide, Fault Tree Handbook NUREG-0492
		// P (E1 or E2 or E3 .. En) = 1 - ( (1-P(E1)) * (1-P(E2)) * (1-P(E3)) * ... * (1-P(En)) )

		BigDecimal inverseProb = BigOne;
		for (Token subEvent : event.getTokens()) {
			inverseProb = inverseProb.multiply((BigOne.subtract(getScaledProbability(subEvent))));
		}
		return BigOne.subtract(inverseProb);
	}

	public static BigDecimal pORMOREEvents(Token event) {
		// For this computation, we use the algorithm presented in
		// "Computing k-out-of-n System Reliability", by R. E. Barlow and K. D. Heidtmann
		// in IEEE Transactions on Reliability, Vol R-33, No 4, October 1984
		//
		// The general intuition of this algorithm goes as follows, using LaTex notation for the equations
		// Conventions:
		// $q_i$ is the failure rate of component i
		// $p_i$ is the reliability rate of component i, $p_i = 1 - q_i$
		// Re(k, n) is the probability that there are exactly k working components out of n
		//
		// Borderline cases as managed by the following conventions:
		// $\forall j \in \{1 .. n\}, Re(-1, j) = Re(j+1, j) = 0$
		// $Re(0, 0) = 0$
		//
		// Barlow and Heidtmann propose the following generating function
		//
		// g(z)=\prod_{i=1}^n (q_i + p_i z)
		//
		// By recurrence, one can establish that $g(z)=\prod_{i=1}^n (q_i + p_i z)=\sum_{i=0}^ n Re(i,n) z^i$
		// using $Re(i,j) = q_j * Re(i, j - 1) + p_j * Re(i-1, j-1)$.
		//
		// It follows that computing $Re(k, n)$ for some $k \leq n$ is equivalent to computing the k-th element in the polynom
		// g (z) = \sum_{i=0}^ n g_i z^i$ and perform term identification

		// For simplicity, we implement PROGRAM 1
		// Note: to match the original algorithm, we start with index at 1, up-to index n + 1

		int n = event.getTokens().size();
		BigDecimal[] probabilities = new BigDecimal[n + 2];
		Arrays.fill(probabilities, BigDecimal.ZERO);

		BigDecimal[] A = new BigDecimal[n + 2];
		Arrays.fill(A, BigDecimal.ZERO);

		A[1] = BigOne;

		int k = 1;
		for (Token subEvent : event.getTokens()) {
			probabilities[k] = BigOne.subtract(getScaledProbability(subEvent));
			k++;
		}

		for (int j = 1; j <= n; j++) {
			for (int i = j + 1; i >= 1; i--) {
				// At each step, we perform A(i) = A(i) + P(j) * (A(i - 1) - A(i))
				A[i] = A[i].add(probabilities[j].multiply(A[i - 1].subtract(A[i])));
			}
		}

		// The associated failure probability of k or more is $1 - \Sum_{j=k}^n Re(j, n)$
		BigDecimal R = BigZero;

		for (int j = event.getK() + 1; j <= n + 1; j++) {
			R = R.add(A[j]);
		}

		R = BigOne.subtract(R);
		return R;
	}

	public static BigDecimal pANDEvents(Token event) {
		BigDecimal result = BigOne;
		for (Token subEvent : event.getTokens()) {
			result = result.multiply(getScaledProbability(subEvent));
		}
		return result;
	}

	// Sum P(Xi)*P(!Xk) for k <> i k in 1..n
	public static BigDecimal p1OFEvents(Token event) {
		BigDecimal result = BigZero;
		for (Token subEvent : event.getTokens()) {
			BigDecimal subresult = BigOne;
			for (Token notEvent : event.getTokens()) {
				if (subEvent == notEvent) {
					subresult = subresult.multiply(getScaledProbability(subEvent));
				} else {
					subresult = subresult.multiply((BigOne.subtract(getScaledProbability(subEvent))));
				}
			}
			result = result.add(subresult);
		}
		return result;
	}

	public static BigDecimal getScaledProbability(Token event) {
		return event.getProbability().multiply(event.getScale());
	}

	public static void fillProbabilities(TokenTrace tt) {
		for (Token event : tt.getTokens()) {
			EObject element = event.getRelatedInstanceObject();
			if (element instanceof InstanceObject) {
				fillProbability(event);
			}
		}

	}

	public static void computeProbabilities(Token event) {
		if (!event.getTokens().isEmpty()) {
			for (Token e : event.getTokens()) {
				computeProbabilities(e);
			}
			BigDecimal subtotalprobability = getSubeventProbabilities(event);
			event.setComputedProbability(subtotalprobability);
		}
	}

	public static void fillProbability(Token event) {
		InstanceObject io = event.getRelatedInstanceObject();
		Literal type = event.getRelatedLiteral();
		event.setAssignedProbability(
				new BigDecimal(0.1/*getProbability(io, type)*/, MathContext.UNLIMITED));
	}

}

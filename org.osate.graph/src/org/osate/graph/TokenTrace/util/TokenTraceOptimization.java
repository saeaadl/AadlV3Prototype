package org.osate.graph.TokenTrace.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.osate.aadlv3.aadlv3.EOperator;
import org.osate.aadlv3.aadlv3.TypeReference;
import org.osate.av3instance.av3instance.ComponentInstance;
import org.osate.graph.TokenTrace.TokenType;
import org.osate.graph.TokenTrace.Token;
import org.osate.graph.TokenTrace.TokenTrace;
import org.osate.graph.TokenTrace.TokenTraceType;

import static org.osate.graph.TokenTrace.util.TokenTraceUtil.*;

public class TokenTraceOptimization {
	
	private TokenTrace tt;

	public void optimizeTokenTrace(TokenTrace tt ) {
		this.tt = tt;
		Token rootEvent = tt.getRoot();
		TokenTraceType tokenTraceType = tt.getTokenTraceType();
		if (!tokenTraceType.equals(TokenTraceType.TOKEN_TRACE)
				&& !tokenTraceType.equals(TokenTraceType.COMPOSITE_PARTS)) {
			flattenGates(rootEvent);
			cleanupXORGates(rootEvent);
//		xformXORtoOR(rootEvent);
			if (tokenTraceType.equals(TokenTraceType.TOKEN_GRAPH)) {
				flattenGates(rootEvent);
				rootEvent = optimizeGates(rootEvent);
				flattenGates(rootEvent);
			}
			// remove gate with single event from root
			if (rootEvent.getTokens().size() == 1) {
				Token subevent = rootEvent.getTokens().get(0);
				if (!subevent.getTokens().isEmpty()) {
					subevent.setName(rootEvent.getName());
					subevent.setMessage(rootEvent.getMessage());
					subevent.setRelatedInstanceObject(rootEvent.getRelatedInstanceObject());
					subevent.setRelatedLiteral(rootEvent.getRelatedLiteral());
					rootEvent = subevent;
				}
			}
			if (tokenTraceType.equals(TokenTraceType.MINIMAL_CUT_SET)) {
				rootEvent = minimalCutSet(rootEvent);
			}
		}
		tt.setRoot(rootEvent);
		TokenTraceUtil.removeTokenOrphans(tt);

	}
		/**
		 * recursively flatten gates with same subgates
		 * @param rootevent
		 * @return Token original or new root event
		 */
		private void flattenGates(Token rootevent) {
			if (rootevent.getTokens().isEmpty()) {
				return;
			}
			List<Token> subEvents = rootevent.getTokens();
			for (Token event : subEvents) {
				if (!event.getTokens().isEmpty()) {
					flattenGates(event);
				}
			}
			flattenSubgates(rootevent);
			removeZeroOneEventSubGates(rootevent);
			return;
		}

		/**
		 * flatten subgates of same type into given gate
		 * @param gate
		 */
		private void flattenSubgates(Token event) {
			if (event.getTokens().isEmpty()) {
				return;
			}
			EOperator mygate = event.getOperator();
			EList<Token> subEvents = event.getTokens();
			List<Token> toAdd = new LinkedList<Token>();
			List<Token> toRemove = new LinkedList<Token>();
			for (Token se : subEvents) {
				if (!se.getTokens().isEmpty() && se.getOperator() == mygate) {
					for (Token ev : se.getTokens()) {
						toAdd.add(ev);
					}
					toRemove.add(se);
				}
			}
			if (!toRemove.isEmpty()) {
				subEvents.removeAll(toRemove);
			}
			if (!toAdd.isEmpty()) {
				subEvents.addAll(toAdd);
			}
		}

		/**
		 * remove subgates with a single Token and place Token in enclosing gate
		 * @param topgate
		 */
		private void removeZeroOneEventSubGates(Token topEvent) {
			if (topEvent.getTokens().isEmpty()) {
				return;
			}
			List<Token> subEvents = topEvent.getTokens();
			List<Token> toRemove = new LinkedList<Token>();
			List<Token> toAdd = new LinkedList<Token>();
			for (Token event : subEvents) {
				if (!event.getTokens().isEmpty()) {
					EList<Token> subs = event.getTokens();
					if (subs.size() == 1) {
						toRemove.add(event);
						toAdd.add(event.getTokens().get(0));
					} else if (subs.isEmpty()) {
						toRemove.add(event);
					}
				}
			}
			if (!toRemove.isEmpty()) {
				subEvents.removeAll(toRemove);
			}
			if (!toAdd.isEmpty()) {
				subEvents.addAll(toAdd);
			}
		}



		/**
		 * normalize graph
		 */

		private Token minimalCutSet(Token rootevent) {
			if (rootevent.getTokens().isEmpty()) {
				return rootevent;
			}
			List<Token> toAdd = new LinkedList<Token>();
			// alternatives : collection of minimal cutsets
			Token alternatives = createToken(tt,
					rootevent.getRelatedInstanceObject(), (TypeReference) rootevent.getRelatedLiteral(), TokenType.INTERMEDIATE);
			alternatives.setName("Alternatives");
			if (rootevent.getOperator() == EOperator.ONEOF) {
				alternatives.setOperator(EOperator.ONEOF);
			} else {
				alternatives.setOperator(EOperator.ANY);
			}
			if (rootevent.getOperator() == EOperator.ANY || rootevent.getOperator() == EOperator.ONEOF
					|| rootevent.getOperator() == EOperator.KORMORE
					|| isIntermediate(rootevent)) {
				for (Token alt : rootevent.getTokens()) {
					// if top-level is OR, XOR, KORMORE each of the sub-events become the starting point of a cutset
					Token alternative = createToken(tt,
							rootevent.getRelatedInstanceObject(), (TypeReference) rootevent.getRelatedLiteral(),TokenType.INTERMEDIATE);
					alternative.setOperator(EOperator.ALL);
					toAdd.add(alternative);
					// normalize each of the subevents
					normalizeEvent(alt, toAdd, alternatives);
					for (Token addMe : toAdd) {
						addAsMinimalAndSet(alternatives, addMe);
					}
					toAdd.clear();
				}
			} else if (rootevent.getOperator() == EOperator.ALL) {
				// in case of AND or P-AND we take the root as starting point
				Token alternative = createToken(tt,
						rootevent.getRelatedInstanceObject(), (TypeReference) rootevent.getRelatedLiteral(),TokenType.INTERMEDIATE);
				alternative.setOperator(EOperator.ALL);
				toAdd.add(alternative);
				normalizeEvent(rootevent, toAdd, alternatives);
				for (Token addMe : toAdd) {
					addAsMinimalAndSet(alternatives, addMe);
				}
			}
			int cutsetcount = 1;
			for (Token alt : alternatives.getTokens()) {
				alt.setName("Cutset" + cutsetcount++);
				alt.setRelatedInstanceObject(null);
			}
			return alternatives;
		}

		/**
		 * event as starting point turn everything into alternatives of ANDed events
		 * the resulting alternatives are added to the list of alternatives
		 * @param event
		 * @param alternatives
		 */
		private void normalizeEvent(Token event, List<Token> alternatives, Token existingAlternatives) {
			for (Token alternative : alternatives) {
				if (event.getScale().compareTo(TokenTraceUtil.BigOne) < 0) {
					alternative.setScale(alternative.getScale().multiply(event.getScale()));
				}
			}
			if (event.getTokens().isEmpty()) {
				// add the leaf event to all alternatives
				for (Token alternative : alternatives) {
					alternative.getTokens().add(event);
				}
				return;
			}
			if (event.getOperator() == EOperator.ALL ) {
				// in case of AND normalize each sub-event (adding it or its normalized collection)
				for (Token subevent : event.getTokens()) {
					normalizeEvent(subevent, alternatives, existingAlternatives);
				}
			} else if (event.getOperator() == EOperator.ANY || event.getOperator() == EOperator.ONEOF
					|| event.getOperator() == EOperator.KORMORE) {
				// alternatives could grow huge and copying them could easily lead to OOM error,
				// so by eager cleanup here we avoid exponential memory consumption
				minimizeAlternativesSize(alternatives, existingAlternatives);
				// for each sub-event of OR etc create a separate alternative
				List<Token> origalts = TokenTraceUtil.copy(tt, alternatives);
				boolean first = true;
				for (Token subevent : event.getTokens()) {
					if (first) {
						normalizeEvent(subevent, alternatives, existingAlternatives);
						first = false;
					} else {
						List<Token> morealts = TokenTraceUtil.copy(tt, origalts);
						normalizeEvent(subevent, morealts, existingAlternatives);
						alternatives.addAll(morealts);
					}
				}
			}
		}

		/**
		 * In some cases it's very likely that a lot of newly generated alternatives doesn't make sense in broader context of
		 * previously calculated alternatives as they will be minimized anyway,
		 * so it makes no sense to keep them as they will only slow down any further calculations
		 * @param alternatives - list of alternatives to cleanup
		 * @param existingAlternatives - global, previously minimized set of alternatives
		 */
		private void minimizeAlternativesSize(List<Token> alternatives, Token existingAlternatives) {
			List<Token> toRemove = new LinkedList<Token>();
			for (Token altEvent : alternatives) {
				for (Token matchEvent : existingAlternatives.getTokens()) {
					if (!matchEvent.getTokens().isEmpty() && !altEvent.getTokens().isEmpty()
							&& matchEvent.getOperator() == EOperator.ALL
							&& altEvent.getOperator() == EOperator.ALL) {
						if (altEvent.getTokens().containsAll(matchEvent.getTokens())) {
							toRemove.add(altEvent);
						}
					} else {
						if (matchEvent.getTokens().isEmpty() && !altEvent.getTokens().isEmpty()
								&& altEvent.getOperator() == EOperator.ALL) {
							if (altEvent.getTokens().contains(matchEvent)) {
								toRemove.add(altEvent);
							}
						} else if (altEvent.getTokens().isEmpty() && matchEvent.getTokens().isEmpty()) {
							if (matchEvent == altEvent) {// matchEvent.equals(altEvent)) {
								toRemove.add(altEvent);
							}
						}
					}
				}
			}
			if (!toRemove.isEmpty()) {
				alternatives.removeAll(toRemove);
			}
		}

		private void addAsMinimalAndSet(Token alternatives, Token altEvent) {
			EList<Token> existingAlternatives = alternatives.getTokens();
			List<Token> toRemove = new LinkedList<Token>();
			for (Token matchEvent : existingAlternatives) {
				if (!matchEvent.getTokens().isEmpty() && !altEvent.getTokens().isEmpty()
						&& matchEvent.getOperator() == EOperator.ALL
						&& altEvent.getOperator() == EOperator.ALL) {
					if (matchEvent.getTokens().containsAll(altEvent.getTokens())) {
						toRemove.add(matchEvent);
					} else if (altEvent.getTokens().containsAll(matchEvent.getTokens())) {
						return;
					}
				} else {
					if (matchEvent.getTokens().isEmpty() && !altEvent.getTokens().isEmpty()
							&& altEvent.getOperator() == EOperator.ALL) {
						if (altEvent.getTokens().contains(matchEvent)) {
							return;
						}
					} else if (altEvent.getTokens().isEmpty() && !matchEvent.getTokens().isEmpty()
							&& matchEvent.getOperator() == EOperator.ALL) {
						if (matchEvent.getTokens().contains(altEvent)) {
							toRemove.add(matchEvent);
						}
					} else if (altEvent.getTokens().isEmpty() && matchEvent.getTokens().isEmpty()) {
						if (matchEvent == altEvent) {// matchEvent.equals(altEvent)) {
							return;
						}
					}
				}
			}
			if (!toRemove.isEmpty()) {
				existingAlternatives.removeAll(toRemove);
			}
			existingAlternatives.add(altEvent);
		}

		/**
		 * recursively remove common events from subgates of XOR gates
		 * @param rootevent
		 * @return Token original or new root event
		 */
		private void cleanupXORGates(Token rootevent) {
			if (rootevent.getTokens().isEmpty()) {
				return;
			}
			List<Token> subEvents = rootevent.getTokens();
			for (Token event : subEvents) {
				if (!event.getTokens().isEmpty()) {
					cleanupXORGates(event);
				}
			}
			if (rootevent.getOperator() == EOperator.ONEOF) {
				removeCommonEventsFromSubgates(rootevent, EOperator.ANY);
			}
			return;
		}

		/**
		 * recursively remove common events from subgates of XOR gates
		 * @param rootevent
		 * @return Token original or new root event
		 */
		private void xformXORtoOR(Token rootevent) {
			if (rootevent.getTokens().isEmpty()) {
				return;
			}
			List<Token> subEvents = rootevent.getTokens();
			for (Token event : subEvents) {
				if (!event.getTokens().isEmpty()) {
					cleanupXORGates(event);
				}
			}
			if (rootevent.getOperator() == EOperator.ONEOF) {
				doXformXORtoOR(rootevent);
			}
			return;
		}

		/**
		 * recursively apply optimizations on subgates.
		 * At the end optimize gate of rootevent.
		 * This may result in a new rootevent
		 * @param rootevent
		 * @return Token original or new root event
		 */
		private Token optimizeGates(Token rootevent) {
			if (rootevent.getTokens().isEmpty()) {
				return rootevent;
			}
			String rootname = rootevent.getName();
			Token res = rootevent;
			List<Token> toAdd = new LinkedList<Token>();
			List<Token> toRemove = new LinkedList<Token>();
			res = optimizeEvent(res);
			// now we recurse to do bottom up transformation
			List<Token> subEvents = res.getTokens();
			for (Token event : subEvents) {
				if (!event.getTokens().isEmpty()) {
					Token tmp = optimizeGates(event);
					if (tmp != event) {
						toAdd.add(tmp);
						toRemove.add(event);
					}
				}
			}
			if (!toAdd.isEmpty()) {
				subEvents.removeAll(toRemove);
				subEvents.addAll(toAdd);
				flattenSubgates(res);
				removeZeroOneEventSubGates(res);
			}
			res = optimizeEvent(res);
			if (res.getTokens().size() == 1 && isIntermediate(res)) {
				res = res.getTokens().get(0);
			}
			if (!rootname.startsWith("Intermediate")) {
				res.setName(rootname);
			}
			return res;
		}

		private Token optimizeEvent(Token rootevent) {
			Token res = rootevent;
			if (res.getOperator() == EOperator.ALL ) {
				Token tmp = transformSubgates(res, EOperator.ANY, res.getOperator());
				if (tmp != res) {
					res = tmp;
					flattenSubgates(res);
					removeZeroOneEventSubGates(res);
				}
			}
			if (res.getOperator() == EOperator.ALL ) {
				Token tmp = transformSubgates(res, EOperator.ONEOF, res.getOperator());
				if (tmp != res) {
					res = tmp;
					flattenSubgates(res);
					removeZeroOneEventSubGates(res);
				}
			}
			if (res.getOperator() == EOperator.ANY || res.getOperator() == EOperator.ONEOF) {
				Token tmp = transformSubgates(res, EOperator.ALL, res.getOperator());
				if (tmp != res) {
					res = tmp;
					flattenSubgates(res);
					removeZeroOneEventSubGates(res);
				}
			}
			if (res.getOperator() == EOperator.ALL) {
				res = removeSubEventsCommonWithEnclosingEvents(res, EOperator.ALL, EOperator.ANY);
			}
			if (res.getOperator() == EOperator.ANY) {
				res = removeSubEventsCommonWithEnclosingEvents(res, EOperator.ANY, EOperator.ALL);
			}
			flattenSubgates(res);
			removeZeroOneEventSubGates(res);
			return res;
		}

		/**
		 * find common events in subgates and move them to an enclosing gate
		 * Currently does it if all of the gates of a given type have something in common.
		 * It also does it for various subsets of events with the matching gate type.
		 * Distributive Law 3a and 3b (see NRC Fault Tree Handbook page 80).
		 * @param topevent
		 * @param gt
		 * @return Event
		 */
		private Token transformSubgates(Token topevent, EOperator gt, EOperator topgt) {
			List<Token> subEvents = topevent.getTokens();
			if (subEvents.isEmpty()) {
				return topevent;
			}
			if (subEvents.size() == 1) {
				return topevent;// (Event) subEvents.get(0);
			}
			Set<Token> intersection = null;
			List<Token> todo = new LinkedList<Token>();
			while (true) {
				todo.clear();
				for (Token se : subEvents) {
					if (!se.getTokens().isEmpty() && (se.getOperator() == gt)) {
						if (intersection == null) {
							intersection = new HashSet<Token>(se.getTokens());
							todo.add(se);
						} else {
							if (intersects(intersection, se.getTokens())) {
								intersection.retainAll(se.getTokens());
								todo.add(se);
							}
						}
					}
				}
				if (todo.size() > 1 && intersection != null && !intersection.isEmpty()) {
					if (subEvents.size() == todo.size()) {
						// all subgates are involved
						// remove from lower OR and create an OR above top gate
						Token newtopevent = createToken(tt,
								topevent.getRelatedInstanceObject(),
								(TypeReference) topevent.getRelatedLiteral(),TokenType.INTERMEDIATE);
						newtopevent.setOperator(gt);
						newtopevent.getTokens().add(topevent);
						for (Token event : intersection) {
							newtopevent.getTokens().add(event);
						}
						for (Token se : todo) {
							EList<Token> rem = se.getTokens();
							rem.removeAll(intersection);
						}
						flattenSubgates(topevent);
						removeZeroOneEventSubGates(topevent);
						flattenSubgates(newtopevent);
						removeZeroOneEventSubGates(newtopevent);
						return newtopevent;
					} else {
						// transformed subtree to top gate replacing subset of events involved in transformation
						Token newtopevent = createToken(tt,
								topevent.getRelatedInstanceObject(),
								(TypeReference) topevent.getRelatedLiteral(),TokenType.INTERMEDIATE);
						newtopevent.setOperator(gt);
						topevent.getTokens().add(newtopevent);
						// remove intersection fro subset of gates
						for (Token event : intersection) {
							newtopevent.getTokens().add(event);
						}
						for (Token se : todo) {
							EList<Token> rem = se.getTokens();
							rem.removeAll(intersection);
						}
						topevent.getTokens().removeAll(todo);
						flattenSubgates(newtopevent);
						removeZeroOneEventSubGates(newtopevent);
						flattenSubgates(topevent);
						removeZeroOneEventSubGates(topevent);
						return topevent;
					}
				} else {
					flattenSubgates(topevent);
					removeZeroOneEventSubGates(topevent);
					return topevent;
				}
			}
		}

		private boolean intersects(Collection<Token> list1, Collection<Token> list2) {
			for (Token event : list2) {
				if (list1.contains(event)) {
					return true;
				}
			}
			return false;
		}

		/**
		 * find common events in subgates and remove them.
		 * This is done for an XOR gate, which should not include common events.
		 * Currently does it if all of the gates of a given type have something in common.
		 * also for various subsets of events with the matching gate type.
		 * Distributive Law 3a and 3b (se NRC Fault Tree Handbook page 80.
		 * @param topevent
		 * @param gt
		 * @return Event
		 */
		private void removeCommonEventsFromSubgates(Token topevent, EOperator gt) {
			List<Token> subEvents = topevent.getTokens();
			if (subEvents.isEmpty()) {
				return;
			}
			if (subEvents.size() == 1) {
				return;
			}
			Set<Token> intersection = null;
			List<Token> todo = new LinkedList<Token>();
			while (true) {
				todo.clear();
				for (Token se : subEvents) {
					if (!se.getTokens().isEmpty() && (se.getOperator() == gt)) {
						if (intersection == null) {
							intersection = new HashSet<Token>(se.getTokens());
							todo.add(se);
						} else {
							if (intersects(intersection, se.getTokens())) {
								intersection.retainAll(se.getTokens());
								todo.add(se);
							}
						}
					}
				}
				if (todo.size() > 1 && intersection != null && !intersection.isEmpty()) {
					if (subEvents.size() == todo.size()) {
						// all subgates are involved
						// remove from lower OR
						for (Token se : todo) {
							EList<Token> rem = se.getTokens();
							rem.removeAll(intersection);
						}
						flattenSubgates(topevent);
						removeZeroOneEventSubGates(topevent);
						return;
					} else {
						// remove intersection fro subset of gates
						for (Token se : todo) {
							EList<Token> rem = se.getTokens();
							rem.removeAll(intersection);
						}
						flattenSubgates(topevent);
						removeZeroOneEventSubGates(topevent);
					}
				} else {
					flattenSubgates(topevent);
					removeZeroOneEventSubGates(topevent);
					return;
				}
			}
		}

		/**
		 * remove shared OR from AND if also as subevent of XOR
		 * @param topevent
		 * @param gt
		 * @return Event
		 */
		private void doXformXORtoOR(Token topevent) {
			List<Token> subEvents = topevent.getTokens();
			if (subEvents.isEmpty()) {
				return;
			}
			if (subEvents.size() == 1) {
				return;
			}
			List<Token> todo = new LinkedList<Token>();
			todo.clear();
			for (Token se : subEvents) {
				if (!se.getTokens().isEmpty() && (se.getOperator() == EOperator.ANY)) {
					for (Token andevent : subEvents) {
						if (!andevent.getTokens().isEmpty() && (andevent.getOperator() == EOperator.ALL)) {
							if (andevent.getTokens().contains(se)) {
								andevent.getTokens().remove(se);
								todo.add(se);
							}
						}
					}
				}
			}
			if (todo.size() > 0) {
				topevent.setOperator(EOperator.ANY);
				topevent.getTokens().removeAll(todo);
			}
		}

		/**
		 * find subevents that contain other subevents of the topevent and remove them if they do contain one.
		 * Law of Absorption
		 * @param topevent
		 * @param gt
		 * @return Token topevent
		 */
		private Token removeSubEventsCommonWithEnclosingEvents(Token topevent, EOperator topgt, EOperator gt) {
			List<Token> subEvents = topevent.getTokens();
			if (subEvents.isEmpty()) {
				return null;
			}
			LinkedList<Token> toRemove = new LinkedList<Token>();
			for (Token se : subEvents) {
				for (Token subse : subEvents) {
					if (subse != se && !subse.getTokens().isEmpty() && (subse.getOperator() == gt)) {
						if (subse.getTokens().contains(se)) {
							toRemove.add(subse);
						} else {
							for (Token subsub : subse.getTokens()) {
								if (subsub.getOperator() == topgt) {
									if (subsub.getTokens().contains(se)) {
										if (topgt == EOperator.ANY || topgt == EOperator.ALL) {
											subsub.getTokens().remove(se);
										}
									}
								}
							}
						}
					}
				}
			}
			if (!toRemove.isEmpty()) {
				subEvents.removeAll(toRemove);
				removeZeroOneEventSubGates(topevent);
			}
			return topevent;
		}

}

package org.osate.av3instance.av3instance.util;

import org.osate.aadlv3.aadlv3.Literal;
import org.osate.av3instance.av3instance.InstanceObject;

public interface InstanceState {
	/**
	 * current error behavior state of a component
	 * Should only be set for components
	 * FOr states with error types, the type token represents the token
	 * @return
	 */
	public Literal getState();

	/**
	 * set the current error behavior state of a component
	 * @param errorBehaviorState
	 */
	public void setState(Literal state);

	/**
	 * set all elements of instance state to null
	 */
	public void unsetAll();

}

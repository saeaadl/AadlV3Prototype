package org.osate.av3instance.av3instance.util;

import org.osate.aadlv3.aadlv3.Literal;

public interface TokenRecord {
	/**
	 * Also record it in the visited history.
	 * return true if previously visited.
	 * return false if not previously visited.
	 * @param token
	 * @return
	 */
	public void setVisitLiteral(Literal token, Literal state);

	/**
	 * remove the token from the visited list
	 * @param token
	 */
	public void removeVisitedLiteral( Literal token, Literal state);

	/**
	 * returns true if type token is already in the list of visited tokens.
	 * This test will also return true if its supertype is included
	 * @param tt
	 * @return
	 */
	public boolean visited( Literal tt, Literal state);

	public void reset();

}

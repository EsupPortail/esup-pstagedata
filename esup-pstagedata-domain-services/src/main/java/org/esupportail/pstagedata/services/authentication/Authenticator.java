package org.esupportail.pstagedata.services.authentication;

import org.esupportail.pstagedata.domain.beans.User;

/**
 * The interface of authenticators.
 */
public interface Authenticator {

	/**
	 * @return the authenticated user.
	 */
	User getUser();

}
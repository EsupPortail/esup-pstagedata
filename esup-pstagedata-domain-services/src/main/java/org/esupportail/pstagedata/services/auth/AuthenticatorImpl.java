/**
 * ESUP-Portail Blank Application - Copyright (c) 2010 ESUP-Portail consortium.
 */
package org.esupportail.pstagedata.services.auth;

import java.io.Serializable;

import org.esupportail.commons.services.authentication.AuthUtils;
import org.esupportail.commons.services.authentication.AuthenticationService;
import org.esupportail.commons.services.authentication.info.AuthInfo;
import org.esupportail.commons.services.i18n.I18nUtils;
import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.commons.utils.Assert;
import org.esupportail.commons.utils.ContextUtils;
import org.esupportail.pstagedata.domain.beans.User;
import org.springframework.beans.factory.InitializingBean;


/**
 * @author Yves Deschamps (Universite de Lille 1) - 2010
 * 
 */
public class AuthenticatorImpl implements Serializable, InitializingBean,
		Authenticator {

	/**
	 * The serialization id.
	 */
	private static final long serialVersionUID = 6382142726147456592L;

	/**
	 * The session attribute to store the auth info.
	 */
	private static final String AUTH_INFO_ATTRIBUTE = AuthenticatorImpl.class
			.getName()
			+ ".authInfo";

	/**
	 * The session attribute to store the user.
	 */
	private static final String USER_ATTRIBUTE = AuthenticatorImpl.class
			.getName()
			+ ".user";

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());

	/**
	 * The external authenticator.
	 */
	private AuthenticationService authenticationService;

	/**
	 * Bean constructor.
	 */
	public AuthenticatorImpl() {
		super();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Assert.notNull(authenticationService, "property authenticationService of class "
				+ this.getClass().getName() + " can not be null");
	}

	@Override
	public User getUser() {
		try {
			AuthInfo authInfo = (AuthInfo) ContextUtils
					.getSessionAttribute(AUTH_INFO_ATTRIBUTE);
			if (authInfo != null) {
				User user = (User) ContextUtils
						.getSessionAttribute(USER_ATTRIBUTE);
				if (logger.isDebugEnabled()) {
					logger.debug("found auth info in session: " + user);
				}
				return user;
			}
			if (logger.isDebugEnabled()) {
				logger.debug("no auth info found in session");
			}
			authInfo = authenticationService.getAuthInfo();
			if (authInfo == null) {
				if (logger.isDebugEnabled()) {
					logger.debug("authInfo is null");
				}
				return null;
			}
			if (AuthUtils.SHIBBOLETH.equals(authInfo.getType())) {
				if (logger.isDebugEnabled()) {
					logger.debug("Shibboleth authentication");
				}
				User user = new User();
				user.setId(authInfo.getId());

				storeToSession(authInfo, user);
				return user;
			}
			if (AuthUtils.CAS.equals(authInfo.getType())) {
				if (logger.isDebugEnabled()) {
					logger.debug("CAS authentication");
				}
				User user = new User();
				user.setId(authInfo.getId());
				storeToSession(authInfo, user);
				return user;
			}
		} catch (Exception e) {
			logger.error(e);
			return null;
		}
		return null;
	}

	/**
	 * Store the authentication information to the session.
	 * 
	 * @param authInfo
	 * @param user
	 */
	protected void storeToSession(final AuthInfo authInfo, final User user) {
		if (logger.isDebugEnabled()) {
			logger.debug("storing to session: " + authInfo);
		}
		ContextUtils.setSessionAttribute(AUTH_INFO_ATTRIBUTE, authInfo);
		ContextUtils.setSessionAttribute(USER_ATTRIBUTE, user);
	}

	/**
	 * @param authenticationService
	 *            the authenticationService to set
	 */
	public void setAuthenticationService(
			final AuthenticationService authenticationService) {
		this.authenticationService = authenticationService;
	}

	/**
	 * @return the authenticationService
	 */

	protected AuthenticationService getAuthenticationService() {
		return authenticationService;
	}

}
///**
// * ESUP-Portail Example Application - Copyright (c) 2006 ESUP-Portail consortium
// * http://sourcesup.cru.fr/projects/esup-example
// */
//package org.esupportail.pstagedata.web.deepLinking;
//
//import java.util.Map;
//
//import org.esupportail.commons.utils.Assert;
//import org.esupportail.commons.web.deepLinking.AbstractDeepLinkingRedirector;
//import org.esupportail.pstagedata.web.controllers.SessionController;
//
///**
// * The esup-helpdesk implementation of the page redirector (for deep linking).
// */
//public class DeepLinkingRedirectorImpl extends AbstractDeepLinkingRedirector {
//	
//	/**
//	 * The serialization id.
//	 */
//	private static final long serialVersionUID = -4484064189163071618L;
//	
//	/**
//	 * The session controller.
//	 */
//	private SessionController sessionController;
//	
//	/**
//	 * Bean constructor.
//	 */
//	public DeepLinkingRedirectorImpl() {
//		super();
//	}
//
//	/**
//	 * @see org.esupportail.commons.beans.AbstractI18nAwareBean#afterPropertiesSet()
//	 */
//	@Override
//	public void afterPropertiesSet() {
//		super.afterPropertiesSet();
//		Assert.notNull(this.sessionController, "property sessionController of class " 
//				+ this.getClass().getName() + " can not be null");
//	}
//
//	/**
//	 * @see org.esupportail.commons.web.deepLinking.DeepLinkingRedirector#redirect(java.util.Map)
//	 */
//	public String redirect(
//			@SuppressWarnings("unused")
//			final Map<String, String> params) {
//		sessionController.resetSessionLocale();
//		return null;
//	}
//
//	/**
//	 * @param sessionController the sessionController to set
//	 */
//	public void setSessionController(final SessionController sessionController) {
//		this.sessionController = sessionController;
//	}
//
//}

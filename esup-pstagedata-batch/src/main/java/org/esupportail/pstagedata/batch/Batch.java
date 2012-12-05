/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.batch; 

import org.esupportail.commons.services.application.ApplicationService;
import org.esupportail.commons.services.application.ApplicationUtils;
import org.esupportail.commons.services.application.VersionningUtils;
//import org.esupportail.commons.services.database.DatabaseUtils;
import org.esupportail.commons.services.exceptionHandling.ExceptionUtils;
import org.esupportail.commons.services.i18n.I18nUtils;
import org.esupportail.commons.services.ldap.LdapUtils;
import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.commons.services.portal.PortalUtils;
import org.esupportail.commons.services.smtp.SmtpUtils;
import org.esupportail.commons.services.urlGeneration.UrlGenerationUtils;

/**
 * A class with a main method called by ant targets.
 */
public class Batch {

	/**
	 * A logger.
	 */
	private static final Logger LOG = new LoggerImpl(Batch.class);
	
	/**
	 * Bean constructor.
	 */
	private Batch() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Print the syntax and exit.
	 */
	private static void syntax() {
		throw new IllegalArgumentException(
				"syntax: " + Batch.class.getSimpleName() + " <options>"
				+ "\nwhere option can be:"
				+ "\n- test-beans: test the required beans");
	}
	
	/**
	 * Test the required beans.
	 */
	private static void testBeans() {
		//DatabaseUtils.test();
		ApplicationUtils.createApplicationService();
		I18nUtils.createI18nService();
		LdapUtils.createLdapService();
		PortalUtils.createPortalService();
		SmtpUtils.createSmtpService();
		UrlGenerationUtils.createUrlGenerator();
		VersionningUtils.createVersionningService();
	}

	/**
	 * Dispatch dependaing on the arguments.
	 * @param args
	 */
	protected static void dispatch(final String[] args) {
		switch (args.length) {
		case 0:
			syntax();
			break;
		case 1:
			if ("test-beans".equals(args[0])) {
				testBeans();
			} else {
				syntax();
			}
			break;
		default:
			syntax();
			break;
		}
	}

	/**
	 * The main method, called by ant.
	 * @param args
	 */
	public static void main(final String[] args) {
		try {
			ApplicationService applicationService = ApplicationUtils.createApplicationService();
			LOG.info(applicationService.getName() + " v" + applicationService.getVersion());
			dispatch(args);
		} catch (Throwable t) {
			ExceptionUtils.catchException(t);
		}
	}

}

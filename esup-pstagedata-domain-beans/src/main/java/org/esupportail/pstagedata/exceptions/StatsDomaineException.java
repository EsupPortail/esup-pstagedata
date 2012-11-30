package org.esupportail.pstagedata.exceptions;

/**
 * 
 *Gestion des Exceptions pour les  acces  aux domaines  statitistiques 
 *
 */
@SuppressWarnings("serial")
public class StatsDomaineException extends CoreException {
	

	/**
	 * Constructor.
	 * @param message 
	 * @param cause 
	 */
	public StatsDomaineException(final String message, final Throwable cause) {
		super(message, cause);
	}
}

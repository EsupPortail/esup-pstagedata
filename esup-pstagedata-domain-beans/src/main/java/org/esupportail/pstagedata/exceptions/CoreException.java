package org.esupportail.pstagedata.exceptions;

/**
 *  *Gestion des Exceptions pour les  acces  aux domaines  statitistiques, classe mere
 */
public  abstract class CoreException  extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	/**
	 * Constructor.
	 */
	protected CoreException() {
		super();
	}

	/**
	 * Constructor.
	 * @param message 
	 */
	protected CoreException(final String message) {
		super(message);
	}

	

	/**
	 * Constructor.
	 * @param message 
	 * @param cause 
	 */
	protected CoreException(final String message, final Throwable cause) {
		super(message, cause);
	}
}

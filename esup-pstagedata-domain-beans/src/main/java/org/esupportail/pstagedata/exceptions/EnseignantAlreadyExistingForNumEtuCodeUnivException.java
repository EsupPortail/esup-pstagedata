package org.esupportail.pstagedata.exceptions;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EnseignantAlreadyExistingForNumEtuCodeUnivException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public EnseignantAlreadyExistingForNumEtuCodeUnivException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public EnseignantAlreadyExistingForNumEtuCodeUnivException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}

package org.esupportail.pstagedata.exceptions;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class VersionEtapeAlreadyExistingForCodeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public VersionEtapeAlreadyExistingForCodeException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public VersionEtapeAlreadyExistingForCodeException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}

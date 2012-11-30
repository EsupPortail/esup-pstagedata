package org.esupportail.pstagedata.exceptions;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class UfrAlreadyExistingForCodeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public UfrAlreadyExistingForCodeException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public UfrAlreadyExistingForCodeException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}

package org.esupportail.pstagedata.exceptions;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EtapeAlreadyExistingForCodeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public EtapeAlreadyExistingForCodeException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public EtapeAlreadyExistingForCodeException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}

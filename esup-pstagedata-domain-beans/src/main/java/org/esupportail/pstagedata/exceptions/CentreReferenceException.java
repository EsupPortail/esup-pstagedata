package org.esupportail.pstagedata.exceptions;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CentreReferenceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public CentreReferenceException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public CentreReferenceException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}

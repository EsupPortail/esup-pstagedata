package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class UnvalidNumSiretException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public UnvalidNumSiretException(String msg){
		super(msg);
	}
	
	/**
	 * @param msg
	 * @param cause
	 */
	public UnvalidNumSiretException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}

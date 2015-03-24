package org.esupportail.pstagedata.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AdminStructureAccountException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public AdminStructureAccountException(String msg){
		super(msg);
	}	

	/**
	 * @param msg
	 * @param cause
	 */
	public AdminStructureAccountException(String msg, Throwable cause){
		super(msg,cause);
	}
	
}

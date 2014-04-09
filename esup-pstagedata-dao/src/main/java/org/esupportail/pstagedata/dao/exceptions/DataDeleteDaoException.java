package org.esupportail.pstagedata.dao.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class DataDeleteDaoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public DataDeleteDaoException(String msg){
		super(msg);
	}

	/**
	 * @param msg
	 * @param cause
	 */
	public DataDeleteDaoException(String msg, Throwable cause){
		super(msg,cause);
	}
}

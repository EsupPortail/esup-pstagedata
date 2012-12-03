package org.esupportail.pstagedata.dao.exceptions;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class DataUpdateDaoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @param msg
	 */
	public DataUpdateDaoException(String msg){
		super(msg);
	}

	/**
	 * @param msg
	 * @param cause
	 */
	public DataUpdateDaoException(String msg, Throwable cause){
		super(msg,cause);
	}
}

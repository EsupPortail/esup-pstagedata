package org.esupportail.pstagedata.dao.exceptions;

/**
 * 
 *Gestion des Exceptions pour les  acces  aux donnees statitistiques dao  
 *
 */
public class DataAccessDaoException extends Exception {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataAccessDaoException(String message) {
    	super(message);
        }
    
    public DataAccessDaoException(String message, Throwable cause) {
        super(message, cause);
    }

}

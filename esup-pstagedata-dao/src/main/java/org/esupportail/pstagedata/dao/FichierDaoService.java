/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Fichier;


/**
 * Fichier DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FichierDaoService extends Serializable {
	
	
	/**
	 * @param idFichier
	 * @return OffreFichier
	 */
	public Fichier getFichierFromIdFichier(int idFichier);
	
	/**
	 * @param o
	 * @return int
	 * @throws DataAddDaoException
	 * @throws DataBaseDaoException
	 */
	public int addFichier(Fichier o) throws DataAddDaoException, DataBaseDaoException;
	
	/**
	 * @param o
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateFichier(Fichier o) throws DataUpdateDaoException, DataBaseDaoException;

	/**
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean cleanFichiers() throws DataDeleteDaoException, DataBaseDaoException;
	
	/**
	 * @param idFichier
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteFichier(int idFichier) throws DataDeleteDaoException, DataBaseDaoException;
}

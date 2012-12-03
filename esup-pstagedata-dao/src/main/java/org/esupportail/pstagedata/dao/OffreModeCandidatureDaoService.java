/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;


/**
 * OffreModeCandidature DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface OffreModeCandidatureDaoService extends Serializable {
	
	/**
	 * @param idOffre
	 * @param idsModeCandidature 
	 * @return int
	 * @throws DataAddDaoException
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException
	 */
	public int addOffreModeCandidature(int idOffre, List<Integer> idsModeCandidature) throws DataAddDaoException, DataDeleteDaoException, DataBaseDaoException;
	
	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteOffreModeCandidatureFromId(int idOffre) throws DataDeleteDaoException, DataBaseDaoException;

}

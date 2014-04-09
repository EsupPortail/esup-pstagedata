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
import org.esupportail.pstagedata.domain.beans.OffreDiffusion;


/**
 * Offre Diffusion DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface OffreDiffusionDaoService extends Serializable {
	
	/**
	 * @return List<OffreDiffusion>
	 * @param idOffre	 
	 */
	public List<OffreDiffusion> getOffreDiffusionFromIdOffre(int idOffre);
	
	/**
	 * @param lod
	 * @return int
	 * @throws DataAddDaoException
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public int addOffreDiffusion(List<OffreDiffusion> lod) throws DataAddDaoException, DataDeleteDaoException, DataBaseDaoException;
	
	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteOffreDiffusionFromId(int idOffre) throws DataDeleteDaoException, DataBaseDaoException;
}

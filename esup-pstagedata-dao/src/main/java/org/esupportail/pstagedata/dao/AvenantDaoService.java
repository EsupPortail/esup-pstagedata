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
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Avenant;


/**
 * Avenant DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface AvenantDaoService extends Serializable {
	
	/**
	 * @return List<Avenant>
	 */
	public List<Avenant> getAvenant(int idConvention);
	
	/**
	 * @return int
	 */
	public int getNombreAvenant(int idConvention);
	
	/**
	 * @param a
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addAvenant(Avenant a) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param a
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateAvenant(Avenant a) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idAvenant
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteAvenant(int idAvenant) throws DataDeleteDaoException, DataBaseDaoException;
}

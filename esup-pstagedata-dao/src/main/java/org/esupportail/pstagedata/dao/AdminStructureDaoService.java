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
import org.esupportail.pstagedata.domain.beans.AdminStructure;

/**
 * AdminStructure DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface AdminStructureDaoService extends Serializable {
	
	/**
	 * @return List<AdminStructure>
	 */
	public List<AdminStructure> getAdminsStructure();
	/**
	 * @param login 
	 * @return AdminStructure
	 */
	public AdminStructure getAdminStructureFromLogin(String login);
	/**
	 * @param eppn 
	 * @return AdminStructure
	 */
	public AdminStructure getAdminStructureFromEppn(String eppn);
	/**
	 * @param admin 
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addAdminStructure(AdminStructure admin) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param admin 
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateAdminStructure(AdminStructure admin) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param admin 
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateAdminStructureDerniereConnexion(AdminStructure admin) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idAdminStructure 
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteAdminStructure(int idAdminStructure) throws DataDeleteDaoException, DataBaseDaoException;

}

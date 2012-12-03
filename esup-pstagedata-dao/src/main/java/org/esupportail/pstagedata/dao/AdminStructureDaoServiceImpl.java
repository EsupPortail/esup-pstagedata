/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.AdminStructure;
import org.springframework.dao.DataAccessException;


/**
 * AdminStructure DAO impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AdminStructureDaoServiceImpl extends AbstractIBatisDaoService implements AdminStructureDaoService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see org.esupportail.pstagedata.dao.AdminStructureDaoService#addAdminStructure(org.esupportail.pstagedata.domain.beans.AdminStructure)
	 */
	public int addAdminStructure(AdminStructure admin) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addAdminStructure",admin);
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AdminStructureDaoService#deleteAdminStructure(int)
	 */
	public boolean deleteAdminStructure(int idAdminStructure) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteAdminStructure",idAdminStructure)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AdminStructureDaoService#getAdminStructureFromEppn(java.lang.String)
	 */
	public AdminStructure getAdminStructureFromEppn(String eppn) {
		return (AdminStructure) getSqlMapClientTemplate().queryForObject("getAdminStructureFromEppn", eppn);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AdminStructureDaoService#getAdminStructureFromLogin(java.lang.String)
	 */
	public AdminStructure getAdminStructureFromLogin(String login) {
		return (AdminStructure) getSqlMapClientTemplate().queryForObject("getAdminStructureFromLogin", login);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AdminStructureDaoService#getAdminsStructure()
	 */
	@SuppressWarnings("unchecked")
	public List<AdminStructure> getAdminsStructure() {
		return getSqlMapClientTemplate().queryForList("getAdminsStructure");
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AdminStructureDaoService#updateAdminStructure(org.esupportail.pstagedata.domain.beans.AdminStructure)
	 */
	public boolean updateAdminStructure(AdminStructure admin) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateAdminStructure",admin)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.AdminStructureDaoService#updateAdminStructureDerniereConnexion(org.esupportail.pstagedata.domain.beans.AdminStructure)
	 */
	public boolean updateAdminStructureDerniereConnexion(AdminStructure admin) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateAdminStructureDerniereConnexion", admin)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

}

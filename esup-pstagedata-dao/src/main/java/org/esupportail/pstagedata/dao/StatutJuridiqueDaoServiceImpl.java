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
import org.esupportail.pstagedata.dao.exceptions.DataReactivateDaoException;
import org.esupportail.pstagedata.domain.beans.StatutJuridique;
import org.esupportail.pstagedata.exceptions.*;
import org.springframework.dao.DataAccessException;

/**
 * StatutJuridique DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StatutJuridiqueDaoServiceImpl extends AbstractIBatisDaoService implements StatutJuridiqueDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.StatutJuridiqueDaoService#getStatutsJuridiques()
	 */
	@SuppressWarnings("unchecked")
	public List<StatutJuridique> getStatutsJuridiques() {
		return getSqlMapClientTemplate().queryForList("getStatutsJuridiques");
	}

	/**
	 * @see org.esupportail.pstagedata.dao.StatutJuridiqueDaoService#getStatutJuridiqueFromTypeStructure(int)
	 */
	public StatutJuridique getStatutJuridiqueFromTypeStructure(int id) {
		return (StatutJuridique) getSqlMapClientTemplate().queryForObject("getStatutJuridiqueFromTypeStructure ", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.StatutJuridiqueDaoService#getStatutsJuridiquesFromId(int)
	 */
	public StatutJuridique getStatutsJuridiquesFromId(int id) {
		return (StatutJuridique) getSqlMapClientTemplate().queryForObject("getStatutsJuridiquesFromId ", id);
	}

	@Override
	public int addStatutJuridique(StatutJuridique sj)
			throws DataAddException, WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addStatutJuridique",sj);
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

	@Override
	public boolean updateStatutJuridique(StatutJuridique sj)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateStatutJuridique",sj)>0?true:false;
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

	@Override
	public boolean deleteStatutJuridique(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteStatutJuridique",id)>0?true:false;
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

	@Override
	public boolean reactivateStatutJuridique(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("reactivateStatutJuridique",id)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataReactivateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}


}

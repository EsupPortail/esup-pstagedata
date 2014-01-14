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
import org.esupportail.pstagedata.domain.beans.ContratOffre;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.springframework.dao.DataAccessException;

/**
 * Contrat DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContratDaoServiceImpl extends AbstractIBatisDaoService implements ContratDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return List<ContratOffre>
	 */
	@SuppressWarnings("unchecked")
	public List<ContratOffre> getContrats(){
		return getSqlMapClientTemplate().queryForList("getContratsOffre");
	}

	public int addContratOffre(ContratOffre co) throws DataAddException,
			WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addContratOffre",co);
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

	public boolean updateContratOffre(ContratOffre co)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateContratOffre",co)>0?true:false;
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

	public boolean deleteContratOffre(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteContratOffre",id)>0?true:false;
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

}

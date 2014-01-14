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
import org.esupportail.pstagedata.domain.beans.TypeConvention;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.springframework.dao.DataAccessException;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * LangueConventionDaoServiceImpl.
 */
public class TypeConventionDaoServiceImpl extends AbstractIBatisDaoService implements TypeConventionDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	/**
	 * @see org.esupportail.pstagedata.dao.TypeConventionDaoService#getTypeConventions()
	 */
	@SuppressWarnings("unchecked")
	public List<TypeConvention> getTypeConventions() {
		return getSqlMapClientTemplate().queryForList("getTypeConventions");
	}



	@Override
	public int addTypeConvention(TypeConvention tc) throws DataAddException,
			WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addTypeConvention",tc);
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
	public boolean updateTypeConvention(TypeConvention tc)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateTypeConvention",tc)>0?true:false;
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
	public boolean deleteTypeConvention(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteTypeConvention",id)>0?true:false;
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

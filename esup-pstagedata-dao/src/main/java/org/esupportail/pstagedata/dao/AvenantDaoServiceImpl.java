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
import org.esupportail.pstagedata.domain.beans.Avenant;
import org.springframework.dao.DataAccessException;


/**
 * Avenant DAO service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class AvenantDaoServiceImpl extends AbstractIBatisDaoService implements AvenantDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.AvenantDaoService#getAvenant()
	 */
	@SuppressWarnings("unchecked")
	public List<Avenant> getAvenant(int idConvention){
		return getSqlMapClientTemplate().queryForList("getAvenant", idConvention);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AvenantDaoService#getNombreAvenant()
	 */
	public int getNombreAvenant(int idConvention){
		return (Integer) getSqlMapClientTemplate().queryForObject("getNombreAvenant", idConvention);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AvenantDaoService#addAvenant(org.esupportail.pstagedata.domain.beans.Avenant)
	 */
	public int addAvenant(Avenant a)throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try {
			tmp = (Integer) getSqlMapClientTemplate().insert("addAvenant", a);
		} catch (DataAccessException e){
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
	 * @see org.esupportail.pstagedata.dao.AvenantDaoService#updateAvenant(org.esupportail.pstagedata.domain.beans.Avenant)
	 */
	public boolean updateAvenant(Avenant a)throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateAvenant",a)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.AvenantDaoService#deleteAvenant(int)
	 */
	public boolean deleteAvenant(int idAvenant) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteAvenant", idAvenant)>0?true:false;
		} catch (DataAccessException e) {
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
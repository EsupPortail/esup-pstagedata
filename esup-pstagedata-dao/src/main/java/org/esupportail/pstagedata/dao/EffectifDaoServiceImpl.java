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
import org.esupportail.pstagedata.domain.beans.Effectif;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.springframework.dao.DataAccessException;

/**
 * Effectif DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class EffectifDaoServiceImpl extends AbstractIBatisDaoService implements EffectifDaoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return List<Effectif>
	 */
	@SuppressWarnings("unchecked")
	public List<Effectif> getEffectifs(){
		return getSqlMapClientTemplate().queryForList("getEffectifs");
	}

	@Override
	public int addEffectif(Effectif ef) throws DataAddException,
	WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addEffectif",ef);
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
	public boolean updateEffectif(Effectif ef) throws DataUpdateException,
	WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateEffectif",ef)>0?true:false;
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
	public boolean deleteEffectif(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteEffectif",id)>0?true:false;
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

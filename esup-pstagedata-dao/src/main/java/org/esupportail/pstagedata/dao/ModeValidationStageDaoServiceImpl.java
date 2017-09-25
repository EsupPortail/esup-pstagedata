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
import org.esupportail.pstagedata.domain.beans.ModeValidationStage;
import org.esupportail.pstagedata.exceptions.*;
import org.springframework.dao.DataAccessException;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * ModeValidationStageDaoServiceImpl.
 */
public class ModeValidationStageDaoServiceImpl extends AbstractIBatisDaoService implements ModeValidationStageDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	/**
	 * @see org.esupportail.pstagedata.dao.ModeValidationStageDaoService#getModeValidationStages()
	 */
	@SuppressWarnings("unchecked")
	public List<ModeValidationStage> getModeValidationStages() {
		return getSqlMapClientTemplate().queryForList("getModeValidationStages");
	}

	@Override
	public boolean reactivateModeValidationStage(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b = false;
		try {
			b = getSqlMapClientTemplate().update("reactivateModeValidationStage", id) > 0;
		} catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if(error == 1452) {
				throw new DataReactivateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(),e.getCause());
		} catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(),e.getCause());
		}
		return b;
	}


	@Override
	public int addModeValidationStage(ModeValidationStage mv)
			throws DataAddException, WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addModeValidationStage",mv);
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	@Override
	public boolean updateModeValidationStage(ModeValidationStage mv)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateModeValidationStage",mv)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	@Override
	public boolean deleteModeValidationStage(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteModeValidationStage",id)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
}

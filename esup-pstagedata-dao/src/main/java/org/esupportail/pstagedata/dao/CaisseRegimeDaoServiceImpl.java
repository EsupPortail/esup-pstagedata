/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataReactivateDaoException;
import org.esupportail.pstagedata.domain.beans.CaisseRegime;
import org.esupportail.pstagedata.exceptions.*;
import org.springframework.dao.DataAccessException;

/**
 * CaisseRegimeDaoServiceImpl.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class CaisseRegimeDaoServiceImpl extends AbstractIBatisDaoService implements CaisseRegimeDaoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @see org.esupportail.pstagedata.dao.CaisseRegimeDaoService#getCaisseRegimes()
	 */
	@SuppressWarnings("unchecked")
	public List<CaisseRegime> getCaisseRegimes() {
		return getSqlMapClientTemplate().queryForList("getCaisseRegimes");
	}

	public int addCaisseRegime(CaisseRegime cr) throws WebServiceDataBaseException {
		int tmp;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addCaisseRegime",cr);
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
	
	public boolean updateCaisseRegime(CaisseRegime cr, String codeCaisse)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("code", cr.getCode());
		parameterMap.put("libelle", cr.getLibelle());
		parameterMap.put("infoCaisse", cr.getInfoCaisse());
		parameterMap.put("codeCaisse", codeCaisse);
		try{
			b = getSqlMapClientTemplate().update("updateCaisseRegime",parameterMap)>0?true:false;
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
	
	public boolean deleteCaisseRegime(String codeCaisse)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteCaisseRegime",codeCaisse)>0?true:false;
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

	public boolean reactivateCaisseRegime(String codeCaisse) throws DataReactivateException {
		boolean b = false;
		try {
			b = getSqlMapClientTemplate().update("reactivateCaisseRegime", codeCaisse) > 0;
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

}

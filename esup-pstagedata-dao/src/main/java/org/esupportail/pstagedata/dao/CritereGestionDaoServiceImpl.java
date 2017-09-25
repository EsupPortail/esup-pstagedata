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
import org.esupportail.pstagedata.domain.beans.CritereGestion;
import org.springframework.dao.DataAccessException;


/**
 * CritereGestion DAO service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CritereGestionDaoServiceImpl extends AbstractIBatisDaoService implements CritereGestionDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.CritereGestionDaoService#getCritereGestion()
	 */
	@SuppressWarnings("unchecked")
	public List<CritereGestion> getCritereGestion(){
		return getSqlMapClientTemplate().queryForList("getCritereGestion");
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CritereGestionDaoService#getCritereGestionFromIdCentre(int)
	 */
	@SuppressWarnings("unchecked")
	public List<CritereGestion> getCritereGestionFromIdCentre(int idCentreGestion){
		return  getSqlMapClientTemplate().queryForList("getCritereGestionFromIdCentre", idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CritereGestionDaoService#getCritereGestionFromIdCentreAndAnnee(int, String)
	 */
	@SuppressWarnings("unchecked")
	public List<CritereGestion> getCritereGestionFromIdCentreAndAnnee(int idCentreGestion, String anneeUniv){
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idCentreGestion", idCentreGestion);
		parameterMap.put("anneeUniv", anneeUniv);
		return getSqlMapClientTemplate().queryForList("getCritereGestionFromIdCentreAndAnnee",parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CritereGestionDaoService#getCritereGestionSansVetFromCodeEtape(String)
	 */
	public CritereGestion getCritereGestionSansVetFromCodeEtape(String codeEtape){
		return (CritereGestion) getSqlMapClientTemplate().queryForObject("getCritereGestionSansVetFromCodeEtape", codeEtape);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.CritereGestionDaoService#getNombreCritereGestion(int)
	 */
	public int getNombreCritereGestion(int idCentreGestion) {
		return (Integer) getSqlMapClientTemplate().queryForObject("getNombreCritereGestion",idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CritereGestionDaoService#addCritere(org.esupportail.pstagedata.domain.beans.CritereGestion)
	 */
	public int addCritere(CritereGestion critere)throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try {
			tmp = (Integer) getSqlMapClientTemplate().insert("addCritere", critere);
		} catch (DataAccessException e){
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
	
	/**
	 * @see org.esupportail.pstagedata.dao.CritereGestionDaoService#deleteCritere(String)
	 */
	public boolean deleteCritere(String codeCritere) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			if (codeCritere.contains(";")){
				String [] tabCodes = codeCritere.split(";");
				parameterMap.put("code", tabCodes[0]);
				parameterMap.put("codeVersionEtape", tabCodes[1]);
			} else {
				parameterMap.put("code", codeCritere);
				parameterMap.put("codeVersionEtape", null);
			}
			b = getSqlMapClientTemplate().delete("deleteCritere", parameterMap)>0?true:false;
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
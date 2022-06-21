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
import org.esupportail.pstagedata.domain.beans.Etape;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.springframework.dao.DataAccessException;
import org.springframework.util.StringUtils;

/**
 * CaisseRegimeDaoServiceImpl.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EtapeDaoServiceImpl extends AbstractIBatisDaoService implements EtapeDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	/**
	 * @see org.esupportail.pstagedata.dao.EtapeDaoService#getEtapes(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Etape> getEtapes(String codeUniversite) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getEtapes", parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.EtapeDaoService#getEtapesFromIdsCentreGestion(java.util.List, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Etape> getEtapesFromIdsCentreGestion(List<Integer> idsCentreGestion, String codeUniversite, String anneeUniv){
		if(idsCentreGestion!=null && !idsCentreGestion.isEmpty() && StringUtils.hasText(codeUniversite)){
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			parameterMap.put("idsCG", idsCentreGestion);
			parameterMap.put("codeUniversite", codeUniversite);
			parameterMap.put("anneeUniv", anneeUniv);
			return getSqlMapClientTemplate().queryForList("getEtapesFromIdsCentreGestion",parameterMap);
		}
		return null;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.EtapeDaoService#addEtape(org.esupportail.pstagedata.domain.beans.Etape)
	 */
	public int addEtape(Etape etape) throws DataAddException,
			DataAddException {
		int tmp=0;
		try{
			if(etape.getCodeUniversite()==null) etape.setCodeUniversite(" ");
			tmp = (Integer) getSqlMapClientTemplate().insert("addEtape",etape);
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			if (error == 1062) {//Duplicate entry
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
	 * @see org.esupportail.pstagedata.dao.EtapeDaoService#getEtapeFromId(java.lang.String, java.lang.String)
	 */
	public Etape getEtapeFromId(String code, String codeUniversite) {
		if(StringUtils.hasText(code) && StringUtils.hasText(codeUniversite)){
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			if (code.contains(";")){
				String [] tabCodes = code.split(";");
				parameterMap.put("code", tabCodes[0]);
				parameterMap.put("codeVersionEtape", tabCodes[1]);
			} else {
				parameterMap.put("code", code);
				parameterMap.put("codeVersionEtape", null);
			}
			parameterMap.put("codeUniversite", codeUniversite);
			return (Etape) getSqlMapClientTemplate().queryForObject("getEtapeFromId",parameterMap);
		}
		return null;
	}

	

}

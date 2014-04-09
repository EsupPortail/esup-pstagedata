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
import org.esupportail.pstagedata.domain.beans.Ufr;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.springframework.dao.DataAccessException;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * UfrDaoServiceImpl.
 */
public class UfrDaoServiceImpl extends AbstractIBatisDaoService implements UfrDaoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.UfrDaoService#getUfrs(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Ufr> getUfrs(String codeUniversite) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getUfrs", parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.UfrDaoService#getUfrsFromIdsCentreGestion(java.util.List, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Ufr> getUfrsFromIdsCentreGestion(List<Integer> idsCentreGestion, String codeUniversite){
		if(idsCentreGestion!=null && !idsCentreGestion.isEmpty()){
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			parameterMap.put("idsCG", idsCentreGestion);
			parameterMap.put("codeUniversite", codeUniversite);
			return getSqlMapClientTemplate().queryForList("getUfrsFromIdsCentreGestion",parameterMap);
		}
		return null;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.UfrDaoService#addUfr(org.esupportail.pstagedata.domain.beans.Ufr)
	 */
	public int addUfr(Ufr ufr) throws DataAddException,
	DataBaseDaoException {
		int tmp=0;
		try{
			if(ufr.getCodeUniversite()==null) ufr.setCodeUniversite(" ");
			tmp = (Integer) getSqlMapClientTemplate().insert("addUfr",ufr);
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			if (error == 1062) {//Duplicate entry
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.UfrDaoService#getUfrFromId(java.lang.String, java.lang.String)
	 */
	public Ufr getUfrFromId(String code, String codeUniversite) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("code", code);
		parameterMap.put("codeUniversite", codeUniversite);
		return (Ufr) getSqlMapClientTemplate().queryForObject("getUfrFromId",parameterMap);
	}

}

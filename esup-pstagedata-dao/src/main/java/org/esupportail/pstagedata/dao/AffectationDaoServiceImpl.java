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
import org.esupportail.pstagedata.domain.beans.Affectation;
import org.springframework.dao.DataAccessException;
import org.springframework.util.StringUtils;


/**
 * Affectation DAO service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class AffectationDaoServiceImpl extends AbstractIBatisDaoService implements AffectationDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.AffectationDaoService#getAffectation(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Affectation> getAffectation(String codeUniversite){
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getAffectation", parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AffectationDaoService#getAffectationFromCodeAffectation(java.lang.String, java.lang.String)
	 */
	public Affectation getAffectationFromCodeAffectation(String codeAffectation,String codeUniversite){
		if(StringUtils.hasText(codeUniversite)){
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			parameterMap.put("codeAffectation", codeAffectation);
			parameterMap.put("codeUniversite", codeUniversite);
			return (Affectation) getSqlMapClientTemplate().queryForObject("getAffectationFromCodeAffectation", parameterMap);
		}
		return null;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AffectationDaoService#getNombreAffectation()
	 */
	public int getNombreAffectation(){
		return (Integer) getSqlMapClientTemplate().queryForObject("getNombreAffectation");
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AffectationDaoService#addAffectation(org.esupportail.pstagedata.domain.beans.Affectation)
	 */
	public int addAffectation(Affectation a)throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try {
			if(a.getCodeUniversite()==null) a.setCodeUniversite(" ");
			tmp = (Integer) getSqlMapClientTemplate().insert("addAffectation", a);
		} catch (DataAccessException e){
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
}
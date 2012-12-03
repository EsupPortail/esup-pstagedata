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
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.PersonnelCentreGestion;
import org.springframework.dao.DataAccessException;

/**
 * PersonnelCentreGestion DAO service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class PersonnelCentreGestionDaoServiceImpl extends AbstractIBatisDaoService implements PersonnelCentreGestionDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#getPersonnelCentreGestionList(int)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<PersonnelCentreGestion> getPersonnelCentreGestionList(int idCentreGestion) {
		return (List<PersonnelCentreGestion>) getSqlMapClientTemplate().queryForList("getPersonnelCentreGestionList",idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#getNombrePersonnelCentreGestion(int)
	 */
	public int getNombrePersonnelCentreGestion(int idCentreGestion){
		return (Integer)getSqlMapClientTemplate().queryForObject("getNombrePersonnelCentreGestion",idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#getPersonnelCentreGestion(int)
	 */
	public PersonnelCentreGestion getPersonnelCentreGestion(int idPersonnelCentreGestion) {
		return (PersonnelCentreGestion) getSqlMapClientTemplate().queryForObject("getPersonnelCentreGestion",idPersonnelCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#getInterlocuteur(int)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<PersonnelCentreGestion> getInterlocuteur(int idCentreGestion){
		return (List<PersonnelCentreGestion>) getSqlMapClientTemplate().queryForList("getInterlocuteur", idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#getPersonnelCentreGestionFromIdAndCentre(int,int)
	 */
	public PersonnelCentreGestion getPersonnelCentreGestionFromIdAndCentre(int idPersonnelCentreGestion, int idCentreGestion){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idPersonnelCentreGestion", ""+idPersonnelCentreGestion);
		parameterMap.put("idCentreGestion", ""+idCentreGestion);
		return (PersonnelCentreGestion) getSqlMapClientTemplate().queryForObject("getPersonnelCentreGestionFromIdAndCentre", parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#getPersonnelCentreGestionFromUid(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings({ "unchecked", "cast" })
	public List<PersonnelCentreGestion> getPersonnelCentreGestionFromUid(String uidPersonnel,String codeUniversite) {
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("uidPersonnel", uidPersonnel);
		parameterMap.put("codeUniversite", codeUniversite);
		return (List<PersonnelCentreGestion>) getSqlMapClientTemplate().queryForList("getPersonnelCentreGestionFromUid",parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#getPersonnelCentreGestionFromNom(String,String)
	 */
	public PersonnelCentreGestion getPersonnelCentreGestionFromNom(String nom, String codeUniversite) {
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("nom", nom);
		parameterMap.put("codeUniversite", codeUniversite);
		return (PersonnelCentreGestion) getSqlMapClientTemplate().queryForObject("getPersonnelCentreGestionFromNom",parameterMap);
	}
	  
	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#addPersonnelCentreGestion(org.esupportail.pstagedata.domain.beans.PersonnelCentreGestion)
	 */
	public int addPersonnelCentreGestion(PersonnelCentreGestion pg) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			if(pg.getCodeUniversiteAffectation()==null) pg.setCodeUniversiteAffectation(" ");
			tmp = (Integer) getSqlMapClientTemplate().insert("addPersonnelCentreGestion", pg);
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
	
	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#updatePersonnelCentreGestion(org.esupportail.pstagedata.domain.beans.PersonnelCentreGestion)
	 */
	public boolean updatePersonnelCentreGestion(PersonnelCentreGestion pg) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			if(pg.getCodeUniversiteAffectation()==null) pg.setCodeUniversiteAffectation(" ");
			b = getSqlMapClientTemplate().update("updatePersonnelCentreGestion", pg)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService#deletePersonnelCentreGestion(int, int)
	 */
	public boolean deletePersonnelCentreGestion(int idCentreGestion, int idPersonnelCentreGestion) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			if (!isInterlocutor(idPersonnelCentreGestion)){
				HashMap<String, Integer> parameterMap = new HashMap<String, Integer>();
				parameterMap.put("idCentreGestion", idCentreGestion);
				parameterMap.put("idPersonnelCentreGestion", idPersonnelCentreGestion);
				b = getSqlMapClientTemplate().update("deletePersonnelCentreGestion",parameterMap)>0?true:false;
			}
		}catch (DataAccessException e) {
			if(e.getMessage().contains("Cannot delete or update")){
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	@SuppressWarnings({ "unchecked", "cast" })
	private boolean isInterlocutor(int idPersonnelCentreGestion) {
		List<Integer> listeOffres = (List<Integer>) getSqlMapClientTemplate().queryForList("getOffresForPersonnelCentreGestion", idPersonnelCentreGestion);
		if (listeOffres!=null && !listeOffres.isEmpty()){
			return true;
		}
		return false;
	}
	
}

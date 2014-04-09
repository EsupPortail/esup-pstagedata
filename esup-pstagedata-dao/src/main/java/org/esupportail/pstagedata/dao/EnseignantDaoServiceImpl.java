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
import org.esupportail.pstagedata.domain.beans.Enseignant;
import org.esupportail.pstagedata.exceptions.EnseignantAlreadyExistingForNumEtuCodeUnivException;
import org.springframework.dao.DataAccessException;

/**
 * CaisseRegimeDaoServiceImpl.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EnseignantDaoServiceImpl extends AbstractIBatisDaoService implements EnseignantDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @see org.esupportail.pstagedata.dao.EnseignantDaoService#getEnseignants(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Enseignant> getEnseignants(String codeUniversite) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getEnseignants", parameterMap);
	}



	/**
	 * @see org.esupportail.pstagedata.dao.EnseignantDaoService#addEnseignant(org.esupportail.pstagedata.domain.beans.Enseignant)
	 */
	public int addEnseignant(Enseignant enseignant) throws DataAddDaoException, DataBaseDaoException, EnseignantAlreadyExistingForNumEtuCodeUnivException {
	int tmp=0;
	try{
		if(enseignant.getCodeUniversiteAffectation()==null) enseignant.setCodeUniversiteAffectation(" ");
		tmp = (Integer) getSqlMapClientTemplate().insert("addEnseignant",enseignant);
	}catch (DataAccessException e) {
		int error = ((SQLException)e.getCause()).getErrorCode();
		if (error == 1452) {//Cannot add or update
			throw new DataAddDaoException(e.getMessage(),e.getCause());
		}
		if (error == 1062) {//Duplicate entry
			throw new EnseignantAlreadyExistingForNumEtuCodeUnivException("Enseignant deja existant pour clef ident-codeUniv : "+enseignant.getId() + " "+enseignant.getUidEnseignant() + " " + enseignant.getCodeUniversite());
		}
		throw new DataBaseDaoException(e.getMessage(), e.getCause());
	}catch (Exception e) {
		throw new DataBaseDaoException(e.getMessage(), e.getCause());
	}
	return tmp;
	}



	/**
	 * @see org.esupportail.pstagedata.dao.EnseignantDaoService#deleteEnseignant(int)
	 */
	public boolean deleteEnseignant(int idEnseignant)
			throws DataDeleteDaoException, DataBaseDaoException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteEnseignant",idEnseignant)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			// cas  e.getMessage().contains("Cannot delete or update"), code erreur 1451
			if (error == 1451) {
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}



	/**
	 * @see org.esupportail.pstagedata.dao.EnseignantDaoService#getEnseignantFromId(int)
	 */
	public Enseignant getEnseignantFromId(int id) {
		return (Enseignant) getSqlMapClientTemplate().queryForObject("getEnseignantFromId",id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.EnseignantDaoService#getNombreConventionByEnseignant(java.lang.String, java.lang.String)
	 */
	public int getNombreConventionByEnseignant(String uidEnseignant, String codeUniversite){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("uidEnseignant", uidEnseignant);
		parameterMap.put("codeUniversite", codeUniversite);
		return (Integer)getSqlMapClientTemplate().queryForObject("getNombreConventionByEnseignant",parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.EnseignantDaoService#updateEnseignant(org.esupportail.pstagedata.domain.beans.Enseignant)
	 */
	public boolean updateEnseignant(Enseignant enseignant)
			throws DataUpdateDaoException, DataBaseDaoException {
		boolean b = false;
		try{
			if(enseignant.getCodeUniversiteAffectation()==null) enseignant.setCodeUniversiteAffectation(" ");
			b = getSqlMapClientTemplate().update("updateEnseignant",enseignant)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.EnseignantDaoService#getEnseignantFromUid(java.lang.String, java.lang.String)
	 */
	public Enseignant getEnseignantFromUid(String uidEnseignant,String codeUniversite) {
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("uidEnseignant", uidEnseignant);
		parameterMap.put("codeUniversite", codeUniversite);
		return (Enseignant) getSqlMapClientTemplate().queryForObject("getEnseignantFromUid",parameterMap);
	}

	

}

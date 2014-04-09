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
import org.esupportail.pstagedata.domain.beans.Etudiant;
import org.esupportail.pstagedata.exceptions.EtudiantAlreadyExistingForNumEtuCodeUnivException;
import org.springframework.dao.DataAccessException;


/**
 * EtudiantDaoServiceImpl
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EtudiantDaoServiceImpl extends AbstractIBatisDaoService implements EtudiantDaoService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.EtudiantDaoService#addEtudiant(org.esupportail.pstagedata.domain.beans.Etudiant)
	 */
	public int addEtudiant(Etudiant etudiant) throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addEtudiant",etudiant);
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			if (error == 1062) {//Duplicate entry
				throw new EtudiantAlreadyExistingForNumEtuCodeUnivException("Etudiant deja existant pour clef ident-codeUniv : "+etudiant.getIdentEtudiant() + " "+etudiant.getCodeUniversite());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.EtudiantDaoService#deleteEtudiant(int)
	 */
	public boolean deleteEtudiant(int idEtudiant) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteEtudiant",idEtudiant)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.EtudiantDaoService#getEtudiantFromId(int)
	 */
	public Etudiant getEtudiantFromId(int id) {
		return (Etudiant) getSqlMapClientTemplate().queryForObject("getEtudiantFromId",id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.EtudiantDaoService#getEtudiants()
	 */
	@SuppressWarnings("unchecked")
	public List<Etudiant> getEtudiants() {
		return getSqlMapClientTemplate().queryForList("getEtudiants");
	}

	/**
	 * @see org.esupportail.pstagedata.dao.EtudiantDaoService#updateEtudiant(org.esupportail.pstagedata.domain.beans.Etudiant)
	 */
	public boolean updateEtudiant(Etudiant etudiant)
			throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateEtudiant",etudiant)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.EtudiantDaoService#getEtudiantFromUid(java.lang.String, java.lang.String)
	 */
	public Etudiant getEtudiantFromUid(String uidEtudiant, String codeUniversite) {
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("identEtudiant", uidEtudiant);
		parameterMap.put("codeUniversite", codeUniversite);
		return (Etudiant) getSqlMapClientTemplate().queryForObject("getEtudiantFromUid",parameterMap);
	}

}

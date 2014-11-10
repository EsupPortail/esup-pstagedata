/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.CentreGestion;
import org.springframework.dao.DataAccessException;

/**
 * Centre Gestion DAO service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CentreGestionDaoServiceImpl extends AbstractIBatisDaoService implements CentreGestionDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getIdsCentreGestionSansConfidentialiteFromCodeUniversite(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Integer> getIdsCentreGestionSansConfidentialiteFromCodeUniversite(String codeUniversite){
		return getSqlMapClientTemplate().queryForList("getIdsCentreGestionSansConfidentialiteFromCodeUniversite",codeUniversite);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentreGestionList(String)
	 */
	@SuppressWarnings("unchecked")
	public List<CentreGestion> getCentreGestionList(String codeUniversite) {
		return getSqlMapClientTemplate().queryForList("getCentreGestionList",codeUniversite);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentreGestion(int)
	 */
	public CentreGestion getCentreGestion(int idCentreGestion) {
		return (CentreGestion) getSqlMapClientTemplate().queryForObject("getCentreGestion",idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentreGestionFromNomCentre(String,String)
	 */
	public CentreGestion getCentreGestionFromNomCentre(String nomCentre, String codeUniversite) {
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("nomCentre", nomCentre);
		parameterMap.put("codeUniversite", codeUniversite);
		return (CentreGestion) getSqlMapClientTemplate().queryForObject("getCentreGestionFromNomCentre", parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getNombreCentreGestion(String)
	 */
	public int getNombreCentreGestion(String codeUniversite) {
		return (Integer) getSqlMapClientTemplate().queryForObject("getNombreCentreGestion",codeUniversite);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentreDroitEcriture(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<CentreGestion> getCentreDroitEcriture(String uidPersonnel, String codeUniversite){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("uidPersonnel", uidPersonnel);
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getCentreDroitEcriture",parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentreFromUid(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<CentreGestion> getCentreFromUid(String uidPersonnel, String codeUniversite){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("uidPersonnel", uidPersonnel);
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getCentreFromUid",parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentreEntreprise()
	 */
	public CentreGestion getCentreEntreprise(){
		return (CentreGestion) getSqlMapClientTemplate().queryForObject("getCentreEntreprise");
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentreEtablissement(java.lang.String)
	 */
	public CentreGestion getCentreEtablissement(String codeUniversite){
		return (CentreGestion) getSqlMapClientTemplate().queryForObject("getCentreEtablissement", codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentresEtablissement(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<CentreGestion> getCentresEtablissement(String codeUniversite){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getCentresEtablissement", parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#getCentreFromCritere(java.lang.String, java.lang.String)
	 */
	public CentreGestion getCentreFromCritere(String codeCritere,
			String codeUniversite) {
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		CentreGestion centre = new CentreGestion();
		
		if(codeCritere.contains(";")){
			String[] tab = codeCritere.split(";");
			codeCritere = tab[0];
			String codeVersionEtape = tab[1];
			parameterMap.put("codeCritere", codeCritere);
			parameterMap.put("codeUniversite", codeUniversite);
			parameterMap.put("codeVersionEtape", codeVersionEtape);
			centre = (CentreGestion) getSqlMapClientTemplate().queryForObject("getCentreFromCritere", parameterMap);
			if (centre != null){
				// si l'on trouve un centre a partir du couple code etape/codeVersionEtape, on renvoie le centre en question
				return centre;
			} else {
				// sinon on recherche sans le codeversionetape
				parameterMap = new HashMap<String, String>();
				
				parameterMap.put("codeCritere", codeCritere);
				parameterMap.put("codeUniversite", codeUniversite);
				parameterMap.put("codeVersionEtape", "");

				centre = (CentreGestion) getSqlMapClientTemplate().queryForObject("getCentreFromCritere", parameterMap);
			}
			
		} else {
			parameterMap.put("codeCritere", codeCritere);
			parameterMap.put("codeUniversite", codeUniversite);
			parameterMap.put("codeVersionEtape", null);
			centre = (CentreGestion) getSqlMapClientTemplate().queryForObject("getCentreFromCritere", parameterMap);
		}

		return centre;

	}	
	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#addCentreGestion(org.esupportail.pstagedata.domain.beans.CentreGestion)
	 */
	public int addCentreGestion(CentreGestion cg) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try {
			tmp = (Integer) getSqlMapClientTemplate().insert("addCentreGestion", cg);
		} catch (DataAccessException e){
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
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#updateCentreGestion(org.esupportail.pstagedata.domain.beans.CentreGestion)
	 */
	public boolean updateCentreGestion(CentreGestion cg)throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateCentreGestion",cg)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.FichierDaoService#updateIdFichier(int, int)
	 */
	public boolean updateIdFichier(int idCentreGestion, int idFichier) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		HashMap<String,Integer> parameterMap = new HashMap<String,Integer>();
		parameterMap.put("idCentreGestion", idCentreGestion);
		parameterMap.put("idFichier", idFichier);
		try{
			b = getSqlMapClientTemplate().update("updateIdFichier",parameterMap)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.FichierDaoService#setIdFichierNull(int)
	 */
	public boolean setIdFichierNull(int idCentreGestion) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("setIdFichierNull",idCentreGestion)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#deleteCentreGestion(int)
	 */
	public boolean deleteCentreGestion(int idCentreGestion) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deletePersonnelsCentreGestion", idCentreGestion)>0?true:false;
			b = getSqlMapClientTemplate().delete("deleteCentreGestion", idCentreGestion)>0?true:false;
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

	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionDaoService#centreGestionReference(int)
	 */
	public List<String> centreGestionReference (int idCentreGestion) {		
		List<String> ref = new ArrayList<String>();
		HashMap<String,Integer> parameterMap = new HashMap<String,Integer>();
		parameterMap.put("idCentreGestion", idCentreGestion);
		parameterMap.put("codeUniversite", null);
		
		Integer nbConventions = (Integer)getSqlMapClientTemplate().queryForObject("getNombreConventionByCentreGestion",parameterMap);
		Integer nbOffres = (Integer)getSqlMapClientTemplate().queryForObject("getNombreOffreByCentreGestion",parameterMap);
		Integer nbContacts = (Integer)getSqlMapClientTemplate().queryForObject("getNombreContactByCentreGestion",parameterMap);
		
		if (nbConventions != 0 && nbConventions != null){
			ref.add(nbConventions+" convention(s)");
		}
		if (nbOffres != 0 && nbOffres != null){
			ref.add(nbOffres+" offre(s)");
		}
		if (nbContacts != 0 && nbContacts != null){
			ref.add(nbContacts+" contact(s)");
		}
		
		return ref;
	}
}

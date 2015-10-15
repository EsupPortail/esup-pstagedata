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
import org.esupportail.pstagedata.domain.beans.Convention;
import org.esupportail.pstagedata.domain.beans.CritereRechercheConvention;
import org.springframework.dao.DataAccessException;
import org.springframework.util.StringUtils;


/**
 * ConventionDaoServiceImpl
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class ConventionDaoServiceImpl extends AbstractIBatisDaoService implements ConventionDaoService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#addConvention(org.esupportail.pstagedata.domain.beans.Convention)
	 */
	public int addConvention(Convention convention) throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try{
			if(convention.getCodeUniversiteUFR()==null) convention.setCodeUniversiteUFR(" ");
			if(convention.getCodeUniversiteEtape()==null) convention.setCodeUniversiteEtape(" ");
			tmp = (Integer) getSqlMapClientTemplate().insert("addConvention",convention);
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
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#deleteConvention(int)
	 */
	public boolean deleteConvention(int idConvention)
			throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteConvention",idConvention)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getConventionFromId(int)
	 */
	public Convention getConventionFromId(int id) {
		return (Convention) getSqlMapClientTemplate().queryForObject("getConventionFromId",id);
	}
	

	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getConventionsEtudiant(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Convention> getConventionsEtudiant(String identEtudiant, String codeUniversite) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("identEtudiant", identEtudiant);
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getConventionsEtudiant", parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getNombreConventionByCentreGestion(int, java.lang.String)
	 */
	public int getNombreConventionByCentreGestion(int idCentreGestion, String codeUniversite){
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idCentreGestion", idCentreGestion);
		parameterMap.put("codeUniversite", codeUniversite);
		return (Integer)getSqlMapClientTemplate().queryForObject("getNombreConventionByCentreGestion", parameterMap);
	}

	/**
	 * @param idEnseignant
	 * @param annee
	 * @return List<Convention>
	 */
	@SuppressWarnings("unchecked")
	public List<Convention> getConventionsByEnseignant(int idEnseignant, String annee) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idEnseignant", idEnseignant);
		parameterMap.put("annee", annee);
		return getSqlMapClientTemplate().queryForList("getConventionsByEnseignant", parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getAnneesConvention(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<String> getAnneesConvention(String codeUniversite){
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getAnneesConvention", parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getConventionsFromCriteres(org.esupportail.pstagedata.domain.beans.CritereRechercheConvention)
	 */
	@SuppressWarnings("unchecked")
	public List<Convention> getConventionsFromCriteres(CritereRechercheConvention critereRechercheConvention){
		if(critereRechercheConvention!=null){
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			if(critereRechercheConvention.getIdsCentreGestion()!=null) parameterMap.put("idsCG", critereRechercheConvention.getIdsCentreGestion());
			else return null;
			parameterMap.put("idC", critereRechercheConvention.getIdConvention());
			parameterMap.put("numET", critereRechercheConvention.getNumeroEtudiant());
			parameterMap.put("nET", critereRechercheConvention.getNomEtudiant());
			parameterMap.put("pET", critereRechercheConvention.getPrenomEtudiant());
			if(critereRechercheConvention.getIdsUfrs()!=null) parameterMap.put("idsUfrs", critereRechercheConvention.getIdsUfrs());
			else parameterMap.put("idsUfrs",null);
			if(critereRechercheConvention.getIdsEtapes()!=null) parameterMap.put("idsEtapes", critereRechercheConvention.getIdsEtapes());
			else parameterMap.put("idsEtapes",null);
			parameterMap.put("sC", StringUtils.hasText(critereRechercheConvention.getSujetStage())?critereRechercheConvention.getSujetStage():null);
			if(critereRechercheConvention.getTypeConvention()!=null) parameterMap.put("idTC", critereRechercheConvention.getTypeConvention().getId());
			else parameterMap.put("idTC",null);
			if(critereRechercheConvention.getTheme()!=null) parameterMap.put("idTH", critereRechercheConvention.getTheme().getId());
			else parameterMap.put("idTH",null);
			if(StringUtils.hasText(critereRechercheConvention.getNbJoursHebdo())) parameterMap.put("nbJH", critereRechercheConvention.getNbJoursHebdo());
			else parameterMap.put("nbJH",null);
			if(critereRechercheConvention.getIndemnisation()!=null) parameterMap.put("idI", critereRechercheConvention.getIndemnisation().getId());
			else parameterMap.put("idI",null);
			if(critereRechercheConvention.getTempsTravail()!=null) parameterMap.put("idTT", critereRechercheConvention.getTempsTravail().getId());
			else parameterMap.put("idTT",null);
			if(critereRechercheConvention.getLangueConvention()!=null) parameterMap.put("idLC", critereRechercheConvention.getLangueConvention().getCode());
			else parameterMap.put("idLC",null);
			if(critereRechercheConvention.getEstVerifiee()!=null) parameterMap.put("cVerif", critereRechercheConvention.getEstVerifiee().booleanValue()?"1":"0");
			else parameterMap.put("cVerif", null);
			if(critereRechercheConvention.getEstValidee()!=null) parameterMap.put("cV", critereRechercheConvention.getEstValidee().booleanValue()?"1":"0");
			else parameterMap.put("cV", null);
			parameterMap.put("dS", StringUtils.hasText(critereRechercheConvention.getDateStage())?critereRechercheConvention.getDateStage():null);
			parameterMap.put("aU", critereRechercheConvention.getAnneeUniversitaire());
			parameterMap.put("idO", critereRechercheConvention.getIdOffre());
			parameterMap.put("nE", critereRechercheConvention.getNomEnseignant());
			parameterMap.put("pE", critereRechercheConvention.getPrenomEnseignant());
			parameterMap.put("rsS", StringUtils.hasText(critereRechercheConvention.getRaisonSociale())?critereRechercheConvention.getRaisonSociale():null);
			parameterMap.put("nsS", StringUtils.hasText(critereRechercheConvention.getNumeroSiret())?critereRechercheConvention.getNumeroSiret():null);
			parameterMap.put("cmS", StringUtils.hasText(critereRechercheConvention.getCommune())?critereRechercheConvention.getCommune():null);
			parameterMap.put("cpS", StringUtils.hasText(critereRechercheConvention.getCodePostal())?critereRechercheConvention.getCodePostal():null);
			
			if (critereRechercheConvention.getEstEtrangere()) parameterMap.put("idPE", critereRechercheConvention.getPays().getId());
			else{
				if(critereRechercheConvention.getPays()!=null) parameterMap.put("idP", critereRechercheConvention.getPays().getId());
				else parameterMap.put("idP",null);
			}
			
			if(critereRechercheConvention.getTypeStructure()!=null) parameterMap.put("idTS", critereRechercheConvention.getTypeStructure().getId());
			else parameterMap.put("idTS",null);
			if(critereRechercheConvention.getStatutJuridique()!=null) parameterMap.put("idSJ", critereRechercheConvention.getStatutJuridique().getId());
			else parameterMap.put("idSJ",null);
			if(critereRechercheConvention.getEffectif()!=null) parameterMap.put("idE", critereRechercheConvention.getEffectif().getId());
			else parameterMap.put("idE",null);
			if(critereRechercheConvention.getNafN1()!=null) parameterMap.put("nafN1", critereRechercheConvention.getNafN1().getCode());
			else parameterMap.put("nafN1",null);
			parameterMap.put("isLimit",critereRechercheConvention.isLimit());
			if (StringUtils.hasText(critereRechercheConvention.getNbRechercheMaxi())) {
				parameterMap.put("nbRechercheMaxi", Integer.parseInt(critereRechercheConvention.getNbRechercheMaxi()));
			}else {
				parameterMap.put("nbRechercheMaxi","200");
			}
			return getSqlMapClientTemplate().queryForList("getConventionsFromCriteres", parameterMap);
		}
		return null;
	}
	

	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getConventionsFromCriteresByEnseignantTuteur(int, org.esupportail.pstagedata.domain.beans.CritereRechercheConvention)
	 */
	@SuppressWarnings("unchecked")
	public List<Convention> getConventionsFromCriteresByEnseignantTuteur(int idEnseignant, CritereRechercheConvention critereRechercheConvention) {
		if(critereRechercheConvention!=null){
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			parameterMap.put("idEnseignant", idEnseignant);
			parameterMap.put("idC", StringUtils.hasText(critereRechercheConvention.getIdConvention())?critereRechercheConvention.getIdConvention():null);
			parameterMap.put("numET", StringUtils.hasText(critereRechercheConvention.getNumeroEtudiant())?critereRechercheConvention.getNumeroEtudiant():null);
			parameterMap.put("nET", StringUtils.hasText(critereRechercheConvention.getNomEtudiant())?critereRechercheConvention.getNomEtudiant():null);
			parameterMap.put("pET", StringUtils.hasText(critereRechercheConvention.getPrenomEtudiant())?critereRechercheConvention.getPrenomEtudiant():null);
			if(critereRechercheConvention.getIdsUfrs()!=null) parameterMap.put("idsUfrs", critereRechercheConvention.getIdsUfrs());
			else parameterMap.put("idsUfrs",null);
			if(critereRechercheConvention.getIdsEtapes()!=null) parameterMap.put("idsEtapes", critereRechercheConvention.getIdsEtapes());
			else parameterMap.put("idsEtapes",null);
			parameterMap.put("sC", critereRechercheConvention.getSujetStage());
			if(critereRechercheConvention.getTypeConvention()!=null) parameterMap.put("idTC", critereRechercheConvention.getTypeConvention().getId());
			else parameterMap.put("idTC",null);
			if(critereRechercheConvention.getTheme()!=null) parameterMap.put("idTH", critereRechercheConvention.getTheme().getId());
			else parameterMap.put("idTH",null);
			if(StringUtils.hasText(critereRechercheConvention.getNbJoursHebdo())) parameterMap.put("nbJH", critereRechercheConvention.getNbJoursHebdo());
			else parameterMap.put("nbJH",null);
			if(critereRechercheConvention.getIndemnisation()!=null) parameterMap.put("idI", critereRechercheConvention.getIndemnisation().getId());
			else parameterMap.put("idI",null);
			if(critereRechercheConvention.getTempsTravail()!=null) parameterMap.put("idTT", critereRechercheConvention.getTempsTravail().getId());
			else parameterMap.put("idTT",null);
			if(critereRechercheConvention.getLangueConvention()!=null) parameterMap.put("idLC", critereRechercheConvention.getLangueConvention().getCode());
			else parameterMap.put("idLC",null);
			if(critereRechercheConvention.getEstVerifiee()!=null) parameterMap.put("cVerif", critereRechercheConvention.getEstVerifiee().booleanValue()?"1":"0");
			else parameterMap.put("cVerif", null);
			if(critereRechercheConvention.getEstValidee()!=null) parameterMap.put("cV", critereRechercheConvention.getEstValidee().booleanValue()?"1":"0");
			else parameterMap.put("cV", null);
			parameterMap.put("dS", StringUtils.hasText(critereRechercheConvention.getDateStage())?critereRechercheConvention.getDateStage():null);
			parameterMap.put("aU", StringUtils.hasText(critereRechercheConvention.getAnneeUniversitaire())?critereRechercheConvention.getAnneeUniversitaire():null);
			parameterMap.put("idO", StringUtils.hasText(critereRechercheConvention.getIdOffre())?critereRechercheConvention.getIdOffre():null);
			parameterMap.put("nE", StringUtils.hasText(critereRechercheConvention.getNomEnseignant())?critereRechercheConvention.getNomEnseignant():null);
			parameterMap.put("pE", StringUtils.hasText(critereRechercheConvention.getPrenomEnseignant())?critereRechercheConvention.getPrenomEnseignant():null);
			parameterMap.put("rsS", StringUtils.hasText(critereRechercheConvention.getRaisonSociale())?critereRechercheConvention.getRaisonSociale():null);
			parameterMap.put("nsS", StringUtils.hasText(critereRechercheConvention.getNumeroSiret())?critereRechercheConvention.getNumeroSiret():null);
			parameterMap.put("cmS", StringUtils.hasText(critereRechercheConvention.getCommune())?critereRechercheConvention.getCommune():null);
			parameterMap.put("cpS", StringUtils.hasText(critereRechercheConvention.getCodePostal())?critereRechercheConvention.getCodePostal():null);
			if(critereRechercheConvention.getPays()!=null) parameterMap.put("idP", critereRechercheConvention.getPays().getId());
			else parameterMap.put("idP",null);
			if(critereRechercheConvention.getTypeStructure()!=null) parameterMap.put("idTS", critereRechercheConvention.getTypeStructure().getId());
			else parameterMap.put("idTS",null);
			if(critereRechercheConvention.getStatutJuridique()!=null) parameterMap.put("idSJ", critereRechercheConvention.getStatutJuridique().getId());
			else parameterMap.put("idSJ",null);
			if(critereRechercheConvention.getEffectif()!=null) parameterMap.put("idE", critereRechercheConvention.getEffectif().getId());
			else parameterMap.put("idE",null);
			if(critereRechercheConvention.getNafN1()!=null) parameterMap.put("nafN1", critereRechercheConvention.getNafN1().getCode());
			else parameterMap.put("nafN1",null);
			parameterMap.put("isLimit",critereRechercheConvention.isLimit());
			if (StringUtils.hasText(critereRechercheConvention.getNbRechercheMaxi())) {
				parameterMap.put("nbRechercheMaxi", Integer.parseInt(critereRechercheConvention.getNbRechercheMaxi()));
			}else {
				parameterMap.put("nbRechercheMaxi","200");
			}
			return getSqlMapClientTemplate().queryForList("getConventionsFromCriteresByEnseignantTuteur", parameterMap);
		}
		return null;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getConventionsFromCriteresExport(org.esupportail.pstagedata.domain.beans.CritereRechercheConvention)
	 */
	@SuppressWarnings("unchecked")
	public List<Convention> getConventionsFromCriteresExport(CritereRechercheConvention critereRechercheConvention){
		if(critereRechercheConvention!=null){
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			if(critereRechercheConvention.getIdsCentreGestion()!=null) parameterMap.put("idsCG", critereRechercheConvention.getIdsCentreGestion());
			else return null;
			parameterMap.put("idC", critereRechercheConvention.getIdConvention());
			parameterMap.put("numET", critereRechercheConvention.getNumeroEtudiant());
			parameterMap.put("nET", critereRechercheConvention.getNomEtudiant());
			parameterMap.put("pET", critereRechercheConvention.getPrenomEtudiant());
			if(critereRechercheConvention.getIdsUfrs()!=null) parameterMap.put("idsUfrs", critereRechercheConvention.getIdsUfrs());
			else parameterMap.put("idsUfrs",null);
			if(critereRechercheConvention.getIdsEtapes()!=null) parameterMap.put("idsEtapes", critereRechercheConvention.getIdsEtapes());
			else parameterMap.put("idsEtapes",null);
			parameterMap.put("sC", critereRechercheConvention.getSujetStage());
			if(critereRechercheConvention.getTypeConvention()!=null) parameterMap.put("idTC", critereRechercheConvention.getTypeConvention().getId());
			else parameterMap.put("idTC",null);
			if(critereRechercheConvention.getTheme()!=null) parameterMap.put("idTH", critereRechercheConvention.getTheme().getId());
			else parameterMap.put("idTH",null);
			if(StringUtils.hasText(critereRechercheConvention.getNbJoursHebdo())) parameterMap.put("nbJH", critereRechercheConvention.getNbJoursHebdo());
			else parameterMap.put("nbJH",null);
			if(critereRechercheConvention.getIndemnisation()!=null) parameterMap.put("idI", critereRechercheConvention.getIndemnisation().getId());
			else parameterMap.put("idI",null);
			if(critereRechercheConvention.getTempsTravail()!=null) parameterMap.put("idTT", critereRechercheConvention.getTempsTravail().getId());
			else parameterMap.put("idTT",null);
			if(critereRechercheConvention.getLangueConvention()!=null) parameterMap.put("idLC", critereRechercheConvention.getLangueConvention().getCode());
			else parameterMap.put("idLC",null);
			if(critereRechercheConvention.getEstVerifiee()!=null) parameterMap.put("cVerif", critereRechercheConvention.getEstVerifiee().booleanValue()?"1":"0");
			else parameterMap.put("cVerif", null);
			if(critereRechercheConvention.getEstValidee()!=null) parameterMap.put("cV", critereRechercheConvention.getEstValidee().booleanValue()?"1":"0");
			else parameterMap.put("cV", null);
			parameterMap.put("dS", critereRechercheConvention.getDateStage());
			parameterMap.put("aU", critereRechercheConvention.getAnneeUniversitaire());
			parameterMap.put("idO", critereRechercheConvention.getIdOffre());
			parameterMap.put("nE", critereRechercheConvention.getNomEnseignant());
			parameterMap.put("pE", critereRechercheConvention.getPrenomEnseignant());
			parameterMap.put("rsS", critereRechercheConvention.getRaisonSociale());
			parameterMap.put("nsS", critereRechercheConvention.getNumeroSiret());
			parameterMap.put("cmS", critereRechercheConvention.getCommune());
			parameterMap.put("cpS", critereRechercheConvention.getCodePostal());
			if(critereRechercheConvention.getPays()!=null) parameterMap.put("idP", critereRechercheConvention.getPays().getId());
			else parameterMap.put("idP",null);
			if(critereRechercheConvention.getTypeStructure()!=null) parameterMap.put("idTS", critereRechercheConvention.getTypeStructure().getId());
			else parameterMap.put("idTS",null);
			if(critereRechercheConvention.getStatutJuridique()!=null) parameterMap.put("idSJ", critereRechercheConvention.getStatutJuridique().getId());
			else parameterMap.put("idSJ",null);
			if(critereRechercheConvention.getEffectif()!=null) parameterMap.put("idE", critereRechercheConvention.getEffectif().getId());
			else parameterMap.put("idE",null);
			if(critereRechercheConvention.getNafN1()!=null) parameterMap.put("nafN1", critereRechercheConvention.getNafN1().getCode());
			else parameterMap.put("nafN1",null);
			parameterMap.put("isLimit",critereRechercheConvention.isLimit());
			if (critereRechercheConvention.getNbExportMaxi()!=null) {
				parameterMap.put("nbExportMaxi", Integer.parseInt(critereRechercheConvention.getNbExportMaxi()));
			}else {
				parameterMap.put("nbExportMaxi","200");
			}
			
			List<Convention> lConv = getSqlMapClientTemplate().queryForList("getConventionsFromCriteresExport", parameterMap);
			return lConv;
		}
		return null;
	}


	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getConventionFromExport(java.util.List)
	 */
//	public Convention getConventionFromExport(int id) {
//		return (Convention) getSqlMapClientTemplate().queryForObject("getConventionFromExport",id);
//	}
	@SuppressWarnings("unchecked")
	public List<Convention> getConventionsFromExport(List<Integer> idsConventionsExport) {
		HashMap<String, Object> parameterMap = new HashMap<String,Object>();
		parameterMap.put("idsConventionsExport", idsConventionsExport);
		return getSqlMapClientTemplate().queryForList("getConventionsFromExport", parameterMap);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getConventions(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Convention> getConventions(String codeUniversite) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("codeUniversite", codeUniversite);
		return getSqlMapClientTemplate().queryForList("getConventions", parameterMap);
	}

	
	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#updateConvention(org.esupportail.pstagedata.domain.beans.Convention)
	 */
	public boolean updateConvention(Convention convention)
			throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			if(convention.getCodeUniversiteUFR()==null) convention.setCodeUniversiteUFR(" ");
			if(convention.getCodeUniversiteEtape()==null) convention.setCodeUniversiteEtape(" ");
			b = getSqlMapClientTemplate().update("updateConvention",convention)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#updateCentreConventionByUfr(java.lang.String, int, java.lang.String)
	 */
	public boolean updateCentreConventionByUfr(String code, int idCentreGestion, String codeUniversite)
			throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("code", code);
		parameterMap.put("idCentreGestion", idCentreGestion);
		parameterMap.put("codeUniversite", codeUniversite);
		try{
			b = getSqlMapClientTemplate().update("updateCentreConventionByUfr",parameterMap)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#updateCentreConventionByEtape(java.lang.String, int, java.lang.String)
	 */
	public boolean updateCentreConventionByEtape(String code, int idCentreGestion, String codeUniversite)
			throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		if (code.contains(";")){
			String [] tabCodes = code.split(";");
			parameterMap.put("code", tabCodes[0]);
			parameterMap.put("codeVersionEtape", tabCodes[1]);
		} else {
			parameterMap.put("code", code);
			parameterMap.put("codeVersionEtape", null);
		}
		parameterMap.put("idCentreGestion", idCentreGestion);
		parameterMap.put("codeUniversite", codeUniversite);
		try{
			b = getSqlMapClientTemplate().update("updateCentreConventionByEtape",parameterMap)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getCodeUFRFromCodeEtape(java.lang.String, java.lang.String)
	 */
	public String getCodeUFRFromCodeEtape(String codeEtape, String codeUniversite) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("codeEtape", codeEtape);
		parameterMap.put("codeUniversite", codeUniversite);
		return (String) getSqlMapClientTemplate().queryForObject("getCodeUFRFromCodeEtape",parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#updateConventionSetCodeVersionEtape(java.lang.String, java.lang.String)
	 */
	public boolean updateConventionSetCodeVersionEtape(String codeEtape, String codeVersionEtape) throws DataUpdateDaoException, DataBaseDaoException {
		boolean b = false;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("codeEtape", codeEtape);
		parameterMap.put("codeVersionEtape", codeVersionEtape);
		try{
			b = getSqlMapClientTemplate().update("updateConventionSetCodeVersionEtape",parameterMap)>0?true:false;
		} catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		} catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.ConventionDaoService#getNbConventionsByAnneeAndEtu(java.lang.String, java.lang.String, java.lang.String)
	 */
	public int getNbConventionsByAnneeAndEtu(String annee,
			String identEtudiant, String codeUniversite) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("annee", annee);
		parameterMap.put("identEtudiant", identEtudiant);
		parameterMap.put("codeUniversite", codeUniversite);
		return (Integer)getSqlMapClientTemplate().queryForObject("getNbConventionsByAnneeAndEtu", parameterMap);
	}
	
}

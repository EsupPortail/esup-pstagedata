/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.CritereRechercheStructureAdresse;
import org.esupportail.pstagedata.domain.beans.CritereRechercheStructureAncien;
import org.esupportail.pstagedata.domain.beans.Structure;
import org.esupportail.pstagedata.utils.Utils;
import org.springframework.dao.DataAccessException;
import org.springframework.util.StringUtils;

/**
 * Structure DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StructureDaoServiceImpl extends AbstractIBatisDaoService implements StructureDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Ajout moderation Entreprise
	/**
	 * @see org.esupportail.pstage.domain.StructureDomainService#getStructuresFromVerification(boolean)
	 */
	@SuppressWarnings({ "unchecked", "cast" })
	public List<Structure> getStructuresFromVerification(int estValidee){
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresFromVerification", estValidee);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#addStructure(org.esupportail.pstagedata.domain.beans.Structure)
	 */
	public int addStructure(Structure s) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			tmp = (Integer)getSqlMapClientTemplate().insert("addStructure", s);
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
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#deleteStructureBase(int)
	 */
	public boolean deleteStructureBase(int idStructure) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteStructureBase", idStructure)>0?true:false;
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
	
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#deleteStructure(int)
	 */
	public boolean deleteStructure(int idStructure, String loginCurrentUser) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			HashMap<String, String> parameterMap = new HashMap<String, String>();
			parameterMap.put("idStructure", ""+idStructure);
			parameterMap.put("loginCurrentUser", ""+loginCurrentUser);
			b = getSqlMapClientTemplate().update("deleteStructure", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructureFromId(int)
	 */
	public Structure getStructureFromId(int id) {
		return (Structure) getSqlMapClientTemplate().queryForObject("getStructureFromId", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructureFromIdService(int)
	 */
	public Structure getStructureFromIdService(int id) {
		return (Structure) getSqlMapClientTemplate().queryForObject("getStructureFromIdService", id);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresFromRaisonSociale(java.lang.String)
	 */
	@SuppressWarnings({ "unchecked", "cast" })
	public List<Structure> getStructuresFromRaisonSociale(String raisonSociale){
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructureFromRaisonSociale", raisonSociale);
	}

	/**
	 * @param raisonSociale
	 * @param cog
	 * @return List<Structure>
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresFromRaisonSocialeEtPays(String raisonSociale, int cog){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("raisonSociale", ""+raisonSociale);
		parameterMap.put("cog", ""+(cog==0?999999:cog));
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresFromRaisonSocialeEtPays", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresPaysEtrangerFromRaisonSociale(java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresPaysEtrangerFromRaisonSociale(String raisonSociale){
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresPaysEtrangerFromRaisonSociale", raisonSociale);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructureFromNumSiret(java.lang.String)
	 */
	public Structure getStructureFromNumSiret(String numeroSiret){
		return (Structure) getSqlMapClientTemplate().queryForObject("getStructureFromNumSiret", numeroSiret);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructureFromContactMailEntrepriseAvecCompte(java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructureFromContactMailEntrepriseAvecCompte(String mail){
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructureFromContactMailEntrepriseAvecCompte", mail);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructureAvecAccordFromId(int)
	 */
	public Structure getStructureAvecAccordFromId(int id){
		return (Structure) getSqlMapClientTemplate().queryForObject("getStructureAvecAccordFromId", id);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresFromRaisonSocialeEtDepartement(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresFromRaisonSocialeEtDepartement(String raisonSociale, String departement){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("raisonSociale", raisonSociale);
		parameterMap.put("codePostal", departement);
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresFromRaisonSocialeEtDepartement", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresFromNumSiren(java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresFromNumSiren(String numSiren){
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresFromNumSiren", numSiren);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresFromTelephone(java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresFromTelephone(String telephone){
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresFromTelephone", telephone);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresFromFax(java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresFromFax(String fax){
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresFromFax", fax);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresFromAdresse(org.esupportail.pstagedata.domain.beans.CritereRechercheStructureAdresse)
	 */
	@SuppressWarnings("unchecked")
	public List<Structure> getStructuresFromAdresse(CritereRechercheStructureAdresse c){
		if(c!=null){
			if(StringUtils.hasText(c.getRechVoie())
					|| StringUtils.hasText(c.getRechBatimentResidence())
					|| StringUtils.hasText(c.getRechVille())
					|| StringUtils.hasText(c.getCodePostal())
					|| (c.getRechPays()!=null && c.getRechPays().getId()>0)){
				HashMap<String, Object> parameterMap = new HashMap<String, Object>();
				if(StringUtils.hasText(c.getRechVoie()))parameterMap.put("voie", c.getRechVoie());
				if(StringUtils.hasText(c.getRechBatimentResidence()))parameterMap.put("batimentResidence", c.getRechBatimentResidence());
				if(StringUtils.hasText(c.getRechVille()))parameterMap.put("commune", c.getRechVille());
				if(StringUtils.hasText(c.getCodePostal()))parameterMap.put("codePostal", c.getCodePostal());
				if(c.getRechPays()!=null && c.getRechPays().getId()>0)parameterMap.put("idPays", c.getRechPays().getId());
				return getSqlMapClientTemplate().queryForList("getStructuresFromAdresse", parameterMap);
			}
		}
		return null;
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresFromNomServiceEtDepartement(java.lang.String, java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresFromNomServiceEtDepartement(String nomService, String departement){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("nom", nomService);
		parameterMap.put("codePostal", departement);
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresFromNomServiceEtDepartement", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresFromTypeStructureNafN1EtDepartement(int, java.lang.String, java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresFromTypeStructureNafN1EtDepartement(int typeStructure, String nafN1, String departement){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("typeStructure", typeStructure>0?""+typeStructure:null);
		parameterMap.put("nafN1", nafN1);
		parameterMap.put("codePostal", departement);
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresFromTypeStructureNafN1EtDepartement", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresAvecAccordAValiderFromRaisonSociale(java.lang.String, java.util.Date, java.util.Date)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresAvecAccordAValiderFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin){
		//Heure dedébut positionnée à 00:00:00 pour inclure les structures du jour actuel
		String dateD00="";
		if(dateDebut!=null){
			dateD00=Utils.convertDateToString(dateDebut, Utils.DATE_PATTERN_SQL);
			dateD00 += " 00:00:00";
		}else{
			dateD00 = Utils.DATE_YEAR2000+" 00:00:00";
		}
		//Heure de début  positionnée à 23:59:59 pour inclure les structures du jour actuel
		String dateF23="";
		if(dateFin!=null){
			dateF23=Utils.convertDateToString(dateFin, Utils.DATE_PATTERN_SQL);
			dateF23 += " 23:59:59";
		}else{
			dateF23=Utils.convertDateToString(Utils.getToday().getTime(), Utils.DATE_PATTERN_SQL);
			dateF23 += " 23:59:59";
		}
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("raisonSociale", ""+raisonSociale);
		parameterMap.put("dateDebut", dateD00);
		parameterMap.put("dateFin", dateF23);
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresAvecAccordAValiderFromRaisonSociale", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresAvecAccordValidesFromRaisonSociale(java.lang.String, java.util.Date, java.util.Date)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresAvecAccordValidesFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin){
		//Heure dedébut positionnée à 00:00:00 pour inclure les structures du jour actuel
		String dateD00="";
		if(dateDebut!=null){
			dateD00=Utils.convertDateToString(dateDebut, Utils.DATE_PATTERN_SQL);
			dateD00 += " 00:00:00";
		}else{
			dateD00 = Utils.DATE_YEAR2000+" 00:00:00";
		}
		//Heure dedébut positionnée à 23:59:59 pour inclure les structures du jour actuel
		String dateF23="";
		if(dateFin!=null){
			dateF23=Utils.convertDateToString(dateFin, Utils.DATE_PATTERN_SQL);
			dateF23 += " 23:59:59";
		}else{
			dateF23=Utils.convertDateToString(Utils.getToday().getTime(), Utils.DATE_PATTERN_SQL);
			dateF23 += " 23:59:59";
		}
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("raisonSociale", ""+raisonSociale);
		parameterMap.put("dateDebut", dateD00);
		parameterMap.put("dateFin", dateF23);
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresAvecAccordValidesFromRaisonSociale", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresSansAccordFromRaisonSociale(java.lang.String)
	 */
	@SuppressWarnings({ "cast", "unchecked" })
	public List<Structure> getStructuresSansAccordFromRaisonSociale(String raisonSociale){
		return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresSansAccordFromRaisonSociale", raisonSociale);
	}


	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#getStructuresAncien(org.esupportail.pstagedata.domain.beans.CritereRechercheStructureAncien)
	 */
	@SuppressWarnings({ "unchecked", "cast" })
	public List<Structure> getStructuresAncien(CritereRechercheStructureAncien c) {
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		if(c!=null){
			if (StringUtils.hasText(c.getRaisonSociale())) {
				parameterMap.put("raisonSociale", c.getRaisonSociale());
			}else {
				parameterMap.put("raisonSociale", null);
			}
			if (StringUtils.hasText(c.getNumeroSiret())) {
				parameterMap.put("numeroSiret", c.getNumeroSiret());
			}else {
				parameterMap.put("numeroSiret", null);
			}
			if (StringUtils.hasText(c.getCodePostal())) {
				parameterMap.put("codePostal", c.getCodePostal());
			}else {
				parameterMap.put("codePostal", null);
			}
					
			if (c.getNafN1()!=null) {
				parameterMap.put("cNAF_N1", c.getNafN1().getCode());
			}else {
				parameterMap.put("cNAF_N1", null);
			}
			if (c.getNafN5()!=null) {
				parameterMap.put("cNAF_N5", c.getNafN5().getCode());
			}else {
				parameterMap.put("cNAF_N5", null);
			}
			
			if (StringUtils.hasText(c.getDepartement())) {
				parameterMap.put("departement", c.getDepartement());
			}else {
				parameterMap.put("departement", null);
			}
			return (List<Structure>) getSqlMapClientTemplate().queryForList("getStructuresAncien", parameterMap);
		}
		return null;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#countOffreFromIdStructure(int)
	 */
	public int countOffreFromIdStructure(int id){
		return (Integer) getSqlMapClientTemplate().queryForObject("countOffreFromIdStructure", id);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#countConventionFromIdStructure(int)
	 */
	public int countConventionFromIdStructure(int id){
		return (Integer) getSqlMapClientTemplate().queryForObject("countConventionFromIdStructure", id);		
	}
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#countCompteContactFromIdStructure(int)
	 */
	public int countCompteContactFromIdStructure(int id){
		System.out.println( getSqlMapClientTemplate().queryForObject("countCompteContactFromIdStructure", id));
		return (Integer) getSqlMapClientTemplate().queryForObject("countCompteContactFromIdStructure", id);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#updateStructure(org.esupportail.pstagedata.domain.beans.Structure)
	 */
	public boolean updateStructure(Structure s) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateStructure", s)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#updateStructureInfosAJour(int, java.lang.String)
	 */
	public boolean updateStructureInfosAJour(int idStructure,
			String loginInfosAJour) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idStructure", ""+idStructure);
		parameterMap.put("loginInfosAJour", loginInfosAJour);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateStructureInfosAJour", parameterMap)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#updateStructureStopValidation(int, java.lang.String)
	 */
	public boolean updateStructureStopValidation(int idStructure,
			String loginStopValidation) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idStructure", ""+idStructure);
		parameterMap.put("loginStopValidation", loginStopValidation);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateStructureStopValidation", parameterMap)>0?true:false;
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
	 * @see org.esupportail.pstagedata.dao.StructureDaoService#updateStructureValidation(int, java.lang.String)
	 */
	public boolean updateStructureValidation(int idStructure, String loginValidation) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idStructure", ""+idStructure);
		parameterMap.put("loginValidation", loginValidation);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateStructureValidation", parameterMap)>0?true:false;
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


			
}

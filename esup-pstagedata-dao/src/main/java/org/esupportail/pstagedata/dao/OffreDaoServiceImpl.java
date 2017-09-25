/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.CentreGestion;
import org.esupportail.pstagedata.domain.beans.CritereRechercheOffre;
import org.esupportail.pstagedata.domain.beans.Offre;
import org.springframework.dao.DataAccessException;

/**
 * Offre DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class OffreDaoServiceImpl extends AbstractIBatisDaoService implements OffreDaoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * CentreGestionDaoService
	 */
	private CentreGestionDaoService centreGestionDaoService;

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#countOffreADiffuser(List)
	 */
	public int countOffreADiffuser(List<Integer> idsCentreGestion){
		int i;
		List<Integer> listeIds = idsCentreGestion;
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		CentreGestion cgEntr = this.centreGestionDaoService.getCentreEntreprise();		
		if(cgEntr!=null && cgEntr.getIdCentreGestion()>0){
			if(listeIds==null)listeIds = new ArrayList<Integer>();
			if(!listeIds.contains(cgEntr.getIdCentreGestion())){
				listeIds.add(cgEntr.getIdCentreGestion());
			}
		}
		parameterMap.put("idsCG", listeIds);
		i = (Integer)getSqlMapClientTemplate().queryForObject("countOffreADiffuser",parameterMap);
		
		return i;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#getAnneesUnivOffres()
	 */
	@SuppressWarnings("unchecked")
	public List<String> getAnneesUnivOffres() {
		return getSqlMapClientTemplate().queryForList("getAnneesUnivOffre");
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#getNombreOffreByCentreGestion(int)
	 */
	public int getNombreOffreByCentreGestion(int idCentreGestion){
		return (Integer)getSqlMapClientTemplate().queryForObject("getNombreOffreByCentreGestion", idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#addOffre(org.esupportail.pstagedata.domain.beans.Offre)
	 */
	public int addOffre(Offre o) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addOffre", o);
		}catch (DataAccessException e) {
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
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#deleteOffreLogique(int)
	 */
	public boolean deleteOffreLogique(int idOffre) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("deleteOffreLogique", idOffre)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#getOffresFromIdStructureAndIdsCentreGestion(int, java.util.List, boolean)
	 */
	@SuppressWarnings("unchecked")
	public List<Offre> getOffresFromIdStructureAndIdsCentreGestion(int idStructure, List<Integer> idsCentreGestion, boolean isEtudiant) {
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		CentreGestion cgEntr = this.centreGestionDaoService.getCentreEntreprise();		
		if(cgEntr!=null && cgEntr.getIdCentreGestion()>0){
			if(idsCentreGestion!=null && !idsCentreGestion.isEmpty()){
				//Si centre entreprise n'est pas dans la liste
				ArrayList<Integer> l = (ArrayList<Integer>) idsCentreGestion;
				if(l.size()>1 && l.contains(cgEntr.getIdCentreGestion())){
					idsCentreGestion.remove(cgEntr.getIdCentreGestion());
				}
				parameterMap.put("idCGEntr", cgEntr.getIdCentreGestion());
			}
		}else{
			parameterMap.put("idCGEntr", 0);
		}
		if(idsCentreGestion==null)return null;//Retourne null si aucun id de centre de gestion
		parameterMap.put("idStructure", Integer.toString(idStructure));
		parameterMap.put("idsCG", idsCentreGestion);
		parameterMap.put("etudiant", isEtudiant?"1":null);
		return getSqlMapClientTemplate().queryForList("getOffresFromIdStructureAndIdsCentreGestion", parameterMap);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#getOffreFromId(int)
	 */
	public Offre getOffreFromId(int id){
		return (Offre) getSqlMapClientTemplate().queryForObject("getOffreFromId", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#getOffresFromCriteres(org.esupportail.pstagedata.domain.beans.CritereRechercheOffre)
	 */
	@SuppressWarnings("unchecked")
	public List<Offre> getOffresFromCriteres(CritereRechercheOffre critereRechercheOffre){
		if(critereRechercheOffre!=null){
			HashMap<String, Object> parameterMap = new HashMap<String, Object>();
			if(critereRechercheOffre.getIdsCentreGestion()!=null && !critereRechercheOffre.getIdsCentreGestion().isEmpty()){
				if(critereRechercheOffre.isInclureOffresEntreprise()){
					CentreGestion cgEntr = this.centreGestionDaoService.getCentreEntreprise();	
					if(cgEntr!=null && cgEntr.getIdCentreGestion()>0){
						
						parameterMap.put("idCGEntr", cgEntr.getIdCentreGestion());
						
						HashMap<String, Object> parameterMapIdsOffre = new HashMap<String, Object>();
						parameterMapIdsOffre.put("idsCG", critereRechercheOffre.getIdsCentreGestion());
						List<Integer> idsOffreAExclure = getSqlMapClientTemplate().queryForList("getIdOffresEntrepriseCiblees", parameterMapIdsOffre);
						//checking 
						parameterMapIdsOffre = new HashMap<String, Object>();
						parameterMapIdsOffre.put("idsCGCheck", critereRechercheOffre.getIdsCentreGestion());
						List<Integer> idsOffreValides = getSqlMapClientTemplate().queryForList("getIdOffresEntrepriseCiblees", parameterMapIdsOffre);
						if(idsOffreValides!=null && !idsOffreValides.isEmpty()){
							if(idsOffreAExclure!=null && !idsOffreAExclure.isEmpty()){
								for(int id : idsOffreValides){
									if(idsOffreAExclure.contains(id)){
										idsOffreAExclure.remove((Object)id);
									}
								}
							}
						}
						if(idsOffreAExclure!=null && !idsOffreAExclure.isEmpty())parameterMap.put("idsOffreAExclure", idsOffreAExclure);
					}
				}else{
					parameterMap.put("idCGEntr", 0);
				}
				parameterMap.put("idsCG", critereRechercheOffre.getIdsCentreGestion());
			}else return null;//Retourne null si aucun id de centre de gestion
			if(critereRechercheOffre.getTypeOffre()!=null)parameterMap.put("idTO", critereRechercheOffre.getTypeOffre().getId());
			else parameterMap.put("idTO", null);
			if(critereRechercheOffre.getContratOffre()!=null)parameterMap.put("idCO", critereRechercheOffre.getContratOffre().getId());
			else parameterMap.put("idCO", null);
			parameterMap.put("int", critereRechercheOffre.getIntitule());
			if(critereRechercheOffre.getLieuPays()!=null)parameterMap.put("idLP", critereRechercheOffre.getLieuPays().getId());
			else parameterMap.put("idLP", null);
			parameterMap.put("lC", critereRechercheOffre.getLieuCommune());
			parameterMap.put("lCsP", critereRechercheOffre.getLieuCodesPostal());
			boolean useFAP=false;
			if(critereRechercheOffre.getFapQualificationSimplifiee()!=null){
				parameterMap.put("cFAP_S", critereRechercheOffre.getFapQualificationSimplifiee().getId());
				useFAP=true;
			}else parameterMap.put("cFAP_S", null);
			if(critereRechercheOffre.getFapN1()!=null){
				parameterMap.put("cFAP_N1", critereRechercheOffre.getFapN1().getCode());
				useFAP=true;
			}
			else parameterMap.put("cFAP_N1", null);
			if(critereRechercheOffre.getFapN2()!=null){
				parameterMap.put("cFAP_N2", critereRechercheOffre.getFapN2().getCode());
				useFAP=true;
			}
			else parameterMap.put("cFAP_N2", null);
			if(critereRechercheOffre.getFapN3()!=null){
				parameterMap.put("cFAP_N3", critereRechercheOffre.getFapN3().getCode());
				useFAP=true;
			}
			else parameterMap.put("cFAP_N3", null);
			if(useFAP) parameterMap.put("useFAP", "1");
			if(critereRechercheOffre.getNafN1()!=null)parameterMap.put("cNAF_N1", critereRechercheOffre.getNafN1().getCode());
			else parameterMap.put("cNAF_N1", null);
			if(critereRechercheOffre.getNiveauFormation()!=null)parameterMap.put("idNF", critereRechercheOffre.getNiveauFormation().getId());
			else parameterMap.put("idNF", null);
			if(critereRechercheOffre.getTypeStructure()!=null)parameterMap.put("idTS", critereRechercheOffre.getTypeStructure().getId());
			else parameterMap.put("idTS", null);
			parameterMap.put("idO", critereRechercheOffre.getIdOffre());
			//Si recherche d'un admin sur les offres supprimees, critere de suppression prend le dessus sur les criteres de diffusion
			/*if(!critereRechercheOffre.isEstSupprimee()){
				//Si recherche d'un admin sur les offres dont la diffusion est terminee, 
				//critere de diffusionTerminee prend le dessus sur le critere de validite de la diffusion
				if(!critereRechercheOffre.isDiffusionTerminee()){
					parameterMap.put("oD", critereRechercheOffre.isEstDiffusee()?"1":"0");
				}else{
					parameterMap.put("oD",null);
				}
				parameterMap.put("oDT", critereRechercheOffre.isDiffusionTerminee()?"1":"0");
			}else{
				parameterMap.put("oD",null);
				parameterMap.put("oDT",null);
			}*/
			parameterMap.put("oD", critereRechercheOffre.isEstDiffusee()?"1":"0");
			parameterMap.put("oDT", critereRechercheOffre.isDiffusionTerminee()?"1":"0");
			parameterMap.put("oS", critereRechercheOffre.isEstSupprimee()?"1":"0");
			//Si true recuperation uniquement des offres AccessERQTH + PrioERQTH
			if(critereRechercheOffre.isEstAccessERQTH()){
				parameterMap.put("oAE", critereRechercheOffre.isEstAccessERQTH()?"1":"0");
			}else{
				parameterMap.put("oAE",null);
			}
			//Si true recuperation uniquement des offres PrioERQTH
			if(critereRechercheOffre.isEstPrioERQTH()){
				parameterMap.put("oPE", critereRechercheOffre.isEstPrioERQTH()?"1":"0");
				parameterMap.put("oAE", null);
			}else{
				parameterMap.put("oPE",null);
			}
			parameterMap.put("msC", critereRechercheOffre.splitMotsCles());
			parameterMap.put("aU", critereRechercheOffre.getAnneeUniversitaire());
			parameterMap.put("oFRANCE", critereRechercheOffre.isEstFrance()?"1":"0");
			return getSqlMapClientTemplate().queryForList("getOffresFromCriteres", parameterMap);
		}
		return null;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#updateDiffusionOffre(int, java.lang.String, java.util.Date)
	 */
	public boolean updateDiffusionOffre(int idOffre, String loginDiffusion, Date dateFinDiffusion) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idOffre", Integer.toString(idOffre));
		parameterMap.put("loginDiffusion", loginDiffusion);
		parameterMap.put("dateFinDiffusion", dateFinDiffusion);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateDiffusionOffre", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#updateOffre(org.esupportail.pstagedata.domain.beans.Offre)
	 */
	public boolean updateOffre(Offre o) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateOffre", o)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#updateRejetOffre(int, java.lang.String)
	 */
	public boolean updateRejetOffre(int idOffre, String loginRejetValidation) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idOffre", Integer.toString(idOffre));
		parameterMap.put("loginRejetValidation", loginRejetValidation);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateRejetOffre", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#updateStopDiffusionOffre(int, java.lang.String)
	 */
	public boolean updateStopDiffusionOffre(int idOffre, String loginStopDiffusion) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idOffre", Integer.toString(idOffre));
		parameterMap.put("loginStopDiffusion", loginStopDiffusion);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateStopDiffusionOffre", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#updateStopValidationOffre(int, java.lang.String)
	 */
	public boolean updateStopValidationOffre(int idOffre,String loginStopValidation) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idOffre", Integer.toString(idOffre));
		parameterMap.put("loginStopValidation", loginStopValidation);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateStopValidationOffre", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#updateValidationOffre(int, java.lang.String)
	 */
	public boolean updateValidationOffre(int idOffre, String loginValidation) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idOffre", Integer.toString(idOffre));
		parameterMap.put("loginValidation", loginValidation);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateValidationOffre", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.OffreDaoService#updateOffrePourvue(int, boolean)
	 */
	public boolean updateOffrePourvue(int idOffre, boolean estPourvue) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idOffre", Integer.toString(idOffre));
		parameterMap.put("estPourvue", estPourvue?"1":"0");
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateOffrePourvue", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @return the centreGestionDaoService
	 */
	public CentreGestionDaoService getCentreGestionDaoService() {
		return centreGestionDaoService;
	}

	/**
	 * @param centreGestionDaoService the centreGestionDaoService to set
	 */
	public void setCentreGestionDaoService(
			CentreGestionDaoService centreGestionDaoService) {
		this.centreGestionDaoService = centreGestionDaoService;
	}
	
	

}

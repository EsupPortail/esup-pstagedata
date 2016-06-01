/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ConventionDaoService;
import org.esupportail.pstagedata.dao.EtapeDaoService;
import org.esupportail.pstagedata.dao.UfrDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Convention;
import org.esupportail.pstagedata.domain.beans.ConventionExport;
import org.esupportail.pstagedata.domain.dto.ConventionDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;

/**
 * Convention Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class ConventionDomainServiceImpl implements ConventionDomainService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ConventionDaoService
	 */
	private ConventionDaoService conventionDaoService;
	/**
	 * 
	 */
	private UfrDaoService ufrDaoService;
	/**
	 * 
	 */
	private EtapeDaoService etapeDaoService;


	/**
	 * @return the conventionDaoService
	 */
	public ConventionDaoService getConventionDaoService() {
		return conventionDaoService;
	}
	/**
	 * @param conventionDaoService the conventionDaoService to set
	 */
	public void setConventionDaoService(ConventionDaoService conventionDaoService) {
		this.conventionDaoService = conventionDaoService;
	}



	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#addConvention(org.esupportail.pstagedata.domain.dto.ConventionDTO)
	 */
	public int addConvention(ConventionDTO convention) throws DataAddException,
	WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.conventionDaoService.addConvention(UtilsDTO.getConventionFromDTO(convention));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#deleteConvention(int)
	 */
	public boolean deleteConvention(int idConvention)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.conventionDaoService.deleteConvention(idConvention);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getConventionFromId(int)
	 */
	public ConventionDTO getConventionFromId(int id) {
		Convention c = this.conventionDaoService.getConventionFromId(id);
		ConventionDTO cDTO = null;		
		if (c!=null) {
			cDTO = new ConventionDTO(c,false);
		}
		return cDTO;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getAnneesConvention(java.lang.String)
	 */
	public List<String> getAnneesConvention(String codeUniversite){
		return this.conventionDaoService.getAnneesConvention(codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getConventionsFromCriteres(org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO)
	 */
	public List<ConventionDTO> getConventionsFromCriteres(CritereRechercheConventionDTO critereRechercheConvention){
		List<ConventionDTO> lr = null;
		if(critereRechercheConvention!=null && critereRechercheConvention.getIdsCentreGestion()!=null && !critereRechercheConvention.getIdsCentreGestion().isEmpty()){
			List<ConventionExport> l = this.conventionDaoService.getConventionsFromCriteres(UtilsDTO.getCritereRechercheConventionFromDTO(critereRechercheConvention));
			lr = UtilsDTO.getConventionListExportDTO(l,true);
		}
		return lr;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getConventionsFromCriteresByEnseignantTuteur(int, org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO)
	 */
	public List<ConventionDTO> getConventionsFromCriteresByEnseignantTuteur(int idEnseignant, CritereRechercheConventionDTO critereRechercheConvention) {
		List<ConventionDTO> lr = null;
		if(critereRechercheConvention!=null ){
			List<ConventionExport> l = this.conventionDaoService.getConventionsFromCriteresByEnseignantTuteur(idEnseignant ,UtilsDTO.getCritereRechercheConventionFromDTO(critereRechercheConvention));
			lr = UtilsDTO.getConventionListExportDTO(l,true);
		}
		return lr;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getConventionsFromCriteresExport(org.esupportail.pstagedata.domain.dto.CritereRechercheConventionDTO)
	 */
	public List<ConventionDTO> getConventionsFromCriteresExport(CritereRechercheConventionDTO critereRechercheConvention){
		List<ConventionDTO> lr = null;
		if(critereRechercheConvention!=null && critereRechercheConvention.getIdsCentreGestion()!=null && !critereRechercheConvention.getIdsCentreGestion().isEmpty()){
			lr = UtilsDTO.getConventionListDTO(this.conventionDaoService.getConventionsFromCriteresExport(UtilsDTO.getCritereRechercheConventionFromDTO(critereRechercheConvention)), false);
		}
		return lr;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getConventionFromExport(int)
	 */
	//	public ConventionDTO getConventionFromExport(int id) {
	//		ConventionDTO cr = null;
	//		Convention c = this.conventionDaoService.getConventionFromExport(id);
	//		if(c!=null){
	//			if(c.getCodeUFR()!=null){
	//				c.setUfr(ufrDaoService.getUfrFromId(c.getCodeUFR(), c.getCodeUniversiteUFR()!=null?c.getCodeUniversiteUFR():" "));
	//			}
	//			if(c.getCodeEtape()!=null){
	//				c.setEtape(etapeDaoService.getEtapeFromId(c.getCodeEtape(), c.getCodeUniversiteEtape()!=null?c.getCodeUniversiteEtape():" "));
	//			}
	//			cr = new ConventionDTO(c,false);
	//		}
	//		return cr;
	//	}
	public List<ConventionDTO> getConventionsFromExport(List<Integer> idsConventionsExport) {
		List<ConventionDTO> lr = null;
		List<ConventionExport> l = this.conventionDaoService.getConventionsFromExport(idsConventionsExport);
		if(l!=null && !l.isEmpty()){
			lr = UtilsDTO.getConventionExportListDTO(l);
		}
		return lr;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getConventions(java.lang.String)
	 */
	public List<ConventionDTO> getConventions(String codeUniversite) {
		return UtilsDTO.getConventionListDTO(this.conventionDaoService.getConventions(codeUniversite),false);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getConventionsEtudiant(java.lang.String, java.lang.String)
	 */
	public List<ConventionDTO> getConventionsEtudiant(String identEtudiant, String codeUniversite) {
		List<ConventionDTO> lr = null;
		if (identEtudiant != null) {
			List<Convention> l = this.conventionDaoService.getConventionsEtudiant(identEtudiant, codeUniversite);
			lr = UtilsDTO.getConventionListDTO(l,true);
		}
		return lr;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#getNombreConventionByCentreGestion(int, java.lang.String)
	 */
	public int getNombreConventionByCentreGestion(int idCentreGestion, String codeUniversite){
		return this.conventionDaoService.getNombreConventionByCentreGestion(idCentreGestion, codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getConventionsByEnseignant(int, java.lang.String)
	 */
	public List<ConventionDTO> getConventionsByEnseignant(int idEnseignant, String annee) {
		List<ConventionDTO> lr = null;
		if (idEnseignant > 0) {
			List<ConventionExport> l = this.conventionDaoService.getConventionsByEnseignant(idEnseignant,annee);
			lr = UtilsDTO.getConventionListExportDTO(l,true);
		}
		return lr;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#updateConvention(org.esupportail.pstagedata.domain.dto.ConventionDTO)
	 */
	public boolean updateConvention(ConventionDTO convention)
			throws DataUpdateException, WebServiceDataBaseException {

		boolean b = false;
		try{
			b = this.conventionDaoService.updateConvention(UtilsDTO.getConventionFromDTO(convention));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#updateCentreConventionByUfr(java.lang.String, int, java.lang.String)
	 */
	public boolean updateCentreConventionByUfr(String code, int idCentreGestion, String codeUniversite)
			throws DataUpdateException, WebServiceDataBaseException {

		boolean b = false;
		try{
			b = this.conventionDaoService.updateCentreConventionByUfr(code, idCentreGestion, codeUniversite);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#updateCentreConventionByEtape(java.lang.String, int, java.lang.String)
	 */
	public boolean updateCentreConventionByEtape(String code, int idCentreGestion, String codeUniversite)
			throws DataUpdateException, WebServiceDataBaseException {

		boolean b = false;
		try{
			b = this.conventionDaoService.updateCentreConventionByEtape(code, idCentreGestion, codeUniversite);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getCodeUFRFromCodeEtape(java.lang.String, java.lang.String)
	 */
	public String getCodeUFRFromCodeEtape(String codeEtape, String codeUniversite) {
		return this.conventionDaoService.getCodeUFRFromCodeEtape(codeEtape, codeUniversite);
	}


	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#updateConventionSetCodeVersionEtape(java.lang.String, java.lang.String)
	 */
	public boolean updateConventionSetCodeVersionEtape(String codeEtape, String codeVersionEtape) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.conventionDaoService.updateConventionSetCodeVersionEtape(codeEtape, codeVersionEtape);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getNbConventionsByAnneeAndEtu(java.lang.String, java.lang.String, java.lang.String)
	 */
	public int getNbConventionsByAnneeAndEtu(String annee,
			String identEtudiant, String codeUniversite) {
		return this.conventionDaoService.getNbConventionsByAnneeAndEtu(annee, identEtudiant, codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#getCodesEtapesConventionsFromCodeUfrAndIdCentre(java.lang.String, int, java.lang.String)
	 */
	public List<String> getCodesEtapesConventionsFromCodeUfrAndIdCentre(String codeUfr, int idCentreGestion, String codeUniversite) {
		return this.conventionDaoService.getCodesEtapesConventionsFromCodeUfrAndIdCentre(codeUfr, idCentreGestion, codeUniversite);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ConventionDomainService#updateConventionValidation(org.esupportail.pstagedata.domain.dto.ConventionDTO)
	 */
	public boolean updateConventionValidation(ConventionDTO convention)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.conventionDaoService.updateConventionValidation(UtilsDTO.getConventionFromDTO(convention));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @return the ufrDaoService
	 */
	public UfrDaoService getUfrDaoService() {
		return ufrDaoService;
	}
	/**
	 * @param ufrDaoService the ufrDaoService to set
	 */
	public void setUfrDaoService(UfrDaoService ufrDaoService) {
		this.ufrDaoService = ufrDaoService;
	}
	/**
	 * @return the etapeDaoService
	 */
	public EtapeDaoService getEtapeDaoService() {
		return etapeDaoService;
	}
	/**
	 * @param etapeDaoService the etapeDaoService to set
	 */
	public void setEtapeDaoService(EtapeDaoService etapeDaoService) {
		this.etapeDaoService = etapeDaoService;
	}

}

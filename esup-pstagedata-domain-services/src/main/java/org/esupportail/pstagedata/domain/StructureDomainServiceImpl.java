/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.Date;
import java.util.List;

import org.esupportail.commons.services.logging.Logger;
import org.esupportail.commons.services.logging.LoggerImpl;
import org.esupportail.pstagedata.dao.StructureDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Structure;
import org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAdresseDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAncienDTO;
import org.esupportail.pstagedata.domain.dto.StructureDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * Structure Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StructureDomainServiceImpl implements StructureDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * A logger.
	 */
	private final transient Logger logger = new LoggerImpl(this.getClass());
	/**
	 * StructureDaoService
	 */
	private StructureDaoService structureDaoService;
	/**
	 * @return the structureDaoService
	 */
	public StructureDaoService getStructureDaoService() {
		return structureDaoService;
	}
	/**
	 * @param structureDaoService the structureDaoService to set
	 */
	public void setStructureDaoService(StructureDaoService structureDaoService) {
		this.structureDaoService = structureDaoService;
	}
	
	// Ajout moderation Entreprise
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromVerification(int)
	 */
	public List<StructureDTO> getStructuresFromVerification(int estValidee){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromVerification(estValidee));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#addStructure(org.esupportail.pstagedata.domain.dto.StructureDTO)
	 */
	public int addStructure(StructureDTO s) throws DataAddException, WebServiceDataBaseException{
		int tmp;
		try{
			tmp = this.structureDaoService.addStructure(UtilsDTO.getStructureFromDTO(s));
		}catch (DataAddDaoException e) {
			logger.debug(e);
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#deleteStructureBase(int)
	 */
	public boolean deleteStructureBase(int idStructure) throws DataDeleteException, WebServiceDataBaseException{
		boolean b;
		try{
			b = this.structureDaoService.deleteStructureBase(idStructure);
		}catch (DataDeleteDaoException e) {
			logger.debug(e);
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#deleteStructure(int,String)
	 */
	public boolean deleteStructure(int idStructure, String loginCurrentUser) throws DataUpdateException, WebServiceDataBaseException{
		boolean b;
		try{
			b = this.structureDaoService.deleteStructure(idStructure,loginCurrentUser);
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructureFromId(int)
	 */
	public StructureDTO getStructureFromId(int id) {
		Structure s = this.structureDaoService.getStructureFromId(id);
		return s==null?null:new StructureDTO(s,false);
	}	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructureFromIdService(int)
	 */
	public StructureDTO getStructureFromIdService(int id) {
		Structure s = this.structureDaoService.getStructureFromIdService(id);
		return s==null?null:new StructureDTO(s,false);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromRaisonSociale(java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromRaisonSociale(String raisonSociale){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromRaisonSociale(raisonSociale));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromRaisonSocialeEtPays(java.lang.String, int)
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtPays(String raisonSociale, int cog){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromRaisonSocialeEtPays(raisonSociale,cog));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresPaysEtrangerFromRaisonSociale(java.lang.String)
	 */
	public List<StructureDTO> getStructuresPaysEtrangerFromRaisonSociale(String raisonSociale){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresPaysEtrangerFromRaisonSociale(raisonSociale));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructureFromNumSiret(java.lang.String)
	 */
	public StructureDTO getStructureFromNumSiret(String numeroSiret){
		Structure s = this.structureDaoService.getStructureFromNumSiret(numeroSiret);
		return s==null?null:new StructureDTO(s,false);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructureFromContactMailEntrepriseAvecCompte(java.lang.String)
	 */
	public List<StructureDTO> getStructureFromContactMailEntrepriseAvecCompte(String mail){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructureFromContactMailEntrepriseAvecCompte(mail));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructureAvecAccordFromId(int)
	 */
	public StructureDTO getStructureAvecAccordFromId(int id){
		Structure s = this.structureDaoService.getStructureAvecAccordFromId(id);
		return s==null?null:new StructureDTO(s,false);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromRaisonSocialeEtDepartement(java.lang.String, java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtDepartement(String raisonSociale, String departement){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromRaisonSocialeEtDepartement(raisonSociale,departement));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromRaisonSocialeEtDepartementFr(java.lang.String, java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtDepartementFr(String raisonSociale, String departement){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromRaisonSocialeEtDepartementFr(raisonSociale,departement));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromNumSiren(java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromNumSiren(String numSiren){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromNumSiren(numSiren));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromTelephone(java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromTelephone(String telephone){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromTelephone(telephone));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromFax(java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromFax(String fax){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromFax(fax));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromAdresse(org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAdresseDTO)
	 */
	public List<StructureDTO> getStructuresFromAdresse(CritereRechercheStructureAdresseDTO c){
		List<StructureDTO> l = null;
		if(c!=null){
			l=UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromAdresse(UtilsDTO.getCritereRechercheStructureAdresseFromDTO(c)));
		}
		return l;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromNomServiceEtDepartement(java.lang.String, java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromNomServiceEtDepartement(String nomService, String departement){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromNomServiceEtDepartement(nomService,departement));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresFromTypeStructureNafN1EtDepartement(int, java.lang.String, java.lang.String)
	 */
	public List<StructureDTO> getStructuresFromTypeStructureNafN1EtDepartement(int typeStructure, String nafN1, String departement){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresFromTypeStructureNafN1EtDepartement(typeStructure,nafN1,departement));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresAvecAccordAValiderFromRaisonSociale(java.lang.String, java.util.Date, java.util.Date)
	 */
	public List<StructureDTO> getStructuresAvecAccordAValiderFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresAvecAccordAValiderFromRaisonSociale(raisonSociale, dateDebut, dateFin));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresAvecAccordValidesFromRaisonSociale(java.lang.String, java.util.Date, java.util.Date)
	 */
	public List<StructureDTO> getStructuresAvecAccordValidesFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresAvecAccordValidesFromRaisonSociale(raisonSociale, dateDebut, dateFin));
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresSansAccordFromRaisonSociale(java.lang.String)
	 */
	public List<StructureDTO> getStructuresSansAccordFromRaisonSociale(String raisonSociale){
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresSansAccordFromRaisonSociale(raisonSociale));
	}
	

	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresAncien(org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAncienDTO)
	 */
	public List<StructureDTO> getStructuresAncien(CritereRechercheStructureAncienDTO c) {
		List<StructureDTO> l = null;
		if(c!=null){
			l=UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresAncien(UtilsDTO.getCritereRechercheStructureAncienFromDTO(c)));
		}
		return l;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#countOffreFromIdStructure(int)
	 */
	public int countOffreFromIdStructure(int id){
		return this.structureDaoService.countOffreFromIdStructure(id);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#countConventionFromIdStructure(int)
	 */
	public int countConventionFromIdStructure(int id){
		return this.structureDaoService.countConventionFromIdStructure(id);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#countCompteContactFromIdStructure(int)
	 */
	public int countCompteContactFromIdStructure(int id){
		return this.structureDaoService.countCompteContactFromIdStructure(id);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#updateStructure(org.esupportail.pstagedata.domain.dto.StructureDTO)
	 */
	public boolean updateStructure(StructureDTO s) throws DataUpdateException, WebServiceDataBaseException{
		boolean b;
		try{
			b = this.structureDaoService.updateStructure(UtilsDTO.getStructureFromDTO(s));
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#updateStructureInfosAJour(int, java.lang.String)
	 */
	public boolean updateStructureInfosAJour(int idStructure,
			String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException{
		boolean b;
		try{
			b = this.structureDaoService.updateStructureInfosAJour(idStructure,loginInfosAJour);
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#updateStructureStopValidation(int, java.lang.String)
	 */
	public boolean updateStructureStopValidation(int idStructure,
			String loginStopValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b;
		try{
			b = this.structureDaoService.updateStructureStopValidation(idStructure, loginStopValidation);
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#updateStructureValidation(int, java.lang.String)
	 */
	public boolean updateStructureValidation(int idStructure,
			String loginValidation) throws DataUpdateException, WebServiceDataBaseException{
		boolean b;
		try{
			b = this.structureDaoService.updateStructureValidation(idStructure, loginValidation);
		}catch (DataUpdateDaoException e) {
			logger.debug(e);
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			logger.debug(e);
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getRaisonsSociales(java.lang.String)
	 */
	public List<String> getRaisonsSociales(String raisonSociale){
		return getStructureDaoService().getRaisonsSociales(raisonSociale);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.StructureDomainService#getStructuresTemEnServFalse()
	 */
	public List<StructureDTO> getStructuresTemEnServFalse() {
		return UtilsDTO.getStructureListDTO(this.structureDaoService.getStructuresTemEnServFalse());
	}

}

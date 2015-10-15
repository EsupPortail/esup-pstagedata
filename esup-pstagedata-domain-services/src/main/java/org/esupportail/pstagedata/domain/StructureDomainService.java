/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAdresseDTO;
import org.esupportail.pstagedata.domain.dto.CritereRechercheStructureAncienDTO;
import org.esupportail.pstagedata.domain.dto.StructureDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * Structure Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface StructureDomainService extends Serializable {
	
	// Ajout moderation Entreprise
	/**
	 * @param estValidee
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromVerification(int estValidee);
	
	/**
	 * @param id
	 * @return StructureDTO
	 */
	public StructureDTO getStructureFromId(int id);
	/**
	 * @param id
	 * @return StructureDTO
	 */
	public StructureDTO getStructureFromIdService(int id);
	/**
	 * @param raisonSociale
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromRaisonSociale(String raisonSociale);
	/**
	 * @param raisonSociale
	 * @param cog
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtPays(String raisonSociale, int cog);
	/**
	 * @param raisonSociale
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresPaysEtrangerFromRaisonSociale(String raisonSociale);
	/**
	 * @param numeroSiret
	 * @return Structure
	 */
	public StructureDTO getStructureFromNumSiret(String numeroSiret);
	/**
	 * @param mail
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructureFromContactMailEntrepriseAvecCompte(String mail);
	/**
	 * @param id
	 * @return StructureDTO
	 */
	public StructureDTO getStructureAvecAccordFromId(int id);
	/**
	 * @param raisonSociale
	 * @param departement
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromRaisonSocialeEtDepartement(String raisonSociale, String departement);
	/**
	 * @param numSiren
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromNumSiren(String numSiren);
	/**
	 * @param telephone
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromTelephone(String telephone);
	/**
	 * @param fax
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromFax(String fax);
	/**
	 * @param c
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromAdresse(CritereRechercheStructureAdresseDTO c);
	/**
	 * @param nomService
	 * @param departement
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresFromNomServiceEtDepartement(String nomService, String departement);
	/**
	 * @param typeStructure
	 * @param nafN1
	 * @param departement
	 * @return List<Structure>
	 */
	public List<StructureDTO> getStructuresFromTypeStructureNafN1EtDepartement(int typeStructure, String nafN1, String departement);
	/**
	 * @param raisonSociale
	 * @param dateDebut 
	 * @param dateFin 
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresAvecAccordAValiderFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin);
	/**
	 * @param raisonSociale
	 * @param dateDebut 
	 * @param dateFin 
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresAvecAccordValidesFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin);
	/**
	 * @param raisonSociale
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresSansAccordFromRaisonSociale(String raisonSociale);
	
	/**
	 * @param c
	 * @return List<StructureDTO>
	 */
	public List<StructureDTO> getStructuresAncien(CritereRechercheStructureAncienDTO c);
	/**
	 * @param id
	 * @return int
	 */
	public int countOffreFromIdStructure(int id);
	/**
	 * @param id
	 * @return int
	 */
	public int countConventionFromIdStructure(int id);
	/**
	 * @param id
	 * @return int
	 */
	public int countCompteContactFromIdStructure(int id);	
	/**
	 * @param s
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addStructure(StructureDTO s) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param s
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStructure(StructureDTO s) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idStructure
	 * @param loginInfosAJour
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStructureInfosAJour(int idStructure, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idStructure 
	 * @param loginValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStructureValidation(int idStructure, String loginValidation) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idStructure 
	 * @param loginStopValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStructureStopValidation(int idStructure, String loginStopValidation) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idStructure
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteStructureBase(int idStructure) throws DataDeleteException, WebServiceDataBaseException;
	
	/**
	 * @param idStructure
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteStructure(int idStructure, String loginCurrentUser) throws DataUpdateException, WebServiceDataBaseException;
	
	/**
	 * 
	 * @return List<String>
	 */
	public List<String> getRaisonsSociales(String raisonSociale);
	
	/**
	 * @return List<Structure>
	 */
	public List<StructureDTO> getStructuresTemEnServFalse();
}



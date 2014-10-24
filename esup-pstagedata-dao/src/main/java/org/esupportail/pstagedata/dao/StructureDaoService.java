/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.CritereRechercheStructureAdresse;
import org.esupportail.pstagedata.domain.beans.CritereRechercheStructureAncien;
import org.esupportail.pstagedata.domain.beans.Structure;

/**
 * Structure DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface StructureDaoService extends Serializable {

	// Ajout moderation Entreprise
	/**
	 * @param estValidee
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromVerification(int estValidee);
	
	/**
	 * @param id
	 * @return Structure
	 */
	public Structure getStructureFromId(int id);
	/**
	 * @param id
	 * @return Structure
	 */
	public Structure getStructureFromIdService(int id);
	/**
	 * @param raisonSociale
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromRaisonSociale(String raisonSociale);
	/**
	 * @param raisonSociale
	 * @param pays
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromRaisonSocialeEtPays(String raisonSociale, int pays);
	/**
	 * @param raisonSociale
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresPaysEtrangerFromRaisonSociale(String raisonSociale);
	/**
	 * @param numeroSiret
	 * @return Structure
	 */
	public Structure getStructureFromNumSiret(String numeroSiret);
	/**
	 * @param mail
	 * @return List<Structure>
	 */
	public List<Structure> getStructureFromContactMailEntrepriseAvecCompte(String mail);
	/**
	 * @param id
	 * @return Structure
	 */
	public Structure getStructureAvecAccordFromId(int id);
	/**
	 * @param raisonSociale
	 * @param departement
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromRaisonSocialeEtDepartement(String raisonSociale, String departement);
	/**
	 * @param numSiren
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromNumSiren(String numSiren);
	/**
	 * @param telephone
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromTelephone(String telephone);
	/**
	 * @param fax
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromFax(String fax);
	/**
	 * @param c
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromAdresse(CritereRechercheStructureAdresse c);
	/**
	 * @param nomService
	 * @param departement
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromNomServiceEtDepartement(String nomService, String departement);
	/**
	 * @param typeStructure
	 * @param nafN1
	 * @param departement
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresFromTypeStructureNafN1EtDepartement(int typeStructure, String nafN1, String departement);
	/**
	 * @param raisonSociale
	 * @param dateDebut 
	 * @param dateFin 
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresAvecAccordAValiderFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin);
	/**
	 * @param raisonSociale
	 * @param dateDebut 
	 * @param dateFin 
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresAvecAccordValidesFromRaisonSociale(String raisonSociale, Date dateDebut, Date dateFin);
	/**
	 * @param raisonSociale
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresSansAccordFromRaisonSociale(String raisonSociale);	
	
	/**
	 * @param c
	 * @return List<Structure>
	 */
	public List<Structure> getStructuresAncien(CritereRechercheStructureAncien c);
	/**
	 * @param id
	 * @return nombre offre pour la structure
	 */
	public int countOffreFromIdStructure(int id);
	/**
	 * @param id
	 * @return nombre convention pour la structure
	 */
	public int countConventionFromIdStructure(int id);
	/**
	 * @param id
	 * @return nombre compte contact pour la structure
	 */
	public int countCompteContactFromIdStructure(int id);	
	/**
	 * @param s
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addStructure(Structure s) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param s
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateStructure(Structure s) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idStructure
	 * @param loginInfosAJour
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateStructureInfosAJour(int idStructure, String loginInfosAJour) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idStructure 
	 * @param loginValidation
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateStructureValidation(int idStructure, String loginValidation) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idStructure 
	 * @param loginStopValidation
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateStructureStopValidation(int idStructure, String loginStopValidation) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idStructure
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteStructure(int idStructure) throws DataDeleteDaoException, DataBaseDaoException;
}

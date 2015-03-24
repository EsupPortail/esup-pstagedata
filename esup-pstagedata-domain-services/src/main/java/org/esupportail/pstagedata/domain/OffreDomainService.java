/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.CritereRechercheOffreDTO;
import org.esupportail.pstagedata.domain.dto.OffreDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;



/**
 * Offre Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface OffreDomainService extends Serializable {
	
	/**
	 * @return int
	 * @param idsCentreGestion
	 */
	public int countOffreADiffuser(List<Integer> idsCentreGestion);
	/**
	 * @return List<String>
	 */
	public List<String> getAnneesUnivOffres();

	/**
	 * @param idCentreGestion
	 * @return int
	 */
	public int getNombreOffreByCentreGestion(int idCentreGestion);
	
	/**
	 * @param idStructure
	 * @param idsCentreGestion 
	 * @param isEtudiant 
	 * @return List<OffreDTO>
	 */
	public List<OffreDTO> getOffresFromIdStructureAndIdsCentreGestion(int idStructure, List<Integer> idsCentreGestion, boolean isEtudiant);

	/**
	 * @param id
	 * @return OffreDTO
	 */
	public OffreDTO getOffreFromId(int id);
	
	/**
	 * @param critereRechercheOffre
	 * @return List<OffreDTO>
	 */
	public List<OffreDTO> getOffresFromCriteres(CritereRechercheOffreDTO critereRechercheOffre);
	
	/**
	 * @param o
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addOffre(OffreDTO o) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param o
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateOffre(OffreDTO o) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteOffreLogique(int idOffre) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateValidationOffre(int idOffre, String loginValidation) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginStopValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStopValidationOffre(int idOffre, String loginStopValidation) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginDiffusion 
	 * @param dateFinDiffusion
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateDiffusionOffre(int idOffre, String loginDiffusion, Date dateFinDiffusion) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginStopDiffusion
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStopDiffusionOffre(int idOffre, String loginStopDiffusion) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idOffre
	 * @param loginRejetValidation
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateRejetOffre(int idOffre, String loginRejetValidation) throws DataUpdateException, WebServiceDataBaseException;
	
	/**
	 * @param idOffre
	 * @param estPourvue
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateOffrePourvue(int idOffre, boolean estPourvue) throws DataUpdateException, WebServiceDataBaseException;
}

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
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.CritereRechercheOffre;
import org.esupportail.pstagedata.domain.beans.Offre;



/**
 * Offre DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface OffreDaoService extends Serializable {

	/**
	 * @return int
	 */
	public int countOffreADiffuser();
	/**
	 * @return List<String>
	 */
	public List<String> getAnneesUnivOffres();
	
	/**
	 * @param idStructure
	 * @param idsCentreGestion 
	 * @param isEtudiant 
	 * @return List<Offre>
	 */
	public List<Offre> getOffresFromIdStructureAndIdsCentreGestion(int idStructure, List<Integer> idsCentreGestion, boolean isEtudiant);
	
	/**
	 * @param id
	 * @return Offre
	 */
	public Offre getOffreFromId(int id);
	
	/**
	 * @param critereRechercheOffre
	 * @return List<Offre>
	 */
	public List<Offre> getOffresFromCriteres(CritereRechercheOffre critereRechercheOffre);
	
	/**
	 * @param idCentreGestion
	 * @return int
	 */
	public int getNombreOffreByCentreGestion(int idCentreGestion);
	
	/**
	 * @param o
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addOffre(Offre o) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param o
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateOffre(Offre o) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idOffre
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteOffreLogique(int idOffre) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idOffre
	 * @param loginValidation
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateValidationOffre(int idOffre, String loginValidation) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idOffre
	 * @param loginStopValidation
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateStopValidationOffre(int idOffre, String loginStopValidation) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idOffre
	 * @param loginDiffusion 
	 * @param dateFinDiffusion
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateDiffusionOffre(int idOffre, String loginDiffusion, Date dateFinDiffusion) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idOffre
	 * @param loginStopDiffusion
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateStopDiffusionOffre(int idOffre, String loginStopDiffusion) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idOffre
	 * @param loginRejetValidation
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateRejetOffre(int idOffre, String loginRejetValidation) throws DataUpdateDaoException, DataBaseDaoException;
	
	/**
	 * @param idOffre
	 * @param estPourvue
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateOffrePourvue(int idOffre, boolean estPourvue) throws DataUpdateDaoException, DataBaseDaoException;
}

package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.domain.dto.StatisticItemDTO;
import org.esupportail.pstagedata.exceptions.StatsDomaineException;
/**
 * Gestion des stats sur les offres
 *
 */
public interface OffreStatsDomaineService {

	public List<String> getOfferYears(Integer idCentreGestion) throws StatsDomaineException ;
  
public List<StatisticItemDTO> getNumberOfOffers(Integer idCenter) throws StatsDomaineException;

/**
 *  recupere le nombre d'offres par activite de l'etablisssment, par annee universitaire,
 */
public List<StatisticItemDTO> getNumberOfOffersByActivity(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws StatsDomaineException;


/**
 * recupere le nombre d'offres 
 * @param idCentreDeGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
* @param validation 
* @param publication
 */
  public List<StatisticItemDTO>  getNumberOfOffersByType(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws StatsDomaineException;

	 /**
 * recupere le nombre d'offres par etablissement, par annee universitaire
 * @param idCentreDeGestion : identifiant du centre de gestion
 */
	  public List<StatisticItemDTO> getNumberOfOffersByStructure(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws StatsDomaineException;
	  
	  	/**
	     * recupere le nombre d'offres par statut juridique etablissement, par annee universitaire
	     */
		  public List<StatisticItemDTO> getNumberOfOffersByStructureType(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws StatsDomaineException;
	  
		  
	  /**
	     * recupere le nombre d'offres par taille etablisssement, par annee universitaire
	     */
	  public List<StatisticItemDTO> getNumberOfOffersByStructureSize(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws StatsDomaineException;

	  
	  /**
	     * recupere le nombre d'offres par departement etablisssement, par annee universitaire
	   */
	  public List<StatisticItemDTO> getNumberOfOffersByStructureDep(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws StatsDomaineException;

	  /**
	     * recupere le nombre d'offres par pays etablissement, par annee universitaire
	     */
  public List<StatisticItemDTO> getNumberOfOffersByStructureCountry(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws StatsDomaineException;
	  
	  /**
	     * recupere le nombre d'offres par niveau de formation et annee universtaire
	     *
	     */
	 public List<StatisticItemDTO> getNumberOfOffersByLevel(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws StatsDomaineException;
	  
	 /**
		 * recupere le nombre d'offres par designation d'un candidat, par validation et diffusion
		 * @param idCenter : identifiant du centre de gestion
		 * @param year : annee universitaire


		 */
	public List<StatisticItemDTO> getNumberOfOffersByCandidateFound(Integer idCenter, String year, boolean validation, boolean publication) throws StatsDomaineException;
		/**
		 * recupere le nombre d'offres par origine du candidat (etudiant local ou non), par validation et diffusion
		 * @param idCenter : identifiant du centre de gestion
		 * @param year : annee universitaire
		 */
	public List<StatisticItemDTO> getNumberOfOffersByLocalStudent(Integer idCenter, String year, boolean validation, boolean publication) throws StatsDomaineException;

	  public List<StatisticItemDTO> getNumberOfOffersByFunction(Integer idCenter, String year, boolean validation, boolean publication) throws StatsDomaineException;
	  public List<StatisticItemDTO> getNumberOfOffersByFormation(Integer idCenter, String year, boolean validation, boolean publication) throws StatsDomaineException;
	  public List<StatisticItemDTO> getNumberOfOffersByValidation(Integer idCenter, String year) throws StatsDomaineException;
	  public List<StatisticItemDTO> getNumberOfOffersByPublication(Integer idCenter, String year) throws StatsDomaineException;
}

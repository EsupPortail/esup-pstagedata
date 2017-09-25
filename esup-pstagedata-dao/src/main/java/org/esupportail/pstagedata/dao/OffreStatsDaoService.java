package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;
/**
 * gestion des statistiques pour les offre 
 *
 */
public interface OffreStatsDaoService  {

	/**
	 * Etat des offres utlisant ce servive
	 * @return
	 */
	public String getStatutOffre() ;
	 
	  /**
	     * recupere les annees existant dans les offres de ce centre de gestion
	     * @param idCenter
	     * @return
	     */
	  public List<String> getOfferYears(Integer idCenter) throws DataAccessDaoException ;  
		
	  /**
	     *  
	     * recupere le nombre d'offres  pour le centre specifie et  par annee universitaire
	     * @param idCenter : identifiant du centre de gestion
	     *  @return liste de ce centre
	     */
	
   public List<StatisticItem> getNumberOfOffers(Integer idCenter) throws DataAccessDaoException;
   /**
    *  recupere le nombre d'offres par activite de l'etablisssment, par annee universitaire, par validation et diffusion
    */
	public List<StatisticItem> getNumberOfOffersByActivity( Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException;
	
	/**
   * recupere les statistiques sur les nombres d'offres par type d'offre 
   * @param idCentreDeGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   *  @return liste des statistiques 
   */
	public List<StatisticItem> getNumberOfOffersByType(final Integer idCentreDeGestion, final String annee, boolean validation, boolean publication) throws DataAccessDaoException;
	
	
	 /**
   * recupere le nombre d'offres par etablisssment, par annee universitaire
   * @param idCentreDeGestion : identifiant du centre de gestion
   */
	  public List<StatisticItem> getNumberOfOffersByStructure(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException;
	  
	  	/**
	     * recupere le nombre d'offres par statut juridique etablisssment, par annee universitaire
	     */
		  public List<StatisticItem> getNumberOfOffersByStructureType(Integer idCentreDeGestion, String annee, boolean validation, boolean publication )throws DataAccessDaoException;
	  
		  
	  /**
	     * recupere le nombre d'offres par taille etablisssement, par annee universitaire
	     */
	   public List<StatisticItem> getNumberOfOffersByStructureSize(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException;

	  
	  /**
	     * recupere le nombre d'offres par departement etablisssement, par annee universitaire
	   */
	  public List<StatisticItem> getNumberOfOffersByStructureDep(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException;

	  /**
	     * recupere le nombre d'offres par pays etablisssment, par annee universitaire
	     */
    public List<StatisticItem> getNumberOfOffersByStructureCountry(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException;
	  
	  /**
	     * recupere le nombre d'offres par niveau de formation et annee universtaire
	     *
	     */
	  public List<StatisticItem> getNumberOfOffersByLevel(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException;
	  
	  public List<StatisticItem> getNumberOfOffersByFunction(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException;
	  public List<StatisticItem> getNumberOfOffersByFormation(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException;
	  public List<StatisticItem> getNumberOfOffersByValidation(Integer idCentreDeGestion, String annee) throws DataAccessDaoException;
	  public List<StatisticItem> getNumberOfOffersByPublication(Integer idCentreDeGestion, String annee) throws DataAccessDaoException;
	  public List<StatisticItem> getNumberOfOffersByCandidateFound(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException;
	  public List<StatisticItem> getNumberOfOffersByLocalStudent(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException;
	  
	  
	  

}

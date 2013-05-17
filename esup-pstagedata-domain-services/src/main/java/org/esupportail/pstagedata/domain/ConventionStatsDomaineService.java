package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.domain.dto.StatisticItemDTO;
import org.esupportail.pstagedata.exceptions.StatsDomaineException;

/**
 * 
 *Domaine service pour  les statistiques : cas  des conventions  
 *
 */
public interface ConventionStatsDomaineService {
	  /**
     * Recherche des ann&#233;es universitaires existant dans les conventions de ce centre de gestion
     * @param idCentreGestion
     * @return
     */
  public List<String> getYears(Integer idCentreGestion) throws StatsDomaineException;
  
  
  /**
   * recupere le nombre de convention pour le centre specifie 
   * @param idCentreGestion : identifiant du centre de gestion
   *  @return
   */

public List<StatisticItemDTO> getNumberOfConventions(Integer idCentreGestion) throws StatsDomaineException ;

/**
 * recupere le nombre de convention par type de convention pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 *  @return
 */

public List<StatisticItemDTO> getNumberOfConventionsByType(Integer idCentreGestion, String annee)throws StatsDomaineException ;

/**
 * recupere le nombre de convention par theme de convention pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 *  @return
 */

public List<StatisticItemDTO> getNumberOfConventionsByTheme(Integer idCentreGestion, String annee)throws StatsDomaineException ;

/**
 * recupere le nombre de convention par gratification pour le centre specifie et l'annee universitaire
 * @param idCentreGestion: identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */
public List<StatisticItemDTO> getNumberOfConventionsByIndemnity(Integer idCentreGestion, String annee) throws StatsDomaineException ;



/**
   * recupere le nombre de convention par temps de travail pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   *  
   */

public List<StatisticItemDTO> getNumberOfConventionsByWorkDuration(Integer idCentreGestion, String annee) throws StatsDomaineException ;


/**
   * recupere le nombre de convention par nb de jours de travail par semaine pour le centre specifie et l'annee universitaire
   * @param idCentreGestion  : identifiant du centre de gestion
   * @param annee : annee universitaire
   *  
   */

public List<StatisticItemDTO> getNumberOfConventionsByNbDaysPerWeek(Integer idCentreGestion, String annee) throws StatsDomaineException ;
/**
 * recupere le nombre de convention par origine du stage pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */

public List<StatisticItemDTO> getNumberOfConventionsByWayToFind(Integer idCentreGestion, String annee) throws StatsDomaineException ;




/**
 * recupere le nombre de convention par enseignant pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee: annee universitaire
 *  
 */

public List<StatisticItemDTO> getNumberOfConventionsByTeacherGuide(Integer idCentreGestion, String annee) throws StatsDomaineException ;

/**
 * recupere le nombre de convention par structure pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */

public List<StatisticItemDTO> getNumberOfConventionsByStructure(Integer idCentreGestion, String annee) throws StatsDomaineException ;

/**
 * recupere le nombre de convention par activite de la structure pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */

public List<StatisticItemDTO> getNumberOfConventionsByStructureActivity(Integer idCentreGestion, String annee) throws StatsDomaineException ;

/**
   * recupere le nombre de convention par statut juridique de la structure pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   *  
   */

public List<StatisticItemDTO> getNumberOfConventionsByStructureType(Integer idCentreGestion, String annee) throws StatsDomaineException ;



/**
   * recupere le nombre de convention par taille de la structure pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   */

public List<StatisticItemDTO> getNumberOfConventionsByStructureSize(Integer idCentreGestion, String annee) throws StatsDomaineException ;


/**
 * recupere le nombre de convention par departement du lieu de stage pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 */

public List<StatisticItemDTO> getNumberOfConventionsByServiceDep(Integer idCentreGestion, String annee)throws StatsDomaineException ;


/**
   * recupere le nombre de convention par pays du lieu de stage pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   */

public List<StatisticItemDTO> getNumberOfConventionsByServiceCountry(Integer idCentreGestion, String annee)throws StatsDomaineException ;

/*** UFR ***/

public List<StatisticItemDTO> getNumberOfConventionsByStudy(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndType(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndIndemnity(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndNbDaysPerWeek(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndWayToFind(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndTeacherGuide(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndWorkDuration(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructure(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndActivity(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructureType(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructureSize(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndServiceDep(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndServiceCountry(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStudyAndTheme(Integer idCentreGestion, String annee)throws StatsDomaineException;


/*** DEPARTEMENT ***/

public List<StatisticItemDTO> getNumberOfConventionsByDepartment(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndType(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndActivity(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndIndemnity(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndWorkDuration(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndNbDaysPerWeek(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndWayToFind(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndTeacherGuide(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructure(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructureType(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructureSize(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndServiceDep(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndServiceCountry(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndTheme(Integer idCentreGestion, String annee)throws StatsDomaineException;

/*** ETAPE ***/

public List<StatisticItemDTO> getNumberOfConventionsByStep(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndType(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndActivity(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndIndemnity(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndWorkDuration(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndNbDaysPerWeek(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndWayToFind(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndTeacherGuide(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructure(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructureType(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructureSize(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndServiceDep(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndServiceCountry(Integer idCentreGestion, String annee)throws StatsDomaineException;

public List<StatisticItemDTO> getNumberOfConventionsByStepAndTheme(Integer idCentreGestion, String annee)throws StatsDomaineException;


/*Ajout duree*/
public List<StatisticItemDTO> getNumberOfConventionsByNbWeeks(Integer idCentreGestion, String annee)throws StatsDomaineException;
public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndNbWeeks(Integer idCentreGestion, String annee)throws StatsDomaineException;
public List<StatisticItemDTO> getNumberOfConventionsByStudyAndNbWeeks(Integer idCentreGestion, String annee)throws StatsDomaineException;
public List<StatisticItemDTO> getNumberOfConventionsByStepAndNbWeeks(Integer idCentreGestion, String annee)throws StatsDomaineException;


}

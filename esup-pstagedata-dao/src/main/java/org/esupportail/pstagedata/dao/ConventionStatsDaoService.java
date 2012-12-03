package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;

/**
 * 
 * Statistiques sur les conventions
 *
 */
public interface ConventionStatsDaoService {
	  /**
     * recupere les annees universitaires existant dans les conventions de ce centre de gestion
     * @param idCentreGestion
     * 
     */
  public List<String> getYears(Integer idCentreGestion)  throws DataAccessDaoException ;
  
  /**
   * recupere le nombre de convention pour le centre specifie 
   * @param idCentreGestion : identifiant du centre de gestion
   *  
   */

public List<StatisticItem> getNumberOfConventions(Integer idCentreGestion) throws DataAccessDaoException ;


/**
   * recupere le nombre de convention par type de convention pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   *  
   */

public List<StatisticItem> getNumberOfConventionsByType(Integer idCentreGestion, String annee) throws DataAccessDaoException ;

/**
 * recupere le nombre de convention par theme pour le centre specifie et l'annee universitaire
 * @param idCentreGestion: identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */

public List<StatisticItem> getNumberOfConventionsByTheme(Integer idCentreGestion, String annee) throws DataAccessDaoException ;

/**
 * recupere le nombre de convention par gratification pour le centre specifie et l'annee universitaire
 * @param idCentreGestion: identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */



public List<StatisticItem> getNumberOfConventionsByIndemnity(Integer idCentreGestion, String annee) throws DataAccessDaoException ;


/**
   * recupere le nombre de convention par temps de travail pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   *  
   */

public List<StatisticItem> getNumberOfConventionsByWorkDuration(Integer idCentreGestion, String annee) throws DataAccessDaoException ;


/**
   * recupere le nombre de convention par nb de jours de travail par semaine pour le centre specifie et l'annee universitaire
   * @param idCentreGestion  : identifiant du centre de gestion
   * @param annee : annee universitaire
   *  
   */

public List<StatisticItem> getNumberOfConventionsByNbDaysPerWeek(Integer idCentreGestion, String annee) throws DataAccessDaoException ;
/**
 * recupere le nombre de convention par origine du stage pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */

public List<StatisticItem> getNumberOfConventionsByWayToFind(Integer idCentreGestion, String annee) throws DataAccessDaoException ;


/**
 * recupere le nombre de convention par enseignant pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee: annee universitaire
 *  
 */

public List<StatisticItem> getNumberOfConventionsByTeacherGuide(Integer idCentreGestion, String annee) throws DataAccessDaoException ;

/**
 * recupere le nombre de convention par structure pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */

public List<StatisticItem> getNumberOfConventionsByStructure(Integer idCentreGestion, String annee) throws DataAccessDaoException ;

/**
 * recupere le nombre de convention par activite de structure pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 *  
 */

public List<StatisticItem> getNumberOfConventionsByStructureActivity(Integer idCentreGestion, String annee) throws DataAccessDaoException ;

/**
   * recupere le nombre de convention par statut juridique de la structure pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   *  
   */

public List<StatisticItem> getNumberOfConventionsByStructureType(Integer idCentreGestion, String annee) throws DataAccessDaoException ;



/**
   * recupere le nombre de convention par taille de la structure pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   */

public List<StatisticItem> getNumberOfConventionsByStructureSize(Integer idCentreGestion, String annee) throws DataAccessDaoException ;


/**
 * recupere le nombre de convention par departement du lieu de stage pour le centre specifie et l'annee universitaire
 * @param idCentreGestion : identifiant du centre de gestion
 * @param annee : annee universitaire
 */

public List<StatisticItem> getNumberOfConventionsByServiceDep(Integer idCentreGestion, String annee)throws DataAccessDaoException ;


/**
   * recupere le nombre de convention par pays du lieu de stage pour le centre specifie et l'annee universitaire
   * @param idCentreGestion : identifiant du centre de gestion
   * @param annee : annee universitaire
   */

public List<StatisticItem> getNumberOfConventionsByServiceCountry(Integer idCentreGestion, String annee)throws DataAccessDaoException ;


/*** UFR **/

public List<StatisticItem> getNumberOfConventionsByStudy(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndType(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndIndemnity(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndNbDaysPerWeek(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndWayToFind(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndTeacherGuide(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndWorkDuration(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndStructure(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndActivity(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndStructureType(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndStructureSize(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndServiceDep(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndServiceCountry(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStudyAndTheme(Integer idCentreGestion, String annee)throws DataAccessDaoException;

/*** DEPARTEMENT **/

public List<StatisticItem> getNumberOfConventionsByDepartment(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndType(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndActivity(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndIndemnity(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndWorkDuration(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndNbDaysPerWeek(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndWayToFind(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndTeacherGuide(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructure(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructureType(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructureSize(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndServiceDep(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndServiceCountry(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByDepartmentAndTheme(Integer idCentreGestion, String annee)throws DataAccessDaoException;


/*** ETAPE **/

public List<StatisticItem> getNumberOfConventionsByStep(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndType(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndActivity(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndIndemnity(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndWorkDuration(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndNbDaysPerWeek(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndWayToFind(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndTeacherGuide(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndStructure(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndStructureType(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndStructureSize(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndServiceDep(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndServiceCountry(Integer idCentreGestion, String annee)throws DataAccessDaoException;

public List<StatisticItem> getNumberOfConventionsByStepAndTheme(Integer idCentreGestion, String annee)throws DataAccessDaoException;


}

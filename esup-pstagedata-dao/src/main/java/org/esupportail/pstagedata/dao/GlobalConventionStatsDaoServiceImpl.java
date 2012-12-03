package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.dao.AbstractIBatisDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;
/**
 * gestion des statitistiques des conventions sur l'ensemble de l'etablissement supperieur
 *
 */
public class GlobalConventionStatsDaoServiceImpl extends AbstractIBatisDaoService  implements
		ConventionStatsDaoService {
	
	private StatsParTypeService statsParTypeService;

	
	@Override
	public List<String> getYears(Integer idCentreGestion)
			throws DataAccessDaoException {
		 return statsParTypeService.findAnnees(idCentreGestion, "getAllYears");
}


	@Override
	public List<StatisticItem> getNumberOfConventions(Integer idCentreGestion)
			throws DataAccessDaoException {
		return statsParTypeService.findNombreAnnees(idCentreGestion, "getAllNumberOfConventions");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByType");
	}
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByTheme(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByTheme");
	}

	

	/**
	 * @param statsParTypeService the statsParTypeService to set
	 */
	public void setStatsParTypeService(StatsParTypeService statsParTypeService) {
		this.statsParTypeService = statsParTypeService;
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByIndemnity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		//TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByIndemnity");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByWorkDuration(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		// TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByWorkDuration");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByNbDaysPerWeek(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		// TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByNbDaysPerWeek");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByWayToFind(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		// TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByWayToFind");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByTeacherGuide(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		// TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByTeacherGuide");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByStructure(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		// TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee,"getAllNumberOfConventionsByStructure");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByStructureActivity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		// TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee,"getAllNumberOfConventionsByStructureActivity");
	}
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStructureType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		// TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee,"getAllNumberOfConventionsByStructureType");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByStructureSize(
			Integer idCentreGestion, String annee) throws DataAccessDaoException {
		// TODO TEST ME
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStructureSize");
	}


	@Override
	public List<StatisticItem> getNumberOfConventionsByServiceDep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		// TODO TEST ME
		
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByServiceDep");

	}
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByServiceCountry(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByServiceCountry");
	}
	
	/*** UFR ***/
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStudy(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudy");
	}
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndType");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndIndemnity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndIndemnity");
	}
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndNbDaysPerWeek(Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndNbDaysPerWeek");
	}
	

	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndWayToFind(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndWayToFind");
	}
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndTeacherGuide(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndTeacherGuide");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndWorkDuration(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndWorkDuration");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndStructure(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndStructure");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndActivity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndActivity");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndStructureType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndStructureType");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndStructureSize(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndStructureSize");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndServiceDep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndServiceDep");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndServiceCountry(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndServiceCountry");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndTheme(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStudyAndTheme");
	}
	
/*** DEPARTEMENT ***/
	
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartment(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartment");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndType");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndActivity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndActivity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndIndemnity(Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndIndemnity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndWorkDuration(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndWorkDuration");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndNbDaysPerWeek(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndNbDaysPerWeek");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndWayToFind(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndWayToFind");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndTeacherGuide(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndTeacherGuide");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructure(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndStructure");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructureType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndStructureType");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructureSize(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndStructureSize");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndServiceDep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndServiceDep");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndServiceCountry(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndServiceCountry");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndTheme(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByDepartmentAndTheme");
	}
	
/*** ETAPE ***/
	
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStep");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndType");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndActivity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndActivity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndIndemnity(Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndIndemnity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndWorkDuration(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndWorkDuration");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndNbDaysPerWeek(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndNbDaysPerWeek");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndWayToFind(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndWayToFind");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndTeacherGuide(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndTeacherGuide");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndStructure(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndStructure");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndStructureType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndStructureType");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndStructureSize(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndStructureSize");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndServiceDep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndServiceDep");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndServiceCountry(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndServiceCountry");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndTheme(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getAllNumberOfConventionsByStepAndTheme");
	}
	
	
	
}

package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.dao.AbstractIBatisDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;

public class CentreGestionConventionStatsDaoServiceImpl extends
		AbstractIBatisDaoService implements ConventionStatsDaoService {

	private StatsParTypeService statsParTypeService;

	@Override
	public List<String> getYears(Integer idCentreGestion)
			throws DataAccessDaoException {
		return statsParTypeService.findAnnees(idCentreGestion, "getYears");
	}

	@Override
	public List<StatisticItem> getNumberOfConventions(Integer idCentreGestion)
			throws DataAccessDaoException {
		return statsParTypeService.findNombreAnnees(idCentreGestion,
				"getNumberOfConventions");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee,
				"getNumberOfConventionsByType");
	}
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByTheme(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee,
				"getNumberOfConventionsByTheme");
	}

	/**
	 * @param statsParTypeService
	 *            the statsParTypeService to set
	 */
	public void setStatsParTypeService(StatsParTypeService statsParTypeService) {
		this.statsParTypeService = statsParTypeService;
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByIndemnity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee,
				"getNumberOfConventionsByIndemnity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByWorkDuration(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee,
				"getNumberOfConventionsByWorkDuration");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByNbDaysPerWeek(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee,
				"getNumberOfConventionsByNbDaysPerWeek");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByWayToFind(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee,
				"getNumberOfConventionsByWayToFind");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByTeacherGuide(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByTeacherGuide");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStructure(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStructure");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStructureActivity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStructureActivity");
	}
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStructureType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStructureType");
	}

	
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStructureSize(Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStructureSize");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByServiceDep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByServiceDep");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByServiceCountry(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByServiceCountry");
	}

	/*** UFR ***/
	
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStudy(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudy");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndType");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndIndemnity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndIndemnity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndNbDaysPerWeek(Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndNbDaysPerWeek");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndWayToFind(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndWayToFind");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStudyAndTeacherGuide(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndTeacherGuide");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndWorkDuration(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndWorkDuration");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndStructure(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndStructure");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndActivity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndActivity");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndStructureType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndStructureType");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndStructureSize(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndStructureSize");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndServiceDep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndServiceDep");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndServiceCountry(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndServiceCountry");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStudyAndTheme(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndTheme");
	}
	

/*** DEPARTEMENT ***/
	
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartment(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartment");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndType");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndActivity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndActivity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndIndemnity(Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndIndemnity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndWorkDuration(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndWorkDuration");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndNbDaysPerWeek(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndNbDaysPerWeek");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndWayToFind(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndWayToFind");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndTeacherGuide(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndTeacherGuide");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructure(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndStructure");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructureType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndStructureType");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndStructureSize(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndStructureSize");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndServiceDep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndServiceDep");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndServiceCountry(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndServiceCountry");
	}
	
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndTheme(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndTheme");
	}

/*** ETAPE ***/
	
	
	@Override
	public List<StatisticItem> getNumberOfConventionsByStep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStep");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndType");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndActivity(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndActivity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndIndemnity(Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndIndemnity");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndWorkDuration(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndWorkDuration");
	}

	@Override
	public List<StatisticItem> getNumberOfConventionsByStepAndNbDaysPerWeek(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndNbDaysPerWeek");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndWayToFind(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndWayToFind");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndTeacherGuide(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndTeacherGuide");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndStructure(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndStructure");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndStructureType(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndStructureType");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndStructureSize(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndStructureSize");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndServiceDep(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndServiceDep");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndServiceCountry(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndServiceCountry");
	}
	
	public List<StatisticItem> getNumberOfConventionsByStepAndTheme(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndTheme");
	}
	
	
	/*Ajout duree*/
	public List<StatisticItem> getNumberOfConventionsByNbWeeks(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByNbWeeks");
	}
	public List<StatisticItem> getNumberOfConventionsByDepartmentAndNbWeeks(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByDepartmentAndNbWeeks");
	}
	public List<StatisticItem> getNumberOfConventionsByStudyAndNbWeeks(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStudyAndNbWeeks");
	}
	public List<StatisticItem> getNumberOfConventionsByStepAndNbWeeks(
			Integer idCentreGestion, String annee)
			throws DataAccessDaoException {
		return statsParTypeService.findItemsParType(idCentreGestion, annee, "getNumberOfConventionsByStepAndNbWeeks");
	}
}

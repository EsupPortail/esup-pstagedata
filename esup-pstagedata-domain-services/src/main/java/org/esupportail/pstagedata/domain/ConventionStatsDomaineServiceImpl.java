package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.ConventionStatsDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;
import org.esupportail.pstagedata.domain.dto.StatisticItemDTO;
import org.esupportail.pstagedata.exceptions.StatsDomaineException;


@SuppressWarnings("serial")
public class ConventionStatsDomaineServiceImpl implements
ConventionStatsDomaineService, Serializable {

	/**
	 * gestionnaire des StatisticItemDTO
	 */
	private StatisticsDtoManager statisticsDtoManager;	
	/**
	 * service dao pour les statistiques sur les conventions
	 */
	private ConventionStatsDaoService conventionStatsDaoService;


	/**
	 * @param statisticsDtoManager the statisticsDtoManager to set
	 */
	public void setStatisticsDtoManager(StatisticsDtoManager statisticsDtoManager) {
		this.statisticsDtoManager = statisticsDtoManager;
	}
	/**
	 * @param conventionStatsDaoService the conventionStatsDaoService to set
	 */
	public void setConventionStatsDaoService(
			ConventionStatsDaoService conventionStatsDaoService) {
		this.conventionStatsDaoService = conventionStatsDaoService;
	}
	@Override
	public List<String> getYears(Integer idCentreGestion)
			throws StatsDomaineException {
		// TODO TEST ME
		List<String> years =null;
		try {
			years = this.conventionStatsDaoService.getYears(idCentreGestion);
		} catch (DataAccessDaoException cause) {
			throw new StatsDomaineException(" Probleme survenu lors de la recup des annees des conventions", cause);
		}

		return years;
	}


	private String exceptionMsg(Integer idCentreDeGestion, String annee) {
		StringBuilder sb = new StringBuilder();
		sb.append( " Impossible de recuperer les donnees avec ");
		sb.append(" les parametres suivants : ");
		sb.append(" idCentreDeGestion = ");
		sb.append(idCentreDeGestion);
		sb.append("; annee = ");
		sb.append(annee);
		sb.append(" dans la classe ");
		sb.append(this.getClass().getSimpleName());

		return sb.toString();
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventions(Integer idCentreGestion)
			throws StatsDomaineException {
		List<StatisticItem> numberOfConventions = null;
		List<StatisticItemDTO> dtos =null;
		try {
			numberOfConventions = this.conventionStatsDaoService.getNumberOfConventions(idCentreGestion);
			dtos = this.statisticsDtoManager.transformToDto(numberOfConventions);

		} catch (DataAccessDaoException dtaex) {
			StringBuilder sbuilder = new StringBuilder(" Erreur survenu avec la methode ").append(this.getClass().getName()).append("getNumberOfConventions");
			throw new StatsDomaineException(sbuilder.toString() , dtaex);
		}
		return dtos;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByType(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		// TODO TEST ME
		List<StatisticItem> numberOfConventionsByType =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			numberOfConventionsByType = this.conventionStatsDaoService.getNumberOfConventionsByType(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(numberOfConventionsByType);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}

	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByTheme(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		// TODO TEST ME
		List<StatisticItem> numberOfConventionsByTheme =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			numberOfConventionsByTheme = this.conventionStatsDaoService.getNumberOfConventionsByTheme(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(numberOfConventionsByTheme);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}


	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByIndemnity(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbIndemnites =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbIndemnites = this.conventionStatsDaoService.getNumberOfConventionsByIndemnity(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbIndemnites);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByNbDaysPerWeek(
			Integer idCentreGestion, String annee) throws StatsDomaineException {

		List<StatisticItem> nbDaysPerWeek =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbDaysPerWeek = this.conventionStatsDaoService.getNumberOfConventionsByNbDaysPerWeek(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbDaysPerWeek);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByWayToFind(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbByWayToFind =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbByWayToFind = this.conventionStatsDaoService.getNumberOfConventionsByWayToFind(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbByWayToFind);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByWorkDuration(
			Integer idCentreGestion, String annee) throws StatsDomaineException {

		List<StatisticItem> nbByWorkDuration =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbByWorkDuration = this.conventionStatsDaoService.getNumberOfConventionsByWorkDuration(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbByWorkDuration);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}



	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStructure(
			Integer idCentreGestion, String annee) throws StatsDomaineException {

		List<StatisticItem> nbByStructure =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbByStructure = this.conventionStatsDaoService.getNumberOfConventionsByStructure(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbByStructure);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}

	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStructureActivity(
			Integer idCentreGestion, String annee) throws StatsDomaineException {	
		List<StatisticItem> nbByStructureActivite =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbByStructureActivite = this.conventionStatsDaoService.getNumberOfConventionsByStructureActivity(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbByStructureActivite);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}

	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStructureSize(
			Integer idCentreGestion, String annee) throws StatsDomaineException {	
		List<StatisticItem> nbByStructureSize =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbByStructureSize = this.conventionStatsDaoService.getNumberOfConventionsByStructureSize(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbByStructureSize);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStructureType(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbByStructureSizeType =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbByStructureSizeType = this.conventionStatsDaoService.getNumberOfConventionsByStructureType(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbByStructureSizeType);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByTeacherGuide(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbByTeacherGuides =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbByTeacherGuides = this.conventionStatsDaoService.getNumberOfConventionsByTeacherGuide(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbByTeacherGuides);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}


	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByServiceCountry(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByServiceCountry(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByServiceDep(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByServiceDep(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}

	/*** UFR ***/

	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStudy(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudy(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndIndemnity(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndIndemnity(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndNbDaysPerWeek(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndNbDaysPerWeek(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndTeacherGuide(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndTeacherGuide(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndType(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndType(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndWayToFind(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndWayToFind(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndWorkDuration(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndWorkDuration(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructure(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndStructure(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndActivity(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndActivity(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructureType(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndStructureType(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndStructureSize(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndStructureSize(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndServiceDep(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndServiceDep(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndServiceCountry(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndServiceCountry(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndTheme(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndTheme(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	/*** DEPARTEMENT ***/

	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByDepartment(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartment(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndType(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndType(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndActivity(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndActivity(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndIndemnity(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndIndemnity(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndWorkDuration(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndWorkDuration(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndNbDaysPerWeek(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndNbDaysPerWeek(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndWayToFind(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndWayToFind(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndTeacherGuide(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndTeacherGuide(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructure(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndStructure(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructureType(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndStructureType(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndStructureSize(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndStructureSize(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndServiceDep(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndServiceDep(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndServiceCountry(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndServiceCountry(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndTheme(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndTheme(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	/*** ETAPE ***/

	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStep(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStep(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStepAndType(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndType(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStepAndActivity(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndActivity(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStepAndIndemnity(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndIndemnity(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStepAndWorkDuration(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndWorkDuration(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStepAndNbDaysPerWeek(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndNbDaysPerWeek(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndWayToFind(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndWayToFind(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndTeacherGuide(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndTeacherGuide(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructure(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndStructure(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructureType(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndStructureType(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndStructureSize(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndStructureSize(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndServiceDep(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndServiceDep(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndServiceCountry(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndServiceCountry(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

	public List<StatisticItemDTO> getNumberOfConventionsByStepAndTheme(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndTheme(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}
	

	/*Ajout duree*/
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByNbWeeks(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> numberOfConventionsByNbWeeks =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			numberOfConventionsByNbWeeks = this.conventionStatsDaoService.getNumberOfConventionsByNbWeeks(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(numberOfConventionsByNbWeeks);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByDepartmentAndNbWeeks(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByDepartmentAndNbWeeks(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}

		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStudyAndNbWeeks(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStudyAndNbWeeks(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfConventionsByStepAndNbWeeks(
			Integer idCentreGestion, String annee) throws StatsDomaineException {
		List<StatisticItem> nbres =null;
		List<StatisticItemDTO> transformedToDto = null;
		try {
			nbres = this.conventionStatsDaoService.getNumberOfConventionsByStepAndNbWeeks(idCentreGestion, annee);
			transformedToDto = this.statisticsDtoManager.transformToDto(nbres);
		} catch (DataAccessDaoException e) {
			throw new StatsDomaineException(exceptionMsg(idCentreGestion,annee), e);
		}
		return transformedToDto;
	}

}

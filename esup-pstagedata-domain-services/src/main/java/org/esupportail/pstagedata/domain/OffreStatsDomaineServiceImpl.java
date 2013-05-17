package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.OffreStatsDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;
import org.esupportail.pstagedata.domain.dto.StatisticItemDTO;
import org.esupportail.pstagedata.exceptions.StatsDomaineException;
import org.esupportail.pstagedata.utils.CoreMessages;
import org.springframework.util.Assert;

/**
 * Gestion des stats sur les offres
 *
 */
public class OffreStatsDomaineServiceImpl  implements OffreStatsDomaineService{


	private OffreStatsDaoService offreStatsDaoService;
	private StatisticsDtoManager statisticsDtoManager;	
	
	@Override
	public List<StatisticItemDTO> getNumberOfOffers(Integer idCenter) throws StatsDomaineException{
	
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffers(idCenter);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			throw new StatsDomaineException(" Probleme lors de l'appel de  getNumberOfOffers ", dtae);	
		}
		return statsDto;
		
	}
	
	@Override
	public List<String> getOfferYears(Integer idCentreGestion)
			throws StatsDomaineException {

		List<String> years =null;
		try {
		 years = this.offreStatsDaoService.getOfferYears(idCentreGestion);
		} catch (DataAccessDaoException cause) {
		throw new StatsDomaineException(" Probleme survenu lors de la recup des annees des offres", cause);
		}
		
		return years;
	}

	/**
	 * @param offreStatsDaoService the offreStatsDaoService to set
	 */
	public void setOffreStatsDaoService(OffreStatsDaoService offreStatsDaoService) {
		this.offreStatsDaoService = offreStatsDaoService;
	}



	/**
	 * @param statisticsDtoManager the statisticsDtoManager to set
	 */
	public void setStatisticsDtoManager(StatisticsDtoManager statisticsDtoManager) {
		this.statisticsDtoManager = statisticsDtoManager;
	}

	public void initOffreStatsDomaine(){
		Assert.notNull(offreStatsDaoService, CoreMessages.getString("objet.requis"));
		Assert.notNull(statisticsDtoManager, CoreMessages.getString("objet.requis"));
	}


	/**
	 *  recupere le nombre d'offres par activite de l'etablisssment, par annee universitaire,
	 */
	@Override
	public List<StatisticItemDTO> getNumberOfOffersByActivity(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByActivity( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
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
	public List<StatisticItemDTO> getNumberOfOffersByStructure(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
	
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByStructure( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}


	@Override
	public List<StatisticItemDTO> getNumberOfOffersByType(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {

		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByType( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}


	@Override
	public List<StatisticItemDTO> getNumberOfOffersByStructureType(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByStructureType( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}

    
	@Override
	public List<StatisticItemDTO> getNumberOfOffersByStructureSize(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByStructureSize( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}


	@Override
	public List<StatisticItemDTO> getNumberOfOffersByStructureDep(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByStructureDep( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}


	@Override
	public List<StatisticItemDTO> getNumberOfOffersByStructureCountry(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByStructureCountry( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}


	@Override
	public List<StatisticItemDTO> getNumberOfOffersByLevel(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByLevel( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}
	
	@Override
	public List<StatisticItemDTO> getNumberOfOffersByFunction(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByFunction( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfOffersByFormation(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByFormation( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}

	@Override
	public List<StatisticItemDTO> getNumberOfOffersByValidation(
			Integer idCentreDeGestion, String annee)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByValidation( idCentreDeGestion,  annee);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfOffersByPublication(
			Integer idCentreDeGestion, String annee)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByPublication( idCentreDeGestion,  annee);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}
	@Override
	public List<StatisticItemDTO> getNumberOfOffersByCandidateFound(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByCandidateFound( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}
	
	public List<StatisticItemDTO> getNumberOfOffersByLocalStudent(
			Integer idCentreDeGestion, String annee, boolean validation, boolean publication)
			throws StatsDomaineException {
		List<StatisticItem> numberOfOffers=null;
		List<StatisticItemDTO> statsDto =null;
		try {
			 numberOfOffers = offreStatsDaoService.getNumberOfOffersByLocalStudent( idCentreDeGestion,  annee, validation, publication);
			statsDto=this.statisticsDtoManager.transformToDto(numberOfOffers);
		} catch (DataAccessDaoException dtae) {		
			new StatsDomaineException(exceptionMsg(idCentreDeGestion, annee), dtae);	
		}
		return statsDto;
	}
}

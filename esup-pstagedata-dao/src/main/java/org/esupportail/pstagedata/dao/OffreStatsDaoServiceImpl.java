package org.esupportail.pstagedata.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.esupportail.pstagedata.dao.AbstractIBatisDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;
import org.esupportail.pstagedata.utils.CoreMessages;
import org.springframework.dao.DataAccessException;

/**
 * gestion des statistiques pour toutes les offres  
 *
 */
public class OffreStatsDaoServiceImpl extends AbstractIBatisDaoService implements OffreStatsDaoService {
	private IEtatOffre etatOffre;

	@SuppressWarnings("unchecked")
	private List<StatisticItem> offresParType(final Integer idCentreDeGestion,
											  final String annee , String requete) throws DataAccessDaoException {
		final	Map <String, Object> parametres = new HashMap<String,Object>(2);
		//les cles idCentreGestion, annee sont celles qui seront utilisees dans les requetes, alors garder cette coherence
		parametres.put("idCentreGestion", idCentreDeGestion);
		parametres.put("annee", annee);
		List<StatisticItem> liste = null;

		try {
			liste = (List<StatisticItem>)this.getSqlMapClientTemplate().queryForList(requete, parametres);

		} catch (DataAccessException dataAe) {
			logger.debug(dataAe);
			StringBuilder sb = new StringBuilder();
			sb.append(" Dans la classe ");
			sb.append(this.getClass().getSimpleName());
			sb.append(", ");
			sb.append(" Acces aux donnees avec les parametres suivants ");
			sb.append(" idCentreDeGestion = ");
			sb.append(idCentreDeGestion);
			sb.append("; annee = ");
			sb.append(annee);
			sb.append(" s'est mal passe ! ");
			throw new DataAccessDaoException(sb.toString(),dataAe);
		}
		return liste;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getOfferYears(Integer idCenter)
			throws DataAccessDaoException {
		List<String>  anneesOffres=null;
		try{
			anneesOffres = (List<String>)this.getSqlMapClientTemplate().queryForList("getOfferYears", idCenter); //$NON-NLS-1$
		} catch (final DataAccessException dae) {
			logger.debug(dae);
			throw new DataAccessDaoException(CoreMessages.getString("stats.erreur.db.acces"), dae) ; //$NON-NLS-1$
		}
		catch(final Exception npe) {
			logger.debug(npe);
			throw new DataAccessDaoException(CoreMessages.getString("stats.erreur.inattendue"), npe);

		}
		return anneesOffres;
	}

	@Override
	public String getStatutOffre() {
		return etatOffre.getEtat();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StatisticItem> getNumberOfOffers(Integer idCenter)
			throws DataAccessDaoException {
		List<StatisticItem> totalOffresParCtre = null;

		try {
			totalOffresParCtre = this.getSqlMapClientTemplate().queryForList("getNumberOfOffers", idCenter);

		}
		catch (final DataAccessException dae) {
			logger.debug(dae);
			throw new DataAccessDaoException(CoreMessages.getString("stats.erreur.db.acces"),dae) ;

		}

		return totalOffresParCtre;

	}


	@Override
	public List<StatisticItem> getNumberOfOffersByActivity(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByActivityAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByActivityAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByActivity");
		}
		return liste;
	}


	@Override
	public List<StatisticItem> getNumberOfOffersByStructure(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructure");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByType(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByTypeAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByTypeAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByType");
		}
		return liste;
	}


	@Override
	public List<StatisticItem> getNumberOfOffersByStructureType(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)		throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureTypeAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureTypeAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureType");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByStructureSize(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureSizeAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureSizeAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureSize");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByStructureDep(	Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureDepAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureDepAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureDep");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByStructureCountry(Integer idCentreDeGestion, String annee, boolean validation, boolean publication) throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureCountryAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureCountryAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByStructureCountry");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByLevel(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByLevelAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByLevelAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByLevel");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByFunction(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByFunctionAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByFunctionAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByFunction");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByFormation(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByFormationAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByFormationAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByFormation");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByValidation(Integer idCentreDeGestion, String annee)throws DataAccessDaoException {
		return offresParType(idCentreDeGestion, annee, "getNumberOfOffersByValidation");
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByPublication(Integer idCentreDeGestion, String annee)throws DataAccessDaoException {
		return offresParType(idCentreDeGestion, annee, "getNumberOfOffersByPublication");
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByCandidateFound(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByCandidateFoundAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByCandidateFoundAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByCandidateFound");
		}
		return liste;
	}

	@Override
	public List<StatisticItem> getNumberOfOffersByLocalStudent(Integer idCentreDeGestion, String annee, boolean validation, boolean publication)throws DataAccessDaoException {
		List<StatisticItem> liste;

		if(validation){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByLocalStudentAndValidation");
		}
		else if (publication){
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByLocalStudentAndPublication");
		}
		else{
			liste= offresParType(idCentreDeGestion, annee, "getNumberOfOffersByLocalStudent");
		}
		return liste;
	}


	public void setEtatOffre(IEtatOffre etatOffre) {
		this.etatOffre = etatOffre;
	}

}

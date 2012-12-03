package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;

/**
 * 
 * recherche des stats items par type
 *
 */
public interface StatsParTypeService {
	
	public List<StatisticItem> findItemsParType(final Integer idCentreGestion,
			final String annee , String requete) throws DataAccessDaoException;
	/**
	 * Recherche d'annees
	 * @param idCentreGestion, s'il est null alors la recherche se fait sur l'ensemble de l'etablissement
	 * @return les annees universitaires
	 * @throws DataAccessDaoException
	 */
	public List<String> 	findAnnees(Integer idCentreGestion,  String requete) throws DataAccessDaoException;
	/**
	 * 
	 * @param idCentreGestion, s'il est null alors la recherche se fait sur l'ensemble de l'etablissement
	 * @return  le nombre d'nnees universitaires trouvees
	 * @throws DataAccessDaoException
	 */
	public List<StatisticItem>	findNombreAnnees(Integer idCentreGestion,  String requete) throws DataAccessDaoException;
}

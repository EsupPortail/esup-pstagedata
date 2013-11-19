package org.esupportail.pstagedata.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.esupportail.pstagedata.dao.AbstractIBatisDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAccessDaoException;
import org.esupportail.pstagedata.domain.beans.StatisticItem;
import org.esupportail.pstagedata.utils.CoreMessages;
import org.springframework.dao.DataAccessException;

public class StatsParTypeServiceImpl  extends AbstractIBatisDaoService  implements StatsParTypeService {

	@SuppressWarnings("unchecked")
	@Override
	public List<StatisticItem> findItemsParType(Integer idCentreGestion,
			String annee, String requete) throws DataAccessDaoException {
		
			final	Map <String, Object> parametres = new HashMap<String,Object>(2);
			parametres.put("idCentreGestion", idCentreGestion);
			parametres.put("annee", annee);
			List<StatisticItem> liste = null;

			try {
//				if (requete.contains("Indemnity")){
//					if (requete.contains("Study")){
//						liste = (List<StatisticItem>)this.getSqlMapClientTemplate().queryForList("getNumberOfConventionsByStudyAndIndemnitySlices", parametres);
//					} else if (requete.contains("Department")){
//						liste = (List<StatisticItem>)this.getSqlMapClientTemplate().queryForList("getNumberOfConventionsByDepartmentAndIndemnitySlices", parametres);
//					} else if (requete.contains("Step")){
//						liste = (List<StatisticItem>)this.getSqlMapClientTemplate().queryForList("getNumberOfConventionsByStepAndIndemnitySlices", parametres);
//					} else {
//						liste = (List<StatisticItem>)this.getSqlMapClientTemplate().queryForList("getNumberOfConventionsByIndemnitySlices", parametres);
//					}
//				} else {
					liste = (List<StatisticItem>)this.getSqlMapClientTemplate().queryForList(requete, parametres);
//				}
			} catch (DataAccessException dataAe) {
				StringBuilder sb = new StringBuilder();
				sb.append(" Dans ");
				sb.append(this.getClass().getSimpleName());
				sb.append(" : ");
				sb.append(" Acces aux donnees avec les parametres suivants ");
				sb.append(" idCentreGestion = ");
				sb.append(idCentreGestion);
				sb.append("; annee = ");
				sb.append(annee);
				sb.append(";s'est mal passe ! ");
				throw new DataAccessDaoException(sb.toString(),dataAe);
				
			}
			
			return liste;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> findAnnees(Integer idCentreGestion, String requete)
			throws DataAccessDaoException {
		//TEST ME
		 List<String>  annees=null;
			try{
				 annees = (List<String>)this.getSqlMapClientTemplate().queryForList(requete,idCentreGestion); //$NON-NLS-1$
			}
			catch (final DataAccessException dae) {
				throw new DataAccessDaoException(CoreMessages.getString("stats.erreur.db.acces"), dae) ; //$NON-NLS-1$
			}
			catch(final Exception npe)
			{
				throw new DataAccessDaoException(CoreMessages.getString("stats.erreur.inattendue"), npe);
				
			}
			return annees;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StatisticItem> findNombreAnnees(Integer idCentreGestion, String requete)
			throws DataAccessDaoException {
		 List<StatisticItem>  nbCvts=null;
			try{
				 nbCvts = (List<StatisticItem>)this.getSqlMapClientTemplate().queryForList(requete, idCentreGestion); //$NON-NLS-1$
			}
			catch (final DataAccessException dae) {
				throw new DataAccessDaoException(CoreMessages.getString("stats.erreur.db.acces"), dae) ; //$NON-NLS-1$
			}
			catch(final Exception npe)
			{
				throw new DataAccessDaoException(CoreMessages.getString("stats.erreur.inattendue"), npe);
				
			}
			return nbCvts;
	}

}

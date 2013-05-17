package org.esupportail.pstagedata.domain;

import java.util.Map;

import org.esupportail.pstagedata.utils.CoreMessages;

public class OffreStatsDomaineManagerImpl implements OffreStatsDomaineManager{
	/**
	 * liste clef, valeur des domaines services pour les offres
	 */
private Map<String, OffreStatsDomaineService> offreStatsDomaineServices;



/*
 * 
 * (non-Javadoc)
 * @see org.esupportail.pstagedata.domain.stats.OffreStatsDomaineManager#create(java.lang.String)
 */
	@Override
	public OffreStatsDomaineService create(String etat) {
		OffreStatsDomaineService oStatsDomaineService = offreStatsDomaineServices.get(etat);
		if(oStatsDomaineService != null){
			return oStatsDomaineService;
		}
		else {
			throw new IllegalArgumentException(CoreMessages.getString("offre.domaine.non.impl"));
		}
		
	}


	/**
	 * @param offreStatsDomaineServices the offreStatsDomaineServices to set
	 */
	public void setOffreStatsDomaineServices(
			Map<String, OffreStatsDomaineService> offreStatsDomaineServices) {
		this.offreStatsDomaineServices = offreStatsDomaineServices;
	}


	
}

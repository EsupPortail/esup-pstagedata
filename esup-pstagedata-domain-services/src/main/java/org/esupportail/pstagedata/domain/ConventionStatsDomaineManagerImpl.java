package org.esupportail.pstagedata.domain;

import java.util.Map;

import org.esupportail.pstagedata.utils.CoreMessages;

public class ConventionStatsDomaineManagerImpl implements
		ConventionStatsDomaineManager {
	/**
	 * liste clef, valeur des domaines services pour les conventions
	 */
private Map<String, ConventionStatsDomaineService> cvtsDomaineServices = null;
@SuppressWarnings("unused")
private CoreMessages coreMessages;
  /**
   * ConventionStatsDomaineService par sont etat
   */
	@Override
	public ConventionStatsDomaineService creer(String etat) {
		ConventionStatsDomaineService oStatsDomaineService = cvtsDomaineServices.get(etat);
		if(oStatsDomaineService != null){
			return oStatsDomaineService;
		}
		else {
			throw new IllegalArgumentException(CoreMessages.getString("cvt.domaine.non.impl"));
		}
	}


	/**
	 * @param cvtsDomaineServices the cvtsDomaineServices to set
	 */
	public void setCvtsDomaineServices(
			Map<String, ConventionStatsDomaineService> cvtsDomaineServices) {
		this.cvtsDomaineServices = cvtsDomaineServices;
	}

}

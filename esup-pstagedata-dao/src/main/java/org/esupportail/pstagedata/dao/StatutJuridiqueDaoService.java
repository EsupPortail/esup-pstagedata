/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.StatutJuridique;

/**
 * StatutJuridique DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface StatutJuridiqueDaoService extends Serializable {
	
	/**
	 * @return List<StatutJuridique>
	 */
	public List<StatutJuridique> getStatutsJuridiques();
	/**
	 * @param id
	 * @return StatutJuridique
	 */
	public StatutJuridique getStatutJuridiqueFromTypeStructure(int id);
	/**
	 * @param id
	 * @return StatutJuridique
	 */
	public StatutJuridique getStatutsJuridiquesFromId(int id);

}

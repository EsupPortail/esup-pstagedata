/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.Indemnisation;

/**
 * AssuranceDaoService DAO service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface IndemnisationDaoService extends Serializable {
	
	
	
	/**
	 * @return List<Indemnisation>
	 */
	
	public List<Indemnisation> getIndemnisations();
	
	

}

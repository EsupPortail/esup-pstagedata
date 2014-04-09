/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.ModeVersGratification;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * NatureTravailDaoService DAO service interface.
 */
public interface ModeVersGratificationDaoService extends Serializable {
	
	

	/**
	 * @return List<ModeValidationStage>
	 */
	public List<ModeVersGratification> getModeVersGratifications();

}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.ModeVersGratificationDTO;



/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */


/**
 * ModeValidationStageDomainService interface.
 */
public interface ModeVersGratificationDomainService extends Serializable {
	
	/**
	 * @return List<ModeValidationStageDTO>
	 */
	public List<ModeVersGratificationDTO> getModeVersGratifications();

}

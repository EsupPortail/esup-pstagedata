/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.ConfidentialiteDTO;


/**
 * Confidentialite Domain service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public interface ConfidentialiteDomainService extends Serializable {
	
	/**
	 * @return List<ConfidentialiteDTO>
	 */
	public List<ConfidentialiteDTO> getConfidentialite();

}

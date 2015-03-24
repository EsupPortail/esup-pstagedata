/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.FapQualificationDTO;
/**
 * FapQualification Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapQualificationDomainService extends Serializable {
	
	/**
	 * @return List<FapQualificationDTO>
	 */
	public List<FapQualificationDTO> getFapQualifications();
	/**
	 * @param id 
	 * @return FapQualificationDTO
	 */
	public FapQualificationDTO getFapQualificationFromId(int id);
	/**
	 * @param id 
	 * @return List<FapQualificationDTO>
	 */
	public List<FapQualificationDTO> getFapQualificationFromIdQualificationSimplifiee(int id);
}

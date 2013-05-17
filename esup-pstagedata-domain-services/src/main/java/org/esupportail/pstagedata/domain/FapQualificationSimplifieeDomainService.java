/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.FapQualificationSimplifieeDTO;

/**
 * FapQualificationSimplifiee Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapQualificationSimplifieeDomainService extends Serializable {
	
	/**
	 * @return List<FapQualificationSimplifieeDTO>
	 */
	public List<FapQualificationSimplifieeDTO> getFapQualificationsSimplifiees();
	/**
	 * @param id 
	 * @return FapQualificationSimplifieeDTO
	 */
	public FapQualificationSimplifieeDTO getFapQualificationSimplifieeFromId(int id);
	/**
	 * @param num 
	 * @return FapQualificationSimplifieeDTO
	 */
	public FapQualificationSimplifieeDTO getFapQualificationSimplifieeFromNumFapQualification(int num);
}

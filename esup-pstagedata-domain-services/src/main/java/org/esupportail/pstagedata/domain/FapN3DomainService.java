/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.FapN3DTO;

/**
 * FapN3 Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapN3DomainService extends Serializable {
	
	/**
	 * @return List<FapN3DTO>
	 */
	public List<FapN3DTO> getFapN3();
	/**
	 * @param code
	 * @return FapN3DTO
	 */
	public FapN3DTO getFapN3FromCodeFapN3(String code);
	/**
	 * @param code
	 * @return FapN3DTO
	 */
	public FapN3DTO getFapN3FromCodeFapN2(String code);
	/**
	 * @param num
	 * @return List<FapN3DTO>
	 */
	public List<FapN3DTO> getFapN3FromQualification(int num);
	/**
	 * @param num
	 * @return List<FapN3DTO>
	 */
	public List<FapN3DTO> getFapN3FromQualificationSimplifiee(int num);
}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.FapN2DTO;



/**
 * FapN2 Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapN2DomainService extends Serializable {
	
	/**
	 * @return List<FapN2DTO>
	 */
	public List<FapN2DTO> getFapN2();
	/**
	 * @param code 
	 * @return FapN2DTO
	 */
	public FapN2DTO getFapN2FromCodeFapN2(String code);
	/**
	 * @param code 
	 * @return FapN2DTO
	 */
	public FapN2DTO getFapN2FromCodeFapN3(String code);
	/**
	 * @param code 
	 * @return List<FapN2DTO>
	 */
	public List<FapN2DTO> getFapN2FromCodeFapN1(String code);

}

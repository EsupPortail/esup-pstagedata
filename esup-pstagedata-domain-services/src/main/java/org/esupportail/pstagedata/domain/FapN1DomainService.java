/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.FapN1DTO;



/**
 * FapN1 Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface FapN1DomainService extends Serializable {
	
	/**
	 * @return List<FapN1DTO>
	 */
	public List<FapN1DTO> getFapN1();
	/**
	 * @param code 
	 * @return FapN1DTO
	 */
	public FapN1DTO getFapN1FromCodeFapN1(String code);
	/**
	 * @param code 
	 * @return FapN1DTO
	 */
	public FapN1DTO getFapN1FromCodeFapN2(String code);
}

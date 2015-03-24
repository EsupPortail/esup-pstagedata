/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.NafN1DTO;



/**
 * NafN1 Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface NafN1DomainService extends Serializable {
	
	/**
	 * @return List<NafN1DTO>
	 */
	public List<NafN1DTO> getNafN1();
	/**
	 * @param code 
	 * @return NafN1DTO
	 */
	public NafN1DTO getNafN1FromCodeNafN1(String code);
	/**
	 * @param code 
	 * @return NafN1DTO
	 */
	public NafN1DTO getNafN1FromCodeNafN5(String code);
}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.NafN5DTO;



/**
 * NafN5 Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface NafN5DomainService extends Serializable {
	
	/**
	 * @return List<NafN5DTO>
	 */
	public List<NafN5DTO> getNafN5();
	/**
	 * @param code 
	 * @return NafN5DTO
	 */
	public NafN5DTO getNafN5FromCodeNafN5(String code);

	/**
	 * @param code
	 * @return List<NafN5DTO>
	 */
	public List<NafN5DTO> getNafN5FromCodeNafN1(String code);
}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.TempsTravailDTO;

/**
 * TempsTravail Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface TempsTravailDomainService extends Serializable {
	
	/**
	 * @return List<TempsTravailDTO>
	 */
	public List<TempsTravailDTO> getTempsTravail();

}

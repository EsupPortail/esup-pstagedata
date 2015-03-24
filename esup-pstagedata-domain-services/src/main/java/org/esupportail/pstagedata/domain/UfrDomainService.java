/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.UfrDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * UniteDuree Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface UfrDomainService extends Serializable {
	
	/**
	 * @param codeUniversite 
	 * @return List<UfrDTO>
	 */
	public List<UfrDTO> getUfrs(String codeUniversite);

	/**
	 * @param code
	 * @param codeUniversite 
	 * @return UfrDTO
	 */
	public UfrDTO getUfrFromId(String code, String codeUniversite);
	
	/**
	 * @param idsCentreGestion
	 * @param codeUniversite 
	 * @return List<UfrDTO>
	 */
	public List<UfrDTO> getUfrsFromIdsCentreGestion(List<Integer> idsCentreGestion, String codeUniversite);
	/**
	 * @param ufr
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 */
	public int addUfr(UfrDTO ufr) throws DataAddException, WebServiceDataBaseException;

}

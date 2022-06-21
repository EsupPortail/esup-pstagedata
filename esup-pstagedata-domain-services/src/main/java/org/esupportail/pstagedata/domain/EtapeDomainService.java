/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.EtapeDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * UniteDuree Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface EtapeDomainService extends Serializable {
	
	/**
	 * @param codeUniversite 
	 * @return List<EtapeDTO>
	 */
	public List<EtapeDTO> getEtapes(String codeUniversite);
	
	
	/**
	 * @param code
	 * @param codeUniversite 
	 * @return EtapeDTO
	 */
	public EtapeDTO getEtapeFromId(String code, String codeUniversite);
	
	/**
	 * @param idsCentreGestion
	 * @param codeUniversite 
	 * @return List<EtapeDTO>
	 */
	public List<EtapeDTO> getEtapesFromIdsCentreGestion(List<Integer> idsCentreGestion, String codeUniversite, String anneeUniv);
	
	/**
	 * @param etape
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 */
	public int addEtape(EtapeDTO etape) throws DataAddException, WebServiceDataBaseException;
	
	

}

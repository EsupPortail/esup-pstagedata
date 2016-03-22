/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.OrigineStageDTO;
import org.esupportail.pstagedata.exceptions.*;

/**
 * UniteDuree Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface OrigineStageDomainService extends Serializable {
	
	/**
	 * @return List<OrigineStageDTO>
	 */
	public List<OrigineStageDTO> getOrigineStages();
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addOrigineStage(OrigineStageDTO os) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateOrigineStage(OrigineStageDTO os) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteOrigineStage(int id) throws DataDeleteException,WebServiceDataBaseException;
	/**
	 * @param id
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateOrigineStage(int id) throws DataReactivateException,WebServiceDataBaseException;
}

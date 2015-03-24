/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.ModeValidationStageDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;



/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */


/**
 * ModeValidationStageDomainService interface.
 */
public interface ModeValidationStageDomainService extends Serializable {
	
	/**
	 * @return List<ModeValidationStageDTO>
	 */
	public List<ModeValidationStageDTO> getModeValidationStages();

	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addModeValidationStage(ModeValidationStageDTO mv) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateModeValidationStage(ModeValidationStageDTO mv) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteModeValidationStage(int id) throws DataDeleteException,WebServiceDataBaseException;

}

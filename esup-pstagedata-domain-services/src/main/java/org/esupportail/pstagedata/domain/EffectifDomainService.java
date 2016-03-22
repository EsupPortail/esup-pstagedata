/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.EffectifDTO;
import org.esupportail.pstagedata.exceptions.*;


/**
 * Effectif Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface EffectifDomainService extends Serializable {
	
	/**
	 * @return List<EffectifDTO>
	 */
	public List<EffectifDTO> getEffectifs();
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addEffectif(EffectifDTO ef) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateEffectif(EffectifDTO ef) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteEffectif(int id) throws DataDeleteException,WebServiceDataBaseException;
	/**
	 * @param id
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateEffectif(int id) throws DataReactivateException,WebServiceDataBaseException;
}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.Effectif;
import org.esupportail.pstagedata.exceptions.*;


/**
 * Effectif DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface EffectifDaoService extends Serializable {
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addEffectif(Effectif ef) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateEffectif(Effectif ef) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteEffectif(int id) throws DataDeleteException,WebServiceDataBaseException;

	/**
	 * @return List<Effectif>
	 */
	public List<Effectif> getEffectifs();
	/**
	 * @param id
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateEffectif(int id) throws DataReactivateException,WebServiceDataBaseException;
}

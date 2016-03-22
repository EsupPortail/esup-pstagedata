/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.ContratOffre;
import org.esupportail.pstagedata.exceptions.*;


/**
 * Contrat DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface ContratDaoService extends Serializable {
	
	/**
	 * @return List<ContratOffre>
	 */
	public List<ContratOffre> getContrats();
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addContratOffre(ContratOffre co) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateContratOffre(ContratOffre co) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteContratOffre(int id) throws DataDeleteException,WebServiceDataBaseException;
	/**
	 * @param id
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateContratOffre(int id) throws DataReactivateException,WebServiceDataBaseException;
}

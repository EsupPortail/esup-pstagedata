/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.StatutJuridiqueDTO;
import org.esupportail.pstagedata.exceptions.*;

/**
 * StatutJuridique Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface StatutJuridiqueDomainService extends Serializable {
	
	/**
	 * @return List<StatutJuridiqueDTO>
	 */
	public List<StatutJuridiqueDTO> getStatutsJuridiques();
	/**
	 * @param id
	 * @return StatutJuridiqueDTO
	 */
	public StatutJuridiqueDTO getStatutJuridiqueFromTypeStructure(int id);
	/**
	 * @param id
	 * @return StatutJuridiqueDTO
	 */
	public StatutJuridiqueDTO getStatutsJuridiquesFromId(int id);
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addStatutJuridique(StatutJuridiqueDTO sj) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateStatutJuridique(StatutJuridiqueDTO sj) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteStatutJuridique(int id) throws DataDeleteException,WebServiceDataBaseException;
	/**
	 * @param id
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateStatutJuridique(int id) throws DataReactivateException,WebServiceDataBaseException;
}

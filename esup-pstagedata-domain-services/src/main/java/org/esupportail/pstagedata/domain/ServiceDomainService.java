/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.ServiceDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * Service Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface ServiceDomainService extends Serializable {
	/**
	 * @param id
	 * @return ServiceDTO
	 */
	public ServiceDTO getServiceFromId(int id);
	/**
	 * @param id
	 * @return ServiceDTO
	 */ 
	public ServiceDTO getServiceFromIdContact(int id);
	/**
	 * @param id
	 * @return List<ServiceDTO>
	 */
	public List<ServiceDTO> getServicesFromIdStructure(int id);
	/**
	 * @param idService
	 * @return int
	 */
	public int countContactRefOffre(int idService);
	/**
	 * @param idService
	 * @return int
	 */
	public int countContactRefConvention(int idService);
	/**
	 * @param idService
	 * @return int
	 */
	public int countContactRefAccord(int idService);
	/**
	 * @param idService
	 * @return int
	 */
	public int countContactAvecCompte(int idService);
	/**
	 * @param s
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addService(ServiceDTO s) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param s
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateService(ServiceDTO s) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idService
	 * @param loginInfosAJour
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateServiceInfosAJour(int idService, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idService
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteService(int idService) throws DataDeleteException, WebServiceDataBaseException;
	/**
	 * @param idStructure
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteServiceFromIdStructure(int idStructure) throws DataDeleteException, WebServiceDataBaseException;
}

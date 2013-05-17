/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ServiceDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Service;
import org.esupportail.pstagedata.domain.dto.ServiceDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * Service Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ServiceDomainServiceImpl implements ServiceDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ServiceDaoService
	 */
	private ServiceDaoService serviceDaoService;
	/**
	 * @return the serviceDaoService
	 */
	public ServiceDaoService getServiceDaoService() {
		return serviceDaoService;
	}
	/**
	 * @param serviceDaoService the serviceDaoService to set
	 */
	public void setServiceDaoService(ServiceDaoService serviceDaoService) {
		this.serviceDaoService = serviceDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#addService(org.esupportail.pstagedata.domain.dto.ServiceDTO)
	 */
	public int addService(ServiceDTO s) throws DataAddException, WebServiceDataBaseException{
		int tmp=0;
		try{
			tmp = this.serviceDaoService.addService(UtilsDTO.getServiceFromDTO(s));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#deleteService(int)
	 */
	public boolean deleteService(int idService) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.serviceDaoService.deleteService(idService);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#deleteServiceFromIdStructure(int)
	 */
	public boolean deleteServiceFromIdStructure(int idStructure) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.serviceDaoService.deleteServiceFromIdStructure(idStructure);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#getServiceFromId(int)
	 */
	public ServiceDTO getServiceFromId(int id) {
		Service s =  this.serviceDaoService.getServiceFromId(id);
		return s==null?null:new ServiceDTO(s);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#getServiceFromIdContact(int)
	 */
	public ServiceDTO getServiceFromIdContact(int id) {
		Service s = this.serviceDaoService.getServiceFromIdContact(id);
		return s==null?null:new ServiceDTO(s);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#getServicesFromIdStructure(int)
	 */
	public List<ServiceDTO> getServicesFromIdStructure(int id) {
		return UtilsDTO.getServiceListDTO(this.serviceDaoService.getServicesFromIdStructure(id));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#countContactRefOffre(int)
	 */
	public int countContactRefOffre(int idService){
		return this.serviceDaoService.countContactRefOffre(idService);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#countContactRefConvention(int)
	 */
	public int countContactRefConvention(int idService){
		return this.serviceDaoService.countContactRefConvention(idService);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#countContactRefAccord(int)
	 */
	public int countContactRefAccord(int idService){
		return this.serviceDaoService.countContactRefAccord(idService);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#countContactAvecCompte(int)
	 */
	public int countContactAvecCompte(int idService){
		return this.serviceDaoService.countContactAvecCompte(idService);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#updateService(org.esupportail.pstagedata.domain.dto.ServiceDTO)
	 */
	public boolean updateService(ServiceDTO s) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.serviceDaoService.updateService(UtilsDTO.getServiceFromDTO(s));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ServiceDomainService#updateServiceInfosAJour(int, java.lang.String)
	 */
	public boolean updateServiceInfosAJour(int idService, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.serviceDaoService.updateServiceInfosAJour(idService,loginInfosAJour);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	

}

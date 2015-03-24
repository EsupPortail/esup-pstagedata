/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.AdminStructureDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.AdminStructure;
import org.esupportail.pstagedata.domain.dto.AdminStructureDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;

/**
 * AdminStructure Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AdminStructureDomainServiceImpl implements AdminStructureDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * AdminStructureDaoService
	 */
	public AdminStructureDaoService adminStructureDaoService;

	/**
	 * @return the adminStructureDaoService
	 */
	public AdminStructureDaoService getAdminStructureDaoService() {
		return adminStructureDaoService;
	}

	/**
	 * @param adminStructureDaoService the adminStructureDaoService to set
	 */
	public void setAdminStructureDaoService(
			AdminStructureDaoService adminStructureDaoService) {
		this.adminStructureDaoService = adminStructureDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AdminStructureDomainService#addAdminStructure(org.esupportail.pstagedata.domain.dto.AdminStructureDTO)
	 */
	public int addAdminStructure(AdminStructureDTO admin) throws DataAddException, WebServiceDataBaseException{
		int tmp=0;
		try{
			tmp = adminStructureDaoService.addAdminStructure(UtilsDTO.getAdminStructureFromDTO(admin));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AdminStructureDomainService#deleteAdminStructure(int)
	 */
	public boolean deleteAdminStructure(int idAdminStructure) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = adminStructureDaoService.deleteAdminStructure(idAdminStructure);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AdminStructureDomainService#getAdminStructureFromEppn(java.lang.String)
	 */
	public AdminStructureDTO getAdminStructureFromEppn(String eppn) {
		AdminStructure a = adminStructureDaoService.getAdminStructureFromEppn(eppn);
		return a==null?null:new AdminStructureDTO(a);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AdminStructureDomainService#getAdminStructureFromLogin(java.lang.String)
	 */
	public AdminStructureDTO getAdminStructureFromLogin(String login) {
		AdminStructure a = adminStructureDaoService.getAdminStructureFromLogin(login);
		return a==null?null:new AdminStructureDTO(a);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AdminStructureDomainService#getAdminsStructure()
	 */
	public List<AdminStructureDTO> getAdminsStructure() {
		return UtilsDTO.getAdminStructureListDTO(adminStructureDaoService.getAdminsStructure());
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AdminStructureDomainService#updateAdminStructure(org.esupportail.pstagedata.domain.dto.AdminStructureDTO)
	 */
	public boolean updateAdminStructure(AdminStructureDTO admin) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = adminStructureDaoService.updateAdminStructure(UtilsDTO.getAdminStructureFromDTO(admin));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.AdminStructureDomainService#updateAdminStructureDerniereConnexion(org.esupportail.pstagedata.domain.dto.AdminStructureDTO)
	 */
	public boolean updateAdminStructureDerniereConnexion(AdminStructureDTO admin) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = adminStructureDaoService.updateAdminStructureDerniereConnexion(UtilsDTO.getAdminStructureFromDTO(admin));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	

}

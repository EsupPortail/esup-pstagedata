/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.AdminStructureDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * AdminStructure Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface AdminStructureDomainService extends Serializable {
	
	/**
	 * @return List<AdminStructureDTO>
	 */
	public List<AdminStructureDTO> getAdminsStructure();
	/**
	 * @param login 
	 * @return AdminStructureDTO
	 */
	public AdminStructureDTO getAdminStructureFromLogin(String login);
	/**
	 * @param eppn 
	 * @return AdminStructureDTO
	 */
	public AdminStructureDTO getAdminStructureFromEppn(String eppn);
	/**
	 * @param admin 
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addAdminStructure(AdminStructureDTO admin) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param admin 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateAdminStructure(AdminStructureDTO admin) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param admin 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateAdminStructureDerniereConnexion(AdminStructureDTO admin) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idAdminStructure 
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteAdminStructure(int idAdminStructure) throws DataDeleteException, WebServiceDataBaseException;

}

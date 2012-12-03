/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Service;



/**
 * Service DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface ServiceDaoService extends Serializable {
	/**
	 * @param id
	 * @return Service
	 */
	public Service getServiceFromId(int id);
	/**
	 * @param id
	 * @return Service
	 */ 
	public Service getServiceFromIdContact(int id);
	/**
	 * @param id
	 * @return List<Service>
	 */
	public List<Service> getServicesFromIdStructure(int id);
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
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addService(Service s) throws DataAddDaoException, DataBaseDaoException;
	/**
	 * @param s
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateService(Service s) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idService
	 * @param loginInfosAJour
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateServiceInfosAJour(int idService, String loginInfosAJour) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idService
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteService(int idService) throws DataDeleteDaoException, DataBaseDaoException;
	/**
	 * @param idStructure
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteServiceFromIdStructure(int idStructure) throws DataDeleteDaoException, DataBaseDaoException;
}

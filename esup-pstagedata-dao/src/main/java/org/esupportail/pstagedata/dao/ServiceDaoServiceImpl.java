/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Service;
import org.springframework.dao.DataAccessException;

/**
 * Service DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ServiceDaoServiceImpl extends AbstractIBatisDaoService implements ServiceDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#addService(org.esupportail.pstagedata.domain.beans.Service)
	 */
	public int addService(Service s) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			tmp = (Integer)getSqlMapClientTemplate().insert("addService", s);
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#deleteService(int)
	 */
	public boolean deleteService(int idService) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteService", idService)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#deleteServiceFromIdStructure(int)
	 */
	public boolean deleteServiceFromIdStructure(int idStructure) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteServiceFromIdStructure", idStructure)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#getServiceFromId(int)
	 */
	public Service getServiceFromId(int id) {
		return (Service) getSqlMapClientTemplate().queryForObject("getServiceFromId", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#getServiceFromIdContact(int)
	 */
	public Service getServiceFromIdContact(int id) {
		return (Service) getSqlMapClientTemplate().queryForObject("getServiceFromIdContact", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#getServicesFromIdStructure(int)
	 */
	@SuppressWarnings("unchecked")
	public List<Service> getServicesFromIdStructure(int id) {
		return getSqlMapClientTemplate().queryForList("getServicesFromIdStructure", id);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#countContactRefOffre(int)
	 */
	public int countContactRefOffre(int idService){
		return  (Integer) getSqlMapClientTemplate().queryForObject("countContactRefOffre", idService);		
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#countContactRefConvention(int)
	 */
	public int countContactRefConvention(int idService){
		return  (Integer) getSqlMapClientTemplate().queryForObject("countContactRefConvention", idService);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#countContactRefAccord(int)
	 */
	public int countContactRefAccord(int idService){
		return  (Integer) getSqlMapClientTemplate().queryForObject("countContactRefAccord", idService);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#countContactAvecCompte(int)
	 */
	public int countContactAvecCompte(int idService){
		return  (Integer) getSqlMapClientTemplate().queryForObject("countContactAvecCompte", idService);		
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#updateService(org.esupportail.pstagedata.domain.beans.Service)
	 */
	public boolean updateService(Service s) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateService", s)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.ServiceDaoService#updateServiceInfosAJour(int, java.lang.String)
	 */
	public boolean updateServiceInfosAJour(int idService, String loginInfosAJour) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idService", ""+idService);
		parameterMap.put("loginInfosAJour", loginInfosAJour);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateServiceInfosAJour", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

	
}

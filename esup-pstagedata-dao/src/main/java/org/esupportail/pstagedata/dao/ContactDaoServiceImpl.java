/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Contact;
import org.springframework.dao.DataAccessException;

/**
 * Contact DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContactDaoServiceImpl extends AbstractIBatisDaoService implements ContactDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#getContactFromId(int)
	 */
	public Contact getContactFromId(int id){
		return (Contact) getSqlMapClientTemplate().queryForObject("getContactFromId", id);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#getContactsFromIdServiceAndCodeUniversite(int, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List<Contact> getContactsFromIdServiceAndCodeUniversite(int idService, String codeUniversite){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idService", Integer.toString(idService));
		parameterMap.put("codeUniversite", ""+codeUniversite);
		return getSqlMapClientTemplate().queryForList("getContactsFromIdServiceAndCodeUniversite", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#getContactsFromIdServiceAndIdCentreGestion(int, int)
	 */
	@SuppressWarnings("unchecked")
	public List<Contact> getContactsFromIdServiceAndIdCentreGestion(int idService, int idCentreGestion){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idService", Integer.toString(idService));
		parameterMap.put("idCentreGestion", Integer.toString(idCentreGestion));
		return getSqlMapClientTemplate().queryForList("getContactsFromIdServiceAndIdCentreGestion", parameterMap);
	}
	
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#getContactFromLogin(java.lang.String)
	 */
	public Contact getContactFromLogin(String login){
		return (Contact) getSqlMapClientTemplate().queryForObject("getContactFromLogin", login);
	}
	
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#getContactEntrepriseAvecCompteFromMailAndIdStructure(java.lang.String, int)
	 */
	public Contact getContactEntrepriseAvecCompteFromMailAndIdStructure(String mail, int idStructure){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("mail", mail);
		parameterMap.put("idStructure", Integer.toString(idStructure));
		return  (Contact) getSqlMapClientTemplate().queryForObject("getContactEntrepriseAvecCompteFromMailAndIdStructure", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#getContactEntrepriseFromMailAndIdStructure(java.lang.String, int)
	 */
	public Contact getContactEntrepriseFromMailAndIdStructure(String mail, int idStructure){
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("mail", mail);
		parameterMap.put("idStructure", Integer.toString(idStructure));
		return  (Contact) getSqlMapClientTemplate().queryForObject("getContactEntrepriseFromMailAndIdStructure", parameterMap);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#countOffreRefContact(int)
	 */
	public int countOffreRefContact(int idContact){
		return (Integer)getSqlMapClientTemplate().queryForObject("countOffreRefContact", idContact);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#countConventionRefContact(int)
	 */
	public int countConventionRefContact(int idContact){
		return (Integer)getSqlMapClientTemplate().queryForObject("countConventionRefContact", idContact);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#getNombreContactByCentreGestion(int)
	 */
	public int getNombreContactByCentreGestion(int idCentreGestion){
		return (Integer)getSqlMapClientTemplate().queryForObject("getNombreContactByCentreGestion", idCentreGestion);
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#addContact(org.esupportail.pstagedata.domain.beans.Contact)
	 */
	public int addContact(Contact c) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addContact",c);
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#updateContact(org.esupportail.pstagedata.domain.beans.Contact)
	 */
	public boolean updateContact(Contact c) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateContact", c)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#updateCompteContact(org.esupportail.pstagedata.domain.beans.Contact)
	 */
	public boolean updateCompteContact(Contact c) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateCompteContact", c)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#updateContactInfosAJour(int, java.lang.String)
	 */
	public boolean updateContactInfosAJour(int idContact, String loginInfosAJour) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, String> parameterMap = new HashMap<String, String>();
		parameterMap.put("idContact", Integer.toString(idContact));
		parameterMap.put("loginInfosAJour", loginInfosAJour);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateContactInfosAJour", parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#updateContactDerniereConnexion(int, java.util.Date)
	 */
	public boolean updateContactDerniereConnexion(int idContact, Date avantDerniereConnexion) throws DataUpdateDaoException, DataBaseDaoException{
		HashMap<String, Object> parameterMap = new HashMap<String, Object>();
		parameterMap.put("idContact", Integer.toString(idContact));
		parameterMap.put("avantDerniereConnexion", avantDerniereConnexion);
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateContactDerniereConnexion",parameterMap)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#deleteComptesContactFromIdService(int)
	 */
	public boolean deleteComptesContactFromIdService(int idService) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("deleteComptesContactFromIdService", idService)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#deleteContact(int)
	 */
	public boolean deleteContact(int idContact) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteContact", idContact)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.dao.ContactDaoService#deleteContactFromIdService(int)
	 */
	public boolean deleteContactFromIdService(int idService) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteContactFromIdService", idService)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
}

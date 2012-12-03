/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Contact;

/**
 * Contact DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface ContactDaoService extends Serializable {
	
//	/**
//	 * @param idCentreGestion 
//	 * @param codeUniversite 
//	 * @return List<Contact>
//	 */
//	public List<Contact> getContactsFromIdCenter(int idCentreGestion, String codeUniversite);
//	
	/**
	 * @param id
	 * @return Contact
	 */
	public Contact getContactFromId(int id);
	
	/**
	 * @param idService
	 * @param codeUniversite 
	 * @return List<Contact>
	 */
	public List<Contact> getContactsFromIdServiceAndCodeUniversite(int idService, String codeUniversite);
	/**
	 * @param idService
	 * @param idCentreGestion
	 * @return List<Contact>
	 */
	public List<Contact> getContactsFromIdServiceAndIdCentreGestion(int idService, int idCentreGestion);
	
	/**
	 * @param login
	 * @return Contact
	 */
	public Contact getContactFromLogin(String login);
	
	/**
	 * @param mail
	 * @param idStructure
	 * @return Contact
	 */
	public Contact getContactEntrepriseAvecCompteFromMailAndIdStructure(String mail, int idStructure);
	/**
	 * @param mail
	 * @param idStructure
	 * @return Contact
	 */
	public Contact getContactEntrepriseFromMailAndIdStructure(String mail, int idStructure);
	/**
	 * @param idContact
	 * @return int
	 */
	public int countOffreRefContact(int idContact);
	/**
	 * @param idContact
	 * @return int
	 */
	public int countConventionRefContact(int idContact);
	/**
	 * @param idCentreGestion
	 * @return int
	 */
	public int getNombreContactByCentreGestion(int idCentreGestion);
	/**
	 * @param c
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 */
	public int addContact(Contact c) throws DataAddDaoException, DataBaseDaoException;
	
	/**
	 * @param c
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateContact(Contact c) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param c
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean updateCompteContact(Contact c) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idContact 
	 * @param loginInfosAJour 
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateContactInfosAJour(int idContact, String loginInfosAJour) throws DataUpdateDaoException, DataBaseDaoException;
	
	/**
	 * @param idContact 
	 * @param avantDerniereConnexion 
	 * @return boolean
	 * @throws DataUpdateDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean updateContactDerniereConnexion(int idContact, Date avantDerniereConnexion) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idService
	 * @return boolean
	 * @throws DataUpdateDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteComptesContactFromIdService(int idService) throws DataUpdateDaoException, DataBaseDaoException;
	/**
	 * @param idContact 
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 */
	public boolean deleteContact(int idContact) throws DataDeleteDaoException, DataBaseDaoException;
	/**
	 * @param idService
	 * @return boolean
	 * @throws DataDeleteDaoException
	 * @throws DataBaseDaoException
	 */
	public boolean deleteContactFromIdService(int idService) throws DataDeleteDaoException, DataBaseDaoException;

}

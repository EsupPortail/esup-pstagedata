/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.ContactDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * Contact domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface ContactDomainService extends Serializable {

	/**
	 * @param id
	 * @return ContactDTO
	 */
	public ContactDTO getContactFromId(int id);

	/**
	 * @param idService
	 * @param idsCentresGestion
	 * @param codeUniversite
	 * @return List<ContactDTO>
	 */
	public List<ContactDTO> getContactsFromIdService(int idService, List<Integer> idsCentresGestion, String codeUniversite);

	/**
	 * @param login
	 * @return ContactDTO
	 */
	public ContactDTO getContactFromLogin(String login);

	/**
	 * @param mail
	 * @param idStructure 
	 * @return ContactDTO
	 */
	public ContactDTO getContactEntrepriseAvecCompteFromMailAndIdStructure(String mail, int idStructure);
	/**
	 * @param mail
	 * @param idStructure
	 * @return ContactDTO
	 */
	public ContactDTO getContactEntrepriseFromMailAndIdStructure(String mail, int idStructure);
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
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addContact(ContactDTO c) throws DataAddException, WebServiceDataBaseException;

	/**
	 * @param c
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateContact(ContactDTO c) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param c
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean updateCompteContact(ContactDTO c) throws  DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idContact 
	 * @param loginInfosAJour 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateContactInfosAJour(int idContact, String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException;

	/**
	 * @param idContact 
	 * @param avantDerniereConnexion 
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateContactDerniereConnexion(int idContact, Date avantDerniereConnexion) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idService
	 * @return boolean
	 * @throws DataUpdateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteComptesContactFromIdService(int idService) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idContact 
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteContact(int idContact) throws DataDeleteException, WebServiceDataBaseException;
	/**
	 * @param idService
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteContactFromIdService(int idService) throws DataDeleteException, WebServiceDataBaseException;
}

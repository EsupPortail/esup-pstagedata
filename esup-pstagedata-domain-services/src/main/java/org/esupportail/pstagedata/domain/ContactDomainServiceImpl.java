/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.esupportail.pstagedata.dao.CentreGestionDaoService;
import org.esupportail.pstagedata.dao.ContactDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.CentreGestion;
import org.esupportail.pstagedata.domain.beans.Contact;
import org.esupportail.pstagedata.domain.dto.ContactDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;
import org.springframework.util.StringUtils;


/**
 * Contact Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContactDomainServiceImpl implements ContactDomainService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ContactDaoService
	 */
	private ContactDaoService contactDaoService;
	/**
	 * CentreGestionDaoService
	 */
	private CentreGestionDaoService centreGestionDaoService;
	/**
	 * @return the contactDaoService
	 */
	public ContactDaoService getContactDaoService() {
		return contactDaoService;
	}
	/**
	 * @param contactDaoService the contactDaoService to set
	 */
	public void setContactDaoService(ContactDaoService contactDaoService) {
		this.contactDaoService = contactDaoService;
	}

	/**
	 * @return the centreGestionDaoService
	 */
	public CentreGestionDaoService getCentreGestionDaoService() {
		return centreGestionDaoService;
	}
	/**
	 * @param centreGestionDaoService the centreGestionDaoService to set
	 */
	public void setCentreGestionDaoService(
			CentreGestionDaoService centreGestionDaoService) {
		this.centreGestionDaoService = centreGestionDaoService;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#addContact(org.esupportail.pstagedata.domain.dto.ContactDTO)
	 */
	public int addContact(ContactDTO c) throws DataAddException, WebServiceDataBaseException{
		int tmp=0;
		try{
			tmp = this.contactDaoService.addContact(UtilsDTO.getContactFromDTO(c));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#deleteContact(int)
	 */
	public boolean deleteContact(int idContact) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.contactDaoService.deleteContact(idContact);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#deleteContactFromIdService(int)
	 */
	public boolean deleteContactFromIdService(int idService) throws DataDeleteException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.contactDaoService.deleteContactFromIdService(idService);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#getContactFromId(int)
	 */
	public ContactDTO getContactFromId(int id) {
		Contact c = this.contactDaoService.getContactFromId(id);
		return c==null?null:new ContactDTO(c);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#getContactFromLogin(java.lang.String)
	 */
	public ContactDTO getContactFromLogin(String login) {
		Contact c = this.contactDaoService.getContactFromLogin(login);
		return c==null?null:new ContactDTO(c);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#getContactEntrepriseAvecCompteFromMailAndIdStructure(java.lang.String, int)
	 */
	public ContactDTO getContactEntrepriseAvecCompteFromMailAndIdStructure(String mail, int idStructure){
		Contact c = this.contactDaoService.getContactEntrepriseAvecCompteFromMailAndIdStructure(mail, idStructure);
		return c==null?null:new ContactDTO(c);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#getContactEntrepriseFromMailAndIdStructure(java.lang.String, int)
	 */
	public ContactDTO getContactEntrepriseFromMailAndIdStructure(String mail, int idStructure){
		Contact c = this.contactDaoService.getContactEntrepriseFromMailAndIdStructure(mail, idStructure);
		return c==null?null:new ContactDTO(c);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#getContactsFromIdService(int, java.util.List, java.lang.String)
	 */
	public List<ContactDTO> getContactsFromIdService(int idService, List<Integer> idsCentresGestion, String codeUniversite){
		List<ContactDTO> lRet = new ArrayList<ContactDTO>();
		List<ContactDTO> lTmp = null;
		boolean entrepriseOnly=false;
		if(idService>0 && idsCentresGestion!=null && !idsCentresGestion.isEmpty() && StringUtils.hasText(codeUniversite)){
			// Recup cg Entreprise
			CentreGestion cgEntr = this.centreGestionDaoService.getCentreEntreprise();			
			if(cgEntr!=null && cgEntr.getIdCentreGestion()>0){
				if(idsCentresGestion.size() == 1 && idsCentresGestion.contains(cgEntr.getIdCentreGestion())){
					//Si l'on se trouve cote entreprise
					entrepriseOnly=true;
					//Recup des contacts entreprises uniquement
					lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, cgEntr.getIdCentreGestion()));
					if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);
				} else if (idsCentresGestion.size() > 1 && idsCentresGestion.contains(cgEntr.getIdCentreGestion())){
					//Si on se trouve côté stage et que l'on est rattach� au centre ets
					//On laisse passer, le centre etant dans les idsCentre, ses contacts seront recup par la suite
				} else {
					//Si on se trouve côté stage sans etre rattache au centre entreprise
					//Recup des contacts entreprises si pas de confidentialit� sur le centre entreprise
					switch (cgEntr.getCodeConfidentialite().charAt(0)) {
					case '0'://Pas de confidentialite
						lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, cgEntr.getIdCentreGestion()));
						if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);
						break;
					}
				}
			}
			//Si on se trouve cote stage
			if(!entrepriseOnly){
				//Recup cg Etab de l'universite
				CentreGestion cgEtab = this.centreGestionDaoService.getCentreEtablissement(codeUniversite);
				if(cgEtab!=null && cgEtab.getIdCentreGestion()>0){
					switch (cgEtab.getCodeConfidentialite().charAt(0)) {
					case '0'://Pas de confidentialite
						//Recup de tous les contacts de l'universite
						lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndCodeUniversite(idService, codeUniversite));
						if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);
						break;
					case '1'://Confidentialite totale
						//Recup des contacts des centres en parametre
						for(int i : idsCentresGestion){
							lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, i));
							if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);
						}
						//Recup contacts centre etab sauf si deja en parametre
						if(!idsCentresGestion.contains(cgEtab.getIdCentreGestion())){
							lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, cgEtab.getIdCentreGestion()));
							if(lTmp!=null && !lTmp.isEmpty()) lRet.addAll(lTmp);
						}
						break;
					case '2'://Confidentialite libre
						//Recup des contacts des centres sans confidentialite hormis centre en parametre
						List<Integer> lIdsCentresSansConf = this.centreGestionDaoService.getIdsCentreGestionSansConfidentialiteFromCodeUniversite(codeUniversite);
						if(lIdsCentresSansConf!=null && !lIdsCentresSansConf.isEmpty()){
							for(int i : lIdsCentresSansConf){
								if(!idsCentresGestion.contains(i)){
									lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, i));
									if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);
								}
							}
						}
						//Recup des contacts des centres en parametre
						for(int i : idsCentresGestion){
							lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, i));
							if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);
						}
						//Recup contacts centre etab sauf si deja en parametre
						if(!idsCentresGestion.contains(cgEtab.getIdCentreGestion())){
							lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, cgEtab.getIdCentreGestion()));
							if(lTmp!=null && !lTmp.isEmpty()) lRet.addAll(lTmp);
						}
						break;
					}
				}
			}
		//Si idsCentreGestion null donc cote stage donc recup contacts sans confidentialité
		}else if(idService>0 && (idsCentresGestion==null || idsCentresGestion.isEmpty()) && StringUtils.hasText(codeUniversite)){
			// Recup cg Entreprise
			CentreGestion cgEntr = this.centreGestionDaoService.getCentreEntreprise();			
			if(cgEntr!=null && cgEntr.getIdCentreGestion()>0){
				//Recup des contacts entreprises si pas de confidentialite sur le centre entreprise
				switch (cgEntr.getCodeConfidentialite().charAt(0)) {
				case '0'://Pas de confidentialité
					lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, cgEntr.getIdCentreGestion()));
					if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);
					break;
				}
			}
			// Si idsCentresGestion null ou vide
			// Récupération	des contacts visible par tous
			CentreGestion cgEtab = this.centreGestionDaoService.getCentreEtablissement(codeUniversite);
			if(cgEtab!=null && cgEtab.getIdCentreGestion()>0){
				switch (cgEtab.getCodeConfidentialite().charAt(0)) {
				case '0'://Pas de confidentialité
					//Recup de tout les contacts de l'université
					lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndCodeUniversite(idService, codeUniversite));
					if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);
					break;
				case '1'://Confidentialité totale
					//Recup contacts centre etab
					lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, cgEtab.getIdCentreGestion()));
					if(lTmp!=null && !lTmp.isEmpty()) lRet.addAll(lTmp);
					break;
				case '2'://Confidentialité libre
					//Recup des contacts des centres sans confidentialité
					List<Integer> lIdsCentresSansConf = this.centreGestionDaoService.getIdsCentreGestionSansConfidentialiteFromCodeUniversite(codeUniversite);
					if(lIdsCentresSansConf!=null && !lIdsCentresSansConf.isEmpty()){
						for(int i : lIdsCentresSansConf){
							lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, i));
							if(lTmp!=null && !lTmp.isEmpty())lRet.addAll(lTmp);

						}
					}
					//Recup contacts centre etab
					lTmp=UtilsDTO.getContactListDTO(this.contactDaoService.getContactsFromIdServiceAndIdCentreGestion(idService, cgEtab.getIdCentreGestion()));
					if(lTmp!=null && !lTmp.isEmpty()) lRet.addAll(lTmp);
					break;
				}
			}
		}
		if(lRet.isEmpty()) lRet = null;
		else{
			//Tri par nom
			Collections.sort(lRet, new Comparator<ContactDTO>(){
				/**
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				@Override
				public int compare(ContactDTO o1, ContactDTO o2) {
					return o1.getNom().compareTo(o2.getNom());
				}
			});
		}
		return lRet;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#countOffreRefContact(int)
	 */
	public int countOffreRefContact(int idContact){
		return this.contactDaoService.countOffreRefContact(idContact);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#countConventionRefContact(int)
	 */
	public int countConventionRefContact(int idContact){
		return this.contactDaoService.countOffreRefContact(idContact);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#getNombreContactByCentreGestion(int)
	 */
	public int getNombreContactByCentreGestion(int idCentreGestion){
		return this.contactDaoService.getNombreContactByCentreGestion(idCentreGestion);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#updateContact(org.esupportail.pstagedata.domain.dto.ContactDTO)
	 */
	public boolean updateContact(ContactDTO c) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.contactDaoService.updateContact(UtilsDTO.getContactFromDTO(c));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}	

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#updateCompteContact(org.esupportail.pstagedata.domain.dto.ContactDTO)
	 */
	public boolean updateCompteContact(ContactDTO c) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.contactDaoService.updateCompteContact(UtilsDTO.getContactFromDTO(c));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#updateContactDerniereConnexion(int, java.util.Date)
	 */
	public boolean updateContactDerniereConnexion(int idContact, Date avantDerniereConnexion) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.contactDaoService.updateContactDerniereConnexion(idContact,avantDerniereConnexion);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#updateContactInfosAJour(int, java.lang.String)
	 */
	public boolean updateContactInfosAJour(int idContact , String loginInfosAJour) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.contactDaoService.updateContactInfosAJour(idContact, loginInfosAJour);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.ContactDomainService#deleteComptesContactFromIdService(int)
	 */
	public boolean deleteComptesContactFromIdService(int idService) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.contactDaoService.deleteComptesContactFromIdService(idService);
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}

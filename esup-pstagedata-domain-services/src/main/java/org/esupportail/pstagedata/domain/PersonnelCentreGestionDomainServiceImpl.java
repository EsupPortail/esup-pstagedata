/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.PersonnelCentreGestionDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.PersonnelCentreGestion;
import org.esupportail.pstagedata.domain.dto.PersonnelCentreGestionDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * PersonnelCentreGestion Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class PersonnelCentreGestionDomainServiceImpl implements PersonnelCentreGestionDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * PersonnelCentreGestionDaoService
	 */
	private PersonnelCentreGestionDaoService personnelCentreGestionDaoService;
	
	/**
	 * @return the personnelCentreGestionDaoService
	 */
	public PersonnelCentreGestionDaoService getPersonnelCentreGestionDaoService() {
		return personnelCentreGestionDaoService;
	}

	/**
	 * @param PersonnelCentreGestionDaoService the PersonnelCentreGestionDaoService to set
	 */
	public void setPersonnelCentreGestionDaoService(PersonnelCentreGestionDaoService personnelCentreGestionDaoService) {
		this.personnelCentreGestionDaoService = personnelCentreGestionDaoService;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#getPersonnelCentreGestionList(int)
	 */
	public List<PersonnelCentreGestionDTO> getPersonnelCentreGestionList(int idCentreGestion){
		return UtilsDTO.getPersonnelCentreGestionListDTO(this.personnelCentreGestionDaoService.getPersonnelCentreGestionList(idCentreGestion));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#getNombrePersonnelCentreGestion(int)
	 */
	public int getNombrePersonnelCentreGestion(int idCentreGestion){
		return this.personnelCentreGestionDaoService.getNombrePersonnelCentreGestion(idCentreGestion);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#getPersonnelCentreGestion(int)
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestion(int idPersonnelCentreGestion){
		PersonnelCentreGestion pg = personnelCentreGestionDaoService.getPersonnelCentreGestion(idPersonnelCentreGestion);
		return pg==null?null:new PersonnelCentreGestionDTO(pg);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#getInterlocuteur(int)
	 */
	public List<PersonnelCentreGestionDTO> getInterlocuteur(int idCentreGestion){
		return UtilsDTO.getPersonnelCentreGestionListDTO(this.personnelCentreGestionDaoService.getInterlocuteur(idCentreGestion));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#getPersonnelCentreGestionFromUidAndCentre(String,int)
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestionFromUidAndCentre(String uidPersonnelCentreGestion, int idCentreGestion){
		PersonnelCentreGestion pg = personnelCentreGestionDaoService.getPersonnelCentreGestionFromUidAndCentre(uidPersonnelCentreGestion, idCentreGestion);
		return pg==null?null:new PersonnelCentreGestionDTO(pg);
	}

	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#getPersonnelCentreGestionFromUid(String,String)
	 */
	public List<PersonnelCentreGestionDTO> getPersonnelCentreGestionFromUid(String uidPersonnel,String codeUniversite){
		return UtilsDTO.getPersonnelCentreGestionListDTO(this.personnelCentreGestionDaoService.getPersonnelCentreGestionFromUid(uidPersonnel,codeUniversite));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#getPersonnelCentreGestionFromNom(nom,String)
	 */
	public PersonnelCentreGestionDTO getPersonnelCentreGestionFromNom(String nom, String codeUniversite){
		PersonnelCentreGestion pg = personnelCentreGestionDaoService.getPersonnelCentreGestionFromNom(nom, codeUniversite);
		return pg==null?null:new PersonnelCentreGestionDTO(pg);
	}
	  
	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#addPersonnelCentreGestion(org.esupportail.pstagedata.domain.dto.PersonnelCentreGestionDTO)
	 */
	public int addPersonnelCentreGestion(PersonnelCentreGestionDTO pg) throws DataAddException,WebServiceDataBaseException{
		int tmp = 0;
		try {
			tmp = this.personnelCentreGestionDaoService.addPersonnelCentreGestion(UtilsDTO.getPersonnelCentreGestionFromDTO(pg));
		} catch (DataAddDaoException e){
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#updatePersonnelCentreGestion(org.esupportail.pstagedata.domain.dto.PersonnelCentreGestionDTO)
	 */
	public boolean updatePersonnelCentreGestion(PersonnelCentreGestionDTO pg) throws DataUpdateException,WebServiceDataBaseException{
		return personnelCentreGestionDaoService.updatePersonnelCentreGestion(UtilsDTO.getPersonnelCentreGestionFromDTO(pg));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.PersonnelCentreGestionDomainService#deletePersonnelCentreGestion(int,int)
	 */
	public boolean deletePersonnelCentreGestion(int idCentreGestion, int idPersonnelCentreGestion) throws DataDeleteException,WebServiceDataBaseException{
		return personnelCentreGestionDaoService.deletePersonnelCentreGestion(idCentreGestion, idPersonnelCentreGestion);
	}

}

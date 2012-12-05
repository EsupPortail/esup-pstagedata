/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.EtudiantDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Etudiant;
import org.esupportail.pstagedata.domain.dto.EtudiantDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.EtudiantAlreadyExistingForNumEtuCodeUnivException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;

/**
 * Convention Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EtudiantDomainServiceImpl implements EtudiantDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * EtudiantDaoService
	 */
	public EtudiantDaoService etudiantDaoService;



	/**
	 * @return the etudiantDaoService
	 */
	public EtudiantDaoService getEtudiantDaoService() {
		return etudiantDaoService;
	}

	/**
	 * @param etudiantDaoService the etudiantDaoService to set
	 */
	public void setEtudiantDaoService(EtudiantDaoService etudiantDaoService) {
		this.etudiantDaoService = etudiantDaoService;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#addEtudiant(org.esupportail.pstagedata.domain.dto.EtudiantDTO)
	 */
	public int addEtudiant(EtudiantDTO etudiant) throws DataAddException, WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.etudiantDaoService.addEtudiant(UtilsDTO.getEtudiantFromDTO(etudiant));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}catch (EtudiantAlreadyExistingForNumEtuCodeUnivException ee) {
			try{
				
				Etudiant etudiantUid = this.etudiantDaoService.getEtudiantFromUid(etudiant.getIdentEtudiant(), etudiant.getCodeUniversite());
				if (etudiantUid != null) {
					tmp = etudiantUid.getId();
				}
			}catch (DataAddDaoException e) {
				throw new DataAddException(e.getMessage(), e.getCause());
			}catch (DataBaseDaoException e) {
				throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
			}
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#deleteEtudiant(int)
	 */
	public boolean deleteEtudiant(int idEtudiant) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.etudiantDaoService.deleteEtudiant(idEtudiant);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#getEtudiantFromId(int)
	 */
	public EtudiantDTO getEtudiantFromId(int id) {
		Etudiant e = this.etudiantDaoService.getEtudiantFromId(id);
		EtudiantDTO eDTO = null;
		
		if (e!=null) {
			eDTO = new EtudiantDTO(e,false);
		}
		return eDTO;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#getEtudiants()
	 */
	public List<EtudiantDTO> getEtudiants() {
		return UtilsDTO.getEtudiantListDTO(this.etudiantDaoService.getEtudiants());
	}

	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#updateEtudiant(org.esupportail.pstagedata.domain.dto.EtudiantDTO)
	 */
	public boolean updateEtudiant(EtudiantDTO etudiant)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.etudiantDaoService.updateEtudiant(UtilsDTO.getEtudiantFromDTO(etudiant));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.EtudiantDomainService#getEtudiantFromUid(java.lang.String, java.lang.String)
	 */
	public EtudiantDTO getEtudiantFromUid(String uidEtudiant, String codeUniversite) {
		Etudiant e = this.etudiantDaoService.getEtudiantFromUid(uidEtudiant, codeUniversite);
		EtudiantDTO eDTO = null;
		
		if (e!=null) {
			eDTO = new EtudiantDTO(e,false);
		}
		return eDTO;
	}

}

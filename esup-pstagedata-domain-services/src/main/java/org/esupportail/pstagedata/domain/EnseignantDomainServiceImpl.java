/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.EnseignantDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Enseignant;
import org.esupportail.pstagedata.domain.dto.EnseignantDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.EnseignantAlreadyExistingForNumEtuCodeUnivException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class EnseignantDomainServiceImpl implements EnseignantDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * enseignantDaoService
	 */
	private EnseignantDaoService enseignantDaoService;
	
	/**
	 * @return the enseignantDaoService
	 */
	public EnseignantDaoService getEnseignantDaoService() {
		return enseignantDaoService;
	}

	/**
	 * @param enseignantDaoService the enseignantDaoService to set
	 */
	public void setEnseignantDaoService(EnseignantDaoService enseignantDaoService) {
		this.enseignantDaoService = enseignantDaoService;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.EnseignantDomainService#getEnseignants(java.lang.String)
	 */
	public List<EnseignantDTO> getEnseignants(String codeUniversite) {
		return UtilsDTO.getEnseignantListDTO(this.enseignantDaoService.getEnseignants(codeUniversite));
	}

	
	/**
	 * @see org.esupportail.pstagedata.domain.EnseignantDomainService#getNombreConventionByEnseignant(java.lang.String, java.lang.String)
	 */
	public int getNombreConventionByEnseignant(String uidEnseignant, String codeUniversite){
		return this.enseignantDaoService.getNombreConventionByEnseignant(uidEnseignant, codeUniversite);
	}
	
	public int getNombreConventionByEnseignantByAnnee(String uidEnseignant, String codeUniversite, String annee){
		return this.enseignantDaoService.getNombreConventionByEnseignantByAnnee(uidEnseignant, codeUniversite, annee);
	}


	/**
	 * @see org.esupportail.pstagedata.domain.EnseignantDomainService#addEnseignant(org.esupportail.pstagedata.domain.dto.EnseignantDTO)
	 */
	public int addEnseignant(EnseignantDTO enseignant) throws DataAddException,	WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.enseignantDaoService.addEnseignant(UtilsDTO.getEnseignantFromDTO(enseignant));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}catch (EnseignantAlreadyExistingForNumEtuCodeUnivException ee) {
			try{
				
				Enseignant enseigantUid = this.enseignantDaoService.getEnseignantFromUid(enseignant.getUidEnseignant(), enseignant.getCodeUniversite());
				if (enseigantUid != null) {
					tmp = enseigantUid.getId();
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
	 * @see org.esupportail.pstagedata.domain.EnseignantDomainService#deleteEnseignant(int)
	 */
	public boolean deleteEnseignant(int idEnseignant)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.enseignantDaoService.deleteEnseignant(idEnseignant);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.EnseignantDomainService#getEnseignantFromId(int)
	 */
	public EnseignantDTO getEnseignantFromId(int id) {
		Enseignant e = this.enseignantDaoService.getEnseignantFromId(id);
		EnseignantDTO eDTO = null;
		
		if (e!=null) {
			eDTO = new EnseignantDTO(e);
		}
		return eDTO;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.EnseignantDomainService#updateEnseignant(org.esupportail.pstagedata.domain.dto.EnseignantDTO)
	 */
	public boolean updateEnseignant(EnseignantDTO enseignant)
			throws DataUpdateException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.enseignantDaoService.updateEnseignant(UtilsDTO.getEnseignantFromDTO(enseignant));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.EnseignantDomainService#getEnseignantFromUid(java.lang.String, java.lang.String)
	 */
	public EnseignantDTO getEnseignantFromUid(String uidEnseignant, String codeUniversite) {
		Enseignant e = this.enseignantDaoService.getEnseignantFromUid(uidEnseignant, codeUniversite);
		EnseignantDTO eDTO = null;
		
		if (e!=null) {
			eDTO = new EnseignantDTO(e);
		}
		return eDTO;
	}

}

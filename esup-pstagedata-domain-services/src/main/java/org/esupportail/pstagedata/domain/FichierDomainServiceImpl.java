/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import org.esupportail.pstagedata.dao.FichierDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.Fichier;
import org.esupportail.pstagedata.domain.dto.FichierDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * FichierDomainService Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FichierDomainServiceImpl implements FichierDomainService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * OffreFichierDaoService
	 */
	private FichierDaoService fichierDaoService;

	/**
	 * @see org.esupportail.pstagedata.domain.FichierDomainService#addFichier(org.esupportail.pstagedata.domain.dto.FichierDTO)
	 */
	public int addFichier(FichierDTO o) throws DataAddException,
			WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.fichierDaoService.addFichier(UtilsDTO.getOffreFichierFromDTO(o));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;	
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FichierDomainService#updateFichier(org.esupportail.pstagedata.domain.dto.FichierDTO)
	 */
	public boolean updateFichier(FichierDTO o) throws DataUpdateException, WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.fichierDaoService.updateFichier(UtilsDTO.getOffreFichierFromDTO(o));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.FichierDomainService#deleteFichier(int)
	 */
	public boolean deleteFichier(int idFichier) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.fichierDaoService.deleteFichier(idFichier);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FichierDomainService#cleanFichiers()
	 */
	public boolean cleanFichiers() throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.fichierDaoService.cleanFichiers();
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.FichierDomainService#getFichierFromIdFichier(int)
	 */
	public FichierDTO getFichierFromIdFichier(int idFichier) {
		Fichier o = this.fichierDaoService.getFichierFromIdFichier(idFichier);
		return o==null?null:new FichierDTO(o);
	}

	/**
	 * @return the fichierDaoService
	 */
	public FichierDaoService getFichierDaoService() {
		return fichierDaoService;
	}

	/**
	 * @param fichierDaoService the fichierDaoService to set
	 */
	public void setFichierDaoService(
			FichierDaoService fichierDaoService) {
		this.fichierDaoService = fichierDaoService;
	}
	
	

	
}

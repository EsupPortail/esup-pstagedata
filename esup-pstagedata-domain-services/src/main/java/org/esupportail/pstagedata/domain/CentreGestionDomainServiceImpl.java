/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.CentreGestionDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.CentreGestion;
import org.esupportail.pstagedata.domain.dto.CentreGestionDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * CentreGestion Domain service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CentreGestionDomainServiceImpl implements CentreGestionDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * centreDaoService
	 */
	private CentreGestionDaoService centreGestionDaoService;
	/**
	 * @return the centreDaoService
	 */
	public CentreGestionDaoService getCentreDaoService() {
		return centreGestionDaoService;
	}
	/**
	 * @param centreGestionDaoService
	 */
	public void setCentreGestionDaoService(CentreGestionDaoService centreGestionDaoService) {
		this.centreGestionDaoService = centreGestionDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentreGestionList(java.lang.String)
	 */
	public List<CentreGestionDTO> getCentreGestionList(String codeUniversite) {
		return UtilsDTO.getCentreGestionListDTO(this.centreGestionDaoService.getCentreGestionList(codeUniversite));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentreGestion(int)
	 */
	public CentreGestionDTO getCentreGestion(int idCentreGestion) {
		CentreGestion cg = centreGestionDaoService.getCentreGestion(idCentreGestion);
		return cg==null?null:new CentreGestionDTO(cg);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentreGestionFromNomCentre(java.lang.String,java.lang.String)
	 */
	public CentreGestionDTO getCentreGestionFromNomCentre(String nomCentre, String codeUniversite) {
		CentreGestion cg = centreGestionDaoService.getCentreGestionFromNomCentre(nomCentre, codeUniversite);
		return cg==null?null:new CentreGestionDTO(cg);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getNombreCentreGestion(String)
	 */
	public int getNombreCentreGestion(String codeUniversite) {
		return this.centreGestionDaoService.getNombreCentreGestion(codeUniversite);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentreDroitEcriture(java.lang.String, java.lang.String)
	 */
	public List<CentreGestionDTO> getCentreDroitEcriture(String uidPersonnel, String codeUniversite){
		return UtilsDTO.getCentreGestionListDTO(this.centreGestionDaoService.getCentreDroitEcriture(uidPersonnel, codeUniversite));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentreFromUid(java.lang.String, java.lang.String)
	 */
	public List<CentreGestionDTO> getCentreFromUid(String uidPersonnel, String codeUniversite){
		return UtilsDTO.getCentreGestionListDTO(this.centreGestionDaoService.getCentreFromUid(uidPersonnel, codeUniversite));
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentreEntreprise()
	 */
	public CentreGestionDTO getCentreEntreprise(){
		CentreGestion cg = centreGestionDaoService.getCentreEntreprise();
		return cg==null?null:new CentreGestionDTO(cg);
	}
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentreEtablissement(java.lang.String)
	 */
	public CentreGestionDTO getCentreEtablissement(String codeUniversite){
		CentreGestion cg = centreGestionDaoService.getCentreEtablissement(codeUniversite);
		return cg==null?null:new CentreGestionDTO(cg);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentresEtablissement(java.lang.String)
	 */
	public List<CentreGestionDTO> getCentresEtablissement(String codeUniversite){
		return UtilsDTO.getCentreGestionListDTO(this.centreGestionDaoService.getCentresEtablissement(codeUniversite));
	}

	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#getCentreFromCritere(java.lang.String, java.lang.String)
	 */
	public CentreGestionDTO getCentreFromCritere(String codeCritere,
			String codeUniversite) {

		CentreGestion cg = this.centreGestionDaoService.getCentreFromCritere(codeCritere, codeUniversite);
		CentreGestionDTO cgDTO = null;
		
		if (cg!=null) {
			cgDTO = new CentreGestionDTO(cg);
		}
		return cgDTO;

	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#addCentreGestion(org.esupportail.pstagedata.domain.dto.CentreGestionDTO)
	 */
	public int addCentreGestion(CentreGestionDTO c) throws DataAddException,WebServiceDataBaseException{
		int tmp = 0;
		try {
			tmp = this.centreGestionDaoService.addCentreGestion(UtilsDTO.getCentreGestionFromDTO(c));
		} catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		} catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#updateCentreGestion(org.esupportail.pstagedata.domain.dto.CentreGestionDTO)
	 */
	public boolean updateCentreGestion(CentreGestionDTO c) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.centreGestionDaoService.updateCentreGestion(UtilsDTO.getCentreGestionFromDTO(c));
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#updateIdFichier(int,int)
	 */
	public boolean updateIdFichier(int idCentreGestion, int idFichier) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.centreGestionDaoService.updateIdFichier(idCentreGestion, idFichier);
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#setIdFichierNull(int)
	 */
	public boolean setIdFichierNull(int idCentreGestion) throws DataUpdateException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.centreGestionDaoService.setIdFichierNull(idCentreGestion);
		} catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());
		} catch (DataBaseDaoException e){
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#deleteCentreGestion(int)
	 */
	public boolean deleteCentreGestion(int idCentreGestion) throws DataDeleteException,WebServiceDataBaseException{
		boolean b = false;
		try{
			b = this.centreGestionDaoService.deleteCentreGestion(idCentreGestion);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.domain.CentreGestionDomainService#centreGestionReference(int)
	 */
	public List<String> centreGestionReference (int idCentreGestion) {
		return this.centreGestionDaoService.centreGestionReference(idCentreGestion);
	}
}

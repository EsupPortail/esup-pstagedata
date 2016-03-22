/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.ModeValidationStageDaoService;
import org.esupportail.pstagedata.dao.exceptions.*;
import org.esupportail.pstagedata.domain.dto.ModeValidationStageDTO;
import org.esupportail.pstagedata.exceptions.*;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

public class ModeValidationStageDomainServiceImpl implements ModeValidationStageDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * modeValidationStageDaoService
	 */
	private ModeValidationStageDaoService modeValidationStageDaoService;




	/**
	 * @return the modeValidationStageDaoService
	 */
	public ModeValidationStageDaoService getModeValidationStageDaoService() {
		return modeValidationStageDaoService;
	}


	/**
	 * @param modeValidationStageDaoService the modeValidationStageDaoService to set
	 */
	public void setModeValidationStageDaoService(
			ModeValidationStageDaoService modeValidationStageDaoService) {
		this.modeValidationStageDaoService = modeValidationStageDaoService;
	}



	/**
	 * @see org.esupportail.pstagedata.domain.ModeValidationStageDomainService#getModeValidationStages()
	 */
	public List<ModeValidationStageDTO> getModeValidationStages() {
		return UtilsDTO.getModeValidationStageListDTO(this.modeValidationStageDaoService.getModeValidationStages());
	}


	public int addModeValidationStage(ModeValidationStageDTO mv) throws DataAddException,
	WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.modeValidationStageDaoService.addModeValidationStage(UtilsDTO.getModeValidationStageFromDTO(mv));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateModeValidationStage(ModeValidationStageDTO mv) throws DataUpdateException,
	WebServiceDataBaseException {
		boolean b = false;
		try{
			b = modeValidationStageDaoService.updateModeValidationStage(UtilsDTO.getModeValidationStageFromDTO(mv));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteModeValidationStage(int id) throws DataDeleteException,
	WebServiceDataBaseException {
		boolean b = false;
		try{
			b = modeValidationStageDaoService.deleteModeValidationStage(id);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	@Override
	public boolean reactivateModeValidationStage(int id) throws DataReactivateException, WebServiceDataBaseException {
		boolean b = false;
		try {
			b = modeValidationStageDaoService.reactivateModeValidationStage(id);
		} catch (DataReactivateDaoException e) {
			throw new DataReactivateException(e.getMessage());
		} catch(DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}
}

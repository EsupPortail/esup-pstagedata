/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.TempsTravailDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.dto.TempsTravailDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.services.convertDto.UtilsDTO;


/**
 * TempsTravail Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TempsTravailDomainServiceImpl implements TempsTravailDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * TempsTravailDaoService
	 */
	private TempsTravailDaoService tempsTravailDaoService;
	/**
	 * @return the tempsTravailDaoService
	 */
	public TempsTravailDaoService getTempsTravailDaoService() {
		return tempsTravailDaoService;
	}
	/**
	 * @param tempsTravailDaoService the tempsTravailDaoService to set
	 */
	public void setTempsTravailDaoService(
			TempsTravailDaoService tempsTravailDaoService) {
		this.tempsTravailDaoService = tempsTravailDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TempsTravailDomainService#getTempsTravail()
	 */
	public List<TempsTravailDTO> getTempsTravail() {
		return UtilsDTO.getTempsTravailListDTO(this.tempsTravailDaoService.getTempsTravail());
	}
	

	public int addTempsTravail(TempsTravailDTO ef) throws DataAddException,
			WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.tempsTravailDaoService.addTempsTravail(UtilsDTO.getTempsTravailFromDTO(ef));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	public boolean updateTempsTravail(TempsTravailDTO ef) throws DataUpdateException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = tempsTravailDaoService.updateTempsTravail(UtilsDTO.getTempsTravailFromDTO(ef));
		}catch (DataUpdateDaoException e) {
			throw new DataUpdateException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

	public boolean deleteTempsTravail(int id) throws DataDeleteException,
			WebServiceDataBaseException {
		boolean b = false;
		try{
			b = tempsTravailDaoService.deleteTempsTravail(id);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}

}

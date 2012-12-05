/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;


import org.esupportail.pstagedata.dao.TicketStructureDaoService;
import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.domain.dto.TicketStructureDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;

/**
 * UniteDuree Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class TicketStructureDomainServiceImpl implements TicketStructureDomainService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * TicketStructureDaoService
	 */
	private TicketStructureDaoService ticketStructureDaoService;

	/**
	 * @see org.esupportail.pstagedata.domain.TicketStructureDomainService#addTicketStructure(org.esupportail.pstagedata.domain.dto.TicketStructureDTO)
	 */
	public int addTicketStructure(TicketStructureDTO tsd)
			throws DataAddException, WebServiceDataBaseException {
		int tmp=0;
		try{
			tmp = this.ticketStructureDaoService.addTicketStructure(UtilsDTO.getTicketStructureFromDTO(tsd));
		}catch (DataAddDaoException e) {
			throw new DataAddException(e.getMessage(), e.getCause());
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return tmp;	
	}


	/**
	 * @see org.esupportail.pstagedata.domain.TicketStructureDomainService#deleteTicketStructure(java.lang.String)
	 */
	public boolean deleteTicketStructure(String ticket)
			throws DataDeleteException, WebServiceDataBaseException {
		boolean b = false;
		try{
			b = this.ticketStructureDaoService.deleteTicketStructure(ticket);
		}catch (DataDeleteDaoException e) {
			throw new DataDeleteException(e.getMessage());	
		}catch (DataBaseDaoException e) {
			throw new WebServiceDataBaseException(e.getMessage(), e.getCause());
		}
		return b;
	}


	/**
	 * @see org.esupportail.pstagedata.domain.TicketStructureDomainService#getTicketStructureValide(org.esupportail.pstagedata.domain.dto.TicketStructureDTO)
	 */
	public boolean getTicketStructureValide(TicketStructureDTO tsd) {
		boolean b = false;
		b = this.ticketStructureDaoService.getTicketStructureValide(UtilsDTO.getTicketStructureFromDTO(tsd));
		return b;
	}


	/**
	 * @return the ticketStructureDaoService
	 */
	public TicketStructureDaoService getTicketStructureDaoService() {
		return ticketStructureDaoService;
	}


	/**
	 * @param ticketStructureDaoService the ticketStructureDaoService to set
	 */
	public void setTicketStructureDaoService(
			TicketStructureDaoService ticketStructureDaoService) {
		this.ticketStructureDaoService = ticketStructureDaoService;
	}
	
	

}

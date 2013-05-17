/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.dto.TicketStructureDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * UniteDuree Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface TicketStructureDomainService extends Serializable {
	
	/**
	 * @param ticketStructure 
	 * @return boolean
	 */
	public boolean getTicketStructureValide(TicketStructureDTO ticketStructure);

	
	/**
	 * @param ticketStructure
	 * @return int
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 */
	public int addTicketStructure(TicketStructureDTO ticketStructure) throws DataAddException, WebServiceDataBaseException;
	
	/**
	 * @param ticket
	 * @return boolean
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTicketStructure(String ticket) throws DataDeleteException, WebServiceDataBaseException;

}

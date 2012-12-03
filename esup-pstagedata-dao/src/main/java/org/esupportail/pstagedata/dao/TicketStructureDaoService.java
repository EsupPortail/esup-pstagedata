/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.domain.beans.TicketStructure;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;


/**
 * Fichier DAO service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface TicketStructureDaoService extends Serializable {
	
	
	/**
	 * @param ticketStructure 
	 * @return boolean
	 */
	public boolean getTicketStructureValide(TicketStructure ticketStructure);

	
	/**
	 * @param ticketStructure
	 * @return int
	 * @throws DataAddDaoException 
	 * @throws DataBaseDaoException 
	 * @throws DataAddException
	 * @throws WebServiceDataBaseException
	 */
	public int addTicketStructure(TicketStructure ticketStructure) throws DataAddDaoException, DataBaseDaoException;
	
	/**
	 * @param ticket
	 * @return boolean
	 * @throws DataDeleteDaoException 
	 * @throws DataBaseDaoException 
	 * @throws DataDeleteException
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTicketStructure(String ticket) throws DataDeleteDaoException, DataBaseDaoException;

}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.domain.beans.TicketStructure;
import org.springframework.dao.DataAccessException;


/**
 * TicketStructure DAO service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class TicketStructureDaoServiceImpl extends AbstractIBatisDaoService implements TicketStructureDaoService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * @see org.esupportail.pstagedata.dao.TicketStructureDaoService#addTicketStructure(org.esupportail.pstagedata.domain.beans.TicketStructure)
	 */
	public int addTicketStructure(TicketStructure ticketStructure)
			throws DataAddDaoException, DataBaseDaoException {
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addTicketStructure", ticketStructure);
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}


	/**
	 * @see org.esupportail.pstagedata.dao.TicketStructureDaoService#deleteTicketStructure(java.lang.String)
	 */
	public boolean deleteTicketStructure(String ticket)
			throws DataDeleteDaoException, DataBaseDaoException {
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteTicketStructure", ticket)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}


	/**
	 * @see org.esupportail.pstagedata.dao.TicketStructureDaoService#getTicketStructureValide(org.esupportail.pstagedata.domain.beans.TicketStructure)
	 */
	public boolean getTicketStructureValide(TicketStructure ticketStructure) {
		boolean b = false;
		TicketStructure ticketS = (TicketStructure) getSqlMapClientTemplate().queryForObject("getTicketStructureValide", ticketStructure);
		if (ticketS != null) {
			b = true;
		}
		return b;
	}
	

}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.AccordPartenariatDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;
import org.springframework.dao.DataAccessException;

/**
 * AccordPartenariat Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface AccordPartenariatDomainService extends Serializable {
	
	/**
	 * @return List<AccordPartenariatDTO>
	 */
	public List<AccordPartenariatDTO> getAccordsNonValides();
	/**
	 * @param id 
	 * @return AccordPartenariatDTO
	 */
	public AccordPartenariatDTO getAccordFromId(int id);
	/**
	 * @param idStructure 
	 * @return AccordPartenariatDTO
	 */
	public AccordPartenariatDTO getAccordFromIdStructure(int idStructure);
	/**
	 * @param idContact 
	 * @return AccordPartenariatDTO
	 * @throws DataAccessException 
	 */
	public AccordPartenariatDTO getAccordFromIdContact(int idContact);
	/**
	 * @return int
	 */
	public int countAccordAValider();
	/**
	 * @param accord
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addAccord(AccordPartenariatDTO accord) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @param accord
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateAccord(AccordPartenariatDTO accord) throws DataUpdateException, WebServiceDataBaseException;
	/**
	 * @param idAccord
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean deleteAccord(int idAccord) throws DataDeleteException, WebServiceDataBaseException;

}

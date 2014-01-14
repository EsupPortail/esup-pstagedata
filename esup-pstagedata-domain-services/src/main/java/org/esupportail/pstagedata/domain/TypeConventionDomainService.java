/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.TypeConventionDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * UniteDuree Domain service interface.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public interface TypeConventionDomainService extends Serializable {
	
	/**
	 * @return List<TypeConventionDTO>
	 */
	public List<TypeConventionDTO> getTypeConventions();
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addTypeConvention(TypeConventionDTO tc) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateTypeConvention(TypeConventionDTO tc) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTypeConvention(int id) throws DataDeleteException,WebServiceDataBaseException;

}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.NiveauFormationDTO;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;



/**
 * NiveauFormation Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface NiveauFormationDomainService extends Serializable {
	
	/**
	 * @return List<NiveauFormationDTO>
	 */
	public List<NiveauFormationDTO> getNiveauxFormation();
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addNiveauFormation(NiveauFormationDTO nf) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateNiveauFormation(NiveauFormationDTO nf) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteNiveauFormation(int id) throws DataDeleteException,WebServiceDataBaseException;

}

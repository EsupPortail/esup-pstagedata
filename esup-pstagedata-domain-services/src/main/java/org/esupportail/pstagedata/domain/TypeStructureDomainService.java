/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.TypeStructureDTO;
import org.esupportail.pstagedata.exceptions.*;

/**
 * TypeStructure Domain service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface TypeStructureDomainService extends Serializable {
	
	/**
	 * @return List<TypeStructureDTO>
	 */
	public List<TypeStructureDTO> getTypesStructure();
	/**
	 * @param id
	 * @return TypeStructureDTO
	 */
	public TypeStructureDTO getTypeStructureFromId(int id);
	/**
	 * @param id
	 * @return List<TypeStructureDTO>
	 */
	public List<TypeStructureDTO> getTypesStructureFromStatutJuridique(int id);
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addTypeStructure(TypeStructureDTO ts) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateTypeStructure(TypeStructureDTO ts) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTypeStructure(int id) throws DataDeleteException,WebServiceDataBaseException;
	/**
	 * @param id
	 * @return boolean
	 * @throws DataReactivateException
	 * @throws WebServiceDataBaseException
	 */
	public boolean reactivateTypeStructure(int id) throws DataReactivateException,WebServiceDataBaseException;
}

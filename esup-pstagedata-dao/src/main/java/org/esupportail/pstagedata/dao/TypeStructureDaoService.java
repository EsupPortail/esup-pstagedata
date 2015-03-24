/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.TypeStructure;
import org.esupportail.pstagedata.exceptions.DataAddException;
import org.esupportail.pstagedata.exceptions.DataDeleteException;
import org.esupportail.pstagedata.exceptions.DataUpdateException;
import org.esupportail.pstagedata.exceptions.WebServiceDataBaseException;

/**
 * TypeStructure DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface TypeStructureDaoService extends Serializable {
	
	/**
	 * @return List<TypeStructure>
	 */
	public List<TypeStructure> getTypesStructure();
	/**
	 * @param id
	 * @return TypeStructure
	 */
	public TypeStructure getTypeStructureFromId(int id);
	/**
	 * @param id
	 * @return List<TypeStructure>
	 */
	public List<TypeStructure> getTypesStructureFromStatutJuridique(int id);
	
	/**
	 * @return int
	 * @throws DataAddException 
	 * @throws WebServiceDataBaseException 
	 */
	public int addTypeStructure(TypeStructure ts) throws DataAddException, WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataUpdateException 
	 * @throws WebServiceDataBaseException 
	 */
	public boolean updateTypeStructure(TypeStructure ts) throws DataUpdateException,WebServiceDataBaseException;
	/**
	 * @return boolean
	 * @throws DataDeleteException 
	 * @throws WebServiceDataBaseException
	 */
	public boolean deleteTypeStructure(int id) throws DataDeleteException,WebServiceDataBaseException;

}

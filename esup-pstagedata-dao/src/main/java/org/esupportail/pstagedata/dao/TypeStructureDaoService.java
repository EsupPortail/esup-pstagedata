/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.TypeStructure;

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

}

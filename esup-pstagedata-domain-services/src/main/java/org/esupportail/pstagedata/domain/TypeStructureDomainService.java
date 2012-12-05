/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.dto.TypeStructureDTO;

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

}

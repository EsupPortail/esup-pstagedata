/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.domain;

import java.util.List;

import org.esupportail.pstagedata.dao.TypeStructureDaoService;
import org.esupportail.pstagedata.domain.beans.TypeStructure;
import org.esupportail.pstagedata.domain.dto.TypeStructureDTO;
import org.esupportail.pstagedata.domain.dto.UtilsDTO;


/**
 * TypeStructure Domain service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TypeStructureDomainServiceImpl implements TypeStructureDomainService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * TypeStructureDaoService
	 */
	private TypeStructureDaoService typeStructureDaoService;
	/**
	 * @return the typeStructureDaoService
	 */
	public TypeStructureDaoService getTypeStructureDaoService() {
		return typeStructureDaoService;
	}
	/**
	 * @param typeStructureDaoService the typeStructureDaoService to set
	 */
	public void setTypeStructureDaoService(
			TypeStructureDaoService typeStructureDaoService) {
		this.typeStructureDaoService = typeStructureDaoService;
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TypeStructureDomainService#getTypeStructureFromId(int)
	 */
	public TypeStructureDTO getTypeStructureFromId(int id) {
		TypeStructure t = this.typeStructureDaoService.getTypeStructureFromId(id);
		return t==null?null:new TypeStructureDTO(t);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TypeStructureDomainService#getTypesStructure()
	 */
	public List<TypeStructureDTO> getTypesStructure() {
		return UtilsDTO.getTypeStructureListDTO(this.typeStructureDaoService.getTypesStructure());
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.TypeStructureDomainService#getTypesStructureFromStatutJuridique(int)
	 */
	public List<TypeStructureDTO> getTypesStructureFromStatutJuridique(int id) {
		return UtilsDTO.getTypeStructureListDTO(this.typeStructureDaoService.getTypesStructureFromStatutJuridique(id));
	}
	
	
}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.TypeStructure;

/**
 * TypeStructure DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TypeStructureDaoServiceImpl extends AbstractIBatisDaoService implements TypeStructureDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.TypeStructureDaoService#getTypeStructureFromId(int)
	 */
	public TypeStructure getTypeStructureFromId(int id) {
		return (TypeStructure) getSqlMapClientTemplate().queryForObject("getTypeStructureFromId", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.TypeStructureDaoService#getTypesStructure()
	 */
	@SuppressWarnings("unchecked")
	public List<TypeStructure> getTypesStructure() {
		return getSqlMapClientTemplate().queryForList("getTypesStructure");
	}

	/**
	 * @see org.esupportail.pstagedata.dao.TypeStructureDaoService#getTypesStructureFromStatutJuridique(int)
	 */
	@SuppressWarnings("unchecked")
	public List<TypeStructure> getTypesStructureFromStatutJuridique(int id) {
		return getSqlMapClientTemplate().queryForList("getTypesStructureFromStatutJuridique", id);
	}

	

	
}

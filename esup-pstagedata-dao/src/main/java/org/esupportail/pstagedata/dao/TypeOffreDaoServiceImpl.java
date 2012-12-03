/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.TypeOffre;

/**
 * TypeOffre DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TypeOffreDaoServiceImpl extends AbstractIBatisDaoService implements TypeOffreDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.TypeOffreDaoService#getTypesOffre()
	 */
	@SuppressWarnings("unchecked")
	public List<TypeOffre> getTypesOffre() {
		return getSqlMapClientTemplate().queryForList("getTypesOffre");
	}

	
}

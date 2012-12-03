/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.TypeConvention;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * LangueConventionDaoServiceImpl.
 */
public class TypeConventionDaoServiceImpl extends AbstractIBatisDaoService implements TypeConventionDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	/**
	 * @see org.esupportail.pstagedata.dao.TypeConventionDaoService#getTypeConventions()
	 */
	@SuppressWarnings("unchecked")
	public List<TypeConvention> getTypeConventions() {
		return getSqlMapClientTemplate().queryForList("getTypeConventions");
	}

}

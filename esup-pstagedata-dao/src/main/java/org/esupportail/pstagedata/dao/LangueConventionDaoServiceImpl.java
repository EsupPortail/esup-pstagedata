/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.LangueConvention;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * LangueConventionDaoServiceImpl.
 */
public class LangueConventionDaoServiceImpl extends AbstractIBatisDaoService implements LangueConventionDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	/**
	 * @see org.esupportail.pstagedata.dao.LangueConventionDaoService#getLangueConventions()
	 */
	@SuppressWarnings("unchecked")
	public List<LangueConvention> getLangueConventions() {
		return getSqlMapClientTemplate().queryForList("getLangueConventions");
	}

	

}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.Theme;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * LangueConventionDaoServiceImpl.
 */
public class ThemeDaoServiceImpl extends AbstractIBatisDaoService implements ThemeDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	/**
	 * @see org.esupportail.pstagedata.dao.ThemeDaoService#getThemes()
	 */
	@SuppressWarnings("unchecked")
	public List<Theme> getThemes() {

		return getSqlMapClientTemplate().queryForList("getThemes");
	}

}

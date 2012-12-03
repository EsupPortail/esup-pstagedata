/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.CaisseRegime;

/**
 * CaisseRegimeDaoServiceImpl.
 */
/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class CaisseRegimeDaoServiceImpl extends AbstractIBatisDaoService implements CaisseRegimeDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * @see org.esupportail.pstagedata.dao.CaisseRegimeDaoService#getCaisseRegimes()
	 */
	@SuppressWarnings("unchecked")
	public List<CaisseRegime> getCaisseRegimes() {
		return getSqlMapClientTemplate().queryForList("getCaisseRegimes");
	}

	

}

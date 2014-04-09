/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.ModeVersGratification;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * ModeValidationStageDaoServiceImpl.
 */
public class ModeVersGratificationDaoServiceImpl extends AbstractIBatisDaoService implements ModeVersGratificationDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	/**
	 * @see org.esupportail.pstagedata.dao.ModeVersGratificationDaoService#getModeVersGratifications()
	 */
	@SuppressWarnings("unchecked")
	public List<ModeVersGratification> getModeVersGratifications() {
		return getSqlMapClientTemplate().queryForList("getModeVersGratifications");
	}

}

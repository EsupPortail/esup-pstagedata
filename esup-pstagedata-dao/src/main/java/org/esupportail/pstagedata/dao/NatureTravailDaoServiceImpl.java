/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.NatureTravail;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * NatureTravailDaoServiceImpl.
 */
public class NatureTravailDaoServiceImpl extends AbstractIBatisDaoService implements NatureTravailDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	/**
	 * @see org.esupportail.pstagedata.dao.NatureTravailDaoService#getNatureTravails()
	 */
	public List<NatureTravail> getNatureTravails() {
		return getSqlMapClientTemplate().queryForList("getNatureTravails");

	}

}

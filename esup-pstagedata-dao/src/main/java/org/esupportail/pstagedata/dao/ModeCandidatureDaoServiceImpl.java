/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.ModeCandidature;


/**
 * ModeCandidature DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ModeCandidatureDaoServiceImpl extends AbstractIBatisDaoService implements ModeCandidatureDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.ModeCandidatureDaoService#getModesCandidature()
	 */
	@SuppressWarnings("unchecked")
	public List<ModeCandidature> getModesCandidature() {
		return getSqlMapClientTemplate().queryForList("getModesCandidature");
	}

	

}

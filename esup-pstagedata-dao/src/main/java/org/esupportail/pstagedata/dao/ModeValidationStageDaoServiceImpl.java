/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.ModeValidationStage;


/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */

/**
 * ModeValidationStageDaoServiceImpl.
 */
public class ModeValidationStageDaoServiceImpl extends AbstractIBatisDaoService implements ModeValidationStageDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	


	/**
	 * @see org.esupportail.pstagedata.dao.ModeValidationStageDaoService#getModeValidationStages()
	 */
	@SuppressWarnings("unchecked")
	public List<ModeValidationStage> getModeValidationStages() {
		return getSqlMapClientTemplate().queryForList("getModeValidationStages");
	}

}

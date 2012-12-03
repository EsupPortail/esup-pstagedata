/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.NiveauFormation;

/**
 * NiveauFormation DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NiveauFormationDaoServiceImpl extends AbstractIBatisDaoService implements NiveauFormationDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.NiveauFormationDaoService#getNiveauxFormation()
	 */
	@SuppressWarnings("unchecked")
	public List<NiveauFormation> getNiveauxFormation() {
		return getSqlMapClientTemplate().queryForList("getNiveauxFormation");
	}


}

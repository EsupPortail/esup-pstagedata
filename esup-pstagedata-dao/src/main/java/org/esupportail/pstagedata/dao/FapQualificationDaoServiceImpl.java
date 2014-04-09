/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapQualification;

/**
 * FapQualification DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapQualificationDaoServiceImpl extends AbstractIBatisDaoService implements FapQualificationDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.FapQualificationDaoService#getFapQualificationFromId(int)
	 */
	public FapQualification getFapQualificationFromId(int id) {
		return (FapQualification) getSqlMapClientTemplate().queryForObject("getFapQualificationFromId", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapQualificationDaoService#getFapQualificationFromIdQualificationSimplifiee(int)
	 */
	@SuppressWarnings("unchecked")
	public List<FapQualification> getFapQualificationFromIdQualificationSimplifiee(
			int id) {
		return getSqlMapClientTemplate().queryForList("getFapQualificationFromIdQualificationSimplifiee", id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapQualificationDaoService#getFapQualifications()
	 */
	@SuppressWarnings("unchecked")
	public List<FapQualification> getFapQualifications() {
		return getSqlMapClientTemplate().queryForList("getFapQualifications");
	}

	

}

/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapQualificationSimplifiee;

/**
 * FapQualificationSimplifiee DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapQualificationSimplifieeDaoServiceImpl extends AbstractIBatisDaoService implements FapQualificationSimplifieeDaoService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.FapQualificationSimplifieeDaoService#getFapQualificationSimplifieeFromId(int)
	 */
	public FapQualificationSimplifiee getFapQualificationSimplifieeFromId(int id) {
		return (FapQualificationSimplifiee) getSqlMapClientTemplate().queryForObject("getFapQualificationSimplifieeFromId",id);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapQualificationSimplifieeDaoService#getFapQualificationSimplifieeFromNumFapQualification(int)
	 */
	public FapQualificationSimplifiee getFapQualificationSimplifieeFromNumFapQualification(
			int num) {
		return (FapQualificationSimplifiee) getSqlMapClientTemplate().queryForObject("getFapQualificationSimplifieeFromNumFapQualification", num);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapQualificationSimplifieeDaoService#getFapQualificationsSimplifiees()
	 */
	@SuppressWarnings("unchecked")
	public List<FapQualificationSimplifiee> getFapQualificationsSimplifiees() {
		return getSqlMapClientTemplate().queryForList("getFapQualificationsSimplifiees");
	}

}

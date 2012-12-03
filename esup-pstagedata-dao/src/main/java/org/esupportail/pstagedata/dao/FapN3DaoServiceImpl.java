/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.FapN3;

/**
 * FapN2 DAO service impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapN3DaoServiceImpl extends AbstractIBatisDaoService implements FapN3DaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.FapN3DaoService#getFapN3()
	 */
	@SuppressWarnings("unchecked")
	public List<FapN3> getFapN3() {
		return getSqlMapClientTemplate().queryForList("getFapN3");
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapN3DaoService#getFapN3FromCodeFapN2(java.lang.String)
	 */
	public FapN3 getFapN3FromCodeFapN2(String code) {
		return (FapN3) getSqlMapClientTemplate().queryForObject("getFapN3FromCodeFapN2", code);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapN3DaoService#getFapN3FromCodeFapN3(java.lang.String)
	 */
	public FapN3 getFapN3FromCodeFapN3(String code) {
		return (FapN3) getSqlMapClientTemplate().queryForObject("getFapN3FromCodeFapN3",code);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapN3DaoService#getFapN3FromQualification(int)
	 */
	@SuppressWarnings("unchecked")
	public List<FapN3> getFapN3FromQualification(int num) {
		return getSqlMapClientTemplate().queryForList("getFapN3FromQualification", num);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.FapN3DaoService#getFapN3FromQualificationSimplifiee(int)
	 */
	@SuppressWarnings("unchecked")
	public List<FapN3> getFapN3FromQualificationSimplifiee(int num) {
		return getSqlMapClientTemplate().queryForList("getFapN3FromQualificationSimplifiee", num);
	}

	

}

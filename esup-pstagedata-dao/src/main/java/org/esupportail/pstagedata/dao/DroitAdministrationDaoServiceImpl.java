/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.DroitAdministration;


/**
 * DroitAdministration DAO service interface.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class DroitAdministrationDaoServiceImpl extends AbstractIBatisDaoService implements DroitAdministrationDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return List<DroitAdministration>
	 */
	@SuppressWarnings("unchecked")
	public List<DroitAdministration> getDroitAdministration(){
		return getSqlMapClientTemplate().queryForList("getDroitAdministration");
	}

}

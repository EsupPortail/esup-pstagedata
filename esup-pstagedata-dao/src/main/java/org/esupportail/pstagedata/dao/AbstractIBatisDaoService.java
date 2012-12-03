package org.esupportail.pstagedata.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public abstract class AbstractIBatisDaoService extends SqlMapClientDaoSupport implements InitializingBean {
	
	/**
	 * Constructeur
	 */
	public AbstractIBatisDaoService(){
		//
	}
	
	
}

package org.esupportail.pstagedata.dao;

import java.util.List;

import org.esupportail.pstagedata.domain.beans.User;
import org.esupportail.pstagedata.domain.beans.VersionManager;
import org.springframework.beans.factory.InitializingBean;


/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class IBatisDaoServiceImpl extends AbstractIBatisDaoService implements DaoService,InitializingBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur
	 */
	public IBatisDaoServiceImpl(){
		//
	}

	/*	public void afterPropertiesSet()  {
		Assert.notNull(databaseManager, 
				"property [databaseManager] of class [" 
				+ getClass().getName() + "] can not be null");
	}*/

	/**
	 * @see org.esupportail.pstagedata.dao.DaoService#getUser(java.lang.String)
	 */
	public User getUser(final String id) {
		User u=(User) getSqlMapClientTemplate().queryForObject("getUserById", id);
		return u;	
	}

	/**
	 * @see org.esupportail.pstagedata.dao.DaoService#getUsers()
	 */
	@SuppressWarnings("unchecked")
	public List<User> getUsers()  {
		List<User> u=getSqlMapClientTemplate().queryForList("getAllUsers");
		return u;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.DaoService#addUser(org.esupportail.pstagedata.domain.beans.User)
	 */
	public void addUser(final User user)  {
		getSqlMapClientTemplate().insert("insertUser",user);
	} 
	
	/**
	 * @see org.esupportail.pstagedata.dao.DaoService#deleteUser(org.esupportail.pstagedata.domain.beans.User)
	 */
	public void deleteUser(final User user)  {
		getSqlMapClientTemplate().delete("deleteUser",user);
	} 

	/**
	 * @see org.esupportail.pstagedata.dao.DaoService#updateUser(org.esupportail.pstagedata.domain.beans.User)
	 */
	public void updateUser(final User user)  {
		getSqlMapClientTemplate().update("updateUser",user);
	} 

	/**
	 * @return List<User>
	 */
	@SuppressWarnings({ "unchecked" })
	public List<User> getAdmins()  {
		List<User> u=getSqlMapClientTemplate().queryForList("getAllAdmins");
		return u;
	}


	/**
	 * @see org.esupportail.pstagedata.dao.DaoService#getVersionManager()
	 */
	public VersionManager getVersionManager() {
		VersionManager vm = (VersionManager)getSqlMapClientTemplate().queryForObject("getVersion");
		return vm;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.DaoService#updateVersionManager(org.esupportail.pstagedata.domain.beans.VersionManager)
	 */
	public void updateVersionManager(VersionManager versionManager) {
		getSqlMapClientTemplate().update("updateVersion",versionManager);
	}


}

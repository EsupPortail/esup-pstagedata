/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.domain.beans.CentreGestionSuperviseur;
import org.springframework.dao.DataAccessException;

/**
 * Centre Gestion Superviseur DAO service impl.
 */
/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class CentreGestionSuperviseurDaoServiceImpl extends AbstractIBatisDaoService implements CentreGestionSuperviseurDaoService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionSuperviseurDaoService#getCentreGestionSuperviseur()
	 */
	@SuppressWarnings("unchecked")
	public List<CentreGestionSuperviseur> getCentreGestionSuperviseur(){
		return getSqlMapClientTemplate().queryForList("getCentreGestionSuperviseur");
	}

	/**
	 * @see org.esupportail.pstagedata.dao.CentreGestionSuperviseurDaoService#addCentreGestionSuperviseur(org.esupportail.pstagedata.domain.beans.CentreGestionSuperviseur)
	 */
	public int addCentreGestionSuperviseur(CentreGestionSuperviseur cg) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try {
			tmp = (Integer) getSqlMapClientTemplate().insert("addCentreGestionSuperviseur", cg);
		} catch (DataAccessException e){
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
}

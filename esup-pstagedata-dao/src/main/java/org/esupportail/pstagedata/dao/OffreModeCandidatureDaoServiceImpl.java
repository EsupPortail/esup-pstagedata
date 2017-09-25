/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.springframework.dao.DataAccessException;


/**
 * OffreModeCandidature DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class OffreModeCandidatureDaoServiceImpl extends AbstractIBatisDaoService implements OffreModeCandidatureDaoService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see org.esupportail.pstagedata.dao.OffreModeCandidatureDaoService#addOffreModeCandidature(int, java.util.List)
	 */
	public int addOffreModeCandidature(int idOffre, List<Integer> idsModeCandidature) throws DataAddDaoException, DataDeleteDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			getSqlMapClientTemplate().delete("deleteOffreModeCandidatureFromId",idOffre);
			if(idsModeCandidature!=null&&!idsModeCandidature.isEmpty()){
				for(int i : idsModeCandidature){
					HashMap<String, String> parameterMap = new HashMap<String, String>();
					parameterMap.put("idOffre", Integer.toString(idOffre));
					parameterMap.put("idModeCandidature", Integer.toString(i));
					tmp = (Integer) getSqlMapClientTemplate().insert("addOffreModeCandidature", parameterMap);
				}
			}
		}catch (DataAccessException e) {
			logger.debug(e);
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}

	/**
	 * @see org.esupportail.pstagedata.dao.OffreModeCandidatureDaoService#deleteOffreModeCandidatureFromId(int)
	 */
	public boolean deleteOffreModeCandidatureFromId(int idOffre) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteOffreModeCandidatureFromId",idOffre)>0?true:false;
		}catch (DataAccessException e) {
			logger.debug(e);
			if(e.getMessage().contains("Cannot delete or update")){
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			logger.debug(e);
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}

}

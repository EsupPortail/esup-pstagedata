/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.sql.SQLException;
import java.util.List;

import org.esupportail.pstagedata.dao.exceptions.DataAddDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataBaseDaoException;
import org.esupportail.pstagedata.dao.exceptions.DataDeleteDaoException;
import org.esupportail.pstagedata.domain.beans.OffreDiffusion;
import org.springframework.dao.DataAccessException;


/**
 * Offre Diffusion DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class OffreDiffusionDaoServiceImpl extends AbstractIBatisDaoService implements OffreDiffusionDaoService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see org.esupportail.pstagedata.dao.OffreDiffusionDaoService#getOffreDiffusionFromIdOffre(int)
	 */
	@SuppressWarnings("unchecked")
	public List<OffreDiffusion> getOffreDiffusionFromIdOffre(int idOffre){
		return getSqlMapClientTemplate().queryForList("getOffreDiffusionFromIdOffre",idOffre);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.OffreDiffusionDaoService#addOffreDiffusion(java.util.List)
	 */
	public int addOffreDiffusion(List<OffreDiffusion> lod) throws DataAddDaoException, DataDeleteDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			if(lod!=null&&!lod.isEmpty()){
				getSqlMapClientTemplate().delete("deleteOffreDiffusion",lod.get(0).getIdOffre());
				for(OffreDiffusion od : lod){
					tmp = (Integer) getSqlMapClientTemplate().insert("addOffreDiffusion", od);
				}
			}
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			if (error == 1451) {//Cannot delete or update
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.OffreDiffusionDaoService#deleteOffreDiffusionFromId(int)
	 */
	public boolean deleteOffreDiffusionFromId(int idOffre) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteOffreDiffusion",idOffre)>0?true:false;
		}catch (DataAccessException e) {
			if(e.getMessage().contains("Cannot delete or update")){
				throw new DataDeleteDaoException(e.getMessage());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
}

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
import org.esupportail.pstagedata.dao.exceptions.DataUpdateDaoException;
import org.esupportail.pstagedata.domain.beans.AccordPartenariat;
import org.springframework.dao.DataAccessException;


/**
 * AccordPartenariat DAO impl.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AccordPartenariatDaoServiceImpl extends AbstractIBatisDaoService implements AccordPartenariatDaoService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see org.esupportail.pstagedata.dao.AccordPartenariatDaoService#getAccordsNonValides()
	 */
	@SuppressWarnings("unchecked")
	public List<AccordPartenariat> getAccordsNonValides(){
			return getSqlMapClientTemplate().queryForList("getAccordsNonValides");
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AccordPartenariatDaoService#getAccordFromId(int)
	 */
	public AccordPartenariat getAccordFromId(int id){
		return (AccordPartenariat) getSqlMapClientTemplate().queryForObject("getAccordFromId",id);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AccordPartenariatDaoService#getAccordFromIdStructure(int)
	 */
	public AccordPartenariat getAccordFromIdStructure(int idStructure){
		return (AccordPartenariat) getSqlMapClientTemplate().queryForObject("getAccordFromIdStructure", idStructure);
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AccordPartenariatDaoService#getAccordFromIdContact(int)
	 */
	public AccordPartenariat getAccordFromIdContact(int idContact){
		return (AccordPartenariat) getSqlMapClientTemplate().queryForObject("getAccordFromIdContact", idContact);
	}

	/**
	 * @see org.esupportail.pstagedata.dao.AccordPartenariatDaoService#countAccordAValider()
	 */
	public int countAccordAValider(){
		return (Integer)getSqlMapClientTemplate().queryForObject("countAccordAValider");
	}
	/**
	 * @see org.esupportail.pstagedata.dao.AccordPartenariatDaoService#addAccord(org.esupportail.pstagedata.domain.beans.AccordPartenariat)
	 */
	public int addAccord(AccordPartenariat accord) throws DataAddDaoException, DataBaseDaoException{
		int tmp=0;
		try{
			tmp = (Integer) getSqlMapClientTemplate().insert("addAccord",accord);
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataAddDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return tmp;
	}
	
	/**
	 * @see org.esupportail.pstagedata.dao.AccordPartenariatDaoService#updateAccord(org.esupportail.pstagedata.domain.beans.AccordPartenariat)
	 */
	public boolean updateAccord(AccordPartenariat accord) throws DataUpdateDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().update("updateAccord",accord)>0?true:false;
		}catch (DataAccessException e) {
			int error = ((SQLException)e.getCause()).getErrorCode();
			if (error == 1452) {//Cannot add or update
				throw new DataUpdateDaoException(e.getMessage(),e.getCause());
			}
			throw new DataBaseDaoException(e.getMessage(), e.getCause());	
		}catch (Exception e) {
			throw new DataBaseDaoException(e.getMessage(), e.getCause());
		}
		return b;
	}
	/**
	 * @see org.esupportail.pstagedata.dao.AccordPartenariatDaoService#deleteAccord(int)
	 */
	public boolean deleteAccord(int idAccord) throws DataDeleteDaoException, DataBaseDaoException{
		boolean b = false;
		try{
			b = getSqlMapClientTemplate().delete("deleteAccord",idAccord)>0?true:false;
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

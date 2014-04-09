/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.NafN5;



/**
 * NafN5 DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface NafN5DaoService extends Serializable {
	
	/**
	 * @return List<NafN5>
	 */
	public List<NafN5> getNafN5();
	/**
	 * @param code 
	 * @return NafN5
	 */
	public NafN5 getNafN5FromCodeNafN5(String code);

	/**
	 * @param code
	 * @return List<NafN5>
	 */
	public List<NafN5> getNafN5FromCodeNafN1(String code);
}

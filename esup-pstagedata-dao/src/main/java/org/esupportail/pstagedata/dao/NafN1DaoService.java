/**
 * ESUP-Portail PStageData - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-pstagedata
 */
package org.esupportail.pstagedata.dao;

import java.io.Serializable;
import java.util.List;

import org.esupportail.pstagedata.domain.beans.NafN1;



/**
 * NafN1 DAO service interface.
 */
/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public interface NafN1DaoService extends Serializable {
	
	/**
	 * @return List<NafN1>
	 */
	public List<NafN1> getNafN1();
	/**
	 * @param code 
	 * @return NafN1
	 */
	public NafN1 getNafN1FromCodeNafN1(String code);
	/**
	 * @param code 
	 * @return NafN1
	 */
	public NafN1 getNafN1FromCodeNafN5(String code);
}

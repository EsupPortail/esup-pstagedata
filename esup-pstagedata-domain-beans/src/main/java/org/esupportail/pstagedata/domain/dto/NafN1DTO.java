package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.NafN1;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NafN1DTO extends NomenclatureCodeDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/

	/**
	 * Constructeur
	 */
	public NafN1DTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param n 
	 */
	public NafN1DTO(NafN1 n){
		super(n);
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/	
	
	/** 
	 * @see org.esupportail.pstagedata.domain.beans.NomenclatureCode#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
	}
	
}

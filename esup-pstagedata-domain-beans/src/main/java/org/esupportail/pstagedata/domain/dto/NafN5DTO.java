package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.NafN5;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NafN5DTO extends NomenclatureCodeEnfantDTO implements Serializable{
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
	public NafN5DTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param n 
	 */
	public NafN5DTO(NafN5 n){
		super(n);
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
	}
}

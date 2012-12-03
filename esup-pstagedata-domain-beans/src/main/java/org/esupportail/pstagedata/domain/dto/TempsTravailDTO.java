package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.TempsTravail;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class TempsTravailDTO extends NomenclatureIdDTO implements Serializable{
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
	public TempsTravailDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param t 
	 */
	public TempsTravailDTO(TempsTravail t){
		super(t);
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

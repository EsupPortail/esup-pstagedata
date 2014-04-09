package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.Civilite;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CiviliteDTO extends NomenclatureIdDTO implements Serializable{
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
	public CiviliteDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param c 
	 */
	public CiviliteDTO(Civilite c){
		super(c);
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.NomenclatureIdDTO#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
	}

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	
}

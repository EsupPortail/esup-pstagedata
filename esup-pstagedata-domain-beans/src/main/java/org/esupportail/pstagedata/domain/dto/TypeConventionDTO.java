package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.TypeConvention;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class TypeConventionDTO extends NomenclatureIdDTO implements Serializable{
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
	public TypeConventionDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param t
	 */
	public TypeConventionDTO(TypeConvention t){
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

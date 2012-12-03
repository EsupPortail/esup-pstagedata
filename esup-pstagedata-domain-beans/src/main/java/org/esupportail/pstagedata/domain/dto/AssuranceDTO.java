package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.Assurance;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class AssuranceDTO extends NomenclatureIdDTO implements Serializable {

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
	public AssuranceDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param a 
	 */
	public AssuranceDTO(Assurance a){
		super(a);
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

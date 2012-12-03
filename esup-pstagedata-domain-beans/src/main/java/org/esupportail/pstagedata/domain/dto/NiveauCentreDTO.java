package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.NiveauCentre;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class NiveauCentreDTO extends NomenclatureIdDTO implements Serializable{
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
	public NiveauCentreDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param nc 
	 */
	public NiveauCentreDTO(NiveauCentre nc){
		super(nc);
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

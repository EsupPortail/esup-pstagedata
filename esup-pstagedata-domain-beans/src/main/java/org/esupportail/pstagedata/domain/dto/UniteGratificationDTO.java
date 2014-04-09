package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.UniteGratification;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class UniteGratificationDTO extends NomenclatureIdDTO implements Serializable{
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
	public UniteGratificationDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param u
	 */
	public UniteGratificationDTO(UniteGratification u){
		super(u);
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

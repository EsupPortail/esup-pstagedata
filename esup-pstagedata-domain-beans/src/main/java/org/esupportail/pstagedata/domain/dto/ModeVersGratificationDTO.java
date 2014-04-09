package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.ModeVersGratification;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class ModeVersGratificationDTO extends NomenclatureIdDTO implements Serializable{
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
	public ModeVersGratificationDTO(){
		super();
	}
	
	
	/**
	 * Constructeur
	 * @param m
	 */
	public ModeVersGratificationDTO(ModeVersGratification m){
		super(m);
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

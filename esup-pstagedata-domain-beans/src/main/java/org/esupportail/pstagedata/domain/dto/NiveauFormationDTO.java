package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.NiveauFormation;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class NiveauFormationDTO extends NomenclatureIdDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/

	/**
	 * modifiable
	 */
	private boolean modifiable;
	/**
	 * Constructeur
	 */
	public NiveauFormationDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param n 
	 */
	public NiveauFormationDTO(NiveauFormation n){
		super(n);
		this.modifiable = n.getModifiable();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/* ***************************************************************
	 * Methodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString();
	}

	/**
	 * @return the modifiable
	 */
	public boolean getModifiable() {
		return modifiable;
	}

	/**
	 * @param modifiable the modifiable to set
	 */
	public void setModifiable(boolean modifiable) {
		this.modifiable = modifiable;
	}
	
}

package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.ContratOffre;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContratOffreDTO extends NomenclatureIdEnfantDTO implements Serializable{
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
	 * TypeOffre
	 */
	private TypeOffreDTO typeOffre;
	
	/**
	 * Constructeur
	 */
	public ContratOffreDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param co 
	 */
	public ContratOffreDTO(ContratOffre co){
		super(co);
		this.modifiable = co.getModifiable();
	}

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

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/
	
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

	/**
	 * @return the typeOffre
	 */
	public TypeOffreDTO getTypeOffre() {
		return typeOffre;
	}

	/**
	 * @param typeOffre the typeOffre to set
	 */
	public void setTypeOffre(TypeOffreDTO typeOffre) {
		this.typeOffre = typeOffre;
	}
	
}

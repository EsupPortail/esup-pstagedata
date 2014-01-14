package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.Effectif;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class EffectifDTO extends NomenclatureIdDTO implements Serializable{
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
	public EffectifDTO(){
		super();
	}

	/**
	 * Constructeur
	 * @param e 
	 */
	public EffectifDTO(Effectif e){
		super(e);
		this.modifiable = e.getModifiable();
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

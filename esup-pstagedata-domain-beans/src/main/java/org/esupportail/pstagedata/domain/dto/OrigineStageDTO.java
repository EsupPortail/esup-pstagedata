package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.OrigineStage;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class OrigineStageDTO extends NomenclatureIdDTO implements Serializable{
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
	public OrigineStageDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param l
	 */
	public OrigineStageDTO(OrigineStage l){
		super(l);
		this.modifiable = l.getModifiable();
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

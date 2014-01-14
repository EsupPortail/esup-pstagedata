package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.CaisseRegime;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class CaisseRegimeDTO extends NomenclatureCodeDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * infoCaisse
	 */
	private String infoCaisse;

	/**
	 * modifiable
	 */
	private boolean modifiable;
	/**
	 * Constructeur
	 */
	public CaisseRegimeDTO(){
		super();
	}
	
	
	/**
	 * @param c
	 */
	public CaisseRegimeDTO(CaisseRegime c){
		super(c);
		if(c!=null){
			this.infoCaisse = c.getInfoCaisse();
			this.modifiable = c.getModifiable();
		}
	}
	
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	/**
	 * @return the infoCaisse
	 */
	public String getInfoCaisse() {
		return infoCaisse;
	}

	/**
	 * @param infoCaisse the infoCaisse to set
	 */
	public void setInfoCaisse(String infoCaisse) {
		this.infoCaisse = infoCaisse;
	}	
	
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

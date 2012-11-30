package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class CaisseRegime extends NomenclatureCode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Propri�t�s
	 ****************************************************************/
	/**
	 * infoCaisse
	 */
	private String infoCaisse;
	/**
	 * Constructeur
	 */
	public CaisseRegime(){
		super();
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
	
}

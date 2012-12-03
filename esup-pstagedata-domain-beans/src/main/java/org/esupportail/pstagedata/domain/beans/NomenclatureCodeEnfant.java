package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * Nomenclature Code Enfant = Nomenclature Code + string
 */
public class NomenclatureCodeEnfant extends NomenclatureCode implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Code du parent
	 */
	private String codeParent;
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the codeParent
	 */
	public String getCodeParent() {
		return codeParent;
	}

	/**
	 * @param codeParent the codeParent to set
	 */
	public void setCodeParent(String codeParent) {
		this.codeParent = codeParent;
	}
	
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString()+", CodeParent : "+codeParent;
	}
}

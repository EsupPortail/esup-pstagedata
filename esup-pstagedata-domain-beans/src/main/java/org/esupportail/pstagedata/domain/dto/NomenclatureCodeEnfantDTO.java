package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.NomenclatureCodeEnfant;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 * Nomenclature Code Enfant = Nomenclature Code + string
 */
public class NomenclatureCodeEnfantDTO extends NomenclatureCodeDTO implements Serializable {
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
	/**
	 * Constructeur
	 */
	public NomenclatureCodeEnfantDTO(){
		super();
	}
	/**
	 * @param n
	 */
	public NomenclatureCodeEnfantDTO(NomenclatureCodeEnfant n){
		super(n);
		if(n!=null){
			codeParent=n.getCodeParent();
		}
	}
	
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
		return super.toString()+", codeParent : "+codeParent;
	}
}

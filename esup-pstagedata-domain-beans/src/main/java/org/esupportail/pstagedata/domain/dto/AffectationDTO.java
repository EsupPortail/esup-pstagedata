package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.Affectation;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class AffectationDTO extends NomenclatureCodeDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Code universit�
	 */
	private String codeUniversite;
	
	/**
	 * Constructeurs
	 */
	public AffectationDTO() {
		super();
	}
	
	/**
	 * @param a
	 */
	public AffectationDTO(Affectation a){
		super(a);
		this.codeUniversite=a.getCodeUniversite();
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
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the codeUniversite
	 */
	public String getCodeUniversite() {
		return codeUniversite;
	}

	/**
	 * @param codeUniversite the codeUniversite to set
	 */
	public void setCodeUniversite(String codeUniversite) {
		this.codeUniversite = codeUniversite;
	}
}

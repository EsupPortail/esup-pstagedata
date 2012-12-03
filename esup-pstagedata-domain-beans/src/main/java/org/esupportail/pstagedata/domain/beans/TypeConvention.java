package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class TypeConvention extends NomenclatureId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * code controle 
	 */
	private  String codeCtrl;
	/**
	 * Constructeur
	 */
	public TypeConvention(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	/**
	 * @return the codeCtrl
	 */
	public String getCodeCtrl() {
		return codeCtrl;
	}

	/**
	 * @param codeCtrl the codeCtrl to set
	 */
	public void setCodeCtrl(String codeCtrl) {
		this.codeCtrl = codeCtrl;
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

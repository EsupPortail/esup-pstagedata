package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapQualification extends NomenclatureIdEnfant implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propri�t�s
	 ****************************************************************/
	/**
	 * ID = Qualification d'un code FAP de niveau 3 (quatri�me caract�re)
	 */	
	/**
	 * ID Parent de la qualification simplifi�e
	 */

	/**
	 * Constructeur
	 */
	public FapQualification(){
		super();
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
	
}

package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.FapQualification;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapQualificationDTO extends NomenclatureIdEnfantDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
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
	public FapQualificationDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param f 
	 */
	public FapQualificationDTO(FapQualification f){
		super(f);
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

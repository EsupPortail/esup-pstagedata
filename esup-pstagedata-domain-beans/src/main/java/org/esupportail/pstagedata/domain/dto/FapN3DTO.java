package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.FapN3;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class FapN3DTO extends NomenclatureCodeEnfantDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	
	/**
	 * numéro de Qualification : 4�me caract�re du code de niveau 3
	 */
	private int numQualification;

	/**
	 * Constructeur
	 */
	public FapN3DTO(){
		super();
	}

	/**
	 * Constructeur
	 * @param f 
	 */
	public FapN3DTO(FapN3 f){
		super(f);
		if(f!=null){
			numQualification=f.getNumQualification();
		}
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the numQualification
	 */
	public int getNumQualification() {
		return numQualification;
	}

	/**
	 * @param numQualification the numQualification to set
	 */
	public void setNumQualification(int numQualification) {
		this.numQualification = numQualification;
	}
	
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return super.toString()+", numQualification : "+this.numQualification;
	}
	
}

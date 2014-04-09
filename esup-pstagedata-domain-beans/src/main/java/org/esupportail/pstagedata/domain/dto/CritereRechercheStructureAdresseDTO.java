package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CritereRechercheStructureAdresseDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Voie
	 */
	private String rechVoie;
	/**
	 * Batiment
	 */
	private String rechBatimentResidence;
	/**
	 * Ville
	 */
	private String rechVille;
	/**
	 * Pays
	 */
	private PaysDTO rechPays;
	/**
	 * Code postal
	 */
	private String codePostal;
	
	/**
	 * Constructeur
	 */
	public CritereRechercheStructureAdresseDTO(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the rechVoie
	 */
	public String getRechVoie() {
		return rechVoie;
	}

	/**
	 * @param rechVoie the rechVoie to set
	 */
	public void setRechVoie(String rechVoie) {
		this.rechVoie = rechVoie;
	}

	/**
	 * @return the rechBatimentResidence
	 */
	public String getRechBatimentResidence() {
		return rechBatimentResidence;
	}

	/**
	 * @param rechBatimentResidence the rechBatimentResidence to set
	 */
	public void setRechBatimentResidence(String rechBatimentResidence) {
		this.rechBatimentResidence = rechBatimentResidence;
	}

	/**
	 * @return the rechVille
	 */
	public String getRechVille() {
		return rechVille;
	}

	/**
	 * @param rechVille the rechVille to set
	 */
	public void setRechVille(String rechVille) {
		this.rechVille = rechVille;
	}

	/**
	 * @return the rechPays
	 */
	public PaysDTO getRechPays() {
		return rechPays;
	}

	/**
	 * @param rechPays the rechPays to set
	 */
	public void setRechPays(PaysDTO rechPays) {
		this.rechPays = rechPays;
	}

	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
}

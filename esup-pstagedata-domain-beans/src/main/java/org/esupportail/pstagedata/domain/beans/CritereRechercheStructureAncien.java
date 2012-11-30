package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;


/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CritereRechercheStructureAncien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propri�t�s
	 ****************************************************************/
	/**
	 * raisonSociale.
	 */
	private String raisonSociale;
	/**
	 * numeroSiret.
	 */
	private String numeroSiret;

	/**
	 * Code postal.
	 */
	private String codePostal;
	
	/**
	 * NafN1.
	 */
	private NafN1 nafN1;
	
	/**
	 * NafN5.
	 */
	private NafN5 nafN5;
	
	/**
	 * departement.
	 */
	private String departement;
	
	
	/**
	 * Constructeur
	 */
	public CritereRechercheStructureAncien(){
		super();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the raisonSociale
	 */
	public String getRaisonSociale() {
		return raisonSociale;
	}


	/**
	 * @param raisonSociale the raisonSociale to set
	 */
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}


	/**
	 * @return the numeroSiret
	 */
	public String getNumeroSiret() {
		return numeroSiret;
	}


	/**
	 * @param numeroSiret the numeroSiret to set
	 */
	public void setNumeroSiret(String numeroSiret) {
		this.numeroSiret = numeroSiret;
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


	/**
	 * @return the nafN1
	 */
	public NafN1 getNafN1() {
		return nafN1;
	}

	/**
	 * @param nafN1 the nafN1 to set
	 */
	public void setNafN1(NafN1 nafN1) {
		this.nafN1 = nafN1;
	}

	/**
	 * @return the nafN5
	 */
	public NafN5 getNafN5() {
		return nafN5;
	}

	/**
	 * @param nafN5 the nafN5 to set
	 */
	public void setNafN5(NafN5 nafN5) {
		this.nafN5 = nafN5;
	}

	/**
	 * @return the departement
	 */
	public String getDepartement() {
		return departement;
	}


	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	


}

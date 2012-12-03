package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class CritereRechercheStructureAncienDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
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
	private NafN1DTO nafN1;
	
	/**
	 * NafN5.
	 */
	private NafN5DTO nafN5;
	
	/**
	 * departement.
	 */
	private String departement;
	
	/**
	 * Constructeur
	 */
	public CritereRechercheStructureAncienDTO(){
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
	public NafN1DTO getNafN1() {
		return nafN1;
	}

	/**
	 * @param nafN1 the nafN1 to set
	 */
	public void setNafN1(NafN1DTO nafN1) {
		this.nafN1 = nafN1;
	}

	/**
	 * @return the nafN5
	 */
	public NafN5DTO getNafN5() {
		return nafN5;
	}

	/**
	 * @param nafN5 the nafN5 to set
	 */
	public void setNafN5(NafN5DTO nafN5) {
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

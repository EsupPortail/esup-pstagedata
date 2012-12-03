package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class Etudiant extends Personne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * identEtudiant
	 */
	private String identEtudiant;
	/**
	 * nomMarital
	 */
	private String nomMarital;
	
	/**
	 * numEtudiant
	 */
	private String numEtudiant;
	
	/**
	 * numSS
	 */
	private String numSS;
	/**
	 * codeSexe
	 */
	private String codeSexe;
	/**
	 * dateNais
	 */
	private Date dateNais;

	
		
	/* **
	 * Objets
	 */
	


	
	/**
	 * Constructeur
	 */
	public Etudiant(){
		super();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the identEtudiant
	 */
	public String getIdentEtudiant() {
		return identEtudiant;
	}



	/**
	 * @param identEtudiant the identEtudiant to set
	 */
	public void setIdentEtudiant(String identEtudiant) {
		this.identEtudiant = identEtudiant;
	}



	/**
	 * @return the nomMarital
	 */
	public String getNomMarital() {
		return nomMarital;
	}



	/**
	 * @param nomMarital the nomMarital to set
	 */
	public void setNomMarital(String nomMarital) {
		this.nomMarital = nomMarital;
	}



	/**
	 * @return the numEtudiant
	 */
	public String getNumEtudiant() {
		return numEtudiant;
	}



	/**
	 * @param numEtudiant the numEtudiant to set
	 */
	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}



	/**
	 * @return the numSS
	 */
	public String getNumSS() {
		return numSS;
	}



	/**
	 * @param numSS the numSS to set
	 */
	public void setNumSS(String numSS) {
		this.numSS = numSS;
	}



	/**
	 * @return the codeSexe
	 */
	public String getCodeSexe() {
		return codeSexe;
	}



	/**
	 * @param codeSexe the codeSexe to set
	 */
	public void setCodeSexe(String codeSexe) {
		this.codeSexe = codeSexe;
	}



	/**
	 * @return the dateNais
	 */
	public Date getDateNais() {
		return dateNais;
	}



	/**
	 * @param dateNais the dateNais to set
	 */
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}


		

}

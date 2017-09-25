package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.util.Date;

import org.esupportail.pstagedata.domain.beans.Etudiant;

/**
 * @author Danielle Martineau : danielle.martineau@univ-rennes1.fr
 *
 */
public class EtudiantDTO extends PersonneDTO implements Serializable{
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
	public EtudiantDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param e
	 * @param light 
	 */
	public EtudiantDTO(Etudiant e, boolean light){
		super(e,light);
		if(e!=null){
			if(!light){
				this.identEtudiant=e.getIdentEtudiant();
				this.nomMarital= e.getNomMarital();
				this.numEtudiant = e.getNumEtudiant();
				this.numSS=e.getNumSS();
				this.codeSexe=e.getCodeSexe();
				this.dateNais=e.getDateNais();
			}
		}
	}
	
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.PersonneDTO#toString()
	 */
	@Override
	public String toString(){
		return 
		"identEtudiant: "+identEtudiant+", "+
		"nomMarital : "+nomMarital+", "+
		"numEtudiant : "+numEtudiant +", "+
		"numSS : "+numSS+", "+
		"codeSexe : "+codeSexe+", "+
		"dateNais : "+dateNais+", "+
		", "+super.toString();

	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
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

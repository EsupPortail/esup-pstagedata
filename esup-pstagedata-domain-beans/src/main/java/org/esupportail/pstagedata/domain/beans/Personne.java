package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class Personne extends ObjetMetiers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	
	/**
	 * ID
	 */
	private Integer id;
	/**
	 * Nom
	 */
	private String nom;
	/**
	 * Pr�nom
	 */
	private String prenom;
	/**
	 * T�l�phone
	 */
	private String tel;
	/**
	 * Fax
	 */
	private String fax;
	/**
	 * Mail
	 */
	private String mail;
	/**
	 * ID civilit�
	 */
	private Integer idCivilite;
	/**
	 * Code Universit�
	 */
	private String codeUniversite;
	
	/**
	 * type de personne
	 */
	private String typePersonne;
	/**
	 * Derni�re Connexion
	 */
	private Date derniereConnexion;
	/**
	 * Avant derni�re connexion
	 */
	private Date avantDerniereConnexion;
	
	
	
	/**
	 * Constructeur
	 */
	public Personne(){
		super();
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return "id : "+id+", "+"nom : "+nom+", "+
		", "+"prenom : "+prenom+", "+
		"tel : "+tel+", "+"fax : "+fax+", "+
		"mail : "+mail+", "+"idCivilite : "+idCivilite+", "
		+"codeUniversite : "+codeUniversite+", "
		+"typePersonne : "+typePersonne+", "
		+"derniereConnexion : "+derniereConnexion+", "
		+"avantDerniereConnexion : "+avantDerniereConnexion+", "
		+super.toString();
	}
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}
	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the idCivilite
	 */
	public Integer getIdCivilite() {
		return idCivilite;
	}
	/**
	 * @param idCivilite the idCivilite to set
	 */
	public void setIdCivilite(Integer idCivilite) {
		this.idCivilite = idCivilite;
	}
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

	/**
	 * @return the derniereConnexion
	 */
	public Date getDerniereConnexion() {
		return derniereConnexion;
	}

	/**
	 * @param derniereConnexion the derniereConnexion to set
	 */
	public void setDerniereConnexion(Date derniereConnexion) {
		this.derniereConnexion = derniereConnexion;
	}

	/**
	 * @return the avantDerniereConnexion
	 */
	public Date getAvantDerniereConnexion() {
		return avantDerniereConnexion;
	}

	/**
	 * @param avantDerniereConnexion the avantDerniereConnexion to set
	 */
	public void setAvantDerniereConnexion(Date avantDerniereConnexion) {
		this.avantDerniereConnexion = avantDerniereConnexion;
	}

	/**
	 * @return the typePersonne
	 */
	public String getTypePersonne() {
		return typePersonne;
	}

	/**
	 * @param typePersonne the typePersonne to set
	 */
	public void setTypePersonne(String typePersonne) {
		this.typePersonne = typePersonne;
	}


	
}

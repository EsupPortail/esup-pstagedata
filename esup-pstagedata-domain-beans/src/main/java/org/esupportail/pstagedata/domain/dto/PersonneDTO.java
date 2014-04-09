package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.util.Date;

import org.esupportail.pstagedata.domain.beans.Personne;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class PersonneDTO extends ObjetMetiersDTO implements Serializable {

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
	private int id;
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
	private int idCivilite;
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
	
	
	/* **
	 * 
	 * Objets
	 * 
	 */
	/**
	 * Civilit�
	 */
	private CiviliteDTO civilite;

	/**
	 * Constructeur
	 */
	public PersonneDTO(){
		super();
	}

	/**
	 * Constructeur
	 * @param p 
	 * @param light 
	 */
	public PersonneDTO(Personne p, boolean light){
		super(p);
		if(p!=null){
			nom=p.getNom();
			prenom=p.getPrenom();
			if(!light){
				if(p.getId()!=null)id=p.getId();
				tel=p.getTel();
				fax=p.getFax();
				mail=p.getMail();
				if(p.getIdCivilite()!=null)idCivilite=p.getIdCivilite();
				codeUniversite=p.getCodeUniversite();
				if(p.getTypePersonne()!=null)typePersonne=p.getTypePersonne();
				derniereConnexion=p.getDerniereConnexion();
				avantDerniereConnexion=p.getAvantDerniereConnexion();
			}
		}
	}

	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/


	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonneDTO other = (PersonneDTO) obj;
		if (id != other.id)
			return false;
		return true;
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
		+"avantDerniereConnexion : "+avantDerniereConnexion+", "+super.toString();
	}

	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
	public int getIdCivilite() {
		return idCivilite;
	}
	/**
	 * @param idCivilite the idCivilite to set
	 */
	public void setIdCivilite(int idCivilite) {
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
	 * @return the civilite
	 */
	public CiviliteDTO getCivilite() {
		return civilite;
	}

	/**
	 * @param civilite the civilite to set
	 */
	public void setCivilite(CiviliteDTO civilite) {
		this.civilite = civilite;
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

package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.util.Date;

import org.esupportail.pstagedata.domain.beans.AccordPartenariat;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class AccordPartenariatDTO extends ObjetMetiersDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Id de l'accord de partenariat
	 */
	private int idAccordPartenariat;
	/**
	 * Id de la structure passant l'accord
	 */
	private int idStructure;
	/**
	 * Id du contact pr�sent dans l'accord
	 */
	private int idContact;
	/**
	 * login de la personne ayant valid�
	 */
	private String loginValidation;
	/**
	 * login de la personne ayant supprim�s tous les comptes
	 */
	private String loginSuppressionComptes;
	/**
	 * raison de la suppression de tous les comptes
	 */
	private String raisonSuppressionComptes;
	/**
	 * Date de la validation
	 */
	private Date dateValidation;
	/**
	 * Date de la suppression de tous les comptes
	 */
	private Date dateSuppressionComptes;
	/**
	 * true si valid�
	 */
	private boolean estValide;
	/**
	 * true si comptes supprimes
	 */
	private boolean comptesSupprimes;
	/* **
	 * 
	 * Objets
	 * 
	 */
	/**
	 * Contact de l'accord
	 */
	private ContactDTO contact;
	/**
	 * Structure de l'accord
	 */
	private StructureDTO structure;
	
	/**
	 * Constructeur
	 */
	public AccordPartenariatDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param ap 
	 */
	public AccordPartenariatDTO(AccordPartenariat ap){
		super(ap);
		if(ap!=null){
			idAccordPartenariat=ap.getIdAccordPartenariat();
			idStructure=ap.getIdStructure();
			idContact=ap.getIdContact();
			loginValidation=ap.getLoginValidation();
			loginSuppressionComptes=ap.getLoginSuppressionComptes();
			raisonSuppressionComptes=ap.getRaisonSuppressionComptes();
			dateValidation=ap.getDateValidation();
			dateSuppressionComptes=ap.getDateSuppressionComptes();
			estValide=ap.isEstValide();
			comptesSupprimes=ap.isComptesSupprimes();
			structure=new StructureDTO(ap.getStructure(),false);
			contact=new ContactDTO(ap.getContact());			

		}
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString(){
		return "idAccordPartenariat : "+idAccordPartenariat+", "+"idStructure : "+idStructure+", "+"idContact : "+idContact+", "+
		"loginValidation : "+loginValidation+", "+"loginSuppressionComptes : "+loginSuppressionComptes+", "+
		"raisonSuppressionComptes : "+raisonSuppressionComptes+", "+"dateValidation : "+dateValidation+", "+
		"dateSuppressionComptes : "+dateSuppressionComptes+", "+"estValide : "+estValide+", "+"comptesSupprimes : "+comptesSupprimes
		+", "+super.toString();
	}
		
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	

	/**
	 * @return the idStructure
	 */
	public int getIdStructure() {
		return idStructure;
	}

	/**
	 * @return the idAccordPartenariat
	 */
	public int getIdAccordPartenariat() {
		return idAccordPartenariat;
	}

	/**
	 * @param idAccordPartenariat the idAccordPartenariat to set
	 */
	public void setIdAccordPartenariat(int idAccordPartenariat) {
		this.idAccordPartenariat = idAccordPartenariat;
	}

	/**
	 * @param idStructure the idStructure to set
	 */
	public void setIdStructure(int idStructure) {
		this.idStructure = idStructure;
	}

	/**
	 * @return the idContact
	 */
	public int getIdContact() {
		return idContact;
	}

	/**
	 * @param idContact the idContact to set
	 */
	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	/**
	 * @return the loginValidation
	 */
	public String getLoginValidation() {
		return loginValidation;
	}

	/**
	 * @param loginValidation the loginValidation to set
	 */
	public void setLoginValidation(String loginValidation) {
		this.loginValidation = loginValidation;
	}

	/**
	 * @return the loginSuppressionComptes
	 */
	public String getLoginSuppressionComptes() {
		return loginSuppressionComptes;
	}

	/**
	 * @param loginSuppressionComptes the loginSuppressionComptes to set
	 */
	public void setLoginSuppressionComptes(String loginSuppressionComptes) {
		this.loginSuppressionComptes = loginSuppressionComptes;
	}

	/**
	 * @return the raisonSuppressionComptes
	 */
	public String getRaisonSuppressionComptes() {
		return raisonSuppressionComptes;
	}

	/**
	 * @param raisonSuppressionComptes the raisonSuppressionComptes to set
	 */
	public void setRaisonSuppressionComptes(String raisonSuppressionComptes) {
		this.raisonSuppressionComptes = raisonSuppressionComptes;
	}

	/**
	 * @return the dateValidation
	 */
	public Date getDateValidation() {
		return dateValidation;
	}

	/**
	 * @param dateValidation the dateValidation to set
	 */
	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}

	/**
	 * @return the dateSuppressionComptes
	 */
	public Date getDateSuppressionComptes() {
		return dateSuppressionComptes;
	}

	/**
	 * @param dateSuppressionComptes the dateSuppressionComptes to set
	 */
	public void setDateSuppressionComptes(Date dateSuppressionComptes) {
		this.dateSuppressionComptes = dateSuppressionComptes;
	}

	/**
	 * @return the estValide
	 */
	public boolean isEstValide() {
		return estValide;
	}

	/**
	 * @param estValide the estValide to set
	 */
	public void setEstValide(boolean estValide) {
		this.estValide = estValide;
	}

	/**
	 * @return the comptesSupprimes
	 */
	public boolean isComptesSupprimes() {
		return comptesSupprimes;
	}

	/**
	 * @param comptesSupprimes the comptesSupprimes to set
	 */
	public void setComptesSupprimes(boolean comptesSupprimes) {
		this.comptesSupprimes = comptesSupprimes;
	}

	/**
	 * @return the contact
	 */
	public ContactDTO getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(ContactDTO contact) {
		this.contact = contact;
	}

	/**
	 * @return the structure
	 */
	public StructureDTO getStructure() {
		return structure;
	}

	/**
	 * @param structure the structure to set
	 */
	public void setStructure(StructureDTO structure) {
		this.structure = structure;
	}
	
	/* ***************************************************************
	 * M�thodes
	 ****************************************************************/
	
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o){
		boolean r = false;
		if(o instanceof AccordPartenariatDTO){
			r = this.idAccordPartenariat==((AccordPartenariatDTO)o).getIdAccordPartenariat();
		}
		return r;
	}
}

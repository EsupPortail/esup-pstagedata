package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.util.Date;

import org.esupportail.pstagedata.domain.beans.Contact;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class ContactDTO extends PersonneDTO implements Serializable,Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* ***************************************************************
	 * Proprietes
	 ****************************************************************/
	
	/**
	 * Id Service
	 */
	private Integer idService;
	/**
	 * Id du centre de gestion
	 */
	private Integer idCentreGestion;
	/**
	 * Fonction
	 */
	private String fonction;
	/**
	 * Derniere date indiquant que les informations sont e jour
	 */
	private Date infosAJour;
	/**
	 * Login de la personne ayant confirme que les infos sont e jour
	 */
	private String loginInfosAJour;	
	/**
	 * Login
	 */
	private String login;
	/**
	 * Mot de passe
	 */
	private String mdp;
	/**
	 * Commentaire
	 */
	private String commentaire;
	
	@SuppressWarnings("unused")
	private String print;
	/* **
	 * 
	 * Objets
	 * 
	 */
	/**
	 * Id Accord partenariat
	 */
	private int idAccordPartenariat;
	/**
	 * Structure du contact
	 */
	private StructureDTO structure;
	/**
	 * Service du contact
	 */
	private ServiceDTO service;
	/**
	 * CentreGestion du contact
	 */
	private CentreGestionDTO centreGestion;
	
	/**
	 * Constructeur
	 */
	public ContactDTO(){
		super();
	}
	
	/**
	 * Constructeur
	 * @param c 
	 */
	public ContactDTO(Contact c){
		super(c,false);
		if(c!=null){
			idService=c.getIdService();
			idCentreGestion=c.getIdCentreGestion();
			fonction=c.getFonction();
			infosAJour=c.getInfosAJour();
			loginInfosAJour=c.getLoginInfosAJour();	
			login=c.getLogin();
			mdp=c.getMdp();
			commentaire=c.getCommentaire();
						
			this.service=new ServiceDTO(c.getService());
		}
	}
	
	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return "idService : "+idService+", "+"idCentreGestion : "+idCentreGestion+", "+
		", "+"fonction : "+fonction+", "+
		"infosAJour : "+infosAJour+", "+"loginInfosAJour : "+loginInfosAJour+", "+
		"login : "+login+", "+"commentaire : "+commentaire+", "+super.toString();
	}
	
	/**
	 * @return un string contenant les infos du Contact
	 */
	public String getPrint(){
		return
		"Civilite : "+(super.getCivilite()==null?"/":super.getCivilite().getLibelle())+", "+
		"Nom : "+((super.getNom()==null||super.getNom().isEmpty())?"/":super.getNom())+", "+
		"Prenom : "+((super.getPrenom()==null||super.getPrenom().isEmpty())?"/":super.getPrenom())+", "+
		"Tel : "+((super.getTel()==null||super.getTel().isEmpty())?"/":super.getTel())+", "+
		"Fax : "+((super.getFax()==null||super.getFax().isEmpty())?"/":super.getFax())+", "+
		"Mail : "+((super.getMail()==null||super.getMail().isEmpty())?"/":super.getMail())+", "+
		"Nom du service : "+(this.service==null?"/":this.service.getNom())+", "+
		"Fonction : "+((this.fonction==null||this.fonction.isEmpty())?"/":this.fonction)
		;
	}
	/**
	 * @return un string contenant les infos du Contact
	 */
	public String print(){
		return
		"Civilite : "+(super.getCivilite()==null?"/":super.getCivilite().getLibelle())+", "+
		"Nom : "+((super.getNom()==null||super.getNom().isEmpty())?"/":super.getNom())+", "+
		"Prenom : "+((super.getPrenom()==null||super.getPrenom().isEmpty())?"/":super.getPrenom())+", "+
		"Tel : "+((super.getTel()==null||super.getTel().isEmpty())?"/":super.getTel())+", "+
		"Fax : "+((super.getFax()==null||super.getFax().isEmpty())?"/":super.getFax())+", "+
		"Mail : "+((super.getMail()==null||super.getMail().isEmpty())?"/":super.getMail())+", "+
		"Nom du service : "+(this.service==null?"/":this.service.getNom())+", "+
		"Fonction : "+((this.fonction==null||this.fonction.isEmpty())?"/":this.fonction)
		;
	}
	/**
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone(){
		try {
			return super.clone();
		}catch(CloneNotSupportedException e){
			return null;
		}
	} 
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/	
	
	/**
	 * @return the idService
	 */
	public Integer getIdService() {
		return idService;
	}
	/**
	 * @param idService the idService to set
	 */
	public void setIdService(Integer idService) {
		this.idService = idService;
	}
	/**
	 * @return the idCentreGestion
	 */
	public Integer getIdCentreGestion() {
		return idCentreGestion;
	}
	/**
	 * @param idCentreGestion the idCentreGestion to set
	 */
	public void setIdCentreGestion(Integer idCentreGestion) {
		this.idCentreGestion = idCentreGestion;
	}
	/**
	 * @return the fonction
	 */
	public String getFonction() {
		return fonction;
	}
	/**
	 * @param fonction the fonction to set
	 */
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	/**
	 * @return the infosAJour
	 */
	public Date getInfosAJour() {
		return infosAJour;
	}
	/**
	 * @param infosAJour the infosAJour to set
	 */
	public void setInfosAJour(Date infosAJour) {
		this.infosAJour = infosAJour;
	}
	/**
	 * @return the loginInfosAJour
	 */
	public String getLoginInfosAJour() {
		return loginInfosAJour;
	}

	/**
	 * @param loginInfosAJour the loginInfosAJour to set
	 */
	public void setLoginInfosAJour(String loginInfosAJour) {
		this.loginInfosAJour = loginInfosAJour;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @return the mdp
	 */
	public String getMdp() {
		return mdp;
	}
	/**
	 * @param mdp the mdp to set
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
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

	/**
	 * @return the service
	 */
	public ServiceDTO getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(ServiceDTO service) {
		this.service = service;
	}

	/**
	 * @return the centreGestion
	 */
	public CentreGestionDTO getCentreGestion() {
		return centreGestion;
	}

	/**
	 * @param centreGestion the centreGestion to set
	 */
	public void setCentreGestion(CentreGestionDTO centreGestion) {
		this.centreGestion = centreGestion;
	}

	/**
	 * @param print the print to set
	 */
	public void setPrint(String print) {
		this.print = print;
	}
	
	
}

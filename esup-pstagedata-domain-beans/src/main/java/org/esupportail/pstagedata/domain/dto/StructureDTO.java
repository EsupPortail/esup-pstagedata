package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;
import java.util.Date;

import org.esupportail.pstagedata.domain.beans.Structure;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class StructureDTO extends AdresseDTO implements Serializable, Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * ID de la structure
	 */
	private int idStructure;
	/**
	 * ID Type
	 */
	private int idTypeStructure;
	/**
	 * ID Statut
	 */
	private int idStatutJuridique;
	/**
	 * ID Effectif
	 */
	private int idEffectif;
	/**
	 * Code identifiant dans le pays de l�entreprise
	 */
	private String codeEtab;
	/**
	 * numéro Siret
	 */
	private String numeroSiret;
	/**
	 * Raison Sociale
	 */
	private String raisonSociale;
	/**
	 * Code NAF/APE de niveau 5
	 */
	private String codeNAF_N5;
	/**
	 * Activit� principale
	 */
	private String activitePrincipale;
	/**
	 * T�l�phone
	 */
	private String telephone;
	/**
	 * Fax
	 */
	private String fax;
	/**
	 * Mail
	 */
	private String mail;
	/**
	 * Site Web
	 */
	private String siteWeb;
	/**
	 * Enseigne
	 */
	private String groupe;
	/**
	 * Logo
	 */
	private String logo;
	/**
	 * vrai si valid�e
	 */
	private boolean estValidee;
	/**
	 * Derni�re Date indiquant que les infos sont � jour
	 */
	private Date infosAJour;
	/**
	 * Login de la personne ayant confirm� que les infos sont � jour
	 */
	private String loginInfosAJour;	
	/**
	 * Date de validation de la structure
	 */
	private Date dateValidation;
	/**
	 * Login de la personne ayant valid�
	 */
	private String loginValidation;
	/**
	 * Date de d�-validation 
	 */
	private Date dateStopValidation;
	/**
	 * Login de la personne ayant stopp� la validation
	 */
	private String loginStopValidation;
	/* **
	 * 
	 * Objets
	 * 
	 */
	/**
	 * Id Accord partenariat si existant
	 */
	private int idAccordPartenariat;
	/**
	 * Accord de partenariat
	 */
	private AccordPartenariatDTO accordPartenariat;
	/**
	 * StatutJuridique
	 */
	private StatutJuridiqueDTO statutJuridique;
	/**
	 * TypeStructure
	 */
	private TypeStructureDTO typeStructure;
	/**
	 * Effectif
	 */
	private EffectifDTO effectif;
	/**
	 * NafN5
	 */
	private NafN5DTO nafN5;
	/**
	 * Constructeur
	 */
	public StructureDTO(){
		super();
	}

	/**
	 * Constructeur
	 * @param s 
	 * @param superLight 
	 */
	public StructureDTO(Structure s, boolean superLight){
		super(s);
		if(s!=null){
			idStructure=s.getIdStructure();
			raisonSociale=s.getRaisonSociale();
			if(!superLight){
				idTypeStructure=s.getIdTypeStructure();
				idStatutJuridique=s.getIdStatutJuridique();
				idEffectif=s.getIdEffectif();
				codeEtab=s.getCodeEtab();
				numeroSiret=s.getNumeroSiret();
				codeNAF_N5=s.getCodeNAF_N5();
				activitePrincipale=s.getActivitePrincipale();
				telephone=s.getTelephone();
				fax=s.getFax();
				mail=s.getMail();
				siteWeb=s.getSiteWeb();
				groupe=s.getGroupe();
				logo=s.getLogo();
				estValidee=s.isEstValidee();
				infosAJour=s.getInfosAJour();
				loginInfosAJour=s.getLoginInfosAJour();	
				dateValidation=s.getDateValidation();
				loginValidation=s.getLoginValidation();
				dateStopValidation=s.getDateStopValidation();
				loginStopValidation=s.getLoginStopValidation();
				if (s.getIdAccordPartenariat() != null) {
					idAccordPartenariat=s.getIdAccordPartenariat();
				}
				if(s.getAccordPartenariat()!=null) accordPartenariat=new AccordPartenariatDTO(s.getAccordPartenariat());
			}
		}
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
		if(o instanceof StructureDTO){
			r = this.idStructure==((StructureDTO)o).getIdStructure();
		}
		return r;
	}

	/**
	 * @see org.esupportail.pstagedata.domain.dto.AdresseDTO#toString()
	 */
	@Override
	public String toString(){
		return "idStructure : "+idStructure+", "+
		"idTypeStructure : "+idTypeStructure+", "+
		"idStatutJuridique : "+idStatutJuridique+", "+
		"idEffectif : "+idEffectif+", "+
		"codeEtab : "+codeEtab+", "+
		"numeroSiret : "+numeroSiret+", "+
		"raisonSociale : "+raisonSociale+", "+
		"codeNAF_N5 : "+codeNAF_N5+", "+
		"activitePrincipale : "+activitePrincipale+", "+
		"telephone : "+telephone+", "+
		"fax : "+fax+", "+
		"mail : "+mail+", "+
		"siteWeb : "+siteWeb+", "+
		"groupe : "+groupe+", "+
		"logo : "+logo+", "+
		"estValidee : "+estValidee+", "+
		"infosAJour : "+infosAJour+", "+
		"loginInfosAJour : "+loginInfosAJour+", "+
		"dateValidation : "+dateValidation+", "+
		"loginValidation : "+loginValidation+", "+
		"dateStopValidation : "+dateStopValidation+", "+
		"loginStopValidation : "+loginStopValidation+", "+super.toString();
	}

	/**
	 * @return un string de l'adresse de l'entreprise (raison sociale + adresse)
	 */
	public String printAdresse(){
		return 
		((this.raisonSociale==null||this.raisonSociale.isEmpty())?"/":this.raisonSociale)+", "+
		"Groupe : "+((this.groupe==null||this.groupe.isEmpty())?"/":this.groupe)+", "+
		"Numero Siret : "+((this.numeroSiret==null||this.numeroSiret.isEmpty())?"/":this.numeroSiret)+",\r\n "+
		((super.getBatimentResidence()==null||super.getBatimentResidence().isEmpty())?"/":super.getBatimentResidence())+", "+
		((super.getVoie()==null||super.getVoie().isEmpty())?"/":super.getVoie())+",\r\n "+
		((super.getCommune()==null||super.getCommune().isEmpty())?"/":super.getCommune())+", "+
		((super.getCodePostal()==null||super.getCodePostal().isEmpty())?"/":super.getCodePostal())+",\r\n "+
		((super.getLibCedex()==null||super.getLibCedex().isEmpty())?"/":super.getLibCedex())+",\r\n "+
		"Code Commune : "+(super.getCodeCommune()>0?super.getCodeCommune():"/")+", "+
		(super.getPays()!=null?super.getPays().getLibelle():"/");
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
	 * @return the idStructure
	 */
	public int getIdStructure() {
		return idStructure;
	}
	/**
	 * @param idStructure the idStructure to set
	 */
	public void setIdStructure(int idStructure) {
		this.idStructure = idStructure;
	}	
	/**
	 * @return the idTypeStructure
	 */
	public int getIdTypeStructure() {
		return idTypeStructure;
	}
	/**
	 * @param idTypeStructure the idTypeStructure to set
	 */
	public void setIdTypeStructure(int idTypeStructure) {
		this.idTypeStructure = idTypeStructure;
	}
	/**
	 * @return the idStatutJuridique
	 */
	public int getIdStatutJuridique() {
		return idStatutJuridique;
	}
	/**
	 * @param idStatutJuridique the idStatutJuridique to set
	 */
	public void setIdStatutJuridique(int idStatutJuridique) {
		this.idStatutJuridique = idStatutJuridique;
	}
	/**
	 * @return the idEffectif
	 */
	public int getIdEffectif() {
		return idEffectif;
	}
	/**
	 * @param idEffectif the idEffectif to set
	 */
	public void setIdEffectif(int idEffectif) {
		this.idEffectif = idEffectif;
	}
	/**
	 * @return the codeEtab
	 */
	public String getCodeEtab() {
		return codeEtab;
	}
	/**
	 * @param codeEtab the codeEtab to set
	 */
	public void setCodeEtab(String codeEtab) {
		this.codeEtab = codeEtab;
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
	 * @return the codeNAF_N5
	 */
	public String getCodeNAF_N5() {
		return codeNAF_N5;
	}

	/**
	 * @param codeNAF_N5 the codeNAF_N5 to set
	 */
	public void setCodeNAF_N5(String codeNAF_N5) {
		this.codeNAF_N5 = codeNAF_N5;
	}

	/**
	 * @return the activitePrincipale
	 */
	public String getActivitePrincipale() {
		return activitePrincipale;
	}
	/**
	 * @param activitePrincipale the activitePrincipale to set
	 */
	public void setActivitePrincipale(String activitePrincipale) {
		this.activitePrincipale = activitePrincipale;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	 * @return the siteWeb
	 */
	public String getSiteWeb() {
		return siteWeb;
	}
	/**
	 * @param siteWeb the siteWeb to set
	 */
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}
	/**
	 * @return the groupe
	 */
	public String getGroupe() {
		return groupe;
	}
	/**
	 * @param groupe the groupe to set
	 */
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}
	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}
	/**
	 * @return the estValidee
	 */
	public boolean isEstValidee() {
		return estValidee;
	}
	/**
	 * @param estValidee the estValidee to set
	 */
	public void setEstValidee(boolean estValidee) {
		this.estValidee = estValidee;
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
	 * @return the dateStopValidation
	 */
	public Date getDateStopValidation() {
		return dateStopValidation;
	}
	/**
	 * @param dateStopValidation the dateStopValidation to set
	 */
	public void setDateStopValidation(Date dateStopValidation) {
		this.dateStopValidation = dateStopValidation;
	}
	/**
	 * @return the loginStopValidation
	 */
	public String getLoginStopValidation() {
		return loginStopValidation;
	}
	/**
	 * @param loginStopValidation the loginStopValidation to set
	 */
	public void setLoginStopValidation(String loginStopValidation) {
		this.loginStopValidation = loginStopValidation;
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
	 * @return the accordPartenariat
	 */
	public AccordPartenariatDTO getAccordPartenariat() {
		return accordPartenariat;
	}

	/**
	 * @param accordPartenariat the accordPartenariat to set
	 */
	public void setAccordPartenariat(AccordPartenariatDTO accordPartenariat) {
		this.accordPartenariat = accordPartenariat;
	}

	/**
	 * @return the statutJuridique
	 */
	public StatutJuridiqueDTO getStatutJuridique() {
		return statutJuridique;
	}

	/**
	 * @param statutJuridique the statutJuridique to set
	 */
	public void setStatutJuridique(StatutJuridiqueDTO statutJuridique) {
		this.statutJuridique = statutJuridique;
	}

	/**
	 * @return the typeStructure
	 */
	public TypeStructureDTO getTypeStructure() {
		return typeStructure;
	}

	/**
	 * @param typeStructure the typeStructure to set
	 */
	public void setTypeStructure(TypeStructureDTO typeStructure) {
		this.typeStructure = typeStructure;
	}

	/**
	 * @return the effectif
	 */
	public EffectifDTO getEffectif() {
		return effectif;
	}

	/**
	 * @param effectif the effectif to set
	 */
	public void setEffectif(EffectifDTO effectif) {
		this.effectif = effectif;
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
}

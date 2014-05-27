package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Matthieu Manginot : matthieu.manginot@univ-nancy2.fr
 *
 */
public class CentreGestion extends Adresse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * Id du centre
	 */
	private Integer idCentreGestion;
	/**
	 * Id correspondant au niveau du centre
	 */
	private Integer idNiveauCentre;
	/**
	 * Nom du centre
	 */
	private String nomCentre;
	/**
	 * Site Web
	 */
	private String siteWeb;
	/**
	 * Adresse mail
	 */
	private String mail;
	/**
	 * Telephone
	 */
	private String telephone;
	/**
	 * Fax
	 */
	private String fax;
	/**
	 * Commentaire
	 */
	private String commentaire;
	/**
	 * true si presence du tuteur enseignant
	 */
	private boolean presenceTuteurEns;
	/**
	 * true si presence tuteur pro
	 */
	private boolean presenceTuteurPro;
	/**
	 * true si le tuteur pro peut �tre saisi par un etudiant
	 */
	private boolean saisieTuteurProParEtudiant;
	/**
	 * true si choix d'année possible avant le début de la nouvelle année
	 */
	private boolean choixAnneeAvantDebutAnnee;
	/**
	 * true si choix d'année possible après ledébutde la nouvelle année
	 */
	private boolean choixAnneeApresDebutAnnee;
	/**
	 * true si l'universite utilise le depot anonyme
	 */
	private boolean depotAnonyme;
	/**
	 * Code Université
	 */
	private String codeUniversite;
	/**
	 * Nom du Viseur
	 */
	private String nomViseur;
	/**
	 * pr�nom du Viseur
	 */
	private String prenomViseur;
	/**
	 * Url de la page d'instruction des consignes d'impression
	 */
	private String urlPageInstruction;
	/**
	 * id du centre gestion SuperViseur
	 */
	private Integer idCentreGestionSuperViseur;
	/**
	 * code confidentialité
	 */
	private String codeConfidentialite;
	/**
	 * autoriserImpressionConvention
	 */
	private boolean autoriserImpressionConvention;
	/**
	 * idFichier
	 */
	private int idFichier;
	/**
	 * true si l'universite utilise la validation pedadogique
	 */
	private boolean validationPedagogique;
	/**
	 * true si les etudiants du centre ont le droit de creer leurs conventions
	 */
	private boolean autorisationEtudiantCreationConvention;
	/**
	 * mode d'évaluation des stages
	 */
	private int idModeValidationStage;
	/**
	 * true si les etudiants peuvent voir l'appreciation de leur tuteur pro
	 */
	private boolean visibiliteEvalPro;
	
	/* ***************************************************************
	 * Objets
	 ****************************************************************/
	/**
	 * Critere de gestion du centre
	 */
	private NiveauCentre niveauCentre;
	/**
	 * Confidentialite du centre
	 */
	private Confidentialite confidentialite;
	/**
	 * Fichier du centre
	 */
	private Fichier fichier;
	/**
	 * Mode d'évaludation des stages du centre
	 */
	private ModeValidationStage modeValidationStage;

	/**
	 * Constructeur
	 */
	public CentreGestion(){
		super();
	}
	
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/

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
	 * @return the idNiveauCentre
	 */
	public Integer getIdNiveauCentre() {
		return idNiveauCentre;
	}

	/**
	 * @param idNiveauCentre the idNiveauCentre to set
	 */
	public void setIdNiveauCentre(Integer idNiveauCentre) {
		this.idNiveauCentre = idNiveauCentre;
	}

	/**
	 * @return the nomCentre
	 */
	public String getNomCentre() {
		return nomCentre;
	}

	/**
	 * @param nomCentre the nomCentre to set
	 */
	public void setNomCentre(String nomCentre) {
		this.nomCentre = nomCentre;
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
	 * @return the presenceTuteurEns
	 */
	public boolean isPresenceTuteurEns() {
		return presenceTuteurEns;
	}

	/**
	 * @param presenceTuteurEns the presenceTuteurEns to set
	 */
	public void setPresenceTuteurEns(boolean presenceTuteurEns) {
		this.presenceTuteurEns = presenceTuteurEns;
	}

	/**
	 * @return the presenceTuteurPro
	 */
	public boolean isPresenceTuteurPro() {
		return presenceTuteurPro;
	}

	/**
	 * @param presenceTuteurPro the presenceTuteurPro to set
	 */
	public void setPresenceTuteurPro(boolean presenceTuteurPro) {
		this.presenceTuteurPro = presenceTuteurPro;
	}

	/**
	 * @return the saisieTuteurProParEtudiant
	 */
	public boolean isSaisieTuteurProParEtudiant() {
		return saisieTuteurProParEtudiant;
	}

	/**
	 * @param saisieTuteurProParEtudiant the saisieTuteurProParEtudiant to set
	 */
	public void setSaisieTuteurProParEtudiant(boolean saisieTuteurProParEtudiant) {
		this.saisieTuteurProParEtudiant = saisieTuteurProParEtudiant;
	}

	/**
	 * @return the choixAnneeAvantDebutAnnee
	 */
	public boolean isChoixAnneeAvantDebutAnnee() {
		return choixAnneeAvantDebutAnnee;
	}

	/**
	 * @param choixAnneeAvantDebutAnnee the choixAnneeAvantDebutAnnee to set
	 */
	public void setChoixAnneeAvantDebutAnnee(boolean choixAnneeAvantDebutAnnee) {
		this.choixAnneeAvantDebutAnnee = choixAnneeAvantDebutAnnee;
	}

	/**
	 * @return the choixAnneeApresDebutAnnee
	 */
	public boolean isChoixAnneeApresDebutAnnee() {
		return choixAnneeApresDebutAnnee;
	}

	/**
	 * @param choixAnneeApresDebutAnnee the choixAnneeApresDebutAnnee to set
	 */
	public void setChoixAnneeApresDebutAnnee(boolean choixAnneeApresDebutAnnee) {
		this.choixAnneeApresDebutAnnee = choixAnneeApresDebutAnnee;
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
	 * @param urlPageInstruction the urlPageInstruction to set
	 */
	public void setUrlPageInstruction(String urlPageInstruction) {
		this.urlPageInstruction = urlPageInstruction;
	}
	/**
	 * @return the urlPageInstruction
	 */
	public String getUrlPageInstruction() {
		return urlPageInstruction;
	}
	/**
	 * @param idCentreGestionSuperViseur the idCentreGestionSuperViseur to set
	 */
	public void setIdCentreGestionSuperViseur(Integer idCentreGestionSuperViseur) {
		this.idCentreGestionSuperViseur = idCentreGestionSuperViseur;
	}
	/**
	 * @return the idCentreGestionSuperViseur
	 */
	public Integer getIdCentreGestionSuperViseur() {
		return idCentreGestionSuperViseur;
	}
	/**
	 * @param codeConfidentialite the codeConfidentialite to set
	 */
	public void setCodeConfidentialite(String codeConfidentialite) {
		this.codeConfidentialite = codeConfidentialite;
	}
	/**
	 * @return the codeConfidentialite
	 */
	public String getCodeConfidentialite() {
		return codeConfidentialite;
	}
	/**
	 * @return the autoriserImpressionConvention
	 */
	public boolean isAutoriserImpressionConvention() {
		return autoriserImpressionConvention;
	}

	/**
	 * @param autoriserImpressionConvention the autoriserImpressionConvention to set
	 */
	public void setAutoriserImpressionConvention(
			boolean autoriserImpressionConvention) {
		this.autoriserImpressionConvention = autoriserImpressionConvention;
	}

	/**
	 * @param nomViseur the nomViseur to set
	 */
	public void setNomViseur(String nomViseur) {
		this.nomViseur = nomViseur;
	}
	/**
	 * @return the nomViseur
	 */
	public String getNomViseur() {
		return nomViseur;
	}
	/**
	 * @param prenomViseur the prenomViseur to set
	 */
	public void setPrenomViseur(String prenomViseur) {
		this.prenomViseur = prenomViseur;
	}
	/**
	 * @return the prenomViseur
	 */
	public String getPrenomViseur() {
		return prenomViseur;
	}

	/**
	 * @return the niveauCenre
	 */
	public NiveauCentre getNiveauCentre() {
		return niveauCentre;
	}

	/**
	 * @param niveauCentre the niveauCentre to set
	 */
	public void setNiveauCentre(NiveauCentre niveauCentre) {
		this.niveauCentre = niveauCentre;
	}

	/**
	 * @return the confidentialite
	 */
	public Confidentialite getConfidentialite() {
		return confidentialite;
	}

	/**
	 * @param confidentialite the confidentialite to set
	 */
	public void setConfidentialite(Confidentialite confidentialite) {
		this.confidentialite = confidentialite;
	}

	/**
	 * @param depotAnonyme the depotAnonyme to set
	 */
	public void setDepotAnonyme(boolean depotAnonyme) {
		this.depotAnonyme = depotAnonyme;
	}

	/**
	 * @return the depotAnonyme
	 */
	public boolean isDepotAnonyme() {
		return depotAnonyme;
	}

	/**
	 * @param fichier the fichier to set
	 */
	public void setFichier(Fichier fichier) {
		this.fichier = fichier;
	}

	/**
	 * @return the fichier
	 */
	public Fichier getFichier() {
		return fichier;
	}

	/**
	 * @param idFichier the idFichier to set
	 */
	public void setIdFichier(int idFichier) {
		this.idFichier = idFichier;
	}

	/**
	 * @return the idFichier
	 */
	public int getIdFichier() {
		return idFichier;
	}

	/**
	 * @return the validationPedagogique
	 */
	public boolean isValidationPedagogique() {
		return validationPedagogique;
	}

	/**
	 * @param validationPedagogique the validationPedagogique to set
	 */
	public void setValidationPedagogique(boolean validationPedagogique) {
		this.validationPedagogique = validationPedagogique;
	}

	/**
	 * @return the autorisationEtudiantCreationConvention
	 */
	public boolean isAutorisationEtudiantCreationConvention() {
		return autorisationEtudiantCreationConvention;
	}

	/**
	 * @param autorisationEtudiantCreationConvention the autorisationEtudiantCreationConvention to set
	 */
	public void setAutorisationEtudiantCreationConvention(
			boolean autorisationEtudiantCreationConvention) {
		this.autorisationEtudiantCreationConvention = autorisationEtudiantCreationConvention;
	}

	/**
	 * @return the idModeValidationStage
	 */
	public int getIdModeValidationStage() {
		return idModeValidationStage;
	}

	/**
	 * @param idModeValidationStage the idModeValidationStage to set
	 */
	public void setIdModeValidationStage(int idModeValidationStage) {
		this.idModeValidationStage = idModeValidationStage;
	}

	/**
	 * @return the modeValidationStage
	 */
	public ModeValidationStage getModeValidationStage() {
		return modeValidationStage;
	}

	/**
	 * @param modeValidationStage the modeValidationStage to set
	 */
	public void setModeValidationStage(ModeValidationStage modeValidationStage) {
		this.modeValidationStage = modeValidationStage;
	}

	/**
	 * @return the visibiliteEvalPro
	 */
	public boolean isVisibiliteEvalPro() {
		return visibiliteEvalPro;
	}

	/**
	 * @param visibiliteEvalPro the visibiliteEvalPro to set
	 */
	public void setVisibiliteEvalPro(boolean visibiliteEvalPro) {
		this.visibiliteEvalPro = visibiliteEvalPro;
	}
}

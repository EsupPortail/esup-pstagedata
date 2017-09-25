package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.ReponseEvaluation;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class ReponseEvaluationDTO extends ObjetMetiersDTO implements Serializable{
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
	 * idAvenant
	 */
	private Integer idFicheEvaluation;
	/**
	 * idCentreGestion
	 */
	private Integer idConvention;
	/**
	 * validationEtudiant
	 */
	private boolean validationEtudiant;
	/**
	 * validationEnseignant
	 */
	private boolean validationEnseignant;
	/**
	 * validationEntreprise
	 */
	private boolean validationEntreprise;
	/**
	 * impressionEtudiant
	 */
	private boolean impressionEtudiant;
	/**
	 * impressionEnseignant
	 */
	private boolean impressionEnseignant;
	/**
	 * impressionEntreprise
	 */
	private boolean impressionEntreprise;

	/* ***************************************************************
	 * Reponses Entreprise
	 ****************************************************************/
	/**
	 * reponseEnt1
	 */
	private int reponseEnt1;
	/**
	 * reponseEnt1bis
	 */
	private String reponseEnt1bis;
	/**
	 * reponseEnt2
	 */
	private int reponseEnt2;
	/**
	 * reponseEnt2bis
	 */
	private String reponseEnt2bis;
	/**
	 * reponseEnt3
	 */
	private int reponseEnt3;
	/**
	 * reponseEnt4
	 */
	private int reponseEnt4;
	/**
	 * reponseEnt4bis
	 */
	private String reponseEnt4bis;
	/**
	 * reponseEnt5
	 */
	private int reponseEnt5;
	/**
	 * reponseEnt5bis
	 */
	private String reponseEnt5bis;
	/**
	 * reponseEnt6
	 */
	private int reponseEnt6;
	/**
	 * reponseEnt6bis
	 */
	private String reponseEnt6bis;
	/**
	 * reponseEnt7
	 */
	private int reponseEnt7;
	/**
	 * reponseEnt7bis
	 */
	private String reponseEnt7bis;
	/**
	 * reponseEnt8
	 */
	private int reponseEnt8;
	/**
	 * reponseEnt8bis
	 */
	private String reponseEnt8bis;
	/**
	 * reponseEnt9
	 */
	private int reponseEnt9;
	/**
	 * reponseEnt9bis
	 */
	private String reponseEnt9bis;
	/**
	 * reponseEnt10
	 */
	private boolean reponseEnt10;
	/**
	 * reponseEnt10bis
	 */
	private String reponseEnt10bis;
	/**
	 * reponseEnt11
	 */
	private int reponseEnt11;
	/**
	 * reponseEnt11bis
	 */
	private String reponseEnt11bis;
	/**
	 * reponseEnt12
	 */
	private int reponseEnt12;
	/**
	 * reponseEnt12bis
	 */
	private String reponseEnt12bis;
	/**
	 * reponseEnt13
	 */
	private int reponseEnt13;
	/**
	 * reponseEnt13bis
	 */
	private String reponseEnt13bis;
	/**
	 * reponseEnt14
	 */
	private int reponseEnt14;
	/**
	 * reponseEnt14bis
	 */
	private String reponseEnt14bis;
	/**
	 * reponseEnt15
	 */
	private int reponseEnt15;
	/**
	 * reponseEnt15bis
	 */
	private String reponseEnt15bis;
	/**
	 * reponseEnt16
	 */
	private int reponseEnt16;
	/**
	 * reponseEnt16bis
	 */
	private String reponseEnt16bis;
	/**
	 * reponseEnt17
	 */
	private int reponseEnt17;
	/**
	 * reponseEnt17bis
	 */
	private String reponseEnt17bis;
	/**
	 * reponseEnt18
	 */
	private boolean reponseEnt18;
	/**
	 * reponseEnt18bis
	 */
	private String reponseEnt18bis;
	/**
	 * reponseEnt18
	 */
	private String reponseEnt19;

	/* ***************************************************************
	 * Reponses Etudiant
	 ****************************************************************/
	/**
	 * reponseEtuI1
	 */
	private int reponseEtuI1;
	/**
	 * reponseEtuI1bis
	 */
	private String reponseEtuI1bis;
	/**
	 * reponseEtuI2
	 */
	private int reponseEtuI2;
	/**
	 * reponseEtuI3
	 */
	private int reponseEtuI3;
	/**
	 * reponseEtuI4a
	 */
	private boolean reponseEtuI4a;
	/**
	 * reponseEtuI4b
	 */
	private boolean reponseEtuI4b;
	/**
	 * reponseEtuI4c
	 */
	private boolean reponseEtuI4c;
	/**
	 * reponseEtuI4d
	 */
	private boolean reponseEtuI4d;
	/**
	 * reponseEtuI5
	 */
	private int reponseEtuI5;
	/**
	 * reponseEtuI6
	 */
	private int reponseEtuI6;
	/**
	 * reponseEtuI7 (oui/non)
	 */
	private boolean reponseEtuI7;
	/**
	 * reponseEtuI7bis1 (si oui, par qui ?)
	 */
	private int reponseEtuI7bis1;
	/**
	 * reponseEtuI7bis1a (par le saoip, avez-vous utilise les ressources...?)
	 */
	private boolean reponseEtuI7bis1a;
	/**
	 * reponseEtuI7bis1b (Autre, par qui ?)
	 */
	private String reponseEtuI7bis1b;
	/**
	 * reponseEtuI7bis2  (Non, pourquoi ?)
	 */
	private int reponseEtuI7bis2;
	/**
	 * reponseEtuI8
	 */
	private boolean reponseEtuI8;
	/**
	 * reponseEtuII1
	 */
	private int reponseEtuII1;
	/**
	 * reponseEtuII1bis
	 */
	private String reponseEtuII1bis;
	/**
	 * reponseEtuII2
	 */
	private int reponseEtuII2;
	/**
	 * reponseEtuII2bis
	 */
	private String reponseEtuII2bis;
	/**
	 * reponseEtuII3
	 */
	private int reponseEtuII3;
	/**
	 * reponseEtuII3bis
	 */
	private String reponseEtuII3bis;
	/**
	 * reponseEtuII4
	 */
	private int reponseEtuII4;
	/**
	 * reponseEtuII5
	 */
	private boolean reponseEtuII5;
	/**
	 * reponseEtuII5a
	 */
	private int reponseEtuII5a;
	/**
	 * reponseEtuII5b
	 */
	private boolean reponseEtuII5b;
	/**
	 * reponseEtuII6
	 */
	private boolean reponseEtuII6;

	/**
	 * reponseEtuIII1
	 */
	private boolean reponseEtuIII1;
	/**
	 * reponseEtuIII1bis
	 */
	private String reponseEtuIII1bis;
	/**
	 * reponseEtuIII2
	 */
	private boolean reponseEtuIII2;
	/**
	 * reponseEtuIII2bis
	 */
	private String reponseEtuIII2bis;
	/**
	 * reponseEtuIII3
	 */
	private boolean reponseEtuIII3;
	/**
	 * reponseEtuIII3bis
	 */
	private String reponseEtuIII3bis;
	/**
	 * reponseEtuIII4
	 */
	private int reponseEtuIII4;
	/**
	 * reponseEtuIII5a
	 */
	private boolean reponseEtuIII5a;
	/**
	 * reponseEtuIII5b
	 */
	private boolean reponseEtuIII5b;
	/**
	 * reponseEtuIII5c
	 */
	private boolean reponseEtuIII5c;
	/**
	 * reponseEtuIII5bis
	 */
	private String reponseEtuIII5bis;
	/**
	 * reponseEtuIII6
	 */
	private int reponseEtuIII6;
	/**
	 * reponseEtuIII6bis
	 */
	private String reponseEtuIII6bis;
	/**
	 * reponseEtuIII7
	 */
	private int reponseEtuIII7;
	/**
	 * reponseEtuIII7bis
	 */
	private String reponseEtuIII7bis;
	/**
	 * reponseEtuIII8
	 */
	private boolean reponseEtuIII8;
	/**
	 * reponseEtuIII8bis
	 */
	private String reponseEtuIII8bis;
	/**
	 * reponseEtuIII9
	 */
	private boolean reponseEtuIII9;
	/**
	 * reponseEtuIII9bis
	 */
	private String reponseEtuIII9bis;
	/**
	 * reponseEtuIII10
	 */
	private boolean reponseEtuIII10;
	/**
	 * reponseEtuIII11
	 */
	private boolean reponseEtuIII11;
	/**
	 * reponseEtuIII12
	 */
	private boolean reponseEtuIII12;
	/**
	 * reponseEtuIII13
	 */
	private boolean reponseEtuIII13;
	/**
	 * reponseEtuIII14
	 */
	private boolean reponseEtuIII14;
	/**
	 * reponseEtuIII15
	 */
	private int reponseEtuIII15;
	/**
	 * reponseEtuIII15bis
	 */
	private String reponseEtuIII15bis;
	/**
	 * reponseEtuIII16
	 */
	private int reponseEtuIII16;
	/**
	 * reponseEtuIII16bis
	 */
	private String reponseEtuIII16bis;
	
	/* ***************************************************************
	 * Reponses Enseignant
	 ****************************************************************/
	/**
	 * reponseEnsI1a
	 */
	private boolean reponseEnsI1a;
	/**
	 * reponseEnsI1b
	 */
	private boolean reponseEnsI1b;
	/**
	 * reponseEnsI1c
	 */
	private boolean reponseEnsI1c;
	/**
	 * reponseEnsI2a
	 */
	private boolean reponseEnsI2a;
	/**
	 * reponseEnsI2b
	 */
	private boolean reponseEnsI2b;
	/**
	 * reponseEnsI2c
	 */
	private boolean reponseEnsI2c;
	/**
	 * reponseEnsI3
	 */
	private String reponseEnsI3;
	/**
	 * reponseEnsII1
	 */
	private int reponseEnsII1;
	/**
	 * reponseEnsII2
	 */
	private int reponseEnsII2;
	/**
	 * reponseEnsII3
	 */
	private int reponseEnsII3;
	/**
	 * reponseEnsII4
	 */
	private int reponseEnsII4;
	/**
	 * reponseEnsII5
	 */
	private int reponseEnsII5;
	/**
	 * reponseEnsII6
	 */
	private int reponseEnsII6;
	/**
	 * reponseEnsII7
	 */
	private int reponseEnsII7;
	/**
	 * reponseEnsII8
	 */
	private int reponseEnsII8;
	/**
	 * reponseEnsII9
	 */
	private int reponseEnsII9;
	/**
	 * reponseEnsII10
	 */
	private int reponseEnsII10;
	/**
	 * reponseEnsII11
	 */
	private String reponseEnsII11;

	/* ***************************************************************
	 * Objets
	 ****************************************************************/
	/**
	 * Constructeur
	 */
	public ReponseEvaluationDTO(){
		super();
	}

	/**
	 * Constructeur
	 */
	public ReponseEvaluationDTO(ReponseEvaluation re){
		super(re);
		if(re!=null){
			this.idFicheEvaluation = re.getIdFicheEvaluation();
			this.idConvention = re.getIdConvention();
			this.validationEnseignant = re.isValidationEnseignant();
			this.validationEtudiant = re.isValidationEtudiant();
			this.validationEntreprise = re.isValidationEntreprise();
			this.impressionEtudiant = re.isImpressionEtudiant();
			this.impressionEnseignant = re.isImpressionEnseignant();
			this.impressionEntreprise = re.isImpressionEntreprise();
			// fiche entreprise
			this.reponseEnt1 = re.getReponseEnt1();
			this.reponseEnt1bis = re.getReponseEnt1bis();
			this.reponseEnt2 = re.getReponseEnt2();
			this.reponseEnt2bis = re.getReponseEnt2bis();
			this.reponseEnt3 = re.getReponseEnt3();
			this.reponseEnt4 = re.getReponseEnt4();
			this.reponseEnt4bis = re.getReponseEnt4bis();
			this.reponseEnt5 = re.getReponseEnt5();
			this.reponseEnt5bis = re.getReponseEnt5bis();
			this.reponseEnt6 = re.getReponseEnt6();
			this.reponseEnt6bis = re.getReponseEnt6bis();
			this.reponseEnt7 = re.getReponseEnt7();
			this.reponseEnt7bis = re.getReponseEnt7bis();
			this.reponseEnt8 = re.getReponseEnt8();
			this.reponseEnt8bis = re.getReponseEnt8bis();
			this.reponseEnt9 = re.getReponseEnt9();
			this.reponseEnt9bis = re.getReponseEnt9bis();
			this.reponseEnt10 = re.isReponseEnt10();
			this.reponseEnt10bis = re.getReponseEnt10bis();
			this.reponseEnt11 = re.getReponseEnt11();
			this.reponseEnt11bis = re.getReponseEnt11bis();
			this.reponseEnt12 = re.getReponseEnt12();
			this.reponseEnt12bis = re.getReponseEnt12bis();
			this.reponseEnt13 = re.getReponseEnt13();
			this.reponseEnt13bis = re.getReponseEnt13bis();
			this.reponseEnt14 = re.getReponseEnt14();
			this.reponseEnt14bis = re.getReponseEnt14bis();
			this.reponseEnt15 = re.getReponseEnt15();
			this.reponseEnt15bis = re.getReponseEnt15bis();
			this.reponseEnt16 = re.getReponseEnt16();
			this.reponseEnt16bis = re.getReponseEnt16bis();
			this.reponseEnt17 = re.getReponseEnt17();
			this.reponseEnt17bis = re.getReponseEnt17bis();
			this.reponseEnt18 = re.isReponseEnt18();
			this.reponseEnt18bis = re.getReponseEnt18bis();
			this.reponseEnt19 = re.getReponseEnt19();
			// fiche etudiant
			this.reponseEtuI1 = re.getReponseEtuI1();
			this.reponseEtuI1bis = re.getReponseEtuI1bis();
			this.reponseEtuI2 = re.getReponseEtuI2();
			this.reponseEtuI3 = re.getReponseEtuI3();
			this.reponseEtuI4a = re.isReponseEtuI4a();
			this.reponseEtuI4b = re.isReponseEtuI4b();
			this.reponseEtuI4c = re.isReponseEtuI4c();
			this.reponseEtuI4d = re.isReponseEtuI4d();
			this.reponseEtuI5 = re.getReponseEtuI5();
			this.reponseEtuI6 = re.getReponseEtuI6();
			this.reponseEtuI7 = re.isReponseEtuI7();
			this.reponseEtuI7bis1 = re.getReponseEtuI7bis1();
			this.reponseEtuI7bis1a = re.isReponseEtuI7bis1a();
			this.reponseEtuI7bis1b = re.getReponseEtuI7bis1b();
			this.reponseEtuI7bis2 = re.getReponseEtuI7bis2();
			this.reponseEtuI8 = re.isReponseEtuI8();
			this.reponseEtuII1 = re.getReponseEtuII1();
			this.reponseEtuII1bis = re.getReponseEtuII1bis();
			this.reponseEtuII2 = re.getReponseEtuII2();
			this.reponseEtuII2bis = re.getReponseEtuII2bis();
			this.reponseEtuII3 = re.getReponseEtuII3();
			this.reponseEtuII3bis = re.getReponseEtuII3bis();
			this.reponseEtuII4 = re.getReponseEtuII4();
			this.reponseEtuII5 = re.isReponseEtuII5();
			this.reponseEtuII5a = re.getReponseEtuII5a();
			this.reponseEtuII5b = re.isReponseEtuII5b();
			this.reponseEtuII6 = re.isReponseEtuII6();
			this.reponseEtuIII1 = re.isReponseEtuIII1();
			this.reponseEtuIII1bis = re.getReponseEtuIII1bis();
			this.reponseEtuIII2 = re.isReponseEtuIII2();
			this.reponseEtuIII2bis = re.getReponseEtuIII2bis();
			this.reponseEtuIII3 = re.isReponseEtuIII3();
			this.reponseEtuIII3bis = re.getReponseEtuIII3bis();
			this.reponseEtuIII4 = re.getReponseEtuIII4();
			this.reponseEtuIII5a = re.isReponseEtuIII5a();
			this.reponseEtuIII5b = re.isReponseEtuIII5b();
			this.reponseEtuIII5c = re.isReponseEtuIII5c();
			this.reponseEtuIII5bis = re.getReponseEtuIII5bis();
			this.reponseEtuIII6 = re.getReponseEtuIII6();
			this.reponseEtuIII6bis = re.getReponseEtuIII6bis();
			this.reponseEtuIII7 = re.getReponseEtuIII7();
			this.reponseEtuIII7bis = re.getReponseEtuIII7bis();
			this.setReponseEtuIII8(re.isReponseEtuIII8());
			this.reponseEtuIII8bis = re.getReponseEtuIII8bis();
			this.reponseEtuIII9 = re.isReponseEtuIII9();
			this.setReponseEtuIII9bis(re.getReponseEtuIII9bis());
			this.reponseEtuIII10 = re.isReponseEtuIII10();
			this.reponseEtuIII11 = re.isReponseEtuIII11();
			this.reponseEtuIII12 = re.isReponseEtuIII12();
			this.reponseEtuIII13 = re.isReponseEtuIII13();
			this.reponseEtuIII14 = re.isReponseEtuIII14();
			this.reponseEtuIII15 = re.getReponseEtuIII15();
			this.reponseEtuIII15bis = re.getReponseEtuIII15bis();
			this.reponseEtuIII16 = re.getReponseEtuIII16();
			this.reponseEtuIII16bis = re.getReponseEtuIII16bis();
			// fiche enseignement
			this.reponseEnsI1a = re.isReponseEnsI1a();
			this.reponseEnsI1b = re.isReponseEnsI1b();
			this.reponseEnsI1c = re.isReponseEnsI1c();
			this.reponseEnsI2a = re.isReponseEnsI2a();
			this.reponseEnsI2b = re.isReponseEnsI2b();
			this.reponseEnsI2c = re.isReponseEnsI2c();
			this.reponseEnsI3 = re.getReponseEnsI3();
			this.reponseEnsII1 = re.getReponseEnsII1();
			this.reponseEnsII2 = re.getReponseEnsII2();
			this.reponseEnsII3 = re.getReponseEnsII3();
			this.reponseEnsII4 = re.getReponseEnsII4();
			this.reponseEnsII5 = re.getReponseEnsII5();
			this.reponseEnsII6 = re.getReponseEnsII6();
			this.reponseEnsII7 = re.getReponseEnsII7();
			this.reponseEnsII8 = re.getReponseEnsII8();
			this.reponseEnsII9 = re.getReponseEnsII9();
			this.reponseEnsII10 = re.getReponseEnsII10();
			this.reponseEnsII11 = re.getReponseEnsII11();
		}
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
		ReponseEvaluationDTO other = (ReponseEvaluationDTO) obj;
		if (idFicheEvaluation == null) {
			if (other.idFicheEvaluation != null)
				return false;
		} else if (!idFicheEvaluation.equals(other.idFicheEvaluation))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	/**
	 * @see org.esupportail.pstagedata.domain.dto.ObjetMetiersDTO#toString()
	 */
	@Override
	public String toString(){
		return
		"reponseEnt1 : "+reponseEnt1+", "+
		"reponseEnt1bis : "+reponseEnt1bis+", "+
		"reponseEnt2 : "+reponseEnt2+", "+
		"reponseEnt2bis : "+reponseEnt2bis+", "+
		"reponseEnt3 : "+reponseEnt3+", "+
		"reponseEnt4 : "+reponseEnt4+", "+
		"reponseEnt4bis : "+reponseEnt4bis+", "+
		"reponseEnt5 : "+reponseEnt5+", "+
		"reponseEnt5bis : "+reponseEnt5bis+", "+
		"reponseEnt6 : "+reponseEnt6+", "+
		"reponseEnt6bis : "+reponseEnt6bis+", "+
		"reponseEnt7 : "+reponseEnt7+", "+
		"reponseEnt7bis : "+reponseEnt7bis+", "+
		"reponseEnt8 : "+reponseEnt8+", "+
		"reponseEnt8bis : "+reponseEnt8bis+", "+
		"reponseEnt9 : "+reponseEnt9+", "+
		"reponseEnt9bis : "+reponseEnt9bis+", "+
		"reponseEnt10 : "+reponseEnt10+", "+
		"reponseEnt10bis : "+reponseEnt10bis+", "+
		"reponseEnt11 : "+reponseEnt11+", "+
		"reponseEnt11bis : "+reponseEnt11bis+", "+
		"reponseEnt12 : "+reponseEnt12+", "+
		"reponseEnt12bis : "+reponseEnt12bis+", "+
		"reponseEnt13 : "+reponseEnt13+", "+
		"reponseEnt13bis : "+reponseEnt13bis+", "+
		"reponseEnt14 : "+reponseEnt14+", "+
		"reponseEnt14bis : "+reponseEnt14bis+", "+
		"reponseEnt15 : "+reponseEnt15+", "+
		"reponseEnt15bis : "+reponseEnt15bis+", "+
		"reponseEnt16 : "+reponseEnt16+", "+
		"reponseEnt16bis : "+reponseEnt16bis+", "+
		"reponseEnt17 : "+reponseEnt17+", "+
		"reponseEnt18 : "+reponseEnt18+", "+
		"reponseEnt18bis : "+reponseEnt18bis+", "+
		"reponseEnt19 : "+reponseEnt19+", "+
		"reponseEtuI1 : "+reponseEtuI1+", "+
		"reponseEtuI1bis : "+reponseEtuI1bis+", "+
		"reponseEtuI2 : "+reponseEtuI2+", "+
		"reponseEtuI3 : "+reponseEtuI3+", "+
		"reponseEtuI4a : "+reponseEtuI4a+", "+
		"reponseEtuI4b : "+reponseEtuI4b+", "+
		"reponseEtuI4c : "+reponseEtuI4c+", "+
		"reponseEtuI4d : "+reponseEtuI4d+", "+
		"reponseEtuI5 : "+reponseEtuI5+", "+
		"reponseEtuI6 : "+reponseEtuI6+", "+
		"reponseEtuI7 : "+reponseEtuI7+", "+
		"reponseEtuI7bis1 : "+reponseEtuI7bis1+", "+
		"reponseEtuI7bis1a : "+reponseEtuI7bis1a+", "+
		"reponseEtuI7bis1b : "+reponseEtuI7bis1b+", "+
		"reponseEtuI7bis2 : "+reponseEtuI7bis2+", "+
		"reponseEtuI8 : "+reponseEtuI8+", "+
		"reponseEtuII1 : "+reponseEtuII1+", "+
		"reponseEtuII2 : "+reponseEtuII2+", "+
		"reponseEtuII3 : "+reponseEtuII3+", "+
		"reponseEtuII4 : "+reponseEtuII4+", "+
		"reponseEtuII5 : "+reponseEtuII5+", "+
		"reponseEtuII6 : "+reponseEtuII6+", "+
		"reponseEtuIII1 : "+reponseEtuIII1+", "+
		"reponseEtuIII1bis : "+reponseEtuIII1bis+", "+
		"reponseEtuIII2 : "+reponseEtuIII2+", "+
		"reponseEtuIII2bis : "+reponseEtuIII2bis+", "+
		"reponseEtuIII3 : "+reponseEtuIII3+", "+
		"reponseEtuIII3bis : "+reponseEtuIII3bis+", "+
		"reponseEtuIII4 : "+reponseEtuIII4+", "+
		"reponseEtuIII5a : "+reponseEtuIII5a+", "+
		"reponseEtuIII5b : "+reponseEtuIII5b+", "+
		"reponseEtuIII5c : "+reponseEtuIII5c+", "+
		"reponseEtuIII6 : "+reponseEtuIII6+", "+
		"reponseEtuIII6bis : "+reponseEtuIII6bis+", "+
		"reponseEtuIII7 : "+reponseEtuIII7+", "+
		"reponseEtuIII8 : "+reponseEtuIII8+", "+
		"reponseEtuIII8bis : "+reponseEtuIII8bis+", "+
		"reponseEtuIII9 : "+reponseEtuIII9+", "+
		"reponseEtuIII9bis : "+reponseEtuIII9bis+", "+
		"reponseEtuIII10 : "+reponseEtuIII10+", "+
		"reponseEtuIII11 : "+reponseEtuIII11+", "+
		"reponseEtuIII12 : "+reponseEtuIII12+", "+
		"reponseEtuIII13 : "+reponseEtuIII13+", "+
		"reponseEtuIII14 : "+reponseEtuIII14+", "+
		"reponseEtuIII15 : "+reponseEtuIII15+", "+
		"reponseEtuIII16 : "+reponseEtuIII16+", "+
		"reponseEnsI1a : "+reponseEnsI1a+", "+
		"reponseEnsI1b : "+reponseEnsI1b+", "+
		"reponseEnsI1c : "+reponseEnsI1c+", "+
		"reponseEnsI2a : "+reponseEnsI2a+", "+
		"reponseEnsI2b : "+reponseEnsI2b+", "+
		"reponseEnsI2c : "+reponseEnsI2c+", "+
		"reponseEnsI3 : "+reponseEnsI3+", "+
		"reponseEnsII1 : "+reponseEnsII1+", "+
		"reponseEnsII2 : "+reponseEnsII2+", "+
		"reponseEnsII3 : "+reponseEnsII3+", "+
		"reponseEnsII4 : "+reponseEnsII4+", "+
		"reponseEnsII5 : "+reponseEnsII5+", "+
		"reponseEnsII6 : "+reponseEnsII6+", "+
		"reponseEnsII7 : "+reponseEnsII7+", "+
		"reponseEnsII8 : "+reponseEnsII8+", "+
		"reponseEnsII9 : "+reponseEnsII9+", "+
		"reponseEnsII10 : "+reponseEnsII10+", "+
		"reponseEnsII11 : "+reponseEnsII11+", "+super.toString();
	}
	/* ***************************************************************
	 * Getters / Setters
	 ****************************************************************/
	/**
	 * @return the idFicheEvaluation
	 */
	public Integer getIdFicheEvaluation() {
		return idFicheEvaluation;
	}

	/**
	 * @param idFicheEvaluation the idFicheEvaluation to set
	 */
	public void setIdFicheEvaluation(Integer idFicheEvaluation) {
		this.idFicheEvaluation = idFicheEvaluation;
	}

	/**
	 * @return the idConvention
	 */
	public Integer getIdConvention() {
		return idConvention;
	}

	/**
	 * @param idConvention the idConvention to set
	 */
	public void setIdConvention(Integer idConvention) {
		this.idConvention = idConvention;
	}

	/**
	 * @return the reponseEnt1
	 */
	public int getReponseEnt1() {
		return reponseEnt1;
	}

	/**
	 * @param reponseEnt1 the reponseEnt1 to set
	 */
	public void setReponseEnt1(int reponseEnt1) {
		this.reponseEnt1 = reponseEnt1;
	}

	/**
	 * @return the reponseEnt1bis
	 */
	public String getReponseEnt1bis() {
		return reponseEnt1bis;
	}

	/**
	 * @param reponseEnt1bis the reponseEnt1bis to set
	 */
	public void setReponseEnt1bis(String reponseEnt1bis) {
		this.reponseEnt1bis = reponseEnt1bis;
	}

	/**
	 * @return the reponseEnt2
	 */
	public int getReponseEnt2() {
		return reponseEnt2;
	}

	/**
	 * @param reponseEnt2 the reponseEnt2 to set
	 */
	public void setReponseEnt2(int reponseEnt2) {
		this.reponseEnt2 = reponseEnt2;
	}

	/**
	 * @return the reponseEnt2bis
	 */
	public String getReponseEnt2bis() {
		return reponseEnt2bis;
	}

	/**
	 * @param reponseEnt2bis the reponseEnt2bis to set
	 */
	public void setReponseEnt2bis(String reponseEnt2bis) {
		this.reponseEnt2bis = reponseEnt2bis;
	}

	/**
	 * @return the reponseEnt3
	 */
	public int getReponseEnt3() {
		return reponseEnt3;
	}

	/**
	 * @param reponseEnt3 the reponseEnt3 to set
	 */
	public void setReponseEnt3(int reponseEnt3) {
		this.reponseEnt3 = reponseEnt3;
	}

	/**
	 * @return the reponseEnt4
	 */
	public int getReponseEnt4() {
		return reponseEnt4;
	}

	/**
	 * @param reponseEnt4 the reponseEnt4 to set
	 */
	public void setReponseEnt4(int reponseEnt4) {
		this.reponseEnt4 = reponseEnt4;
	}

	/**
	 * @return the reponseEnt4bis
	 */
	public String getReponseEnt4bis() {
		return reponseEnt4bis;
	}

	/**
	 * @param reponseEnt4bis the reponseEnt4bis to set
	 */
	public void setReponseEnt4bis(String reponseEnt4bis) {
		this.reponseEnt4bis = reponseEnt4bis;
	}

	/**
	 * @return the reponseEnt5
	 */
	public int getReponseEnt5() {
		return reponseEnt5;
	}

	/**
	 * @param reponseEnt5 the reponseEnt5 to set
	 */
	public void setReponseEnt5(int reponseEnt5) {
		this.reponseEnt5 = reponseEnt5;
	}

	/**
	 * @return the reponseEnt5bis
	 */
	public String getReponseEnt5bis() {
		return reponseEnt5bis;
	}

	/**
	 * @param reponseEnt5bis the reponseEnt5bis to set
	 */
	public void setReponseEnt5bis(String reponseEnt5bis) {
		this.reponseEnt5bis = reponseEnt5bis;
	}

	/**
	 * @return the reponseEnt6
	 */
	public int getReponseEnt6() {
		return reponseEnt6;
	}

	/**
	 * @param reponseEnt6 the reponseEnt6 to set
	 */
	public void setReponseEnt6(int reponseEnt6) {
		this.reponseEnt6 = reponseEnt6;
	}

	/**
	 * @return the reponseEnt6bis
	 */
	public String getReponseEnt6bis() {
		return reponseEnt6bis;
	}

	/**
	 * @param reponseEnt6bis the reponseEnt6bis to set
	 */
	public void setReponseEnt6bis(String reponseEnt6bis) {
		this.reponseEnt6bis = reponseEnt6bis;
	}

	/**
	 * @return the reponseEnt7
	 */
	public int getReponseEnt7() {
		return reponseEnt7;
	}

	/**
	 * @param reponseEnt7 the reponseEnt7 to set
	 */
	public void setReponseEnt7(int reponseEnt7) {
		this.reponseEnt7 = reponseEnt7;
	}

	/**
	 * @return the reponseEnt7bis
	 */
	public String getReponseEnt7bis() {
		return reponseEnt7bis;
	}

	/**
	 * @param reponseEnt7bis the reponseEnt7bis to set
	 */
	public void setReponseEnt7bis(String reponseEnt7bis) {
		this.reponseEnt7bis = reponseEnt7bis;
	}

	/**
	 * @return the reponseEnt8
	 */
	public int getReponseEnt8() {
		return reponseEnt8;
	}

	/**
	 * @param reponseEnt8 the reponseEnt8 to set
	 */
	public void setReponseEnt8(int reponseEnt8) {
		this.reponseEnt8 = reponseEnt8;
	}

	/**
	 * @return the reponseEnt8bis
	 */
	public String getReponseEnt8bis() {
		return reponseEnt8bis;
	}

	/**
	 * @param reponseEnt8bis the reponseEnt8bis to set
	 */
	public void setReponseEnt8bis(String reponseEnt8bis) {
		this.reponseEnt8bis = reponseEnt8bis;
	}

	/**
	 * @return the reponseEnt9
	 */
	public int getReponseEnt9() {
		return reponseEnt9;
	}

	/**
	 * @param reponseEnt9 the reponseEnt9 to set
	 */
	public void setReponseEnt9(int reponseEnt9) {
		this.reponseEnt9 = reponseEnt9;
	}

	/**
	 * @return the reponseEnt9bis
	 */
	public String getReponseEnt9bis() {
		return reponseEnt9bis;
	}

	/**
	 * @param reponseEnt9bis the reponseEnt9bis to set
	 */
	public void setReponseEnt9bis(String reponseEnt9bis) {
		this.reponseEnt9bis = reponseEnt9bis;
	}

	/**
	 * @return the reponseEnt10
	 */
	public boolean isReponseEnt10() {
		return reponseEnt10;
	}

	/**
	 * @param reponseEnt10 the reponseEnt10 to set
	 */
	public void setReponseEnt10(boolean reponseEnt10) {
		this.reponseEnt10 = reponseEnt10;
	}

	/**
	 * @return the reponseEnt10bis
	 */
	public String getReponseEnt10bis() {
		return reponseEnt10bis;
	}

	/**
	 * @param reponseEnt10bis the reponseEnt10bis to set
	 */
	public void setReponseEnt10bis(String reponseEnt10bis) {
		this.reponseEnt10bis = reponseEnt10bis;
	}

	/**
	 * @return the reponseEnt11
	 */
	public int getReponseEnt11() {
		return reponseEnt11;
	}

	/**
	 * @param reponseEnt11 the reponseEnt11 to set
	 */
	public void setReponseEnt11(int reponseEnt11) {
		this.reponseEnt11 = reponseEnt11;
	}

	/**
	 * @return the reponseEnt11bis
	 */
	public String getReponseEnt11bis() {
		return reponseEnt11bis;
	}

	/**
	 * @param reponseEnt11bis the reponseEnt11bis to set
	 */
	public void setReponseEnt11bis(String reponseEnt11bis) {
		this.reponseEnt11bis = reponseEnt11bis;
	}

	/**
	 * @return the reponseEnt12
	 */
	public int getReponseEnt12() {
		return reponseEnt12;
	}

	/**
	 * @param reponseEnt12 the reponseEnt12 to set
	 */
	public void setReponseEnt12(int reponseEnt12) {
		this.reponseEnt12 = reponseEnt12;
	}

	/**
	 * @return the reponseEnt12bis
	 */
	public String getReponseEnt12bis() {
		return reponseEnt12bis;
	}

	/**
	 * @param reponseEnt12bis the reponseEnt12bis to set
	 */
	public void setReponseEnt12bis(String reponseEnt12bis) {
		this.reponseEnt12bis = reponseEnt12bis;
	}

	/**
	 * @return the reponseEnt13
	 */
	public int getReponseEnt13() {
		return reponseEnt13;
	}

	/**
	 * @param reponseEnt13 the reponseEnt13 to set
	 */
	public void setReponseEnt13(int reponseEnt13) {
		this.reponseEnt13 = reponseEnt13;
	}

	/**
	 * @return the reponseEnt13bis
	 */
	public String getReponseEnt13bis() {
		return reponseEnt13bis;
	}

	/**
	 * @param reponseEnt13bis the reponseEnt13bis to set
	 */
	public void setReponseEnt13bis(String reponseEnt13bis) {
		this.reponseEnt13bis = reponseEnt13bis;
	}

	/**
	 * @return the reponseEnt14
	 */
	public int getReponseEnt14() {
		return reponseEnt14;
	}

	/**
	 * @param reponseEnt14 the reponseEnt14 to set
	 */
	public void setReponseEnt14(int reponseEnt14) {
		this.reponseEnt14 = reponseEnt14;
	}

	/**
	 * @return the reponseEnt14bis
	 */
	public String getReponseEnt14bis() {
		return reponseEnt14bis;
	}

	/**
	 * @param reponseEnt14bis the reponseEnt14bis to set
	 */
	public void setReponseEnt14bis(String reponseEnt14bis) {
		this.reponseEnt14bis = reponseEnt14bis;
	}

	/**
	 * @return the reponseEnt15
	 */
	public int getReponseEnt15() {
		return reponseEnt15;
	}

	/**
	 * @param reponseEnt15 the reponseEnt15 to set
	 */
	public void setReponseEnt15(int reponseEnt15) {
		this.reponseEnt15 = reponseEnt15;
	}

	/**
	 * @return the reponseEnt15bis
	 */
	public String getReponseEnt15bis() {
		return reponseEnt15bis;
	}

	/**
	 * @param reponseEnt15bis the reponseEnt15bis to set
	 */
	public void setReponseEnt15bis(String reponseEnt15bis) {
		this.reponseEnt15bis = reponseEnt15bis;
	}

	/**
	 * @return the reponseEnt16
	 */
	public int getReponseEnt16() {
		return reponseEnt16;
	}

	/**
	 * @param reponseEnt16 the reponseEnt16 to set
	 */
	public void setReponseEnt16(int reponseEnt16) {
		this.reponseEnt16 = reponseEnt16;
	}

	/**
	 * @return the reponseEnt16bis
	 */
	public String getReponseEnt16bis() {
		return reponseEnt16bis;
	}

	/**
	 * @param reponseEnt16bis the reponseEnt16bis to set
	 */
	public void setReponseEnt16bis(String reponseEnt16bis) {
		this.reponseEnt16bis = reponseEnt16bis;
	}

	/**
	 * @return the reponseEnt17
	 */
	public int getReponseEnt17() {
		return reponseEnt17;
	}

	/**
	 * @param reponseEnt17 the reponseEnt17 to set
	 */
	public void setReponseEnt17(int reponseEnt17) {
		this.reponseEnt17 = reponseEnt17;
	}

	/**
	 * @return the reponseEnt18
	 */
	public boolean isReponseEnt18() {
		return reponseEnt18;
	}

	/**
	 * @param reponseEnt18 the reponseEnt18 to set
	 */
	public void setReponseEnt18(boolean reponseEnt18) {
		this.reponseEnt18 = reponseEnt18;
	}

	/**
	 * @return the reponseEnt19
	 */
	public String getReponseEnt19() {
		return reponseEnt19;
	}

	/**
	 * @param reponseEnt19 the reponseEnt19 to set
	 */
	public void setReponseEnt19(String reponseEnt19) {
		this.reponseEnt19 = reponseEnt19;
	}

	/**
	 * @return the reponseEtuI1bis
	 */
	public String getReponseEtuI1bis() {
		return reponseEtuI1bis;
	}

	/**
	 * @param reponseEtuI1bis the reponseEtuI1bis to set
	 */
	public void setReponseEtuI1bis(String reponseEtuI1bis) {
		this.reponseEtuI1bis = reponseEtuI1bis;
	}

	/**
	 * @return the reponseEtuI4a
	 */
	public boolean isReponseEtuI4a() {
		return reponseEtuI4a;
	}

	/**
	 * @param reponseEtuI4a the reponseEtuI4a to set
	 */
	public void setReponseEtuI4a(boolean reponseEtuI4a) {
		this.reponseEtuI4a = reponseEtuI4a;
	}

	/**
	 * @return the reponseEtuI4b
	 */
	public boolean isReponseEtuI4b() {
		return reponseEtuI4b;
	}

	/**
	 * @param reponseEtuI4b the reponseEtuI4b to set
	 */
	public void setReponseEtuI4b(boolean reponseEtuI4b) {
		this.reponseEtuI4b = reponseEtuI4b;
	}

	/**
	 * @return the reponseEtuI4c
	 */
	public boolean isReponseEtuI4c() {
		return reponseEtuI4c;
	}

	/**
	 * @param reponseEtuI4c the reponseEtuI4c to set
	 */
	public void setReponseEtuI4c(boolean reponseEtuI4c) {
		this.reponseEtuI4c = reponseEtuI4c;
	}

	/**
	 * @return the reponseEtuI4d
	 */
	public boolean isReponseEtuI4d() {
		return reponseEtuI4d;
	}

	/**
	 * @param reponseEtuI4d the reponseEtuI4d to set
	 */
	public void setReponseEtuI4d(boolean reponseEtuI4d) {
		this.reponseEtuI4d = reponseEtuI4d;
	}

	/**
	 * @return the reponseEtuI5
	 */
	public int getReponseEtuI5() {
		return reponseEtuI5;
	}

	/**
	 * @param reponseEtuI5 the reponseEtuI5 to set
	 */
	public void setReponseEtuI5(int reponseEtuI5) {
		this.reponseEtuI5 = reponseEtuI5;
	}

	/**
	 * @return the reponseEtuI7
	 */
	public boolean isReponseEtuI7() {
		return reponseEtuI7;
	}

	/**
	 * @param reponseEtuI7 the reponseEtuI7 to set
	 */
	public void setReponseEtuI7(boolean reponseEtuI7) {
		this.reponseEtuI7 = reponseEtuI7;
	}

	/**
	 * @return the reponseEtuI7bis1a
	 */
	public boolean isReponseEtuI7bis1a() {
		return reponseEtuI7bis1a;
	}

	/**
	 * @param reponseEtuI7bis1a the reponseEtuI7bis1a to set
	 */
	public void setReponseEtuI7bis1a(boolean reponseEtuI7bis1a) {
		this.reponseEtuI7bis1a = reponseEtuI7bis1a;
	}

	/**
	 * @return the reponseEtuI7bis1b
	 */
	public String getReponseEtuI7bis1b() {
		return reponseEtuI7bis1b;
	}

	/**
	 * @param reponseEtuI7bis1b the reponseEtuI7bis1b to set
	 */
	public void setReponseEtuI7bis1b(String reponseEtuI7bis1b) {
		this.reponseEtuI7bis1b = reponseEtuI7bis1b;
	}

	/**
	 * @return the reponseEtuI8
	 */
	public boolean isReponseEtuI8() {
		return reponseEtuI8;
	}

	/**
	 * @param reponseEtuI8 the reponseEtuI8 to set
	 */
	public void setReponseEtuI8(boolean reponseEtuI8) {
		this.reponseEtuI8 = reponseEtuI8;
	}

	/**
	 * @return the reponseEtuII1
	 */
	public int getReponseEtuII1() {
		return reponseEtuII1;
	}

	/**
	 * @param reponseEtuII1 the reponseEtuII1 to set
	 */
	public void setReponseEtuII1(int reponseEtuII1) {
		this.reponseEtuII1 = reponseEtuII1;
	}

	/**
	 * @return the reponseEtuII2
	 */
	public int getReponseEtuII2() {
		return reponseEtuII2;
	}

	/**
	 * @param reponseEtuII2 the reponseEtuII2 to set
	 */
	public void setReponseEtuII2(int reponseEtuII2) {
		this.reponseEtuII2 = reponseEtuII2;
	}

	/**
	 * @return the reponseEtuII3
	 */
	public int getReponseEtuII3() {
		return reponseEtuII3;
	}

	/**
	 * @param reponseEtuII3 the reponseEtuII3 to set
	 */
	public void setReponseEtuII3(int reponseEtuII3) {
		this.reponseEtuII3 = reponseEtuII3;
	}

	/**
	 * @return the reponseEtuII5
	 */
	public boolean isReponseEtuII5() {
		return reponseEtuII5;
	}

	/**
	 * @param reponseEtuII5 the reponseEtuII5 to set
	 */
	public void setReponseEtuII5(boolean reponseEtuII5) {
		this.reponseEtuII5 = reponseEtuII5;
	}

	/**
	 * @return the reponseEtuII6
	 */
	public boolean isReponseEtuII6() {
		return reponseEtuII6;
	}

	/**
	 * @param reponseEtuII6 the reponseEtuII6 to set
	 */
	public void setReponseEtuII6(boolean reponseEtuII6) {
		this.reponseEtuII6 = reponseEtuII6;
	}

	/**
	 * @return the reponseEtuIII1
	 */
	public boolean isReponseEtuIII1() {
		return reponseEtuIII1;
	}

	/**
	 * @param reponseEtuIII1 the reponseEtuIII1 to set
	 */
	public void setReponseEtuIII1(boolean reponseEtuIII1) {
		this.reponseEtuIII1 = reponseEtuIII1;
	}

	/**
	 * @return the reponseEtuIII1bis
	 */
	public String getReponseEtuIII1bis() {
		return reponseEtuIII1bis;
	}

	/**
	 * @param reponseEtuIII1bis the reponseEtuIII1bis to set
	 */
	public void setReponseEtuIII1bis(String reponseEtuIII1bis) {
		this.reponseEtuIII1bis = reponseEtuIII1bis;
	}

	/**
	 * @return the reponseEtuIII2
	 */
	public boolean isReponseEtuIII2() {
		return reponseEtuIII2;
	}

	/**
	 * @param reponseEtuIII2 the reponseEtuIII2 to set
	 */
	public void setReponseEtuIII2(boolean reponseEtuIII2) {
		this.reponseEtuIII2 = reponseEtuIII2;
	}

	/**
	 * @return the reponseEtuIII2bis
	 */
	public String getReponseEtuIII2bis() {
		return reponseEtuIII2bis;
	}

	/**
	 * @param reponseEtuIII2bis the reponseEtuIII2bis to set
	 */
	public void setReponseEtuIII2bis(String reponseEtuIII2bis) {
		this.reponseEtuIII2bis = reponseEtuIII2bis;
	}

	/**
	 * @return the reponseEtuIII3
	 */
	public boolean isReponseEtuIII3() {
		return reponseEtuIII3;
	}

	/**
	 * @param reponseEtuIII3 the reponseEtuIII3 to set
	 */
	public void setReponseEtuIII3(boolean reponseEtuIII3) {
		this.reponseEtuIII3 = reponseEtuIII3;
	}

	/**
	 * @return the reponseEtuIII3bis
	 */
	public String getReponseEtuIII3bis() {
		return reponseEtuIII3bis;
	}

	/**
	 * @param reponseEtuIII3bis the reponseEtuIII3bis to set
	 */
	public void setReponseEtuIII3bis(String reponseEtuIII3bis) {
		this.reponseEtuIII3bis = reponseEtuIII3bis;
	}

	/**
	 * @return the reponseEtuIII5a
	 */
	public boolean isReponseEtuIII5a() {
		return reponseEtuIII5a;
	}

	/**
	 * @param reponseEtuIII5a the reponseEtuIII5a to set
	 */
	public void setReponseEtuIII5a(boolean reponseEtuIII5a) {
		this.reponseEtuIII5a = reponseEtuIII5a;
	}

	/**
	 * @return the reponseEtuIII5b
	 */
	public boolean isReponseEtuIII5b() {
		return reponseEtuIII5b;
	}

	/**
	 * @param reponseEtuIII5b the reponseEtuIII5b to set
	 */
	public void setReponseEtuIII5b(boolean reponseEtuIII5b) {
		this.reponseEtuIII5b = reponseEtuIII5b;
	}

	/**
	 * @return the reponseEtuIII5c
	 */
	public boolean isReponseEtuIII5c() {
		return reponseEtuIII5c;
	}

	/**
	 * @param reponseEtuIII5c the reponseEtuIII5c to set
	 */
	public void setReponseEtuIII5c(boolean reponseEtuIII5c) {
		this.reponseEtuIII5c = reponseEtuIII5c;
	}

	/**
	 * @return the reponseEtuIII6
	 */
	public int getReponseEtuIII6() {
		return reponseEtuIII6;
	}

	/**
	 * @param reponseEtuIII6 the reponseEtuIII6 to set
	 */
	public void setReponseEtuIII6(int reponseEtuIII6) {
		this.reponseEtuIII6 = reponseEtuIII6;
	}

	/**
	 * @return the reponseEtuIII7
	 */
	public int getReponseEtuIII7() {
		return reponseEtuIII7;
	}

	/**
	 * @param reponseEtuIII7 the reponseEtuIII7 to set
	 */
	public void setReponseEtuIII7(int reponseEtuIII7) {
		this.reponseEtuIII7 = reponseEtuIII7;
	}

	/**
	 * @return the reponseEtuIII9
	 */
	public boolean isReponseEtuIII9() {
		return reponseEtuIII9;
	}

	/**
	 * @param reponseEtuIII9 the reponseEtuIII9 to set
	 */
	public void setReponseEtuIII9(boolean reponseEtuIII9) {
		this.reponseEtuIII9 = reponseEtuIII9;
	}

	/**
	 * @return the reponseEtuIII10
	 */
	public boolean isReponseEtuIII10() {
		return reponseEtuIII10;
	}

	/**
	 * @param reponseEtuIII10 the reponseEtuIII10 to set
	 */
	public void setReponseEtuIII10(boolean reponseEtuIII10) {
		this.reponseEtuIII10 = reponseEtuIII10;
	}

	/**
	 * @return the reponseEtuIII11
	 */
	public boolean isReponseEtuIII11() {
		return reponseEtuIII11;
	}

	/**
	 * @param reponseEtuIII11 the reponseEtuIII11 to set
	 */
	public void setReponseEtuIII11(boolean reponseEtuIII11) {
		this.reponseEtuIII11 = reponseEtuIII11;
	}

	/**
	 * @return the reponseEtuIII12
	 */
	public boolean isReponseEtuIII12() {
		return reponseEtuIII12;
	}

	/**
	 * @param reponseEtuIII12 the reponseEtuIII12 to set
	 */
	public void setReponseEtuIII12(boolean reponseEtuIII12) {
		this.reponseEtuIII12 = reponseEtuIII12;
	}

	/**
	 * @return the reponseEtuIII13
	 */
	public boolean isReponseEtuIII13() {
		return reponseEtuIII13;
	}

	/**
	 * @param reponseEtuIII13 the reponseEtuIII13 to set
	 */
	public void setReponseEtuIII13(boolean reponseEtuIII13) {
		this.reponseEtuIII13 = reponseEtuIII13;
	}

	/**
	 * @return the reponseEtuIII14
	 */
	public boolean isReponseEtuIII14() {
		return reponseEtuIII14;
	}

	/**
	 * @param reponseEtuIII14 the reponseEtuIII14 to set
	 */
	public void setReponseEtuIII14(boolean reponseEtuIII14) {
		this.reponseEtuIII14 = reponseEtuIII14;
	}

	/**
	 * @return the reponseEtuIII15
	 */
	public int getReponseEtuIII15() {
		return reponseEtuIII15;
	}

	/**
	 * @param reponseEtuIII15 the reponseEtuIII15 to set
	 */
	public void setReponseEtuIII15(int reponseEtuIII15) {
		this.reponseEtuIII15 = reponseEtuIII15;
	}

	/**
	 * @return the reponseEtuIII16
	 */
	public int getReponseEtuIII16() {
		return reponseEtuIII16;
	}

	/**
	 * @param reponseEtuIII16 the reponseEtuIII16 to set
	 */
	public void setReponseEtuIII16(int reponseEtuIII16) {
		this.reponseEtuIII16 = reponseEtuIII16;
	}

	/**
	 * @return the reponseEnsI1a
	 */
	public boolean isReponseEnsI1a() {
		return reponseEnsI1a;
	}

	/**
	 * @param reponseEnsI1a the reponseEnsI1a to set
	 */
	public void setReponseEnsI1a(boolean reponseEnsI1a) {
		this.reponseEnsI1a = reponseEnsI1a;
	}

	/**
	 * @return the reponseEnsI1b
	 */
	public boolean isReponseEnsI1b() {
		return reponseEnsI1b;
	}

	/**
	 * @param reponseEnsI1b the reponseEnsI1b to set
	 */
	public void setReponseEnsI1b(boolean reponseEnsI1b) {
		this.reponseEnsI1b = reponseEnsI1b;
	}

	/**
	 * @return the reponseEnsI1c
	 */
	public boolean isReponseEnsI1c() {
		return reponseEnsI1c;
	}

	/**
	 * @param reponseEnsI1c the reponseEnsI1c to set
	 */
	public void setReponseEnsI1c(boolean reponseEnsI1c) {
		this.reponseEnsI1c = reponseEnsI1c;
	}

	/**
	 * @return the reponseEnsI2a
	 */
	public boolean isReponseEnsI2a() {
		return reponseEnsI2a;
	}

	/**
	 * @param reponseEnsI2a the reponseEnsI2a to set
	 */
	public void setReponseEnsI2a(boolean reponseEnsI2a) {
		this.reponseEnsI2a = reponseEnsI2a;
	}

	/**
	 * @return the reponseEnsI2b
	 */
	public boolean isReponseEnsI2b() {
		return reponseEnsI2b;
	}

	/**
	 * @param reponseEnsI2b the reponseEnsI2b to set
	 */
	public void setReponseEnsI2b(boolean reponseEnsI2b) {
		this.reponseEnsI2b = reponseEnsI2b;
	}

	/**
	 * @return the reponseEnsI2c
	 */
	public boolean isReponseEnsI2c() {
		return reponseEnsI2c;
	}

	/**
	 * @param reponseEnsI2c the reponseEnsI2c to set
	 */
	public void setReponseEnsI2c(boolean reponseEnsI2c) {
		this.reponseEnsI2c = reponseEnsI2c;
	}

	/**
	 * @return the reponseEnsI3
	 */
	public String getReponseEnsI3() {
		return reponseEnsI3;
	}

	/**
	 * @param reponseEnsI3 the reponseEnsI3 to set
	 */
	public void setReponseEnsI3(String reponseEnsI3) {
		this.reponseEnsI3 = reponseEnsI3;
	}

	/**
	 * @return the reponseEnsII1
	 */
	public int getReponseEnsII1() {
		return reponseEnsII1;
	}

	/**
	 * @param reponseEnsII1 the reponseEnsII1 to set
	 */
	public void setReponseEnsII1(int reponseEnsII1) {
		this.reponseEnsII1 = reponseEnsII1;
	}

	/**
	 * @return the reponseEnsII2
	 */
	public int getReponseEnsII2() {
		return reponseEnsII2;
	}

	/**
	 * @param reponseEnsII2 the reponseEnsII2 to set
	 */
	public void setReponseEnsII2(int reponseEnsII2) {
		this.reponseEnsII2 = reponseEnsII2;
	}

	/**
	 * @return the reponseEnsII3
	 */
	public int getReponseEnsII3() {
		return reponseEnsII3;
	}

	/**
	 * @param reponseEnsII3 the reponseEnsII3 to set
	 */
	public void setReponseEnsII3(int reponseEnsII3) {
		this.reponseEnsII3 = reponseEnsII3;
	}

	/**
	 * @return the reponseEnsII4
	 */
	public int getReponseEnsII4() {
		return reponseEnsII4;
	}

	/**
	 * @param reponseEnsII4 the reponseEnsII4 to set
	 */
	public void setReponseEnsII4(int reponseEnsII4) {
		this.reponseEnsII4 = reponseEnsII4;
	}

	/**
	 * @return the reponseEnsII5
	 */
	public int getReponseEnsII5() {
		return reponseEnsII5;
	}

	/**
	 * @param reponseEnsII5 the reponseEnsII5 to set
	 */
	public void setReponseEnsII5(int reponseEnsII5) {
		this.reponseEnsII5 = reponseEnsII5;
	}

	/**
	 * @return the reponseEnsII6
	 */
	public int getReponseEnsII6() {
		return reponseEnsII6;
	}

	/**
	 * @param reponseEnsII6 the reponseEnsII6 to set
	 */
	public void setReponseEnsII6(int reponseEnsII6) {
		this.reponseEnsII6 = reponseEnsII6;
	}

	/**
	 * @return the reponseEnsII7
	 */
	public int getReponseEnsII7() {
		return reponseEnsII7;
	}

	/**
	 * @param reponseEnsII7 the reponseEnsII7 to set
	 */
	public void setReponseEnsII7(int reponseEnsII7) {
		this.reponseEnsII7 = reponseEnsII7;
	}

	/**
	 * @return the reponseEnsII8
	 */
	public int getReponseEnsII8() {
		return reponseEnsII8;
	}

	/**
	 * @param reponseEnsII8 the reponseEnsII8 to set
	 */
	public void setReponseEnsII8(int reponseEnsII8) {
		this.reponseEnsII8 = reponseEnsII8;
	}

	/**
	 * @return the reponseEnsII9
	 */
	public int getReponseEnsII9() {
		return reponseEnsII9;
	}

	/**
	 * @param reponseEnsII9 the reponseEnsII9 to set
	 */
	public void setReponseEnsII9(int reponseEnsII9) {
		this.reponseEnsII9 = reponseEnsII9;
	}

	/**
	 * @return the reponseEnsII10
	 */
	public int getReponseEnsII10() {
		return reponseEnsII10;
	}

	/**
	 * @param reponseEnsII10 the reponseEnsII10 to set
	 */
	public void setReponseEnsII10(int reponseEnsII10) {
		this.reponseEnsII10 = reponseEnsII10;
	}

	/**
	 * @return the reponseEnsII11
	 */
	public String getReponseEnsII11() {
		return reponseEnsII11;
	}

	/**
	 * @param reponseEnsII11 the reponseEnsII11 to set
	 */
	public void setReponseEnsII11(String reponseEnsII11) {
		this.reponseEnsII11 = reponseEnsII11;
	}
	
	/**
	 * @return the reponseEtuIII8
	 */
	public boolean isReponseEtuIII8() {
		return reponseEtuIII8;
	}

	/**
	 * @param reponseEtuIII8 the reponseEtuIII8 to set
	 */
	public void setReponseEtuIII8(boolean reponseEtuIII8) {
		this.reponseEtuIII8 = reponseEtuIII8;
	}

	/**
	 * @return the reponseEtuII5b
	 */
	public boolean isReponseEtuII5b() {
		return reponseEtuII5b;
	}

	/**
	 * @param reponseEtuII5b the reponseEtuII5b to set
	 */
	public void setReponseEtuII5b(boolean reponseEtuII5b) {
		this.reponseEtuII5b = reponseEtuII5b;
	}

	/**
	 * @return the validationEtudiant
	 */
	public boolean isValidationEtudiant() {
		return validationEtudiant;
	}

	/**
	 * @param validationEtudiant the validationEtudiant to set
	 */
	public void setValidationEtudiant(boolean validationEtudiant) {
		this.validationEtudiant = validationEtudiant;
	}

	/**
	 * @return the validationEnseignant
	 */
	public boolean isValidationEnseignant() {
		return validationEnseignant;
	}

	/**
	 * @param validationEnseignant the validationEnseignant to set
	 */
	public void setValidationEnseignant(boolean validationEnseignant) {
		this.validationEnseignant = validationEnseignant;
	}

	/**
	 * @return the validationEntreprise
	 */
	public boolean isValidationEntreprise() {
		return validationEntreprise;
	}

	/**
	 * @param validationEntreprise the validationEntreprise to set
	 */
	public void setValidationEntreprise(boolean validationEntreprise) {
		this.validationEntreprise = validationEntreprise;
	}

	/**
	 * @return the reponseEnt18bis
	 */
	public String getReponseEnt18bis() {
		return reponseEnt18bis;
	}

	/**
	 * @param reponseEnt18bis the reponseEnt18bis to set
	 */
	public void setReponseEnt18bis(String reponseEnt18bis) {
		this.reponseEnt18bis = reponseEnt18bis;
	}

	/**
	 * @return the reponseEnt17bis
	 */
	public String getReponseEnt17bis() {
		return reponseEnt17bis;
	}

	/**
	 * @param reponseEnt17bis the reponseEnt17bis to set
	 */
	public void setReponseEnt17bis(String reponseEnt17bis) {
		this.reponseEnt17bis = reponseEnt17bis;
	}

	/**
	 * @return the reponseEtuI1
	 */
	public int getReponseEtuI1() {
		return reponseEtuI1;
	}

	/**
	 * @param reponseEtuI1 the reponseEtuI1 to set
	 */
	public void setReponseEtuI1(int reponseEtuI1) {
		this.reponseEtuI1 = reponseEtuI1;
	}

	/**
	 * @return the reponseEtuI2
	 */
	public int getReponseEtuI2() {
		return reponseEtuI2;
	}

	/**
	 * @param reponseEtuI2 the reponseEtuI2 to set
	 */
	public void setReponseEtuI2(int reponseEtuI2) {
		this.reponseEtuI2 = reponseEtuI2;
	}

	/**
	 * @return the reponseEtuI3
	 */
	public int getReponseEtuI3() {
		return reponseEtuI3;
	}

	/**
	 * @param reponseEtuI3 the reponseEtuI3 to set
	 */
	public void setReponseEtuI3(int reponseEtuI3) {
		this.reponseEtuI3 = reponseEtuI3;
	}

	/**
	 * @return the reponseEtuI6
	 */
	public int getReponseEtuI6() {
		return reponseEtuI6;
	}

	/**
	 * @param reponseEtuI6 the reponseEtuI6 to set
	 */
	public void setReponseEtuI6(int reponseEtuI6) {
		this.reponseEtuI6 = reponseEtuI6;
	}

	/**
	 * @return the reponseEtuI7bis1
	 */
	public int getReponseEtuI7bis1() {
		return reponseEtuI7bis1;
	}

	/**
	 * @param reponseEtuI7bis1 the reponseEtuI7bis1 to set
	 */
	public void setReponseEtuI7bis1(int reponseEtuI7bis1) {
		this.reponseEtuI7bis1 = reponseEtuI7bis1;
	}

	/**
	 * @return the reponseEtuI7bis2
	 */
	public int getReponseEtuI7bis2() {
		return reponseEtuI7bis2;
	}

	/**
	 * @param reponseEtuI7bis2 the reponseEtuI7bis2 to set
	 */
	public void setReponseEtuI7bis2(int reponseEtuI7bis2) {
		this.reponseEtuI7bis2 = reponseEtuI7bis2;
	}

	/**
	 * @return the reponseEtuII1bis
	 */
	public String getReponseEtuII1bis() {
		return reponseEtuII1bis;
	}

	/**
	 * @param reponseEtuII1bis the reponseEtuII1bis to set
	 */
	public void setReponseEtuII1bis(String reponseEtuII1bis) {
		this.reponseEtuII1bis = reponseEtuII1bis;
	}

	/**
	 * @return the reponseEtuII2bis
	 */
	public String getReponseEtuII2bis() {
		return reponseEtuII2bis;
	}

	/**
	 * @param reponseEtuII2bis the reponseEtuII2bis to set
	 */
	public void setReponseEtuII2bis(String reponseEtuII2bis) {
		this.reponseEtuII2bis = reponseEtuII2bis;
	}

	/**
	 * @return the reponseEtuII3bis
	 */
	public String getReponseEtuII3bis() {
		return reponseEtuII3bis;
	}

	/**
	 * @param reponseEtuII3bis the reponseEtuII3bis to set
	 */
	public void setReponseEtuII3bis(String reponseEtuII3bis) {
		this.reponseEtuII3bis = reponseEtuII3bis;
	}

	/**
	 * @return the reponseEtuII4
	 */
	public int getReponseEtuII4() {
		return reponseEtuII4;
	}

	/**
	 * @param reponseEtuII4 the reponseEtuII4 to set
	 */
	public void setReponseEtuII4(int reponseEtuII4) {
		this.reponseEtuII4 = reponseEtuII4;
	}

	/**
	 * @return the reponseEtuII5a
	 */
	public int getReponseEtuII5a() {
		return reponseEtuII5a;
	}

	/**
	 * @param reponseEtuII5a the reponseEtuII5a to set
	 */
	public void setReponseEtuII5a(int reponseEtuII5a) {
		this.reponseEtuII5a = reponseEtuII5a;
	}

	/**
	 * @return the reponseEtuIII4
	 */
	public int getReponseEtuIII4() {
		return reponseEtuIII4;
	}

	/**
	 * @param reponseEtuIII4 the reponseEtuIII4 to set
	 */
	public void setReponseEtuIII4(int reponseEtuIII4) {
		this.reponseEtuIII4 = reponseEtuIII4;
	}

	/**
	 * @return the reponseEtuIII5bis
	 */
	public String getReponseEtuIII5bis() {
		return reponseEtuIII5bis;
	}

	/**
	 * @param reponseEtuIII5bis the reponseEtuIII5bis to set
	 */
	public void setReponseEtuIII5bis(String reponseEtuIII5bis) {
		this.reponseEtuIII5bis = reponseEtuIII5bis;
	}

	/**
	 * @return the reponseEtuIII6bis
	 */
	public String getReponseEtuIII6bis() {
		return reponseEtuIII6bis;
	}

	/**
	 * @param reponseEtuIII6bis the reponseEtuIII6bis to set
	 */
	public void setReponseEtuIII6bis(String reponseEtuIII6bis) {
		this.reponseEtuIII6bis = reponseEtuIII6bis;
	}

	/**
	 * @return the reponseEtuIII7bis
	 */
	public String getReponseEtuIII7bis() {
		return reponseEtuIII7bis;
	}

	/**
	 * @param reponseEtuIII7bis the reponseEtuIII7bis to set
	 */
	public void setReponseEtuIII7bis(String reponseEtuIII7bis) {
		this.reponseEtuIII7bis = reponseEtuIII7bis;
	}

	/**
	 * @return the reponseEtuIII8bis
	 */
	public String getReponseEtuIII8bis() {
		return reponseEtuIII8bis;
	}

	/**
	 * @param reponseEtuIII8bis the reponseEtuIII8bis to set
	 */
	public void setReponseEtuIII8bis(String reponseEtuIII8bis) {
		this.reponseEtuIII8bis = reponseEtuIII8bis;
	}

	/**
	 * @return the reponseEtuIII15bis
	 */
	public String getReponseEtuIII15bis() {
		return reponseEtuIII15bis;
	}

	/**
	 * @param reponseEtuIII15bis the reponseEtuIII15bis to set
	 */
	public void setReponseEtuIII15bis(String reponseEtuIII15bis) {
		this.reponseEtuIII15bis = reponseEtuIII15bis;
	}

	/**
	 * @return the reponseEtuIII16bis
	 */
	public String getReponseEtuIII16bis() {
		return reponseEtuIII16bis;
	}

	/**
	 * @param reponseEtuIII16bis the reponseEtuIII16bis to set
	 */
	public void setReponseEtuIII16bis(String reponseEtuIII16bis) {
		this.reponseEtuIII16bis = reponseEtuIII16bis;
	}

	/**
	 * @return the reponseEtuIII9bis
	 */
	public String getReponseEtuIII9bis() {
		return reponseEtuIII9bis;
	}

	/**
	 * @param reponseEtuIII9bis the reponseEtuIII9bis to set
	 */
	public void setReponseEtuIII9bis(String reponseEtuIII9bis) {
		this.reponseEtuIII9bis = reponseEtuIII9bis;
	}

	/**
	 * @return the impressionEtudiant
	 */
	public boolean isImpressionEtudiant() {
		return impressionEtudiant;
	}

	/**
	 * @param impressionEtudiant the impressionEtudiant to set
	 */
	public void setImpressionEtudiant(boolean impressionEtudiant) {
		this.impressionEtudiant = impressionEtudiant;
	}

	/**
	 * @return the impressionEnseignant
	 */
	public boolean isImpressionEnseignant() {
		return impressionEnseignant;
	}

	/**
	 * @param impressionEnseignant the impressionEnseignant to set
	 */
	public void setImpressionEnseignant(boolean impressionEnseignant) {
		this.impressionEnseignant = impressionEnseignant;
	}

	/**
	 * @return the impressionEntreprise
	 */
	public boolean isImpressionEntreprise() {
		return impressionEntreprise;
	}

	/**
	 * @param impressionEntreprise the impressionEntreprise to set
	 */
	public void setImpressionEntreprise(boolean impressionEntreprise) {
		this.impressionEntreprise = impressionEntreprise;
	}
}

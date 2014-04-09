package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class FicheEvaluation extends ObjetMetiers implements Serializable{
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
	private Integer idCentreGestion;
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
	
	/* ***************************************************************
	 * Questions Entreprise
	 ****************************************************************/
	/**
	 * questionEnt1
	 */
	private boolean questionEnt1;
	/**
	 * questionEnt2
	 */
	private boolean questionEnt2;
	/**
	 * questionEnt3
	 */
	private boolean questionEnt3;
	/**
	 * questionEnt4
	 */
	private boolean questionEnt4;
	/**
	 * questionEnt5
	 */
	private boolean questionEnt5;
	/**
	 * questionEnt6
	 */
	private boolean questionEnt6;
	/**
	 * questionEnt7
	 */
	private boolean questionEnt7;
	/**
	 * questionEnt8
	 */
	private boolean questionEnt8;
	/**
	 * questionEnt9
	 */
	private boolean questionEnt9;
	/**
	 * questionEnt10
	 */
	private boolean questionEnt10;
	/**
	 * questionEnt11
	 */
	private boolean questionEnt11;
	/**
	 * questionEnt12
	 */
	private boolean questionEnt12;
	/**
	 * questionEnt13
	 */
	private boolean questionEnt13;
	/**
	 * questionEnt14
	 */
	private boolean questionEnt14;
	/**
	 * questionEnt15
	 */
	private boolean questionEnt15;
	/**
	 * questionEnt16
	 */
	private boolean questionEnt16;
	/**
	 * questionEnt17
	 */
	private boolean questionEnt17;
	/**
	 * questionEnt18
	 */
	private boolean questionEnt18;
	/**
	 * questionEnt18
	 */
	private boolean questionEnt19;

	/* ***************************************************************
	 * Reponses Etudiant
	 ****************************************************************/
	/**
	 * questionEtuI1
	 */
	private boolean questionEtuI1;
	/**
	 * questionEtuI2
	 */
	private boolean questionEtuI2;
	/**
	 * questionEtuI3
	 */
	private boolean questionEtuI3;
	/**
	 * questionEtuI4a
	 */
	private boolean questionEtuI4;
	/**
	 * questionEtuI5
	 */
	private boolean questionEtuI5;
	/**
	 * questionEtuI6
	 */
	private boolean questionEtuI6;
	/**
	 * questionEtuI7 (oui/non)
	 */
	private boolean questionEtuI7;
	/**
	 * questionEtuI8
	 */
	private boolean questionEtuI8;
	/**
	 * questionEtuII1
	 */
	private boolean questionEtuII1;
	/**
	 * questionEtuII2
	 */
	private boolean questionEtuII2;
	/**
	 * questionEtuII3
	 */
	private boolean questionEtuII3;
	/**
	 * questionEtuII4
	 */
	private boolean questionEtuII4;
	/**
	 * questionEtuII5
	 */
	private boolean questionEtuII5;
	/**
	 * questionEtuII6
	 */
	private boolean questionEtuII6;

	/**
	 * questionEtuIII1
	 */
	private boolean questionEtuIII1;
	/**
	 * questionEtuIII2
	 */
	private boolean questionEtuIII2;
	/**
	 * questionEtuIII3
	 */
	private boolean questionEtuIII3;
	/**
	 * questionEtuIII4
	 */
	private boolean questionEtuIII4;
	/**
	 * questionEtuIII5a
	 */
	private boolean questionEtuIII5;
	/**
	 * questionEtuIII6
	 */
	private boolean questionEtuIII6;
	/**
	 * questionEtuIII7
	 */
	private boolean questionEtuIII7;
	/**
	 * questionEtuIII8
	 */
	private boolean questionEtuIII8;
	/**
	 * questionEtuIII9
	 */
	private boolean questionEtuIII9;
	/**
	 * questionEtuIII10
	 */
	private boolean questionEtuIII10;
	/**
	 * questionEtuIII11
	 */
	private boolean questionEtuIII11;
	/**
	 * questionEtuIII12
	 */
	private boolean questionEtuIII12;
	/**
	 * questionEtuIII13
	 */
	private boolean questionEtuIII13;
	/**
	 * questionEtuIII14
	 */
	private boolean questionEtuIII14;
	/**
	 * questionEtuIII15
	 */
	private boolean questionEtuIII15;
	/**
	 * questionEtuIII16
	 */
	private boolean questionEtuIII16;
	
	/* ***************************************************************
	 * Reponses Enseignant
	 ****************************************************************/
	/**
	 * questionEnsI1a
	 */
	private boolean questionEnsI1;
	/**
	 * questionEnsI2a
	 */
	private boolean questionEnsI2;
	/**
	 * questionEnsI3
	 */
	private boolean questionEnsI3;
	/**
	 * questionEnsII1
	 */
	private boolean questionEnsII1;
	/**
	 * questionEnsII2
	 */
	private boolean questionEnsII2;
	/**
	 * questionEnsII3
	 */
	private boolean questionEnsII3;
	/**
	 * questionEnsII4
	 */
	private boolean questionEnsII4;
	/**
	 * questionEnsII5
	 */
	private boolean questionEnsII5;
	/**
	 * questionEnsII6
	 */
	private boolean questionEnsII6;
	/**
	 * questionEnsII7
	 */
	private boolean questionEnsII7;
	/**
	 * questionEnsII8
	 */
	private boolean questionEnsII8;
	/**
	 * questionEnsII9
	 */
	private boolean questionEnsII9;
	/**
	 * questionEnsII10
	 */
	private boolean questionEnsII10;
	/**
	 * questionEnsII11
	 */
	private boolean questionEnsII11;

	
	/* ***************************************************************
	 * Objets
	 ****************************************************************/

	/**
	 * Constructeur
	 */
	public FicheEvaluation(){
		super();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idFicheEvaluation == null) ? 0 : idFicheEvaluation.hashCode());
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
		FicheEvaluation other = (FicheEvaluation) obj;
		if (idFicheEvaluation == null) {
			if (other.idFicheEvaluation != null)
				return false;
		} else if (!idFicheEvaluation.equals(other.idFicheEvaluation))
			return false;
		return true;
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
	 * @return the questionEnt1
	 */
	public boolean isQuestionEnt1() {
		return questionEnt1;
	}

	/**
	 * @param questionEnt1 the questionEnt1 to set
	 */
	public void setQuestionEnt1(boolean questionEnt1) {
		this.questionEnt1 = questionEnt1;
	}

	/**
	 * @return the questionEnt2
	 */
	public boolean isQuestionEnt2() {
		return questionEnt2;
	}

	/**
	 * @param questionEnt2 the questionEnt2 to set
	 */
	public void setQuestionEnt2(boolean questionEnt2) {
		this.questionEnt2 = questionEnt2;
	}

	/**
	 * @return the questionEnt3
	 */
	public boolean isQuestionEnt3() {
		return questionEnt3;
	}

	/**
	 * @param questionEnt3 the questionEnt3 to set
	 */
	public void setQuestionEnt3(boolean questionEnt3) {
		this.questionEnt3 = questionEnt3;
	}

	/**
	 * @return the questionEnt4
	 */
	public boolean isQuestionEnt4() {
		return questionEnt4;
	}

	/**
	 * @param questionEnt4 the questionEnt4 to set
	 */
	public void setQuestionEnt4(boolean questionEnt4) {
		this.questionEnt4 = questionEnt4;
	}

	/**
	 * @return the questionEnt5
	 */
	public boolean isQuestionEnt5() {
		return questionEnt5;
	}

	/**
	 * @param questionEnt5 the questionEnt5 to set
	 */
	public void setQuestionEnt5(boolean questionEnt5) {
		this.questionEnt5 = questionEnt5;
	}

	/**
	 * @return the questionEnt6
	 */
	public boolean isQuestionEnt6() {
		return questionEnt6;
	}

	/**
	 * @param questionEnt6 the questionEnt6 to set
	 */
	public void setQuestionEnt6(boolean questionEnt6) {
		this.questionEnt6 = questionEnt6;
	}

	/**
	 * @return the questionEnt7
	 */
	public boolean isQuestionEnt7() {
		return questionEnt7;
	}

	/**
	 * @param questionEnt7 the questionEnt7 to set
	 */
	public void setQuestionEnt7(boolean questionEnt7) {
		this.questionEnt7 = questionEnt7;
	}

	/**
	 * @return the questionEnt8
	 */
	public boolean isQuestionEnt8() {
		return questionEnt8;
	}

	/**
	 * @param questionEnt8 the questionEnt8 to set
	 */
	public void setQuestionEnt8(boolean questionEnt8) {
		this.questionEnt8 = questionEnt8;
	}

	/**
	 * @return the questionEnt9
	 */
	public boolean isQuestionEnt9() {
		return questionEnt9;
	}

	/**
	 * @param questionEnt9 the questionEnt9 to set
	 */
	public void setQuestionEnt9(boolean questionEnt9) {
		this.questionEnt9 = questionEnt9;
	}

	/**
	 * @return the questionEnt10
	 */
	public boolean isQuestionEnt10() {
		return questionEnt10;
	}

	/**
	 * @param questionEnt10 the questionEnt10 to set
	 */
	public void setQuestionEnt10(boolean questionEnt10) {
		this.questionEnt10 = questionEnt10;
	}

	/**
	 * @return the questionEnt11
	 */
	public boolean isQuestionEnt11() {
		return questionEnt11;
	}

	/**
	 * @param questionEnt11 the questionEnt11 to set
	 */
	public void setQuestionEnt11(boolean questionEnt11) {
		this.questionEnt11 = questionEnt11;
	}

	/**
	 * @return the questionEnt12
	 */
	public boolean isQuestionEnt12() {
		return questionEnt12;
	}

	/**
	 * @param questionEnt12 the questionEnt12 to set
	 */
	public void setQuestionEnt12(boolean questionEnt12) {
		this.questionEnt12 = questionEnt12;
	}

	/**
	 * @return the questionEnt13
	 */
	public boolean isQuestionEnt13() {
		return questionEnt13;
	}

	/**
	 * @param questionEnt13 the questionEnt13 to set
	 */
	public void setQuestionEnt13(boolean questionEnt13) {
		this.questionEnt13 = questionEnt13;
	}

	/**
	 * @return the questionEnt14
	 */
	public boolean isQuestionEnt14() {
		return questionEnt14;
	}

	/**
	 * @param questionEnt14 the questionEnt14 to set
	 */
	public void setQuestionEnt14(boolean questionEnt14) {
		this.questionEnt14 = questionEnt14;
	}

	/**
	 * @return the questionEnt15
	 */
	public boolean isQuestionEnt15() {
		return questionEnt15;
	}

	/**
	 * @param questionEnt15 the questionEnt15 to set
	 */
	public void setQuestionEnt15(boolean questionEnt15) {
		this.questionEnt15 = questionEnt15;
	}

	/**
	 * @return the questionEnt16
	 */
	public boolean isQuestionEnt16() {
		return questionEnt16;
	}

	/**
	 * @param questionEnt16 the questionEnt16 to set
	 */
	public void setQuestionEnt16(boolean questionEnt16) {
		this.questionEnt16 = questionEnt16;
	}

	/**
	 * @return the questionEnt17
	 */
	public boolean isQuestionEnt17() {
		return questionEnt17;
	}

	/**
	 * @param questionEnt17 the questionEnt17 to set
	 */
	public void setQuestionEnt17(boolean questionEnt17) {
		this.questionEnt17 = questionEnt17;
	}

	/**
	 * @return the questionEnt18
	 */
	public boolean isQuestionEnt18() {
		return questionEnt18;
	}

	/**
	 * @param questionEnt18 the questionEnt18 to set
	 */
	public void setQuestionEnt18(boolean questionEnt18) {
		this.questionEnt18 = questionEnt18;
	}

	/**
	 * @return the questionEnt19
	 */
	public boolean isQuestionEnt19() {
		return questionEnt19;
	}

	/**
	 * @param questionEnt19 the questionEnt19 to set
	 */
	public void setQuestionEnt19(boolean questionEnt19) {
		this.questionEnt19 = questionEnt19;
	}

	/**
	 * @return the questionEtuI1
	 */
	public boolean isQuestionEtuI1() {
		return questionEtuI1;
	}

	/**
	 * @param questionEtuI1 the questionEtuI1 to set
	 */
	public void setQuestionEtuI1(boolean questionEtuI1) {
		this.questionEtuI1 = questionEtuI1;
	}

	/**
	 * @return the questionEtuI2
	 */
	public boolean isQuestionEtuI2() {
		return questionEtuI2;
	}

	/**
	 * @param questionEtuI2 the questionEtuI2 to set
	 */
	public void setQuestionEtuI2(boolean questionEtuI2) {
		this.questionEtuI2 = questionEtuI2;
	}

	/**
	 * @return the questionEtuI3
	 */
	public boolean isQuestionEtuI3() {
		return questionEtuI3;
	}

	/**
	 * @param questionEtuI3 the questionEtuI3 to set
	 */
	public void setQuestionEtuI3(boolean questionEtuI3) {
		this.questionEtuI3 = questionEtuI3;
	}

	/**
	 * @return the questionEtuI5
	 */
	public boolean isQuestionEtuI5() {
		return questionEtuI5;
	}

	/**
	 * @param questionEtuI5 the questionEtuI5 to set
	 */
	public void setQuestionEtuI5(boolean questionEtuI5) {
		this.questionEtuI5 = questionEtuI5;
	}

	/**
	 * @return the questionEtuI6
	 */
	public boolean isQuestionEtuI6() {
		return questionEtuI6;
	}

	/**
	 * @param questionEtuI6 the questionEtuI6 to set
	 */
	public void setQuestionEtuI6(boolean questionEtuI6) {
		this.questionEtuI6 = questionEtuI6;
	}

	/**
	 * @return the questionEtuI7
	 */
	public boolean isQuestionEtuI7() {
		return questionEtuI7;
	}

	/**
	 * @param questionEtuI7 the questionEtuI7 to set
	 */
	public void setQuestionEtuI7(boolean questionEtuI7) {
		this.questionEtuI7 = questionEtuI7;
	}

	/**
	 * @return the questionEtuI8
	 */
	public boolean isQuestionEtuI8() {
		return questionEtuI8;
	}

	/**
	 * @param questionEtuI8 the questionEtuI8 to set
	 */
	public void setQuestionEtuI8(boolean questionEtuI8) {
		this.questionEtuI8 = questionEtuI8;
	}

	/**
	 * @return the questionEtuII1
	 */
	public boolean isQuestionEtuII1() {
		return questionEtuII1;
	}

	/**
	 * @param questionEtuII1 the questionEtuII1 to set
	 */
	public void setQuestionEtuII1(boolean questionEtuII1) {
		this.questionEtuII1 = questionEtuII1;
	}

	/**
	 * @return the questionEtuII2
	 */
	public boolean isQuestionEtuII2() {
		return questionEtuII2;
	}

	/**
	 * @param questionEtuII2 the questionEtuII2 to set
	 */
	public void setQuestionEtuII2(boolean questionEtuII2) {
		this.questionEtuII2 = questionEtuII2;
	}

	/**
	 * @return the questionEtuII3
	 */
	public boolean isQuestionEtuII3() {
		return questionEtuII3;
	}

	/**
	 * @param questionEtuII3 the questionEtuII3 to set
	 */
	public void setQuestionEtuII3(boolean questionEtuII3) {
		this.questionEtuII3 = questionEtuII3;
	}

	/**
	 * @return the questionEtuII4
	 */
	public boolean isQuestionEtuII4() {
		return questionEtuII4;
	}

	/**
	 * @param questionEtuII4 the questionEtuII4 to set
	 */
	public void setQuestionEtuII4(boolean questionEtuII4) {
		this.questionEtuII4 = questionEtuII4;
	}

	/**
	 * @return the questionEtuIII1
	 */
	public boolean isQuestionEtuIII1() {
		return questionEtuIII1;
	}

	/**
	 * @param questionEtuIII1 the questionEtuIII1 to set
	 */
	public void setQuestionEtuIII1(boolean questionEtuIII1) {
		this.questionEtuIII1 = questionEtuIII1;
	}

	/**
	 * @return the questionEtuIII2
	 */
	public boolean isQuestionEtuIII2() {
		return questionEtuIII2;
	}

	/**
	 * @param questionEtuIII2 the questionEtuIII2 to set
	 */
	public void setQuestionEtuIII2(boolean questionEtuIII2) {
		this.questionEtuIII2 = questionEtuIII2;
	}

	/**
	 * @return the questionEtuIII3
	 */
	public boolean isQuestionEtuIII3() {
		return questionEtuIII3;
	}

	/**
	 * @param questionEtuIII3 the questionEtuIII3 to set
	 */
	public void setQuestionEtuIII3(boolean questionEtuIII3) {
		this.questionEtuIII3 = questionEtuIII3;
	}

	/**
	 * @return the questionEtuIII4
	 */
	public boolean isQuestionEtuIII4() {
		return questionEtuIII4;
	}

	/**
	 * @param questionEtuIII4 the questionEtuIII4 to set
	 */
	public void setQuestionEtuIII4(boolean questionEtuIII4) {
		this.questionEtuIII4 = questionEtuIII4;
	}

	/**
	 * @return the questionEtuIII6
	 */
	public boolean isQuestionEtuIII6() {
		return questionEtuIII6;
	}

	/**
	 * @param questionEtuIII6 the questionEtuIII6 to set
	 */
	public void setQuestionEtuIII6(boolean questionEtuIII6) {
		this.questionEtuIII6 = questionEtuIII6;
	}

	/**
	 * @return the questionEtuIII7
	 */
	public boolean isQuestionEtuIII7() {
		return questionEtuIII7;
	}

	/**
	 * @param questionEtuIII7 the questionEtuIII7 to set
	 */
	public void setQuestionEtuIII7(boolean questionEtuIII7) {
		this.questionEtuIII7 = questionEtuIII7;
	}

	/**
	 * @return the questionEtuIII8
	 */
	public boolean isQuestionEtuIII8() {
		return questionEtuIII8;
	}

	/**
	 * @param questionEtuIII8 the questionEtuIII8 to set
	 */
	public void setQuestionEtuIII8(boolean questionEtuIII8) {
		this.questionEtuIII8 = questionEtuIII8;
	}

	/**
	 * @return the questionEtuIII9
	 */
	public boolean isQuestionEtuIII9() {
		return questionEtuIII9;
	}

	/**
	 * @param questionEtuIII9 the questionEtuIII9 to set
	 */
	public void setQuestionEtuIII9(boolean questionEtuIII9) {
		this.questionEtuIII9 = questionEtuIII9;
	}

	/**
	 * @return the questionEtuIII10
	 */
	public boolean isQuestionEtuIII10() {
		return questionEtuIII10;
	}

	/**
	 * @param questionEtuIII10 the questionEtuIII10 to set
	 */
	public void setQuestionEtuIII10(boolean questionEtuIII10) {
		this.questionEtuIII10 = questionEtuIII10;
	}

	/**
	 * @return the questionEtuIII11
	 */
	public boolean isQuestionEtuIII11() {
		return questionEtuIII11;
	}

	/**
	 * @param questionEtuIII11 the questionEtuIII11 to set
	 */
	public void setQuestionEtuIII11(boolean questionEtuIII11) {
		this.questionEtuIII11 = questionEtuIII11;
	}

	/**
	 * @return the questionEtuIII12
	 */
	public boolean isQuestionEtuIII12() {
		return questionEtuIII12;
	}

	/**
	 * @param questionEtuIII12 the questionEtuIII12 to set
	 */
	public void setQuestionEtuIII12(boolean questionEtuIII12) {
		this.questionEtuIII12 = questionEtuIII12;
	}

	/**
	 * @return the questionEtuIII13
	 */
	public boolean isQuestionEtuIII13() {
		return questionEtuIII13;
	}

	/**
	 * @param questionEtuIII13 the questionEtuIII13 to set
	 */
	public void setQuestionEtuIII13(boolean questionEtuIII13) {
		this.questionEtuIII13 = questionEtuIII13;
	}

	/**
	 * @return the questionEtuIII14
	 */
	public boolean isQuestionEtuIII14() {
		return questionEtuIII14;
	}

	/**
	 * @param questionEtuIII14 the questionEtuIII14 to set
	 */
	public void setQuestionEtuIII14(boolean questionEtuIII14) {
		this.questionEtuIII14 = questionEtuIII14;
	}

	/**
	 * @return the questionEtuIII15
	 */
	public boolean isQuestionEtuIII15() {
		return questionEtuIII15;
	}

	/**
	 * @param questionEtuIII15 the questionEtuIII15 to set
	 */
	public void setQuestionEtuIII15(boolean questionEtuIII15) {
		this.questionEtuIII15 = questionEtuIII15;
	}

	/**
	 * @return the questionEtuIII16
	 */
	public boolean isQuestionEtuIII16() {
		return questionEtuIII16;
	}

	/**
	 * @param questionEtuIII16 the questionEtuIII16 to set
	 */
	public void setQuestionEtuIII16(boolean questionEtuIII16) {
		this.questionEtuIII16 = questionEtuIII16;
	}

	/**
	 * @return the questionEnsI3
	 */
	public boolean isQuestionEnsI3() {
		return questionEnsI3;
	}

	/**
	 * @param questionEnsI3 the questionEnsI3 to set
	 */
	public void setQuestionEnsI3(boolean questionEnsI3) {
		this.questionEnsI3 = questionEnsI3;
	}

	/**
	 * @return the questionEnsII1
	 */
	public boolean isQuestionEnsII1() {
		return questionEnsII1;
	}

	/**
	 * @param questionEnsII1 the questionEnsII1 to set
	 */
	public void setQuestionEnsII1(boolean questionEnsII1) {
		this.questionEnsII1 = questionEnsII1;
	}

	/**
	 * @return the questionEnsII2
	 */
	public boolean isQuestionEnsII2() {
		return questionEnsII2;
	}

	/**
	 * @param questionEnsII2 the questionEnsII2 to set
	 */
	public void setQuestionEnsII2(boolean questionEnsII2) {
		this.questionEnsII2 = questionEnsII2;
	}

	/**
	 * @return the questionEnsII3
	 */
	public boolean isQuestionEnsII3() {
		return questionEnsII3;
	}

	/**
	 * @param questionEnsII3 the questionEnsII3 to set
	 */
	public void setQuestionEnsII3(boolean questionEnsII3) {
		this.questionEnsII3 = questionEnsII3;
	}

	/**
	 * @return the questionEnsII4
	 */
	public boolean isQuestionEnsII4() {
		return questionEnsII4;
	}

	/**
	 * @param questionEnsII4 the questionEnsII4 to set
	 */
	public void setQuestionEnsII4(boolean questionEnsII4) {
		this.questionEnsII4 = questionEnsII4;
	}

	/**
	 * @return the questionEnsII5
	 */
	public boolean isQuestionEnsII5() {
		return questionEnsII5;
	}

	/**
	 * @param questionEnsII5 the questionEnsII5 to set
	 */
	public void setQuestionEnsII5(boolean questionEnsII5) {
		this.questionEnsII5 = questionEnsII5;
	}

	/**
	 * @return the questionEnsII6
	 */
	public boolean isQuestionEnsII6() {
		return questionEnsII6;
	}

	/**
	 * @param questionEnsII6 the questionEnsII6 to set
	 */
	public void setQuestionEnsII6(boolean questionEnsII6) {
		this.questionEnsII6 = questionEnsII6;
	}

	/**
	 * @return the questionEnsII7
	 */
	public boolean isQuestionEnsII7() {
		return questionEnsII7;
	}

	/**
	 * @param questionEnsII7 the questionEnsII7 to set
	 */
	public void setQuestionEnsII7(boolean questionEnsII7) {
		this.questionEnsII7 = questionEnsII7;
	}

	/**
	 * @return the questionEnsII8
	 */
	public boolean isQuestionEnsII8() {
		return questionEnsII8;
	}

	/**
	 * @param questionEnsII8 the questionEnsII8 to set
	 */
	public void setQuestionEnsII8(boolean questionEnsII8) {
		this.questionEnsII8 = questionEnsII8;
	}

	/**
	 * @return the questionEnsII9
	 */
	public boolean isQuestionEnsII9() {
		return questionEnsII9;
	}

	/**
	 * @param questionEnsII9 the questionEnsII9 to set
	 */
	public void setQuestionEnsII9(boolean questionEnsII9) {
		this.questionEnsII9 = questionEnsII9;
	}

	/**
	 * @return the questionEnsII10
	 */
	public boolean isQuestionEnsII10() {
		return questionEnsII10;
	}

	/**
	 * @param questionEnsII10 the questionEnsII10 to set
	 */
	public void setQuestionEnsII10(boolean questionEnsII10) {
		this.questionEnsII10 = questionEnsII10;
	}

	/**
	 * @return the questionEnsII11
	 */
	public boolean isQuestionEnsII11() {
		return questionEnsII11;
	}

	/**
	 * @param questionEnsII11 the questionEnsII11 to set
	 */
	public void setQuestionEnsII11(boolean questionEnsII11) {
		this.questionEnsII11 = questionEnsII11;
	}

	/**
	 * @return the questionEtuI4
	 */
	public boolean isQuestionEtuI4() {
		return questionEtuI4;
	}

	/**
	 * @param questionEtuI4 the questionEtuI4 to set
	 */
	public void setQuestionEtuI4(boolean questionEtuI4) {
		this.questionEtuI4 = questionEtuI4;
	}

	/**
	 * @return the questionEtuIII5
	 */
	public boolean isQuestionEtuIII5() {
		return questionEtuIII5;
	}

	/**
	 * @param questionEtuIII5 the questionEtuIII5 to set
	 */
	public void setQuestionEtuIII5(boolean questionEtuIII5) {
		this.questionEtuIII5 = questionEtuIII5;
	}

	/**
	 * @return the questionEnsI1
	 */
	public boolean isQuestionEnsI1() {
		return questionEnsI1;
	}

	/**
	 * @param questionEnsI1 the questionEnsI1 to set
	 */
	public void setQuestionEnsI1(boolean questionEnsI1) {
		this.questionEnsI1 = questionEnsI1;
	}

	/**
	 * @return the questionEnsI2
	 */
	public boolean isQuestionEnsI2() {
		return questionEnsI2;
	}

	/**
	 * @param questionEnsI2 the questionEnsI2 to set
	 */
	public void setQuestionEnsI2(boolean questionEnsI2) {
		this.questionEnsI2 = questionEnsI2;
	}

	/**
	 * @return the questionEtuII5
	 */
	public boolean isQuestionEtuII5() {
		return questionEtuII5;
	}

	/**
	 * @param questionEtuII5 the questionEtuII5 to set
	 */
	public void setQuestionEtuII5(boolean questionEtuII5) {
		this.questionEtuII5 = questionEtuII5;
	}

	/**
	 * @return the questionEtuII6
	 */
	public boolean isQuestionEtuII6() {
		return questionEtuII6;
	}

	/**
	 * @param questionEtuII6 the questionEtuII6 to set
	 */
	public void setQuestionEtuII6(boolean questionEtuII6) {
		this.questionEtuII6 = questionEtuII6;
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
}
package org.esupportail.pstagedata.domain.beans;

import java.io.Serializable;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class QuestionSupplementaire extends ObjetMetiers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* ***************************************************************
	 * Propriétés
	 ****************************************************************/
	/**
	 * idQuestionSupplementaire
	 */
	private Integer idQuestionSupplementaire;
	/**
	 * idFicheEvaluation
	 */
	private Integer idFicheEvaluation;
	/**
	 * idPlacement
	 */
	private Integer idPlacement;
	/**
	 * question
	 */
	private String question;
	/**
	 * typeQuestion
	 */
	private String typeQuestion;

	/* ***************************************************************
	 * Objets
	 ****************************************************************/
	/**
	 * Constructeur
	 */
	public QuestionSupplementaire(){
		super();
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
		QuestionSupplementaire other = (QuestionSupplementaire) obj;
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
	 * @return the idQuestionSupplementaire
	 */
	public Integer getIdQuestionSupplementaire() {
		return idQuestionSupplementaire;
	}

	/**
	 * @param idQuestionSupplementaire the idQuestionSupplementaire to set
	 */
	public void setIdQuestionSupplementaire(Integer idQuestionSupplementaire) {
		this.idQuestionSupplementaire = idQuestionSupplementaire;
	}

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
	 * @return the idPlacement
	 */
	public Integer getIdPlacement() {
		return idPlacement;
	}

	/**
	 * @param idPlacement the idPlacement to set
	 */
	public void setIdPlacement(Integer idPlacement) {
		this.idPlacement = idPlacement;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the typeQuestion
	 */
	public String getTypeQuestion() {
		return typeQuestion;
	}

	/**
	 * @param typeQuestion the typeQuestion to set
	 */
	public void setTypeQuestion(String typeQuestion) {
		this.typeQuestion = typeQuestion;
	}

}

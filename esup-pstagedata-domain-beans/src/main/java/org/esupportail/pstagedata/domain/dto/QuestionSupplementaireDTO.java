package org.esupportail.pstagedata.domain.dto;

import java.io.Serializable;

import org.esupportail.pstagedata.domain.beans.QuestionSupplementaire;

/**
 * @author Florian Garot : florian.garot@univ-artois.fr
 *
 */
public class QuestionSupplementaireDTO extends ObjetMetiersDTO implements Serializable{
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
	 * Reponse supplementaire associee a la question
	 */
	private ReponseSupplementaireDTO reponseSupplementaire;
	
	/**
	 * Constructeur
	 */
	public QuestionSupplementaireDTO(){
		super();
	}

	/**
	 * Constructeur
	 */
	public QuestionSupplementaireDTO(QuestionSupplementaire qs){
		super(qs);
		if(qs!=null){
			this.idQuestionSupplementaire = qs.getIdQuestionSupplementaire();
			this.idFicheEvaluation = qs.getIdFicheEvaluation();
			this.idPlacement = qs.getIdPlacement();
			this.question = qs.getQuestion();
			this.typeQuestion = qs.getTypeQuestion();
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
		QuestionSupplementaireDTO other = (QuestionSupplementaireDTO) obj;
		if (idQuestionSupplementaire == null) {
			if (other.idQuestionSupplementaire != null)
				return false;
		} else if (!idQuestionSupplementaire.equals(other.idQuestionSupplementaire))
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
		"idQuestionSupplementaire : "+idQuestionSupplementaire+", "+
		"idFicheEvaluation : "+idFicheEvaluation+", "+
		"idPlacement : "+idPlacement+", "+
		"question : "+question+", "+
		"typeQuestion : "+typeQuestion+", "+super.toString();
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

	/**
	 * @return the reponseSupplementaire
	 */
	public ReponseSupplementaireDTO getReponseSupplementaire() {
		return reponseSupplementaire;
	}

	/**
	 * @param reponseSupplementaire the reponseSupplementaire to set
	 */
	public void setReponseSupplementaire(ReponseSupplementaireDTO reponseSupplementaire) {
		this.reponseSupplementaire = reponseSupplementaire;
	}

}

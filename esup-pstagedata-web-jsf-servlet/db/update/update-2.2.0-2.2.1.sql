ALTER TABLE Convention DROP FOREIGN KEY fk_Convention_FicheEvaluation1;
ALTER TABLE Convention DROP INDEX fk_Convention_FicheEvaluation1;
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE ResultatEvaluation;
DROP TABLE FicheEvaluation;
DROP TABLE CritereEvaluation;
DROP TABLE TypeCritereEvaluation;
SET FOREIGN_KEY_CHECKS=1;
ALTER TABLE Convention DROP COLUMN idFicheEvaluation;

-- Ajout des champs droitEvaluation dans la table PersonnelCentreGestion
ALTER TABLE PersonnelCentreGestion ADD droitEvaluationEtudiant TINYINT(1) NULL DEFAULT 0;
ALTER TABLE PersonnelCentreGestion ADD droitEvaluationEnseignant TINYINT(1) NULL DEFAULT 0;
ALTER TABLE PersonnelCentreGestion ADD droitEvaluationEntreprise TINYINT(1) NULL DEFAULT 0;

-- Ajout de la nouvelle propriete de centre pour la visibilite de l'eval pro aux etus
ALTER TABLE CentreGestion add visibiliteEvalPro TINYINT(1) NULL DEFAULT 0;

-- Ajout des champs relatifs a l'envoi de mail d'avertissement pour l'evaluation du stage
ALTER TABLE Convention ADD envoiMailEtudiant TINYINT(1) DEFAULT 0;
ALTER TABLE Convention ADD dateEnvoiMailEtudiant DATETIME NULL;
ALTER TABLE Convention ADD envoiMailTuteurPedago TINYINT(1) DEFAULT 0;
ALTER TABLE Convention ADD dateEnvoiMailTuteurPedago DATETIME NULL;
ALTER TABLE Convention ADD envoiMailTuteurPro TINYINT(1) DEFAULT 0;
ALTER TABLE Convention ADD dateEnvoiMailTuteurPro DATETIME NULL;

-- Nouvelle table FicheEvaluation --
CREATE TABLE IF NOT EXISTS FicheEvaluation (
	idFicheEvaluation INT NOT NULL AUTO_INCREMENT,
	idCentreGestion INT NOT NULL,
	validationEtudiant TINYINT(1) DEFAULT 0,
	validationEnseignant TINYINT(1) DEFAULT 0,
	validationEntreprise TINYINT(1) DEFAULT 0,
	questionEnt1 TINYINT(1) DEFAULT 1,
	questionEnt2 TINYINT(1) DEFAULT 1,
	questionEnt3 TINYINT(1) DEFAULT 1,
	questionEnt4 TINYINT(1) DEFAULT 1,
	questionEnt5 TINYINT(1) DEFAULT 1,
	questionEnt6 TINYINT(1) DEFAULT 1,
	questionEnt7 TINYINT(1) DEFAULT 1,
	questionEnt8 TINYINT(1) DEFAULT 1,
	questionEnt9 TINYINT(1) DEFAULT 1,
	questionEnt10 TINYINT(1) DEFAULT 1,
	questionEnt11 TINYINT(1) DEFAULT 1,
	questionEnt12 TINYINT(1) DEFAULT 1,
	questionEnt13 TINYINT(1) DEFAULT 1,
	questionEnt14 TINYINT(1) DEFAULT 1,
	questionEnt15 TINYINT(1) DEFAULT 1,
	questionEnt16 TINYINT(1) DEFAULT 1,
	questionEnt17 TINYINT(1) DEFAULT 1,
	questionEnt18 TINYINT(1) DEFAULT 1,
	questionEnt19 TINYINT(1) DEFAULT 1,
	questionEtuI1 TINYINT(1) DEFAULT 1,
	questionEtuI2 TINYINT(1) DEFAULT 1,
	questionEtuI3 TINYINT(1) DEFAULT 1,
	questionEtuI4 TINYINT(1) DEFAULT 1,
	questionEtuI5 TINYINT(1) DEFAULT 1,
	questionEtuI6 TINYINT(1) DEFAULT 1,
	questionEtuI7 TINYINT(1) DEFAULT 1,
	questionEtuI8 TINYINT(1) DEFAULT 1,
	questionEtuII1 TINYINT(1) DEFAULT 1,
	questionEtuII2 TINYINT(1) DEFAULT 1,
	questionEtuII3 TINYINT(1) DEFAULT 1,
	questionEtuII4 TINYINT(1) DEFAULT 1,
	questionEtuII5 TINYINT(1) DEFAULT 1,
	questionEtuII6 TINYINT(1) DEFAULT 1,
	questionEtuIII1 TINYINT(1) DEFAULT 1,
	questionEtuIII2 TINYINT(1) DEFAULT 1,
	questionEtuIII3 TINYINT(1) DEFAULT 1,
	questionEtuIII4 TINYINT(1) DEFAULT 1,
	questionEtuIII5 TINYINT(1) DEFAULT 1,
	questionEtuIII6 TINYINT(1) DEFAULT 1,
	questionEtuIII7 TINYINT(1) DEFAULT 1,
	questionEtuIII8 TINYINT(1) DEFAULT 1,
	questionEtuIII9 TINYINT(1) DEFAULT 1,
	questionEtuIII10 TINYINT(1) DEFAULT 1,
	questionEtuIII11 TINYINT(1) DEFAULT 1,
	questionEtuIII12 TINYINT(1) DEFAULT 1,
	questionEtuIII13 TINYINT(1) DEFAULT 1,
	questionEtuIII14 TINYINT(1) DEFAULT 1,
	questionEtuIII15 TINYINT(1) DEFAULT 1,
	questionEtuIII16 TINYINT(1) DEFAULT 1,
	questionEnsI1 TINYINT(1) DEFAULT 1,
	questionEnsI2 TINYINT(1) DEFAULT 1,
	questionEnsI3 TINYINT(1) DEFAULT 1,
	questionEnsII1 TINYINT(1) DEFAULT 1,
	questionEnsII2 TINYINT(1) DEFAULT 1,
	questionEnsII3 TINYINT(1) DEFAULT 1,
	questionEnsII4 TINYINT(1) DEFAULT 1,
	questionEnsII5 TINYINT(1) DEFAULT 1,
	questionEnsII6 TINYINT(1) DEFAULT 1,
	questionEnsII7 TINYINT(1) DEFAULT 1,
	questionEnsII8 TINYINT(1) DEFAULT 1,
	questionEnsII9 TINYINT(1) DEFAULT 1,
	questionEnsII10 TINYINT(1) DEFAULT 1,
	questionEnsII11 TINYINT(1) DEFAULT 1,
  PRIMARY KEY (idFicheEvaluation),
  CONSTRAINT fk_FicheEvaluation_CentreGestion FOREIGN KEY (idCentreGestion)
  REFERENCES CentreGestion (idCentreGestion) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB;
CREATE INDEX fk_FicheEvaluation_CentreGestion ON FicheEvaluation (idCentreGestion ASC);

CREATE TABLE IF NOT EXISTS ReponseEvaluation (
	idFicheEvaluation INT NOT NULL,
	idConvention INT NOT NULL,
	validationEtudiant TINYINT(1) DEFAULT 0,
	validationEnseignant TINYINT(1) DEFAULT 0,
	validationEntreprise TINYINT(1) DEFAULT 0,
	impressionEtudiant TINYINT(1) DEFAULT 0,
	impressionEnseignant TINYINT(1) DEFAULT 0,
	impressionEntreprise TINYINT(1) DEFAULT 0,
	reponseEnt1 INT NULL,
	reponseEnt1bis TEXT NULL,
	reponseEnt2 INT NULL,
	reponseEnt2bis TEXT NULL,
	reponseEnt3 INT NULL,
	reponseEnt4 INT NULL,
	reponseEnt4bis TEXT NULL,
	reponseEnt5 INT NULL,
	reponseEnt5bis TEXT NULL,
	reponseEnt6 INT NULL,
	reponseEnt6bis TEXT NULL,
	reponseEnt7 INT NULL,
	reponseEnt7bis  TEXT NULL,
	reponseEnt8 INT NULL,
	reponseEnt8bis TEXT NULL,
	reponseEnt9 INT NULL,
	reponseEnt9bis TEXT NULL,
	reponseEnt10 TINYINT(1) DEFAULT 0,
	reponseEnt10bis TEXT NULL,
	reponseEnt11 INT NULL,
	reponseEnt11bis TEXT NULL,
	reponseEnt12 INT NULL,
	reponseEnt12bis TEXT NULL,
	reponseEnt13 INT NULL,
	reponseEnt13bis TEXT NULL,
	reponseEnt14 INT NULL,
	reponseEnt14bis TEXT NULL,
	reponseEnt15 INT NULL,
	reponseEnt15bis TEXT NULL,
	reponseEnt16 INT NULL,
	reponseEnt16bis TEXT NULL,
	reponseEnt17 INT NULL,
	reponseEnt17bis TEXT NULL,
	reponseEnt18 TINYINT(1) DEFAULT 0,
	reponseEnt18bis TEXT NULL,
	reponseEnt19 TEXT NULL,
	reponseEtuI1 INT NULL,
	reponseEtuI1bis TEXT NULL,
	reponseEtuI2 INT NULL,
	reponseEtuI3 INT NULL,
	reponseEtuI4a TINYINT(1) DEFAULT 0,
	reponseEtuI4b TINYINT(1) DEFAULT 0,
	reponseEtuI4c TINYINT(1) DEFAULT 0,
	reponseEtuI4d TINYINT(1) DEFAULT 0,
	reponseEtuI5 INT NULL,
	reponseEtuI6 INT NULL,
	reponseEtuI7 TINYINT(1) DEFAULT 0,
	reponseEtuI7bis1 INT NULL,
	reponseEtuI7bis1a TINYINT(1) DEFAULT 0,
	reponseEtuI7bis1b TEXT NULL,
	reponseEtuI7bis2 INT NULL,
	reponseEtuI8 TINYINT(1) DEFAULT 0,
	reponseEtuII1 INT NULL,
	reponseEtuII1bis TEXT NULL,
	reponseEtuII2 INT NULL,
	reponseEtuII2bis TEXT NULL,
	reponseEtuII3 INT NULL,
	reponseEtuII3bis TEXT NULL,
	reponseEtuII4 INT NULL,
	reponseEtuII5 TINYINT(1) DEFAULT 0,
	reponseEtuII5a INT NULL,
	reponseEtuII5b TINYINT(1) DEFAULT 0,
	reponseEtuII6 TINYINT(1) DEFAULT 0,
	reponseEtuIII1 TINYINT(1) DEFAULT 0,
	reponseEtuIII1bis TEXT NULL,
	reponseEtuIII2 TINYINT(1) DEFAULT 0,
	reponseEtuIII2bis TEXT NULL,
	reponseEtuIII3 TINYINT(1) DEFAULT 0,
	reponseEtuIII3bis TEXT NULL,
	reponseEtuIII4 INT NULL,
	reponseEtuIII5a TINYINT(1) DEFAULT 0,
	reponseEtuIII5b TINYINT(1) DEFAULT 0,
	reponseEtuIII5c TINYINT(1) DEFAULT 0,
	reponseEtuIII5bis TEXT NULL,
	reponseEtuIII6 INT NULL,
	reponseEtuIII6bis TEXT NULL,
	reponseEtuIII7 INT NULL,
	reponseEtuIII7bis TEXT NULL,
	reponseEtuIII8 TINYINT(1) DEFAULT 0,
	reponseEtuIII8bis TEXT NULL,
	reponseEtuIII9 TINYINT(1) DEFAULT 0,
	reponseEtuIII9bis TEXT NULL,
	reponseEtuIII10 TINYINT(1) DEFAULT 0,
	reponseEtuIII11 TINYINT(1) DEFAULT 0,
	reponseEtuIII12 TINYINT(1) DEFAULT 0,
	reponseEtuIII13 TINYINT(1) DEFAULT 0,
	reponseEtuIII14 TINYINT(1) DEFAULT 0,
	reponseEtuIII15 INT NULL,
	reponseEtuIII15bis TEXT NULL,
	reponseEtuIII16 INT NULL,
	reponseEtuIII16bis TEXT NULL,
	reponseEnsI1a TINYINT(1) DEFAULT 0,
	reponseEnsI1b TINYINT(1) DEFAULT 0,
	reponseEnsI1c TINYINT(1) DEFAULT 0,
	reponseEnsI2a TINYINT(1) DEFAULT 0,
	reponseEnsI2b TINYINT(1) DEFAULT 0,
	reponseEnsI2c TINYINT(1) DEFAULT 0,
	reponseEnsI3 TEXT NULL,
	reponseEnsII1 INT NULL,
	reponseEnsII2 INT NULL,
	reponseEnsII3 INT NULL,
	reponseEnsII4 INT NULL,
	reponseEnsII5 INT NULL,
	reponseEnsII6 INT NULL,
	reponseEnsII7 INT NULL,
	reponseEnsII8 INT NULL,
	reponseEnsII9 INT NULL,
	reponseEnsII10 INT NULL,
	reponseEnsII11 TEXT NULL,
  PRIMARY KEY (idFicheEvaluation,idConvention),
  CONSTRAINT fk_ReponseEvaluation_FicheEvaluation FOREIGN KEY (idFicheEvaluation)
  REFERENCES FicheEvaluation (idFicheEvaluation) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_ReponseEvaluation_Convention FOREIGN KEY (idConvention)
  REFERENCES Convention(idConvention) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS QuestionSupplementaire (
  idQuestionSupplementaire INT NOT NULL AUTO_INCREMENT,
  idFicheEvaluation INT NOT NULL,
  idPlacement INT NOT NULL,
  question VARCHAR(200) NOT NULL,
  typeQuestion VARCHAR(5) NOT NULL,
  PRIMARY KEY (idQuestionSupplementaire),
  CONSTRAINT fk_QuestionSupplementaire_FicheEvaluation FOREIGN KEY (idFicheEvaluation)
  REFERENCES FicheEvaluation (idFicheEvaluation) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB;
CREATE INDEX fk_QuestionSupplementaire_FicheEvaluation ON QuestionSupplementaire (idFicheEvaluation ASC);

CREATE TABLE IF NOT EXISTS ReponseSupplementaire(
  idQuestionSupplementaire INT NOT NULL,
  idConvention INT NOT NULL,
  reponseTxt TEXT,
  reponseInt INT,
  reponseBool TINYINT(1),
  PRIMARY KEY (idQuestionSupplementaire,idConvention),
  CONSTRAINT fk_ReponseSupplementaire_QuestionSupplementaire FOREIGN KEY (idQuestionSupplementaire)
  REFERENCES QuestionSupplementaire (idQuestionSupplementaire) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT fk_ReponseSupplementaire_Convention FOREIGN KEY (idConvention)
  REFERENCES Convention (idConvention) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE = InnoDB;
CREATE INDEX fk_ReponseSupplementaire_QuestionSupplementaire ON ReponseSupplementaire (idQuestionSupplementaire ASC);
CREATE INDEX fk_ReponseSupplementaire_Convention ON ReponseSupplementaire (idConvention ASC);
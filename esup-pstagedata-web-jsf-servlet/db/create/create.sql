
-- -----------------------------------------------------

-- Table `Effectif`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Effectif` ;



CREATE  TABLE IF NOT EXISTS `Effectif` (

  `idEffectif` INT NOT NULL AUTO_INCREMENT ,

  `libelleEffectif` VARCHAR(100) NOT NULL ,

  `temEnServEffectif` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idEffectif`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;






-- -----------------------------------------------------

-- Table `TypeStructure`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `TypeStructure` ;



CREATE  TABLE IF NOT EXISTS `TypeStructure` (

  `idTypeStructure` INT NOT NULL AUTO_INCREMENT ,

  `libelleTypeStructure` VARCHAR(100) NOT NULL ,

  `siretObligatoire` TINYINT(1) NOT NULL DEFAULT true ,

  `temEnServTypeStructure` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idTypeStructure`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;



-- -----------------------------------------------------

-- Table `StatutJuridique`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `StatutJuridique` ;



CREATE  TABLE IF NOT EXISTS `StatutJuridique` (

  `idStatutJuridique` INT NOT NULL AUTO_INCREMENT ,

  `libelleStatutJuridique` VARCHAR(100) NOT NULL ,

  `idTypeStructure` INT NOT NULL ,

  `temEnServStatut` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idStatutJuridique`))
ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------

-- Table `Pays`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Pays` ;



CREATE  TABLE IF NOT EXISTS `Pays` (

  `idPays` INT NOT NULL AUTO_INCREMENT ,

  `COG` INT(5) NOT NULL ,

  `actual` INT(1) NOT NULL COMMENT '1=actuel,\n3=territoire n\'ayant pas son propre code officiel g�ographique\n4=territoire ayant son propre code officiel g�ographique' ,

  `CRPAY` INT(5) NULL COMMENT 'Code officiel g�ographique du pays de rattachement du territoire.' ,

  `lib` VARCHAR(70) NOT NULL ,

  `ISO2` VARCHAR(2) NULL ,

  `siretObligatoire` TINYINT(1) NOT NULL DEFAULT false ,

  `temEnServPays` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`idPays`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `NAF_N1`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `NAF_N1` ;



CREATE  TABLE IF NOT EXISTS `NAF_N1` (

  `codeNAF_N1` VARCHAR(1) NOT NULL ,

  `libelleNAF_N1` VARCHAR(150) NOT NULL ,

  `temEnServNAF_N1` VARCHAR(1) NOT NULL DEFAULT 'O',

  PRIMARY KEY (`codeNAF_N1`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------

-- Table `NAF_N5`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `NAF_N5` ;



CREATE  TABLE IF NOT EXISTS `NAF_N5` (

  `codeNAF_N5` VARCHAR(6) NOT NULL ,

  `libelleNAF_N5` VARCHAR(150) NULL ,

  `codeNAF_N1` VARCHAR(1) NOT NULL ,

  `temEnServNAF_N5` VARCHAR(1) NOT NULL DEFAULT 'O',

  PRIMARY KEY (`codeNAF_N5`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;



-- -----------------------------------------------------

-- Table `Structure`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Structure` ;



CREATE  TABLE IF NOT EXISTS `Structure` (

  `idStructure` INT NOT NULL AUTO_INCREMENT ,

  `codeEtab` VARCHAR(20) NULL COMMENT 'Siret pour la France' ,

  `numeroSiret` VARCHAR(14) NULL ,

  `codeNAF_N5` VARCHAR(6) NULL ,

  `raisonSociale` VARCHAR(150) NOT NULL COMMENT 'denomination' ,

  `batimentResidence` VARCHAR(200) NULL COMMENT 'ENTREE-BATIMENT-IMMEUBLE-\nRES-ZI' ,

  `voie` VARCHAR(200) NOT NULL ,

  `commune` VARCHAR(200) NULL ,

  `codePostal` VARCHAR(10) NULL COMMENT 'ou Cedex' ,

  `codeCommune` VARCHAR(10) NULL ,

  `libCedex` VARCHAR(28) NULL COMMENT 'ou L ocalite Destination' ,

  `idPays` INT NOT NULL ,

  `activitePrincipale` TEXT NULL ,

  `telephone` VARCHAR(20) NULL ,

  `fax` VARCHAR(20) NULL ,

  `mail` VARCHAR(50) NULL ,

  `siteWeb` VARCHAR(200) NULL ,

  `groupe` VARCHAR(50) NULL ,

  `logo` VARCHAR(200) NULL ,

  `estValidee` INT(1) NOT NULL DEFAULT 0,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  `loginValidation` VARCHAR(50) NULL ,

  `dateValidation` DATETIME NULL ,

  `loginStopValidation` VARCHAR(50) NULL ,

  `dateStopValidation` DATETIME NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `infosAJour` DATE NULL ,

  `loginInfosAJour` VARCHAR(50) NULL ,

  `idEffectif` INT NOT NULL ,

  `idStatutJuridique` INT NULL ,

  `idTypeStructure` INT NOT NULL ,

  `nomDirigeant` VARCHAR(50) NULL ,

  `prenomDirigeant` VARCHAR(50) NULL ,

  `temEnServStructure` VARCHAR(1) DEFAULT 'O' ,
 
  PRIMARY KEY (`idStructure`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `Service`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Service` ;



CREATE  TABLE IF NOT EXISTS `Service` (

  `idService` INT NOT NULL AUTO_INCREMENT ,

  `nom` VARCHAR(70) NOT NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  `infosAJour` DATE NULL ,

  `loginInfosAJour` VARCHAR(50) NULL ,

  `idStructure` INT NOT NULL ,

  `batimentResidence` VARCHAR(200) NULL ,

  `voie` VARCHAR(200) NOT NULL ,

  `commune` VARCHAR(200) NULL ,

  `codePostal` VARCHAR(10) NOT NULL ,

  `idPays` INT NOT NULL ,

  `codeCommune` VARCHAR(10) NULL ,

  `telephone` VARCHAR(20) NULL ,

  PRIMARY KEY (`idService`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------

-- Table `Civilite`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Civilite` ;



CREATE  TABLE IF NOT EXISTS `Civilite` (

  `idCivilite` INT NOT NULL AUTO_INCREMENT ,

  `libelleCivilite` VARCHAR(50) NOT NULL ,

  PRIMARY KEY (`idCivilite`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `NiveauCentre`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `NiveauCentre` ;



CREATE  TABLE IF NOT EXISTS `NiveauCentre` (

  `idNiveauCentre` INT NOT NULL AUTO_INCREMENT ,

  `libelleNiveauCentre` VARCHAR(50) NOT NULL COMMENT 'ETAB,ENTR,ETAPE,UFR' ,

  `temEnServNiveauCentre` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`idNiveauCentre`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `CentreGestionSuperViseur`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `CentreGestionSuperViseur` ;



CREATE  TABLE IF NOT EXISTS `CentreGestionSuperViseur` (

  `idCentreGestionSuperViseur` INT NOT NULL AUTO_INCREMENT ,

  `nomCentreSuperViseur` VARCHAR(100) NOT NULL ,

  PRIMARY KEY (`idCentreGestionSuperViseur`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `Confidentialite`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Confidentialite` ;



CREATE  TABLE IF NOT EXISTS `Confidentialite` (

  `codeConfidentialite` VARCHAR(1) NOT NULL ,

  `libelleConfidentialite` VARCHAR(50) NOT NULL ,

  `temEnServConfid` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`codeConfidentialite`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `Fichiers`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Fichiers` ;



CREATE  TABLE IF NOT EXISTS `Fichiers` (

  `idFichier` INT NOT NULL AUTO_INCREMENT ,

  `nomFichier` VARCHAR(255) NOT NULL ,

  `nomReel` VARCHAR(255) NULL ,

  PRIMARY KEY (`idFichier`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;



-- -----------------------------------------------------

-- Table `CentreGestion`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `CentreGestion` ;



CREATE  TABLE IF NOT EXISTS `CentreGestion` (

  `idCentreGestion` INT NOT NULL AUTO_INCREMENT ,

  `nomCentre` VARCHAR(100) NULL ,

  `idNiveauCentre` INT NOT NULL ,

  `adresse` VARCHAR(200) NULL ,

  `voie` VARCHAR(200) NULL ,

  `commune` VARCHAR(200) NULL ,

  `codePostal` VARCHAR(10) NULL ,

  `siteWeb` VARCHAR(50) NULL ,

  `mail` VARCHAR(50) NULL ,

  `telephone` VARCHAR(20) NULL ,

  `fax` VARCHAR(20) NULL ,

  `commentaire` TEXT NULL ,

  `presenceTuteurEns` TINYINT(1) NOT NULL DEFAULT false ,

  `presenceTuteurPro` TINYINT(1) NOT NULL DEFAULT false ,

  `saisieTuteurProParEtudiant` TINYINT(1) NOT NULL DEFAULT false ,

  `choixAnneeAvantDebutAnnee` TINYINT(1) NULL DEFAULT false ,

  `choixAnneeApresDebutAnnee` TINYINT(1) NULL DEFAULT false ,

  `depotAnonyme` TINYINT(1) NOT NULL DEFAULT false ,

  `codeUniversite` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateModif` DATETIME NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `nomViseur` VARCHAR(50) NULL COMMENT 'pr�nom , nom viseur - signature\n' ,

  `prenomViseur` VARCHAR(50) NULL ,

  `qualiteViseur` VARCHAR(100) NULL,

  `urlPageInstruction` VARCHAR(200) NULL ,

  `idCentreGestionSuperViseur` INT NULL ,

  `codeConfidentialite` VARCHAR(1) NOT NULL ,

  `autoriserImpressionConvention` TINYINT(1) NOT NULL DEFAULT true ,

  `idFichier` INT NULL ,

  `validationPedagogique` TINYINT NULL DEFAULT 0 ,

  `autorisationEtudiantCreationConvention` TINYINT(1) NOT NULL DEFAULT 1,

  `idModeValidationStage` INT(11) NOT NULL,

  `visibiliteEvalPro` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idCentreGestion`)) 

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------

-- Table `Contact`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Contact` ;



CREATE  TABLE IF NOT EXISTS `Contact` (

  `idContact` INT NOT NULL AUTO_INCREMENT ,

  `idService` INT NOT NULL ,

  `idCivilite` INT NULL ,

  `idCentreGestion` INT NOT NULL ,

  `nom` VARCHAR(50) NOT NULL ,

  `prenom` VARCHAR(50) NOT NULL ,

  `mail` VARCHAR(50) NULL ,

  `tel` VARCHAR(50) NULL ,

  `fax` VARCHAR(50) NULL ,

  `fonction` VARCHAR(100) NOT NULL ,

  `login` VARCHAR(12) NULL ,

  `mdp` VARCHAR(200) NULL ,

  `commentaire` TEXT NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  `infosAJour` DATE NULL ,

  `loginInfosAJour` VARCHAR(50) NULL ,

  `derniereConnexion` DATETIME NULL ,

  `avantDerniereConnexion` DATETIME NULL ,

  PRIMARY KEY (`idContact`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;




-- -----------------------------------------------------

-- Table `UniteDuree`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `UniteDuree` ;



CREATE  TABLE IF NOT EXISTS `UniteDuree` (

  `idUniteDuree` INT NOT NULL AUTO_INCREMENT ,

  `libelleUniteDuree` VARCHAR(100) NOT NULL ,

  `temEnServUniteDuree` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`idUniteDuree`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `TempsTravail`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `TempsTravail` ;



CREATE  TABLE IF NOT EXISTS `TempsTravail` (

  `idTempsTravail` INT NOT NULL AUTO_INCREMENT ,

  `libelleTempsTravail` VARCHAR(200) NOT NULL ,

  `temEnServTempsTravail` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `codeCtrl` VARCHAR(20) NOT NULL ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idTempsTravail`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `NiveauFormation`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `NiveauFormation` ;



CREATE  TABLE IF NOT EXISTS `NiveauFormation` (

  `idNiveauFormation` INT NOT NULL AUTO_INCREMENT ,

  `libelleNiveauFormation` VARCHAR(45) NOT NULL ,

  `temEnServNiveauForm` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idNiveauFormation`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `TypeOffre`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `TypeOffre` ;



CREATE  TABLE IF NOT EXISTS `TypeOffre` (

  `idTypeOffre` INT NOT NULL AUTO_INCREMENT ,

  `libelleType` VARCHAR(50) NOT NULL ,

  `temEnServTypeOffre` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `codeCtrl` VARCHAR(20) NOT NULL ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idTypeOffre`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;



-- -----------------------------------------------------

-- Table `ContratOffre`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `ContratOffre` ;



CREATE  TABLE IF NOT EXISTS `ContratOffre` (

  `idContratOffre` INT NOT NULL AUTO_INCREMENT ,

  `idTypeOffre` INT NOT NULL ,

  `libelleContratOffre` VARCHAR(50) NOT NULL ,

  `temEnServContratOffre` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `codeCtrl` VARCHAR(20) NOT NULL ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idContratOffre`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------

-- Table `DroitAdministration`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `DroitAdministration` ;



CREATE  TABLE IF NOT EXISTS `DroitAdministration` (

  `idDroitAdministration` INT NOT NULL AUTO_INCREMENT ,

  `libelleDroitAdministration` VARCHAR(50) NOT NULL ,

  `temEnServDroitAdmin` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`idDroitAdministration`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `Affectation`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Affectation` ;



CREATE  TABLE IF NOT EXISTS `Affectation` (

  `codeAffectation` VARCHAR(10) NOT NULL ,

  `libelleAffectation` VARCHAR(150) NULL ,

  `codeUniversite` VARCHAR(50) NOT NULL DEFAULT ' ' ,

  PRIMARY KEY (`codeAffectation`, `codeUniversite`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `PersonnelCentreGestion`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `PersonnelCentreGestion` ;



CREATE  TABLE IF NOT EXISTS `PersonnelCentreGestion` (

  `idPersonnelCentreGestion` INT NOT NULL AUTO_INCREMENT ,

  `idCentreGestion` INT NOT NULL ,

  `uidPersonnel` VARCHAR(50) NOT NULL ,

  `nom` VARCHAR(50) NOT NULL ,

  `prenom` VARCHAR(50) NOT NULL ,

  `mail` VARCHAR(50) NULL ,

  `telephone` VARCHAR(50) NULL ,

  `fax` VARCHAR(50) NULL ,

  `fonction` VARCHAR(50) NULL ,

  `idDroitAdministration` INT NOT NULL ,

  `idCivilite` INT NULL ,

  `impressionConvention` TINYINT(1) NOT NULL DEFAULT false ,

  `codeUniversite` VARCHAR(50) NULL ,

  `typePersonne` VARCHAR(50) NULL ,

  `campus` VARCHAR(50) NULL ,

  `batiment` VARCHAR(50) NULL ,

  `bureau` VARCHAR(50) NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  `codeAffectation` VARCHAR(10) NOT NULL ,

  `codeUniversiteAffectation` VARCHAR(50) NOT NULL ,

  `alertesMail` TINYINT(1) NULL DEFAULT 0,

  `droitEvaluationEtudiant` TINYINT(1) NULL DEFAULT 0,

  `droitEvaluationEnseignant` TINYINT(1) NULL DEFAULT 0,

  `droitEvaluationEntreprise` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idPersonnelCentreGestion`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------

-- Table `FAP_QualificationSimplifiee`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `FAP_QualificationSimplifiee` ;



CREATE  TABLE IF NOT EXISTS `FAP_QualificationSimplifiee` (

  `idQualificationSimplifiee` INT NOT NULL ,

  `libelleQualification` VARCHAR(100) NULL ,

  PRIMARY KEY (`idQualificationSimplifiee`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `FAP_N1`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `FAP_N1` ;



CREATE  TABLE IF NOT EXISTS `FAP_N1` (

  `codeFAP_N1` VARCHAR(1) NOT NULL ,

  `libelle` VARCHAR(200) NOT NULL ,

  PRIMARY KEY (`codeFAP_N1`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------

-- Table `Offre`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Offre` ;



CREATE  TABLE IF NOT EXISTS `Offre` (

  `idOffre` INT NOT NULL AUTO_INCREMENT ,

  `idTypeOffre` INT NOT NULL ,

  `idContratOffre` INT NULL ,

  `moisDebut` VARCHAR(50) NULL ,

  `anneeDebut` VARCHAR(50) NULL ,

  `precisionDebut` VARCHAR(200) NULL ,

  `duree` INT NULL COMMENT 'Si CDD, en semaine\n' ,

  `idUniteDuree` INT NULL ,

  `idQualificationSimplifiee` INT NULL ,

  `codeFAP_N3` VARCHAR(1) NULL ,

  `intitule` VARCHAR(200) NOT NULL ,

  `description` TEXT NOT NULL ,

  `lieuCommune` VARCHAR(200) NULL ,

  `codeCommune` VARCHAR(10) NULL ,

  `lieuCodePostal` VARCHAR(10) NULL ,

  `idLieuPays` INT NULL ,

  `deplacement` TINYINT(1) NOT NULL DEFAULT false ,

  `permis` TINYINT(1) NOT NULL DEFAULT false ,

  `voiture` TINYINT(1) NOT NULL DEFAULT false ,

  `remuneration` TINYINT(1) NOT NULL DEFAULT true COMMENT 'salaire/indemnit�' ,

  `avantages` VARCHAR(200) NULL ,

  `precisionRemuneration` VARCHAR(200) NULL ,

  `idTempsTravail` INT NULL ,

  `quotiteTravail` INT NULL ,

  `commentaireTempsTravail` VARCHAR(200) NULL ,

  `observations` TEXT NULL COMMENT 'Commentaires/Observation' ,

  `idNiveauFormation` INT NULL ,

  `competences` TEXT NULL COMMENT 'Competences Souhait�es' ,

  `referenceOffreEtablissement` VARCHAR(100) NULL ,

  `dateDiffusion` DATE NULL ,

  `dateFinDiffusion` DATE NULL ,

  `loginDiffusion` VARCHAR(50) NULL ,

  `loginStopDiffusion` VARCHAR(50) NULL ,

  `dateStopDiffusion` DATETIME NULL ,

  `idStructure` INT NOT NULL ,

  `idCentreGestion` INT NOT NULL ,

  `idReferent` INT NULL ,

  `idContactCand` INT NULL ,

  `idContactInfo` INT NULL ,

  `idContactProprio` INT NULL ,

  `cacherTelContactCand` TINYINT(1) NOT NULL DEFAULT false ,

  `cacherTelContactInfo` TINYINT(1) NOT NULL DEFAULT false ,

  `cacherFaxContactCand` TINYINT(1) NOT NULL DEFAULT false ,

  `cacherFaxContactInfo` TINYINT(1) NOT NULL DEFAULT false ,

  `cacherMailContactCand` TINYINT(1) NOT NULL DEFAULT false ,

  `cacherMailContactInfo` TINYINT(1) NOT NULL DEFAULT false ,

  `cacherNomContactCand` TINYINT(1) NOT NULL DEFAULT false ,

  `cacherNomContactInfo` TINYINT(1) NOT NULL DEFAULT false ,

  `cacherEtablissement` TINYINT(1) NOT NULL DEFAULT false ,

  `estPourvue` TINYINT(1) NOT NULL DEFAULT false ,

  `offrePourvueEtudiantLocal` TINYINT(1) NOT NULL DEFAULT false ,

  `estDiffusee` TINYINT(1) NOT NULL DEFAULT false ,

  `estValidee` TINYINT(1) NOT NULL DEFAULT false ,

  `etatValidation` INT NOT NULL DEFAULT 0 COMMENT 'Si validation des offres\n0 : non valid�e\n1 : valid�e\n2 : en cours\n3 : refus�e' ,

  `estSupprimee` TINYINT(1) NOT NULL DEFAULT false COMMENT 'Suppression logique pour historique' ,

  `estAccessERQTH` TINYINT(1) NOT NULL DEFAULT false COMMENT 'Reconnaissance de Qualification de travailleur handicap�' ,

  `estPrioERQTH` TINYINT(1) NOT NULL DEFAULT false COMMENT 'Reconnaissance de Qualification de travailleur handicap�' ,

  `precisionHandicap` VARCHAR(200) NULL ,

  `avecFichier` TINYINT(1) NOT NULL DEFAULT false ,

  `avecLien` TINYINT(1) NOT NULL DEFAULT false ,

  `lienAttache` VARCHAR(200) NULL ,

  `idFichier` INT NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  `dateValidation` DATETIME NULL ,

  `loginValidation` VARCHAR(50) NULL ,

  `dateStopValidation` DATETIME NULL ,

  `loginStopValidation` VARCHAR(50) NULL ,

  `loginRejetValidation` VARCHAR(50) NULL ,

  `anneeUniversitaire` VARCHAR(50) NOT NULL ,

  PRIMARY KEY (`idOffre`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `ModeCandidature`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `ModeCandidature` ;



CREATE  TABLE IF NOT EXISTS `ModeCandidature` (

  `idModeCandidature` INT NOT NULL AUTO_INCREMENT ,

  `libelleModeCandidature` VARCHAR(50) NOT NULL ,

  `temEnServModeCandidature` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `codeCtrl` VARCHAR(20) NOT NULL ,

  PRIMARY KEY (`idModeCandidature`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8

COMMENT = 'Mode de candidature privil�gi�';

-- -----------------------------------------------------

-- Table `OffreDiffusion`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `OffreDiffusion` ;



CREATE  TABLE IF NOT EXISTS `OffreDiffusion` (

  `idCentreGestion` INT NOT NULL ,

  `idOffre` INT NOT NULL ,

  `estMiseEnAvant` TINYINT(1) NOT NULL DEFAULT false ,

  PRIMARY KEY (`idOffre`, `idCentreGestion`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `AccordPartenariat`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `AccordPartenariat` ;


CREATE  TABLE IF NOT EXISTS `AccordPartenariat` (

  `idAccordPartenariat` INT NOT NULL AUTO_INCREMENT ,

  `idStructure` INT NOT NULL ,

  `idContact` INT NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateValidation` DATETIME NULL DEFAULT NULL ,

  `loginValidation` VARCHAR(50) NULL DEFAULT NULL ,

  `estValide` TINYINT(1) NOT NULL DEFAULT false ,

  `comptesSupprimes` TINYINT(1) NOT NULL DEFAULT false ,

  `raisonSuppressionComptes` TEXT NULL ,

  `dateSuppressionComptes` DATETIME NULL DEFAULT NULL ,

  `loginSuppressionComptes` VARCHAR(50) NULL DEFAULT NULL ,

  PRIMARY KEY (`idAccordPartenariat`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `FAP_N2`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `FAP_N2` ;



CREATE  TABLE IF NOT EXISTS `FAP_N2` (

  `codeFAP_N2` VARCHAR(3) NOT NULL ,

  `libelle` VARCHAR(200) NOT NULL ,

  `codeFAP_N1` VARCHAR(1) NOT NULL ,

  PRIMARY KEY (`codeFAP_N2`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `FAP_Qualification`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `FAP_Qualification` ;



CREATE  TABLE IF NOT EXISTS `FAP_Qualification` (

  `numFAP_Qualification` INT NOT NULL ,

  `libelleQualification` VARCHAR(100) NOT NULL ,

  `idQualificationSimplifiee` INT NOT NULL ,

  PRIMARY KEY (`numFAP_Qualification`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `FAP_N3`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `FAP_N3` ;



CREATE  TABLE IF NOT EXISTS `FAP_N3` (

  `codeFAP_N3` VARCHAR(5) NOT NULL ,

  `libelle` VARCHAR(200) NOT NULL ,

  `codeFAP_N2` VARCHAR(3) NOT NULL ,

  `numFAP_Qualification` INT NOT NULL ,

  PRIMARY KEY (`codeFAP_N3`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `AdminStructure`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `AdminStructure` ;



CREATE  TABLE IF NOT EXISTS `AdminStructure` (

  `idAdminStructure` INT NOT NULL AUTO_INCREMENT ,

  `idCivilite` INT NULL ,

  `nom` VARCHAR(50) NULL ,

  `prenom` VARCHAR(50) NULL ,

  `mail` VARCHAR(50) NULL ,

  `login` VARCHAR(50) NULL COMMENT 'login/uid' ,

  `eppn` VARCHAR(50) NULL ,

  `mdp` VARCHAR(200) NULL ,

  `derniereConnexion` DATETIME NULL ,

  `avantDerniereConnexion` DATETIME NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateModif` DATETIME NULL ,

  `loginModif` VARCHAR(50) NULL ,

  PRIMARY KEY (`idAdminStructure`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `pstagedata_vers_mana`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `pstagedata_vers_mana` ;



CREATE  TABLE IF NOT EXISTS `pstagedata_vers_mana` (

  `id` BIGINT(20) NOT NULL ,

  `vers` VARCHAR(255) NULL ,

  PRIMARY KEY (`id`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `pstagedata_user`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `pstagedata_user` ;



CREATE  TABLE IF NOT EXISTS `pstagedata_user` (

  `id` VARCHAR(255) NOT NULL ,

  `disp_name` VARCHAR(255) NULL ,

  `admi` BIT(1) NOT NULL ,

  `lang` VARCHAR(255) NULL ,

  PRIMARY KEY (`id`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `TypeConvention`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `TypeConvention` ;



CREATE  TABLE IF NOT EXISTS `TypeConvention` (

  `idTypeConvention` INT NOT NULL AUTO_INCREMENT ,

  `libelleTypeConvention` VARCHAR(50) NOT NULL ,

  `codeCtrl` VARCHAR(20) NOT NULL ,

  `temEnServTypeConvention` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idTypeConvention`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `LangueConvention`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `LangueConvention` ;



CREATE  TABLE IF NOT EXISTS `LangueConvention` (

  `codeLangueConvention` VARCHAR(2) NOT NULL ,

  `libelleLangueConvention` VARCHAR(50) NOT NULL ,

  `temEnServLangue` VARCHAR(1) NULL DEFAULT 'O' ,

  PRIMARY KEY (`codeLangueConvention`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `Theme`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Theme` ;



CREATE  TABLE IF NOT EXISTS `Theme` (

  `idTheme` INT NOT NULL AUTO_INCREMENT ,

  `libelleTheme` VARCHAR(50) NOT NULL ,

  `temEnServTheme` VARCHAR(1) NULL DEFAULT 'O' ,

  PRIMARY KEY (`idTheme`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `Indemnisation`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Indemnisation` ;



CREATE  TABLE IF NOT EXISTS `Indemnisation` (

  `idIndemnisation` INT NOT NULL AUTO_INCREMENT ,

  `libelleIndemnisation` VARCHAR(50) NOT NULL ,

  `temEnServIndem` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`idIndemnisation`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `ModeVersGratification`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `ModeVersGratification` ;



CREATE  TABLE IF NOT EXISTS `ModeVersGratification` (

  `idModeVersGratification` INT NOT NULL AUTO_INCREMENT ,

  `libelleModeVersGratification` VARCHAR(50) NOT NULL ,

  `temEnServModeVersGrat` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`idModeVersGratification`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `NatureTravail`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `NatureTravail` ;



CREATE  TABLE IF NOT EXISTS `NatureTravail` (

  `idNatureTravail` INT NOT NULL AUTO_INCREMENT ,

  `libelleNatureTravail` VARCHAR(150) NOT NULL ,

  `temEnServNatTrav` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`idNatureTravail`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `ModeValidationStage`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `ModeValidationStage` ;



CREATE  TABLE IF NOT EXISTS `ModeValidationStage` (

  `idModeValidationStage` INT NOT NULL AUTO_INCREMENT ,

  `libelleModeValidationStage` VARCHAR(150) NOT NULL ,

  `temEnServModeValid` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idModeValidationStage`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `UniteGratification`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `UniteGratification` ;



CREATE  TABLE IF NOT EXISTS `UniteGratification` (

  `idUniteGratification` INT NOT NULL AUTO_INCREMENT ,

  `libelleUniteGratification` VARCHAR(50) NOT NULL ,

  `temEnServGrat` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  PRIMARY KEY (`idUniteGratification`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `Etape`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Etape` ;



CREATE  TABLE IF NOT EXISTS `Etape` (

  `codeEtape` VARCHAR(10) NOT NULL ,

  `codeVersionEtape` VARCHAR(10) NULL ,

  `libelleEtape` VARCHAR(200) NOT NULL ,

  `codeUniversite` VARCHAR(50) NOT NULL DEFAULT ' ' ,

  PRIMARY KEY (`codeEtape`,`codeVersionEtape`, `codeUniversite`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `Assurance`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Assurance` ;



CREATE  TABLE IF NOT EXISTS `Assurance` (

  `idAssurance` INT NOT NULL ,

  `libelleAssurance` VARCHAR(100) NOT NULL ,

  `temEnServAss` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `codeCtrl` VARCHAR(20) NOT NULL ,

  PRIMARY KEY (`idAssurance`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;



-- -----------------------------------------------------

-- Table `Enseignant`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Enseignant` ;



CREATE  TABLE IF NOT EXISTS `Enseignant` (

  `idEnseignant` INT NOT NULL AUTO_INCREMENT ,

  `uidEnseignant` VARCHAR(50) NOT NULL ,

  `nom` VARCHAR(50) NOT NULL ,

  `prenom` VARCHAR(50) NOT NULL ,

  `mail` VARCHAR(50) NULL ,

  `telephone` VARCHAR(30) NULL ,

  `fax` VARCHAR(50) NULL ,

  `campus` VARCHAR(50) NULL ,

  `bureau` VARCHAR(20) NULL ,

  `batiment` VARCHAR(45) NULL ,

  `codeUniversite` VARCHAR(10) NOT NULL ,

  `typePersonne` VARCHAR(50) NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  `codeAffectation` VARCHAR(10) NOT NULL ,

  `codeUniversiteAffectation` VARCHAR(50) NOT NULL ,

  PRIMARY KEY (`idEnseignant`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;



-- -----------------------------------------------------

-- Table `Etudiant`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Etudiant` ;



CREATE  TABLE IF NOT EXISTS `Etudiant` (

  `idEtudiant` INT NOT NULL AUTO_INCREMENT ,

  `identEtudiant` VARCHAR(50) NOT NULL ,

  `nom` VARCHAR(50) NOT NULL DEFAULT '' ,

  `nomMarital` VARCHAR(50) NULL ,

  `prenom` VARCHAR(50) NOT NULL DEFAULT '' ,

  `mail` VARCHAR(100) NULL DEFAULT '' ,

  `numEtudiant` VARCHAR(20) NOT NULL DEFAULT '' ,

  `codeUniversite` VARCHAR(50) NOT NULL ,

  `numSS` VARCHAR(15) NULL ,

  `codeSexe` VARCHAR(1) NULL ,

  `dateNais` DATE NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  PRIMARY KEY (`idEtudiant`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `CaisseRegime`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `CaisseRegime` ;



CREATE  TABLE IF NOT EXISTS `CaisseRegime` (

  `codeCaisse` VARCHAR(5) NULL ,

  `libelleCaisse` VARCHAR(100) NOT NULL ,

  `infoCaisse` VARCHAR(100) NOT NULL ,

  `temEnServCaisse` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`codeCaisse`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `OrigineStage`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `OrigineStage` ;



CREATE  TABLE IF NOT EXISTS `OrigineStage` (

  `idOrigineStage` INT NOT NULL  AUTO_INCREMENT,

  `libelleOrigineStage` VARCHAR(45) NOT NULL ,

  `temEnServOrigineStage` VARCHAR(1) NOT NULL DEFAULT 'O' ,

  `modifiable` TINYINT(1) NULL DEFAULT 0,

  PRIMARY KEY (`idOrigineStage`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8

COLLATE = utf8_general_ci;





-- -----------------------------------------------------

-- Table `Ufr`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Ufr` ;



CREATE  TABLE IF NOT EXISTS `Ufr` (

  `codeUFR` VARCHAR(10) NOT NULL ,

  `libelleUFR` VARCHAR(100) NOT NULL ,

  `codeUniversite` VARCHAR(50) NOT NULL DEFAULT ' ' ,

  PRIMARY KEY (`codeUFR`, `codeUniversite`) )

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------

-- Table `Convention`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Convention` ;



CREATE  TABLE IF NOT EXISTS `Convention` (

  `idConvention` INT NOT NULL AUTO_INCREMENT ,

  `idEtudiant` INT NOT NULL ,

  `idCentreGestion` INT NOT NULL ,

  `codeUFR` VARCHAR(10) NULL ,

  `codeUniversiteUFR` VARCHAR(50) NULL ,

  `codeEtape` VARCHAR(10) NULL ,

  `codeVersionEtape` VARCHAR(10) NULL ,

  `codeUniversiteEtape` VARCHAR(50) NULL ,

  `codeDepartement` VARCHAR(10) NULL ,

  `idEnseignant` INT NULL ,

  `idStructure` INT NULL ,

  `idService` INT NULL ,

  `idContact` INT NULL ,

  `idSignataire` INT NULL ,

  `idTypeConvention` INT NOT NULL ,

  `idOffre` INT NULL ,

  `sujetStage` TEXT NOT NULL ,

  `dateDebutStage` DATE NOT NULL ,

  `dateFinStage` DATE NOT NULL ,

  `interruptionStage` TINYINT NOT NULL DEFAULT 0 ,

  `dateDebutInterruption` DATE NULL ,

  `dateFinInterruption` DATE NULL ,

  `nbJoursHebdo` ENUM('0.5','1','1.5','2','2.5','3','3.5','4','4.5','5','5.5','6') NOT NULL DEFAULT '5' ,

  `idTempsTravail` INT NOT NULL ,

  `commentaireDureeTravail` TEXT NULL ,

  `codeLangueConvention` VARCHAR(2) NOT NULL ,

  `idOrigineStage` INT NULL ,

  `idTheme` INT NOT NULL ,

  `conventionStructure` TINYINT NULL DEFAULT 0 ,

  `validationPedagogique` TINYINT NULL DEFAULT 0 ,

  `validationConvention` TINYINT NULL DEFAULT 0 ,

  `conversionEnContrat` TINYINT NOT NULL DEFAULT 0 ,

  `commentaireStage` TEXT NULL ,

  `adresseEtudiant` VARCHAR(200) NULL ,

  `codePostalEtudiant` VARCHAR(10) NULL ,

  `villeEtudiant` VARCHAR(80) NULL ,

  `paysEtudiant` VARCHAR(50) NULL ,

  `courrielPersoEtudiant` VARCHAR(100) NULL ,

  `telEtudiant` VARCHAR(20) NULL ,

  `telPortableEtudiant` VARCHAR(20) NULL ,

  `idIndemnisation` INT NOT NULL ,

  `montantGratification` VARCHAR(7) NULL ,

  `fonctionsEtTaches` TEXT NULL ,

  `details` TEXT NULL ,

  `annee` VARCHAR(10) NULL ,

  `idAssurance` INT NOT NULL ,

  `insee` VARCHAR(15) NULL ,

  `codeCaisse` VARCHAR(5) NULL ,

  `temConfSujetTeme` VARCHAR(1) NOT NULL DEFAULT 'N' ,

  `nbHeuresHebdo` VARCHAR(5) NULL ,

  `quotiteTravail` INT(3) NULL DEFAULT 100 ,

  `modeEncadreSuivi` TEXT NULL ,

  `idModeVersGratification` INT NOT NULL ,

  `avantagesNature` TEXT NULL ,

  `idNatureTravail` INT NOT NULL ,

  `idModeValidationStage` INT NOT NULL ,

  `codeElp` VARCHAR(8) NULL ,

  `libelleELP` VARCHAR(60) NULL ,

  `creditECTS` DECIMAL(7,2) NULL DEFAULT 0.00 ,

  `travailNuitFerie` TEXT NULL ,

  `dureeStage` INT(4) NOT NULL DEFAULT 0 COMMENT 'en semaine' ,

  `nomEtabRef` VARCHAR(100) NULL ,

  `adresseEtabRef` VARCHAR(250) NULL ,

  `nomSignataireComposante` VARCHAR(30) NULL ,

  `qualiteSignataire` VARCHAR(60) NULL ,

  `libelleCPAM` VARCHAR(100) NULL ,

  `dureeExceptionnelle` VARCHAR(4) NULL ,

  `idUniteDureeExceptionnelle` INT NULL ,

  `idUniteGratification` INT NULL ,

  `codeFinalite` VARCHAR(3) NULL ,

  `libelleFinalite` VARCHAR(60) NULL ,

  `codeCursusLMD` VARCHAR(1) NULL ,

  `priseEnChargeFraisMission` TINYINT(1) NULL DEFAULT false ,

  `codeRGI` VARCHAR(1) NULL ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  `loginValidation` VARCHAR(50) NULL ,

  `dateValidation` DATETIME NULL ,

  `loginSignature` VARCHAR(50) NULL ,

  `dateSignature` DATETIME NULL ,

  `nbConges` TEXT NULL ,

  `competences` TEXT NULL ,

  `idUniteDureeGratification` INT NULL ,

  `monnaieGratification` VARCHAR(50) NULL DEFAULT 'euros',

  `envoiMailEtudiant` TINYINT(1) DEFAULT 0,

  `dateEnvoiMailEtudiant` DATETIME NULL,

  `envoiMailTuteurPedago` TINYINT(1) DEFAULT 0,

  `dateEnvoiMailTuteurPedago` DATETIME NULL,

  `envoiMailTuteurPro` TINYINT(1) DEFAULT 0,

  `dateEnvoiMailTuteurPro` DATETIME NULL,

  PRIMARY KEY (`idConvention`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8

COLLATE = utf8_general_ci;



-- -----------------------------------------------------

-- Table `Avenant`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Avenant` ;



CREATE  TABLE IF NOT EXISTS `Avenant` (

  `idAvenant` INT NOT NULL AUTO_INCREMENT ,

  `idConvention` INT NOT NULL ,

  `titreAvenant` TEXT NULL DEFAULT '' ,

  `motifAvenant` TEXT NULL ,

  `rupture` TINYINT NOT NULL DEFAULT 0 ,

  `modificationPeriode` TINYINT NOT NULL DEFAULT 0 ,

  `dateDebutStage` DATE NULL ,

  `dateFinStage` DATE NULL ,

  `interruptionStage` TINYINT NOT NULL DEFAULT 0 ,

  `dateDebutInterruption` DATE NULL ,

  `dateFinInterruption` DATE NULL ,

  `modificationLieu` TINYINT NULL DEFAULT 0 ,

  `idService` INT NULL ,

  `modificationSujet` TINYINT NOT NULL DEFAULT 0 ,

  `sujetStage` TEXT NULL ,

  `modificationEnseignant` TINYINT NOT NULL DEFAULT 0 ,

  `modificationSalarie` TINYINT NOT NULL DEFAULT 0 ,

  `idContact` INT NULL ,

  `validationAvenant` TINYINT NOT NULL DEFAULT 0 ,

  `loginCreation` VARCHAR(50) NOT NULL ,

  `dateCreation` DATETIME NOT NULL ,

  `loginModif` VARCHAR(50) NULL ,

  `dateModif` DATETIME NULL ,

  `idEnseignant` INT NULL ,

  `montantGratification` VARCHAR(7) NULL ,

  `idUniteGratification` INT NULL ,

  `idUniteDureeGratification` INT NULL DEFAULT 4 ,

  `modificationMontantGratification` TINYINT NOT NULL DEFAULT 0 ,

  `dateRupture` DATE NULL ,

  `commentaireRupture` TEXT NULL ,

  `monnaieGratification` VARCHAR(50) NULL DEFAULT 'euros',

  PRIMARY KEY (`idAvenant`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;



-- -----------------------------------------------------

-- Table `Categorie`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Categorie` ;



CREATE  TABLE IF NOT EXISTS `Categorie` (

  `idCategorie` INT(11) NOT NULL AUTO_INCREMENT ,

  `typeCategorie` INT(11) NOT NULL ,

  PRIMARY KEY (`idCategorie`) )

ENGINE = InnoDB

AUTO_INCREMENT = 3

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `Niveau`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Niveau` ;



CREATE  TABLE IF NOT EXISTS `Niveau` (

  `idNiveau` INT(11) NOT NULL AUTO_INCREMENT ,

  `valeur` INT(11) NOT NULL ,

  PRIMARY KEY (`idNiveau`) )

ENGINE = InnoDB

AUTO_INCREMENT = 3

DEFAULT CHARACTER SET = utf8;





-- -----------------------------------------------------

-- Table `Critere`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `Critere` ;



CREATE  TABLE IF NOT EXISTS `Critere` (

  `idCritere` INT(11) NOT NULL AUTO_INCREMENT ,

  `valeur` VARCHAR(100) NOT NULL ,

  `clef` VARCHAR(15) NOT NULL ,

  `niveau` INT(11) NOT NULL ,

  `typeCategorie` INT(11) NOT NULL ,

  PRIMARY KEY (`idCritere`))

ENGINE = InnoDB

AUTO_INCREMENT = 28

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `CritereGestion`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `CritereGestion` ;



CREATE  TABLE IF NOT EXISTS `CritereGestion` (

  `codeCritere` VARCHAR(15) NOT NULL ,

  `codeVersionEtape` VARCHAR(10) NULL ,

  `libelleCritere` VARCHAR(200) NOT NULL ,

  `idCentreGestion` INT NOT NULL ,

  PRIMARY KEY (`codeCritere`,`codeVersionEtape`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8

COLLATE = utf8_general_ci;


-- -----------------------------------------------------

-- Table `OffreModeCandidature`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `OffreModeCandidature` ;



CREATE  TABLE IF NOT EXISTS `OffreModeCandidature` (

  `idOffre` INT NOT NULL ,

  `idModeCandidature` INT NOT NULL ,

  PRIMARY KEY (`idOffre`, `idModeCandidature`))

ENGINE = InnoDB

DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------

-- Table `TicketStructure`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `TicketStructure` ;



CREATE  TABLE IF NOT EXISTS `TicketStructure` (

  `ticket` VARCHAR(50) NOT NULL ,

  `idStructure` INT NOT NULL ,

  PRIMARY KEY (`ticket`) )

ENGINE = InnoDB;





-- -----------------------------------------------------

-- Table `DureeDiffusion`

-- -----------------------------------------------------

DROP TABLE IF EXISTS `DureeDiffusion` ;



CREATE  TABLE IF NOT EXISTS `DureeDiffusion` (

  `idDureeDiffusion` INT NOT NULL ,

  `adminSeulement` TINYINT NOT NULL DEFAULT 0 ,

  `libelleDureeDiffusion` VARCHAR(20) NOT NULL ,

  PRIMARY KEY (`idDureeDiffusion`) )

ENGINE = InnoDB;


-- AJOUT 2.2.1 MODULE EVALUATION --

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



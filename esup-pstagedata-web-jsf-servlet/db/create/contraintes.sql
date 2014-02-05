-- Fichier contenant toutes les contraintes et les index lors de la cr�ation de la base

-- -----------------------------------------------------

-- Table `StatutJuridique`

-- -----------------------------------------------------
ALTER TABLE `StatutJuridique` 
    ADD CONSTRAINT `fk_StatutJuridique_TypeStructure1` FOREIGN KEY (`idTypeStructure` )
    REFERENCES `TypeStructure` (`idTypeStructure` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION;
    
CREATE INDEX `fk_StatutJuridique_TypeStructure1` ON `StatutJuridique` (`idTypeStructure` ASC) ;

-- -----------------------------------------------------

-- Table `NAF_N5`

-- -----------------------------------------------------
ALTER TABLE `NAF_N5`
    ADD CONSTRAINT `fk_NAF_N5_NAF_N11`
    FOREIGN KEY (`codeNAF_N1` )
    REFERENCES `NAF_N1` (`codeNAF_N1` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION;
    
CREATE INDEX `fk_NAF_N5_NAF_N11` ON `NAF_N5` (`codeNAF_N1` ASC) ;


-- -----------------------------------------------------

-- Table `Structure`

-- -----------------------------------------------------
ALTER TABLE `Structure`
  ADD ( CONSTRAINT `fk_Structure_Effectif1`
    FOREIGN KEY (`idEffectif` )
    REFERENCES `Effectif` (`idEffectif` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Structure_StatutJuridique1`
    FOREIGN KEY (`idStatutJuridique` )
    REFERENCES `StatutJuridique` (`idStatutJuridique` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Structure_TypeStructure1`
    FOREIGN KEY (`idTypeStructure` )
    REFERENCES `TypeStructure` (`idTypeStructure` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Structure_Pays1`
    FOREIGN KEY (`idPays` )
    REFERENCES `Pays` (`idPays` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Structure_NAF_N51`
    FOREIGN KEY (`codeNAF_N5` )
    REFERENCES `NAF_N5` (`codeNAF_N5` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE INDEX `fk_Structure_Effectif1` ON `Structure` (`idEffectif` ASC) ;
CREATE INDEX `fk_Structure_StatutJuridique1` ON `Structure` (`idStatutJuridique` ASC) ;
CREATE INDEX `fk_Structure_TypeStructure1` ON `Structure` (`idTypeStructure` ASC) ;
CREATE INDEX `fk_Structure_Pays1` ON `Structure` (`idPays` ASC) ;
CREATE INDEX `fk_Structure_NAF_N51` ON `Structure` (`codeNAF_N5` ASC) ;


-- -----------------------------------------------------

-- Table `Service`

-- -----------------------------------------------------
ALTER TABLE `Service`
  ADD ( CONSTRAINT `fk_Service_Structure1`
    FOREIGN KEY (`idStructure` )
    REFERENCES `Structure` (`idStructure` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Service_Pays1`
    FOREIGN KEY (`idPays` )
    REFERENCES `Pays` (`idPays` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE INDEX `fk_Service_Structure1` ON `Service` (`idStructure` ASC) ;
CREATE INDEX `fk_Service_Pays1` ON `Service` (`idPays` ASC) ;   


-- -----------------------------------------------------

-- Table `CentreGestion`

-- -----------------------------------------------------,
ALTER TABLE `CentreGestion`
  ADD (CONSTRAINT `fk_CentreGestion_NiveauCentre1`
    FOREIGN KEY (`idNiveauCentre` )
    REFERENCES `NiveauCentre` (`idNiveauCentre` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CentreGestion_CentreGestionSuperViseur1`
    FOREIGN KEY (`idCentreGestionSuperViseur` )
    REFERENCES `CentreGestionSuperViseur` (`idCentreGestionSuperViseur` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CentreGestion_Confidentialite1`
    FOREIGN KEY (`codeConfidentialite` )
    REFERENCES `Confidentialite` (`codeConfidentialite` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CentreGestion_Fichiers1`
    FOREIGN KEY (`idFichier` )
    REFERENCES `Fichiers` (`idFichier` )
    ON DELETE NO ACTION
   ON UPDATE NO ACTION);
 
CREATE INDEX `fk_CentreGestion_NiveauCentre1` ON `CentreGestion` (`idNiveauCentre` ASC) ;
CREATE INDEX `fk_CentreGestion_CentreGestionSuperViseur1` ON `CentreGestion` (`idCentreGestionSuperViseur` ASC) ;
CREATE INDEX `fk_CentreGestion_Confidentialite1` ON `CentreGestion` (`codeConfidentialite` ASC) ;
CREATE INDEX `fk_CentreGestion_Fichiers1` ON `CentreGestion` (`idFichier` ASC) ;

-- -----------------------------------------------------

-- Table `Contact`

-- -----------------------------------------------------
ALTER TABLE `Contact`
 ADD(CONSTRAINT `fk_Contact_Service1`
    FOREIGN KEY (`idService` )
    REFERENCES `Service` (`idService` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Contact_Civilite1`
    FOREIGN KEY (`idCivilite` )
    REFERENCES `Civilite` (`idCivilite` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Contact_CentreGestion1`
    FOREIGN KEY (`idCentreGestion` )
    REFERENCES `CentreGestion` (`idCentreGestion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE INDEX `fk_Contact_Service1` ON `Contact` (`idService` ASC) ;
CREATE INDEX `fk_Contact_Civilite1` ON `Contact` (`idCivilite` ASC) ;
CREATE INDEX `fk_Contact_CentreGestion1` ON `Contact` (`idCentreGestion` ASC) ;



-- -----------------------------------------------------

-- Table `ContratOffre`

-- -----------------------------------------------------
ALTER TABLE `ContratOffre`
  ADD CONSTRAINT `fk_ContratOffre_TypeOffre1`
    FOREIGN KEY (`idTypeOffre` )
    REFERENCES `TypeOffre` (`idTypeOffre` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION;
    
CREATE INDEX `fk_ContratOffre_TypeOffre1` ON `ContratOffre` (`idTypeOffre` ASC) ;

-- -----------------------------------------------------

-- Table `PersonnelCentreGestion`

-- -----------------------------------------------------
ALTER TABLE `PersonnelCentreGestion`
  ADD (CONSTRAINT `fk_PersonnelCentreGestion_CentreGestion1`
    FOREIGN KEY (`idCentreGestion` )
    REFERENCES `CentreGestion` (`idCentreGestion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PersonnelCentreGestion_DroitAdministration1`
    FOREIGN KEY (`idDroitAdministration` )
    REFERENCES `DroitAdministration` (`idDroitAdministration` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PersonnelCentreGestion_Civilite1`
    FOREIGN KEY (`idCivilite` )
    REFERENCES `Civilite` (`idCivilite` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PersonnelCentreGestion_Affectation1`
    FOREIGN KEY (`codeAffectation` , `codeUniversiteAffectation` )
    REFERENCES `Affectation` (`codeAffectation` , `codeUniversite` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE INDEX `fk_PersonnelCentreGestion_CentreGestion1` ON `PersonnelCentreGestion` (`idCentreGestion` ASC) ;
CREATE INDEX `fk_PersonnelCentreGestion_DroitAdministration1` ON `PersonnelCentreGestion` (`idDroitAdministration` ASC) ;
CREATE INDEX `fk_PersonnelCentreGestion_Civilite1` ON `PersonnelCentreGestion` (`idCivilite` ASC) ;
CREATE INDEX `fk_PersonnelCentreGestion_Affectation1` ON `PersonnelCentreGestion` (`codeAffectation` ASC, `codeUniversiteAffectation` ASC) ;

-- -----------------------------------------------------

-- Table `Offre`

-- -----------------------------------------------------
ALTER TABLE `Offre`
  ADD (CONSTRAINT `fk_Offre_UniteDuree1`
    FOREIGN KEY (`idUniteDuree` )
    REFERENCES `UniteDuree` (`idUniteDuree` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_Pays1`
    FOREIGN KEY (`idLieuPays` )
    REFERENCES `Pays` (`idPays` )
    ON DELETE NO ACTION
   ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_TempsTravail1`
    FOREIGN KEY (`idTempsTravail` )
    REFERENCES `TempsTravail` (`idTempsTravail` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_NiveauFormation1`
    FOREIGN KEY (`idNiveauFormation` )
    REFERENCES `NiveauFormation` (`idNiveauFormation` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_ContratOffre1`
    FOREIGN KEY (`idContratOffre` )
    REFERENCES `ContratOffre` (`idContratOffre` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_TypeOffre1`
    FOREIGN KEY (`idTypeOffre` )
    REFERENCES `TypeOffre` (`idTypeOffre` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_Structure1`
    FOREIGN KEY (`idStructure` )
    REFERENCES `Structure` (`idStructure` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_CentreGestion1`
    FOREIGN KEY (`idCentreGestion` )
    REFERENCES `CentreGestion` (`idCentreGestion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_Contact1`
    FOREIGN KEY (`idContactCand` )
    REFERENCES `Contact` (`idContact` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_Contact2`
    FOREIGN KEY (`idContactInfo` )
    REFERENCES `Contact` (`idContact` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_PersonnelCentreGestion1`
    FOREIGN KEY (`idReferent` )
    REFERENCES `PersonnelCentreGestion` (`idPersonnelCentreGestion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_QualificationSimplifiee1`
    FOREIGN KEY (`idQualificationSimplifiee` )
    REFERENCES `FAP_QualificationSimplifiee` (`idQualificationSimplifiee` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_Contact3`
    FOREIGN KEY (`idContactProprio` )
    REFERENCES `Contact` (`idContact` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_Fichiers1`
    FOREIGN KEY (`idFichier` )
    REFERENCES `Fichiers` (`idFichier` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_FAP_N11`
    FOREIGN KEY (`codeFAP_N3` )
    REFERENCES `FAP_N1` (`codeFAP_N1` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE INDEX `fk_Offre_UniteDuree1` ON `Offre` (`idUniteDuree` ASC) ;
CREATE INDEX `fk_Offre_Pays1` ON `Offre` (`idLieuPays` ASC) ;
CREATE INDEX `fk_Offre_TempsTravail1` ON `Offre` (`idTempsTravail` ASC) ;
CREATE INDEX `fk_Offre_NiveauFormation1` ON `Offre` (`idNiveauFormation` ASC) ;
CREATE INDEX `fk_Offre_ContratOffre1` ON `Offre` (`idContratOffre` ASC) ;
CREATE INDEX `fk_Offre_TypeOffre1` ON `Offre` (`idTypeOffre` ASC) ;
CREATE INDEX `fk_Offre_Structure1` ON `Offre` (`idStructure` ASC) ;
CREATE INDEX `fk_Offre_CentreGestion1` ON `Offre` (`idCentreGestion` ASC) ;
CREATE INDEX `fk_Offre_Contact1` ON `Offre` (`idContactCand` ASC) ;
CREATE INDEX `fk_Offre_Contact2` ON `Offre` (`idContactInfo` ASC) ;
CREATE INDEX `fk_Offre_PersonnelCentreGestion1` ON `Offre` (`idReferent` ASC) ;
CREATE INDEX `fk_Offre_QualificationSimplifiee1` ON `Offre` (`idQualificationSimplifiee` ASC) ;
CREATE INDEX `fk_Offre_Contact3` ON `Offre` (`idContactProprio` ASC) ;
CREATE INDEX `fk_Offre_Fichiers1` ON `Offre` (`idFichier` ASC) ;
CREATE INDEX `fk_Offre_FAP_N11` ON `Offre` (`codeFAP_N3` ASC) ;


-- -----------------------------------------------------

-- Table `OffreDiffusion`

-- -----------------------------------------------------
ALTER TABLE `OffreDiffusion`
ADD( CONSTRAINT `fk_Offre_has_CentreGestion_Offre1`
    FOREIGN KEY (`idOffre` )
    REFERENCES `Offre` (`idOffre` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Offre_has_CentreGestion_CentreGestion1`
    FOREIGN KEY (`idCentreGestion` )
    REFERENCES `CentreGestion` (`idCentreGestion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE INDEX `fk_Offre_has_CentreGestion_Offre1` ON `OffreDiffusion` (`idOffre` ASC) ;
CREATE INDEX `fk_Offre_has_CentreGestion_CentreGestion1` ON `OffreDiffusion` (`idCentreGestion` ASC) ;

-- -----------------------------------------------------

-- Table `AccordPartenariat`

-- -----------------------------------------------------
ALTER TABLE `AccordPartenariat`
ADD( CONSTRAINT `fk_AccordPartenariat_Structure1`
   FOREIGN KEY (`idStructure` )
   REFERENCES `Structure` (`idStructure` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_AccordPartenariat_Contact1`
    FOREIGN KEY (`idContact` )
    REFERENCES `Contact` (`idContact` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE INDEX `fk_AccordPartenariat_Structure1` ON `AccordPartenariat` (`idStructure` ASC) ;
CREATE INDEX `fk_AccordPartenariat_Contact1` ON `AccordPartenariat` (`idContact` ASC) ;


-- -----------------------------------------------------

-- Table `FAP_N2`

-- -----------------------------------------------------
ALTER TABLE `FAP_N2`
  ADD( CONSTRAINT `fk_FAP_N2_FAP_N11`
    FOREIGN KEY (`codeFAP_N1` )
    REFERENCES `FAP_N1` (`codeFAP_N1` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
CREATE INDEX `fk_FAP_N2_FAP_N11` ON `FAP_N2` (`codeFAP_N1` ASC) ;


-- -----------------------------------------------------

-- Table `FAP_Qualification`

-- -----------------------------------------------------
ALTER TABLE `FAP_Qualification`
 ADD( CONSTRAINT `fk_FAP_Qualification_QualificationSimplifiee1`
    FOREIGN KEY (`idQualificationSimplifiee` )
    REFERENCES `FAP_QualificationSimplifiee` (`idQualificationSimplifiee` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
CREATE INDEX `fk_FAP_Qualification_QualificationSimplifiee1` ON `FAP_Qualification` (`idQualificationSimplifiee` ASC);

-- -----------------------------------------------------

-- Table `FAP_N3`

-- -----------------------------------------------------

ALTER TABLE `FAP_N3`
ADD( CONSTRAINT `fk_FAP_N3_FAP_N21`
    FOREIGN KEY (`codeFAP_N2` )
    REFERENCES `FAP_N2` (`codeFAP_N2` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_FAP_N3_FAP_Qualification1`
    FOREIGN KEY (`numFAP_Qualification` )
    REFERENCES `FAP_Qualification` (`numFAP_Qualification` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
   
CREATE INDEX `fk_FAP_N3_FAP_N21` ON `FAP_N3` (`codeFAP_N2` ASC) ;
CREATE INDEX `fk_FAP_N3_FAP_Qualification1` ON `FAP_N3` (`numFAP_Qualification` ASC) ;

-- -----------------------------------------------------

-- Table `AdminStructure`

-- -----------------------------------------------------

ALTER TABLE `AdminStructure`
ADD( CONSTRAINT `fk_AdminStructure_Civilite1`
    FOREIGN KEY (`idCivilite` )
    REFERENCES `Civilite` (`idCivilite` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);   
CREATE INDEX `fk_AdminStructure_Civilite1` ON `AdminStructure` (`idCivilite` ASC) ;

-- -----------------------------------------------------

-- Table `Etape`

-- -----------------------------------------------------

CREATE UNIQUE INDEX `index_codeEtape_codeUniversite` ON `Etape` (`codeEtape` ASC, `codeUniversite` ASC) ;

-- -----------------------------------------------------

-- Table `Enseignant`

-- -----------------------------------------------------

ALTER TABLE `Enseignant`
ADD( CONSTRAINT `fk_Enseignant_Affectation1`
    FOREIGN KEY (`codeAffectation` , `codeUniversiteAffectation` )
    REFERENCES `Affectation` (`codeAffectation` , `codeUniversite` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE INDEX `index_nom_enseignant` ON `Enseignant` (`nom` ASC, `prenom` ASC) ;
CREATE UNIQUE INDEX `index_uidEnseignant_codeUniversite` ON `Enseignant` (`uidEnseignant` ASC, `codeUniversite` ASC) ;
CREATE INDEX `fk_Enseignant_Affectation1` ON `Enseignant` (`codeAffectation` ASC, `codeUniversiteAffectation` ASC) ;


-- -----------------------------------------------------

-- Table `Etudiant`

-- -----------------------------------------------------

CREATE INDEX `index_nom_etudiant` ON `Etudiant` (`nom` ASC, `prenom` ASC) ;
CREATE UNIQUE INDEX `index_ident_etudiant_code_universite` ON `Etudiant` (`identEtudiant` ASC, `codeUniversite` ASC) ;

-- -----------------------------------------------------

-- Table `Ufr`

-- -----------------------------------------------------

CREATE UNIQUE INDEX `index_codeUfr_codeUniversite` ON `Ufr` (`codeUFR` ASC, `codeUniversite` ASC) ;


-- -----------------------------------------------------

-- Table `Convention`

-- -----------------------------------------------------

ALTER TABLE `Convention`
ADD( CONSTRAINT `fk_Convention_CentreGestion1`
    FOREIGN KEY (`idCentreGestion` )
    REFERENCES `CentreGestion` (`idCentreGestion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_TypeConvention1`
    FOREIGN KEY (`idTypeConvention` )
    REFERENCES `TypeConvention` (`idTypeConvention` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_TempsTravail1`
    FOREIGN KEY (`idTempsTravail` )
    REFERENCES `TempsTravail` (`idTempsTravail` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_LangueConvention1`
    FOREIGN KEY (`codeLangueConvention` )
    REFERENCES `LangueConvention` (`codeLangueConvention` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Theme1`
    FOREIGN KEY (`idTheme` )
    REFERENCES `Theme` (`idTheme` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Indemnisation1`
    FOREIGN KEY (`idIndemnisation` )
    REFERENCES `Indemnisation` (`idIndemnisation` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_NatureTravail1`
    FOREIGN KEY (`idNatureTravail` )
    REFERENCES `NatureTravail` (`idNatureTravail` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_ModeValidationStage1`
    FOREIGN KEY (`idModeValidationStage` )
    REFERENCES `ModeValidationStage` (`idModeValidationStage` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_UniteDuree1`
    FOREIGN KEY (`idUniteDureeExceptionnelle` )
    REFERENCES `UniteDuree` (`idUniteDuree` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_UniteGratification1`
    FOREIGN KEY (`idUniteGratification` )
    REFERENCES `UniteGratification` (`idUniteGratification` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Contact1`
    FOREIGN KEY (`idContact` )
    REFERENCES `Contact` (`idContact` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Assurance1`
    FOREIGN KEY (`idAssurance` )
    REFERENCES `Assurance` (`idAssurance` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Offre1`
    FOREIGN KEY (`idOffre` )
    REFERENCES `Offre` (`idOffre` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Structure1`
    FOREIGN KEY (`idStructure` )
    REFERENCES `Structure` (`idStructure` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Service1`
    FOREIGN KEY (`idService` )
    REFERENCES `Service` (`idService` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Signataire`
    FOREIGN KEY (`idSignataire` )
    REFERENCES `Contact` (`idContact` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_FicheEvaluation1`
    FOREIGN KEY (`idFicheEvaluation` )
    REFERENCES `FicheEvaluation` (`idFicheEvaluation` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Enseignant1`
    FOREIGN KEY (`idEnseignant` )
    REFERENCES `Enseignant` (`idEnseignant` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Etudiant1`
    FOREIGN KEY (`idEtudiant` )
    REFERENCES `Etudiant` (`idEtudiant` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_CaisseRegime1`
    FOREIGN KEY (`codeCaisse` )
    REFERENCES `CaisseRegime` (`codeCaisse` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_OrigineStage1`
    FOREIGN KEY (`idOrigineStage` )
    REFERENCES `OrigineStage` (`idOrigineStage` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Etape1`
    FOREIGN KEY (`codeEtape` , `codeUniversiteEtape` )
    REFERENCES `Etape` (`codeEtape` , `codeUniversite` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Convention_Ufr1`
    FOREIGN KEY (`codeUFR` , `codeUniversiteUFR` )
    REFERENCES `Ufr` (`codeUFR` , `codeUniversite` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
   
CREATE INDEX `fk_Convention_CentreGestion1` ON `Convention` (`idCentreGestion` ASC) ;
CREATE INDEX `fk_Convention_TypeConvention1` ON `Convention` (`idTypeConvention` ASC) ;
CREATE INDEX `fk_Convention_TempsTravail1` ON `Convention` (`idTempsTravail` ASC) ;
CREATE INDEX `fk_Convention_LangueConvention1` ON `Convention` (`codeLangueConvention` ASC) ;
CREATE INDEX `fk_Convention_Theme1` ON `Convention` (`idTheme` ASC) ;
CREATE INDEX `fk_Convention_Indemnisation1` ON `Convention` (`idIndemnisation` ASC) ;
CREATE INDEX `fk_Convention_NatureTravail1` ON `Convention` (`idNatureTravail` ASC) ;
CREATE INDEX `fk_Convention_ModeValidationStage1` ON `Convention` (`idModeValidationStage` ASC) ;
CREATE INDEX `fk_Convention_UniteDuree1` ON `Convention` (`idUniteDureeExceptionnelle` ASC) ;
CREATE INDEX `fk_Convention_UniteGratification1` ON `Convention` (`idUniteGratification` ASC) ;
CREATE INDEX `fk_Convention_Contact1` ON `Convention` (`idContact` ASC) ;
CREATE INDEX `fk_Convention_Assurance1` ON `Convention` (`idAssurance` ASC) ;
CREATE INDEX `fk_Convention_Offre1` ON `Convention` (`idOffre` ASC) ;
CREATE INDEX `fk_Convention_Structure1` ON `Convention` (`idStructure` ASC) ;
CREATE INDEX `fk_Convention_Service1` ON `Convention` (`idService` ASC) ;
CREATE INDEX `fk_Convention_Signataire` ON `Convention` (`idSignataire` ASC) ;
CREATE INDEX `fk_Convention_FicheEvaluation1` ON `Convention` (`idFicheEvaluation` ASC) ;
CREATE INDEX `fk_Convention_Enseignant1` ON `Convention` (`idEnseignant` ASC) ;
CREATE INDEX `fk_Convention_Etudiant1` ON `Convention` (`idEtudiant` ASC) ;
CREATE INDEX `fk_Convention_CaisseRegime1` ON `Convention` (`codeCaisse` ASC) ;
CREATE INDEX `fk_Convention_OrigineStage1` ON `Convention` (`idOrigineStage` ASC) ;
CREATE INDEX `fk_Convention_Etape1` ON `Convention` (`codeEtape` ASC, `codeUniversiteEtape` ASC) ;
CREATE INDEX `fk_Convention_Ufr1` ON `Convention` (`codeUFR` ASC, `codeUniversiteUFR` ASC) ;


-- -----------------------------------------------------

-- Table `Avenant`

-- -----------------------------------------------------
ALTER TABLE `Avenant`
ADD(  CONSTRAINT `fk_Avenant_Convention1`
    FOREIGN KEY (`idConvention` )
    REFERENCES `Convention` (`idConvention` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Avenant_Service1`
    FOREIGN KEY (`idService` )
    REFERENCES `Service` (`idService` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Avenant_Contact1`
    FOREIGN KEY (`idContact` )
    REFERENCES `Contact` (`idContact` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE INDEX `fk_Avenant_Convention1` ON `Avenant` (`idConvention` ASC) ;
CREATE INDEX `fk_Avenant_Service1` ON `Avenant` (`idService` ASC) ;
CREATE INDEX `fk_Avenant_Contact1` ON `Avenant` (`idContact` ASC) ;


-- -----------------------------------------------------

-- Table `CritereEvaluation`

-- -----------------------------------------------------
ALTER TABLE `CritereEvaluation`
ADD( CONSTRAINT `fk_CritereEvaluation_TypeCritere1`
    FOREIGN KEY (`idTypeCritere` )
    REFERENCES `TypeCritereEvaluation` (`idTypeCritereEvaluation` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
    
CREATE INDEX `fk_CritereEvaluation_TypeCritere1` ON `CritereEvaluation` (`idTypeCritere` ASC) ;



-- -----------------------------------------------------

-- Table `ResultatEvaluation`

-- -----------------------------------------------------

ALTER TABLE `ResultatEvaluation`
ADD( CONSTRAINT `fk_ResultatEvaluation_CritereEvaluation1`
    FOREIGN KEY (`idCritereEvaluation` )
    REFERENCES `CritereEvaluation` (`idCritereEvaluation` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ResultatEvaluation_FicheEvaluation1`
    FOREIGN KEY (`idFicheEvaluation` )
    REFERENCES `FicheEvaluation` (`idFicheEvaluation` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE INDEX `fk_ResultatEvaluation_CritereEvaluation1` ON `ResultatEvaluation` (`idCritereEvaluation` ASC) ;
CREATE INDEX `fk_ResultatEvaluation_FicheEvaluation1` ON `ResultatEvaluation` (`idFicheEvaluation` ASC) ;

-- -----------------------------------------------------

-- Table `Critere`

-- -----------------------------------------------------

ALTER TABLE `Critere`
ADD( CONSTRAINT `FK_Categorie`
    FOREIGN KEY (`typeCategorie` )
    REFERENCES `Categorie` (`idCategorie` )
    ON DELETE CASCADE,
  CONSTRAINT `FK_Niveau`
    FOREIGN KEY (`niveau` )
    REFERENCES `Niveau` (`idNiveau` ));
   
CREATE INDEX `FK_Niveau` ON `Critere` (`niveau` ASC) ;
CREATE INDEX `index_categorie` ON `Critere` (`typeCategorie` ASC) ;


-- -----------------------------------------------------

-- Table `CritereGestion`

-- -----------------------------------------------------

ALTER TABLE `CritereGestion`
ADD( CONSTRAINT `fk_CritereGestion_CentreGestion1`
    FOREIGN KEY (`idCentreGestion` )
    REFERENCES `CentreGestion` (`idCentreGestion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

CREATE INDEX `fk_CritereGestion_CentreGestion1` ON `CritereGestion` (`idCentreGestion` ASC) ;


-- -----------------------------------------------------

-- Table `OffreModeCandidature`

-- -----------------------------------------------------
ALTER TABLE `OffreModeCandidature`
ADD( CONSTRAINT `fk_OffreModeCandidature_Offre1`
    FOREIGN KEY (`idOffre` )
    REFERENCES `Offre` (`idOffre` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_OffreModeCandidature_ModeCandidature1`
    FOREIGN KEY (`idModeCandidature` )
    REFERENCES `ModeCandidature` (`idModeCandidature` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
   
CREATE INDEX `fk_OffreModeCandidature_Offre1` ON `OffreModeCandidature` (`idOffre` ASC) ;
CREATE INDEX `fk_OffreModeCandidature_ModeCandidature1` ON `OffreModeCandidature` (`idModeCandidature` ASC) ;

-- -----------------------------------------------------

-- Data for table `Effectif`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `Effectif` (`idEffectif`, `libelleEffectif`, `temEnServEffectif`) VALUES (1, 0, 'O');

INSERT INTO `Effectif` (`idEffectif`, `libelleEffectif`, `temEnServEffectif`) VALUES (2, '1 à 9', 'O');

INSERT INTO `Effectif` (`idEffectif`, `libelleEffectif`, `temEnServEffectif`) VALUES (3, '10 à 49', 'O');

INSERT INTO `Effectif` (`idEffectif`, `libelleEffectif`, `temEnServEffectif`) VALUES (4, '50 à 199', 'O');

INSERT INTO `Effectif` (`idEffectif`, `libelleEffectif`, `temEnServEffectif`) VALUES (5, '200 à 999', 'O');

INSERT INTO `Effectif` (`idEffectif`, `libelleEffectif`, `temEnServEffectif`) VALUES (6, '1000 et +', 'O');



COMMIT;

-- -----------------------------------------------------

-- Data for table `TypeStructure`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `TypeStructure` (`idTypeStructure`, `libelleTypeStructure`, `temEnServTypeStructure`) VALUES (1, 'Administration', 'O');

INSERT INTO `TypeStructure` (`idTypeStructure`, `libelleTypeStructure`, `temEnServTypeStructure`) VALUES (2, 'Association', 'O');

INSERT INTO `TypeStructure` (`idTypeStructure`, `libelleTypeStructure`, `temEnServTypeStructure`) VALUES (3, 'Entreprise privée', 'O');

INSERT INTO `TypeStructure` (`idTypeStructure`, `libelleTypeStructure`, `temEnServTypeStructure`) VALUES (4, 'Entreprise public / SEM', 'O');

INSERT INTO `TypeStructure` (`idTypeStructure`, `libelleTypeStructure`, `temEnServTypeStructure`) VALUES (5, 'Mutuelle Coopérative', 'O');

INSERT INTO `TypeStructure` (`idTypeStructure`, `libelleTypeStructure`, `temEnServTypeStructure`) VALUES (6, 'Autres', 'O');



COMMIT;

-- -----------------------------------------------------

-- Data for table `StatutJuridique`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `StatutJuridique` (`idStatutJuridique`, `libelleStatutJuridique`, `idTypeStructure`, `temEnServStatut`) VALUES (1, 'EURL', 3, 'O');

INSERT INTO `StatutJuridique` (`idStatutJuridique`, `libelleStatutJuridique`, `idTypeStructure`, `temEnServStatut`) VALUES (2, 'SARL', 3, 'O');

INSERT INTO `StatutJuridique` (`idStatutJuridique`, `libelleStatutJuridique`, `idTypeStructure`, `temEnServStatut`) VALUES (3, 'SA', 3, 'O');

INSERT INTO `StatutJuridique` (`idStatutJuridique`, `libelleStatutJuridique`, `idTypeStructure`, `temEnServStatut`) VALUES (4, 'SAS', 3, 'O');

INSERT INTO `StatutJuridique` (`idStatutJuridique`, `libelleStatutJuridique`, `idTypeStructure`, `temEnServStatut`) VALUES (5, 'SNS', 3, 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `Civilite`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `Civilite` (`idCivilite`, `libelleCivilite`) VALUES (1, 'Mlle');

INSERT INTO `Civilite` (`idCivilite`, `libelleCivilite`) VALUES (2, 'Mme');

INSERT INTO `Civilite` (`idCivilite`, `libelleCivilite`) VALUES (3, 'Mr');

INSERT INTO `Civilite` (`idCivilite`, `libelleCivilite`) VALUES (4, '');


COMMIT;



-- -----------------------------------------------------

-- Data for table `NiveauCentre`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `NiveauCentre` (`idNiveauCentre`, `libelleNiveauCentre`, `temEnServNiveauCentre`) VALUES (1, 'ENTREPRISE', 'O');

INSERT INTO `NiveauCentre` (`idNiveauCentre`, `libelleNiveauCentre`, `temEnServNiveauCentre`) VALUES (2, 'ETABLISSEMENT', 'O');

INSERT INTO `NiveauCentre` (`idNiveauCentre`, `libelleNiveauCentre`, `temEnServNiveauCentre`) VALUES (3, 'ETAPE', 'O');

INSERT INTO `NiveauCentre` (`idNiveauCentre`, `libelleNiveauCentre`, `temEnServNiveauCentre`) VALUES (4, 'UFR', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `Confidentialite`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `Confidentialite` (`codeConfidentialite`, `libelleConfidentialite`, `temEnServConfid`) VALUES ('0', 'Pas de confidentialité', 'O');

INSERT INTO `Confidentialite` (`codeConfidentialite`, `libelleConfidentialite`, `temEnServConfid`) VALUES ('1', 'Confidentialité totale', 'O');

INSERT INTO `Confidentialite` (`codeConfidentialite`, `libelleConfidentialite`, `temEnServConfid`) VALUES ('2', 'Confidentialité libre', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `UniteDuree`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `UniteDuree` (`idUniteDuree`, `libelleUniteDuree`, `temEnServUniteDuree`) VALUES (1, 'heure(s)', 'O');

INSERT INTO `UniteDuree` (`idUniteDuree`, `libelleUniteDuree`, `temEnServUniteDuree`) VALUES (2, 'jour(s)', 'O');

INSERT INTO `UniteDuree` (`idUniteDuree`, `libelleUniteDuree`, `temEnServUniteDuree`) VALUES (3, 'semaine(s)', 'O');

INSERT INTO `UniteDuree` (`idUniteDuree`, `libelleUniteDuree`, `temEnServUniteDuree`) VALUES (4, 'mois', 'O');

INSERT INTO `UniteDuree` (`idUniteDuree`, `libelleUniteDuree`, `temEnServUniteDuree`) VALUES (5, 'année(s)', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `TempsTravail`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `TempsTravail` (`idTempsTravail`, `libelleTempsTravail`, `temEnServTempsTravail`, `codeCtrl`) VALUES (1, 'Temps Plein', 'O', 'TCOMP');

INSERT INTO `TempsTravail` (`idTempsTravail`, `libelleTempsTravail`, `temEnServTempsTravail`, `codeCtrl`) VALUES (2, 'Temps Partiel', 'O', 'TPART');



COMMIT;



-- -----------------------------------------------------

-- Data for table `NiveauFormation`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `NiveauFormation` (`idNiveauFormation`, `libelleNiveauFormation`, `temEnServNiveauForm`) VALUES (1, 'BAC à BAC +3', 'O');

INSERT INTO `NiveauFormation` (`idNiveauFormation`, `libelleNiveauFormation`, `temEnServNiveauForm`) VALUES (2, 'BAC +3 à BAC+4', 'O');

INSERT INTO `NiveauFormation` (`idNiveauFormation`, `libelleNiveauFormation`, `temEnServNiveauForm`) VALUES (3, 'BAC +4 à BAC +5', 'O');

INSERT INTO `NiveauFormation` (`idNiveauFormation`, `libelleNiveauFormation`, `temEnServNiveauForm`) VALUES (4, 'BAC +5 ou +', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `TypeOffre`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `TypeOffre` (`idTypeOffre`, `libelleType`, `temEnServTypeOffre`, `codeCtrl`) VALUES (1, 'Stage', 'O', 'STAGE');

INSERT INTO `TypeOffre` (`idTypeOffre`, `libelleType`, `temEnServTypeOffre`, `codeCtrl`) VALUES (2, 'Emploi', 'O', 'EMPLOI');

INSERT INTO `TypeOffre` (`idTypeOffre`, `libelleType`, `temEnServTypeOffre`, `codeCtrl`) VALUES (3, 'Alternance', 'O', 'ALTERN');

INSERT INTO `TypeOffre` (`idTypeOffre`, `libelleType`, `temEnServTypeOffre`, `codeCtrl`) VALUES (4, 'VIE/VIA', 'O', 'VIEVIA');



COMMIT;



-- -----------------------------------------------------

-- Data for table `ContratOffre`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `ContratOffre` (`idContratOffre`, `idTypeOffre`, `libelleContratOffre`, `temEnServContratOffre`, `codeCtrl`) VALUES (1, 2, 'CDD', 'O', 'CDD');

INSERT INTO `ContratOffre` (`idContratOffre`, `idTypeOffre`, `libelleContratOffre`, `temEnServContratOffre`, `codeCtrl`) VALUES (2, 2, 'CDI', 'O', 'CDI');

INSERT INTO `ContratOffre` (`idContratOffre`, `idTypeOffre`, `libelleContratOffre`, `temEnServContratOffre`, `codeCtrl`) VALUES (3, 2, 'Intérim', 'O', 'INTERIM');

INSERT INTO `ContratOffre` (`idContratOffre`, `idTypeOffre`, `libelleContratOffre`, `temEnServContratOffre`, `codeCtrl`) VALUES (4, 3, 'Contrat d\'apprentissage', 'O', 'CTAPPREN');

INSERT INTO `ContratOffre` (`idContratOffre`, `idTypeOffre`, `libelleContratOffre`, `temEnServContratOffre`, `codeCtrl`) VALUES (5, 3, 'Contrat de professionnalisation', 'O', 'CTPRO');



COMMIT;



-- -----------------------------------------------------

-- Data for table `DroitAdministration`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `DroitAdministration` (`idDroitAdministration`, `libelleDroitAdministration`, `temEnServDroitAdmin`) VALUES (1, 'LECTURE', 'O');

INSERT INTO `DroitAdministration` (`idDroitAdministration`, `libelleDroitAdministration`, `temEnServDroitAdmin`) VALUES (2, 'ECRITURE', 'O');

INSERT INTO `DroitAdministration` (`idDroitAdministration`, `libelleDroitAdministration`, `temEnServDroitAdmin`) VALUES (3, 'ADMIN', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `Affectation`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `Affectation` (`codeAffectation`, `libelleAffectation`, `codeUniversite`) VALUES (' ', ' ', ' ');



COMMIT;



-- -----------------------------------------------------

-- Data for table `FAP_QualificationSimplifiee`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `FAP_QualificationSimplifiee` (`idQualificationSimplifiee`, `libelleQualification`) VALUES (1, 'Ouvriers ou employés');

INSERT INTO `FAP_QualificationSimplifiee` (`idQualificationSimplifiee`, `libelleQualification`) VALUES (2, 'Techniciens');

INSERT INTO `FAP_QualificationSimplifiee` (`idQualificationSimplifiee`, `libelleQualification`) VALUES (3, 'Ingénieurs ou cadres');



COMMIT;



-- -----------------------------------------------------

-- Data for table `ModeCandidature`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `ModeCandidature` (`idModeCandidature`, `libelleModeCandidature`, `temEnServModeCandidature`, `codeCtrl`) VALUES (1, 'Courrier', 'O', 'COUR');

INSERT INTO `ModeCandidature` (`idModeCandidature`, `libelleModeCandidature`, `temEnServModeCandidature`, `codeCtrl`) VALUES (2, 'Mail', 'O', 'MAIL');

INSERT INTO `ModeCandidature` (`idModeCandidature`, `libelleModeCandidature`, `temEnServModeCandidature`, `codeCtrl`) VALUES (3, 'Téléphone', 'O', 'TEL');



COMMIT;



-- -----------------------------------------------------

-- Data for table `TypeConvention`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `TypeConvention` (`idTypeConvention`, `libelleTypeConvention`, `codeCtrl`, `temEnServTypeConvention`) VALUES (1, 'Obligatoire', 'OBLIG', 'O');

INSERT INTO `TypeConvention` (`idTypeConvention`, `libelleTypeConvention`, `codeCtrl`, `temEnServTypeConvention`) VALUES (2, 'Conseillé', 'CONS', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `LangueConvention`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `LangueConvention` (`codeLangueConvention`, `libelleLangueConvention`, `temEnServLangue`) VALUES ('fr', 'Français (Convention nationale, stage en FRANCE) ', 'O');

INSERT INTO `LangueConvention` (`codeLangueConvention`, `libelleLangueConvention`, `temEnServLangue`) VALUES ('en', 'Anglais (Convention, stage étranger)', 'O');

INSERT INTO `LangueConvention` (`codeLangueConvention`, `libelleLangueConvention`, `temEnServLangue`) VALUES ('fo', 'Français (Convention, stage étranger francophone)', 'O');

INSERT INTO `LangueConvention` (`codeLangueConvention`, `libelleLangueConvention`, `temEnServLangue`) VALUES ('es', 'Espagnol (Convention, stage étranger)', 'O');

INSERT INTO `LangueConvention` (`codeLangueConvention`, `libelleLangueConvention`, `temEnServLangue`) VALUES ('al', 'Allemand (Convention, stage étranger)', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `Theme`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (1, 'AMENAGEMENT/URBANISME/ENVIRONNEMENT', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (2, 'ART/PATRIMOINE', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (3, 'COMMERCE INTERNATIONAL/MARKETING', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (4, 'EDUCATION/FORMATION', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (5, 'RESSOURCES HUMAINES', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (6, 'SPORT', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (7, 'TRADUCTION', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (8, 'ECONOMIE/GESTION', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (9, 'INFORMATION/COMMUNICATION', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (10, 'SANTE/SOCIAL', 'O');

INSERT INTO `Theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES (11, 'STATISTIQUE', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `Indemnisation`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `Indemnisation` (`idIndemnisation`, `libelleIndemnisation`, `temEnServIndem`) VALUES (1, 'Oui', 'O');

INSERT INTO `Indemnisation` (`idIndemnisation`, `libelleIndemnisation`, `temEnServIndem`) VALUES (2, 'Non', 'O');

INSERT INTO `Indemnisation` (`idIndemnisation`, `libelleIndemnisation`, `temEnServIndem`) VALUES (3, 'Ne sait pas', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `ModeVersGratification`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `ModeVersGratification` (`idModeVersGratification`, `libelleModeVersGratification`, `temEnServModeVersGrat`) VALUES (1, '', 'O');

INSERT INTO `ModeVersGratification` (`idModeVersGratification`, `libelleModeVersGratification`, `temEnServModeVersGrat`) VALUES (2, 'Chèque', 'O');

INSERT INTO `ModeVersGratification` (`idModeVersGratification`, `libelleModeVersGratification`, `temEnServModeVersGrat`) VALUES (3, 'Virement bancaire', 'O');

INSERT INTO `ModeVersGratification` (`idModeVersGratification`, `libelleModeVersGratification`, `temEnServModeVersGrat`) VALUES (4, 'Espèce', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `NatureTravail`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `NatureTravail` (`idNatureTravail`, `libelleNatureTravail`, `temEnServNatTrav`) VALUES (1, 'Rapport de Stage', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `ModeValidationStage`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `ModeValidationStage` (`idModeValidationStage`, `libelleModeValidationStage`, `temEnServModeValid`) VALUES (1, 'Soutenance', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `UniteGratification`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `UniteGratification` (`idUniteGratification`, `libelleUniteGratification`, `temEnServGrat`) VALUES (1, 'Net', 'O');

INSERT INTO `UniteGratification` (`idUniteGratification`, `libelleUniteGratification`, `temEnServGrat`) VALUES (2, 'Brut', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `Assurance`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `Assurance` (`idAssurance`, `libelleAssurance`, `temEnServAss`, `codeCtrl`) VALUES (1, 'En qualité d\'ayant droit d\'assuré social', 'O', 'ASSAYANTDROIT');

INSERT INTO `Assurance` (`idAssurance`, `libelleAssurance`, `temEnServAss`, `codeCtrl`) VALUES (2, 'En qualité d\'étudiant(e)', 'O', 'ASSETUDIANT');

INSERT INTO `Assurance` (`idAssurance`, `libelleAssurance`, `temEnServAss`, `codeCtrl`) VALUES (3, 'Par une assurance volontaire', 'O', 'ASSVOLONTAIRE');

INSERT INTO `Assurance` (`idAssurance`, `libelleAssurance`, `temEnServAss`, `codeCtrl`) VALUES (4, 'Étudiant étranger', 'O', 'ASSETRANGER');



COMMIT;



-- -----------------------------------------------------

-- Data for table `CaisseRegime`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `CaisseRegime` (`codeCaisse`, `libelleCaisse`, `infoCaisse`, `temEnServCaisse`) VALUES ('CPAM', 'Caisse Primaire d\'Assurance Maladie', '', 'O');

INSERT INTO `CaisseRegime` (`codeCaisse`, `libelleCaisse`, `infoCaisse`, `temEnServCaisse`) VALUES ('MSA', 'Mutualité Sociale Agricole', 'Pour les salariés ou exploitants agricoles', 'O');

INSERT INTO `CaisseRegime` (`codeCaisse`, `libelleCaisse`, `infoCaisse`, `temEnServCaisse`) VALUES ('RSI', 'Régime Social des Indépendants', 'Pour les artisans, commerçants, industriels et professions libérales', 'O');

INSERT INTO `CaisseRegime` (`codeCaisse`, `libelleCaisse`, `infoCaisse`, `temEnServCaisse`) VALUES ('SPEC', 'Régimes spéciaux', 'Pour les travailleurs des mines, de la S.N.C.F., de la R.A.T.P., les militaires, les marins', 'O');



COMMIT;



-- -----------------------------------------------------

-- Data for table `OrigineStage`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `OrigineStage` (`idOrigineStage`, `libelleOrigineStage`, `temEnServOrigineStage`) VALUES (1, 'Réponse à une offre de stage', 'O');

INSERT INTO `OrigineStage` (`idOrigineStage`, `libelleOrigineStage`, `temEnServOrigineStage`) VALUES (2, 'Candidature spontanée', 'O');

INSERT INTO `OrigineStage` (`idOrigineStage`, `libelleOrigineStage`, `temEnServOrigineStage`) VALUES (3, 'Réseau de connaissance', 'O');



COMMIT;




-- -----------------------------------------------------

-- Data for table `DureeDiffusion`

-- -----------------------------------------------------

SET AUTOCOMMIT=0;

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (18, '1 An et demi');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (12, '1 An');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (11, '11 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (10, '10 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (9, '9 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (8, '8 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (7, '7 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (6, '6 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (5, '5 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (4, '4 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (3, '3 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (2, '2 Mois');

INSERT INTO `DureeDiffusion` (`idDureeDiffusion`, `libelleDureeDiffusion`) VALUES (1, '1 Mois');

COMMIT;
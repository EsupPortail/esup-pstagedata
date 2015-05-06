-- Ajout du champs validationPedagogique dans la table Convention --
ALTER TABLE Convention ADD validationPedagogique TINYINT(1) NULL DEFAULT 0 AFTER conventionStructure;

-- Ajout du champs validationPedagogique dans la table CentreGestion --
ALTER TABLE CentreGestion ADD validationPedagogique TINYINT(1) NULL DEFAULT 0;

-- Augmentation de la taille du champs raisonSociale de la table Structure de 100 a 150
ALTER TABLE Structure CHANGE raisonSociale raisonSociale VARCHAR(150) NOT NULL COMMENT 'denomination';

-- Augmentation de la taille du champs nom de la table Service de 50 a 70
ALTER TABLE Service CHANGE nom nom VARCHAR(70) NOT NULL;

-- Ajout du champs alertesMail dans la table Personne
ALTER TABLE PersonnelCentreGestion ADD alertesMail TINYINT(1) NULL DEFAULT 0;

-- Ajout du champs autorisationEtudiantCreationConvention dans la table CentreGestion
ALTER TABLE CentreGestion ADD autorisationEtudiantCreationConvention TINYINT(1) NOT NULL DEFAULT 1;

-- Ajout du champs idModeValidationStage dans la table CentreGestion
ALTER TABLE CentreGestion ADD idModeValidationStage INT(11) NOT NULL;

-- Ajout des champs 'modifiable' pour l'interface de gestion des nomenclatures
ALTER TABLE CaisseRegime ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE NiveauFormation ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE Effectif ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE TempsTravail ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE OrigineStage ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE TypeConvention ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE TypeStructure ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE StatutJuridique ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE TypeOffre ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE ContratOffre ADD modifiable TINYINT(1) NULL DEFAULT 0;
ALTER TABLE ModeValidationStage ADD modifiable TINYINT(1) NULL DEFAULT 0;

-- Rectification idOrigineStage en auto_increment
ALTER TABLE OrigineStage CHANGE idOrigineStage idOrigineStage INT NOT NULL AUTO_INCREMENT;

-- Rajout du titre de l'avenant
ALTER TABLE Avenant ADD titreAvenant TEXT NULL DEFAULT '' after idConvention;

-- Rajout du code version etape dans les tables concernees
ALTER TABLE Convention ADD codeVersionEtape VARCHAR(10) NULL DEFAULT '' after codeEtape;
ALTER TABLE CritereGestion ADD codeVersionEtape VARCHAR(10) NULL DEFAULT '' after codeCritere;
ALTER TABLE Etape ADD codeVersionEtape VARCHAR(10) NULL DEFAULT '' after codeEtape;

--Ajout du code version etape à la clé de la table Etape
ALTER TABLE Etape
  DROP PRIMARY KEY,
   ADD PRIMARY KEY(
     codeEtape,
     codeVersionEtape,
     codeUniversite);
--Ajout du code version etape à la clé de la table CritereGestion
ALTER TABLE CritereGestion
  DROP PRIMARY KEY,
   ADD PRIMARY KEY(
     codeCritere,
     codeVersionEtape);

--Suppression de la contrainte au niveau du mode de versement de la gratification
ALTER TABLE Convention DROP FOREIGN KEY fk_Convention_ModeVersGratification1; 

--Suppression de l'obligation de motif au niveau des avenants
ALTER TABLE Avenant CHANGE motifAvenant motifAvenant TEXT NULL;
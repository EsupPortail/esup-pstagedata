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
ALTER TABLE Avenant ADD titreAvenant VARCHAR(50) NULL DEFAULT '' after idConvention;

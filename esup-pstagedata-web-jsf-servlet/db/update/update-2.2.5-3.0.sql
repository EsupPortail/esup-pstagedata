
-- Augmentation de la taille du champs campus qui peut etre plus grand que 50 caractere dans certains cas
ALTER TABLE Enseignant CHANGE campus campus VARCHAR(250) NULL;

-- Passage du codeCommune de la table offre en varchar pour prendre en compte les codes de la corse
ALTER TABLE Offre CHANGE codeCommune codeCommune VARCHAR(10) NULL;

-- Passage du codeCommune de la table Service en varchar pour prendre en compte les codes de la corse
ALTER TABLE Service CHANGE codeCommune codeCommune VARCHAR(10) NULL;

-- Changement des libelles de la table langue de convention pour mieux correspondre a son nouvel intitulé 'Modèle' dans l'application
ALTER TABLE LangueConvention CHANGE libelleLangueConvention libelleLangueConvention VARCHAR(100) NOT NULL;

INSERT INTO LangueConvention (
   codeLangueConvention
  ,libelleLangueConvention
  ,temEnServLangue
) VALUES (
   'it'  -- codeLangueConvention
  ,'Italien (stage étranger)'  -- libelleLangueConvention
  ,'O'  -- temEnServLangue
);

UPDATE LangueConvention SET libelleLangueConvention = 'Allemand (stage étranger)' WHERE codeLangueConvention = 'al';
UPDATE LangueConvention SET libelleLangueConvention = 'Anglais (stage étranger)' WHERE codeLangueConvention = 'en';
UPDATE LangueConvention SET libelleLangueConvention = 'Espagnol (stage étranger)' WHERE codeLangueConvention = 'es';
UPDATE LangueConvention SET libelleLangueConvention = 'Francophone (stage étranger dans un pays francophone)' WHERE codeLangueConvention = 'fo';
UPDATE LangueConvention SET libelleLangueConvention = 'Français (stage en France)' WHERE codeLangueConvention = 'fr';


UPDATE PersonnelCentreGestion SET impressionConvention = true;

INSERT INTO DroitAdministration (idDroitAdministration,
                                 libelleDroitAdministration,
                                 temEnServDroitAdmin
) VALUES (
  4
  ,'ECRITURE SANS VALIDATION'
  ,'N'
);

ALTER TABLE Convention ADD volumeHoraireFormation VARCHAR(10) DEFAULT '0';
ALTER TABLE Convention ADD typePresence VARCHAR(30) NULL;

ALTER TABLE CentreGestion DROP COLUMN choixAnneeAvantDebutAnnee;
ALTER TABLE CentreGestion DROP COLUMN choixAnneeApresDebutAnnee;

ALTER TABLE CentreGestion ADD recupInscriptionAnterieure TINYINT(1) NULL DEFAULT 0;
ALTER TABLE CentreGestion ADD dureeRecupInscriptionAnterieure INT NULL DEFAULT 0;

UPDATE TypeConvention SET libelleTypeConvention = 'Formation Initiale - Stage Obligatoire' Where idTypeConvention = 1;
UPDATE TypeConvention SET codeCtrl = 'FI' Where idTypeConvention = 1;

UPDATE TypeConvention SET libelleTypeConvention = 'Formation Initiale - Stage Conseillé' Where idTypeConvention = 2;
UPDATE TypeConvention SET codeCtrl = 'FI' Where idTypeConvention = 2;

Insert Into TypeConvention (idTypeConvention, libelleTypeConvention, codeCtrl, temEnServTypeConvention, modifiable)
VALUES (3, 'Formation Continue', 'FC','O',false);

SET FOREIGN_KEY_CHECKS=0;

-- Recreation de l'index et la clé primaire sur la table Etape car il semblerait qu'il ne soit pas bon pour certaines universités
ALTER TABLE Etape DROP INDEX index_codeEtape_codeUniversite;

CREATE UNIQUE INDEX index_codeEtape_codeUniversite ON Etape (codeEtape ASC, codeVersionEtape ASC, codeUniversite ASC) ;

ALTER TABLE `Etape` DROP PRIMARY KEY, ADD PRIMARY KEY(
     `codeEtape`,
     `codeVersionEtape`,
     `codeUniversite`);

--Suppression des clés étrangères sur la caisse regime et l'assurance
ALTER TABLE Convention DROP FOREIGN KEY fk_Convention_Assurance1 ;
ALTER TABLE Convention DROP FOREIGN KEY fk_Convention_CaisseRegime1 ;
ALTER TABLE Convention DROP INDEX fk_Convention_Assurance1 ;
ALTER TABLE Convention DROP INDEX fk_Convention_CaisseRegime1 ;

SET FOREIGN_KEY_CHECKS=1;
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
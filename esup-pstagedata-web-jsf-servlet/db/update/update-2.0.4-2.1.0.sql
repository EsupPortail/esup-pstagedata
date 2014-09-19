-- Retrait de la table Version Etape et de ses dependences (pas ou mal utilisees) --
ALTER TABLE `Convention` DROP FOREIGN KEY `fk_Convention_VersionEtape1`;
ALTER TABLE `Convention` DROP COLUMN `codeVersionEtape`;
DROP TABLE `VersionEtape`;

-- Changement du motifAvenant en Text afin de ne plus avoir la limitation du VARCHAR(200) --
ALTER TABLE `Avenant` CHANGE `motifAvenant` `motifAvenant` TEXT NOT NULL;

-- Suppression du numero de securite sociale --
ALTER TABLE `Etudiant` DROP COLUMN `numSS`;

-- sujet du stage Avenant
ALTER TABLE `Avenant` CHANGE `sujetStage` `sujetStage` TEXT CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL;

ALTER TABLE `NatureTravail` CHANGE `libelleNatureTravail` `libelleNatureTravail` VARCHAR(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL;
ALTER TABLE `ModeValidationStage` CHANGE `libelleModeValidationStage` `libelleModeValidationStage` VARCHAR(150) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL;

--- libelle affectation peut etre null 
ALTER TABLE `Affectation` CHANGE `libelleAffectation` `libelleAffectation` VARCHAR( 150 ) CHARACTER SET utf8 COLLATE utf8_general_ci NULL;
/* Table Affectation */

--Ajout du code université
ALTER TABLE `Affectation` ADD `codeUniversite` VARCHAR( 50 ) NOT NULL DEFAULT ' ' AFTER `libelleAffectation` ;

/* >>>>>> Faire un insert à blanc pour toutes vos universités : <<<<<<
INSERT INTO `Affectation` (`codeAffectation` ,`libelleAffectation` ,`codeUniversite`)
VALUES ('', '', 'CODE_UNIVERSITE');
*/

--Ajout du code université à la clé primaire
ALTER TABLE `Affectation` DROP PRIMARY KEY ,
ADD PRIMARY KEY ( `codeAffectation` ( 10 ) , `codeUniversite` ( 50 ) ) ;

/* Table Ufr */

--Ajout du code université
ALTER TABLE `Ufr` ADD `codeUniversite` VARCHAR( 50 ) NOT NULL DEFAULT ' ' AFTER `libelleUFR` ;

--Ajout du code université à la clé primaire
ALTER TABLE `Ufr`
  DROP PRIMARY KEY,
   ADD PRIMARY KEY(
     `codeUFR`,
     `codeUniversite`);
   
--Ajout des codes/libellés avec un code universite déduit des centres de gestion
--(conservation en parallèle des précédents codes/libellés avec un code université à blanc) 
INSERT INTO Ufr (SELECT DISTINCT C.codeUfr, U.libelleUfr, CG.codeUniversite from CentreGestion CG 
INNER JOIN Convention C ON C.idCentreGestion = CG.idCentreGestion
INNER JOIN Ufr U ON U.codeUFR = C.codeUFR);

/* Table Etape */

--Ajout du code université
ALTER TABLE `Etape` ADD `codeUniversite` VARCHAR( 50 ) NOT NULL DEFAULT ' ' AFTER `libelleEtape` ;

--Ajout du code université à la clé primaire
ALTER TABLE `Etape`
  DROP PRIMARY KEY,
   ADD PRIMARY KEY(
     `codeEtape`,
     `codeUniversite`);
     
--Ajout des codes/libellés avec un code universite déduit des centres de gestion
--(conservation en parallèle des précédents codes/libellés avec un code université à blanc)  
INSERT INTO Etape (SELECT DISTINCT E.codeEtape, E.libelleEtape, CG.codeUniversite
FROM CentreGestion CG
INNER JOIN Convention C ON C.idCentreGestion = CG.idCentreGestion
INNER JOIN Etape E ON C.codeEtape = E.codeEtape);
     
/* Table Convention*/

--Ajout du code université UFR
ALTER TABLE `Convention` ADD `codeUniversiteUFR` VARCHAR( 50 ) NULL DEFAULT ' ' AFTER `codeUFR` ;

--Ajout du code université Etape
ALTER TABLE `Convention` ADD `codeUniversiteEtape` VARCHAR( 50 ) NULL DEFAULT ' ' AFTER `codeEtape` ;

--Suppression clé étrangère UFR
ALTER TABLE `Convention` DROP FOREIGN KEY `fk_Convention_Ufr1` ;

--Suppression clé étrangère Etape
ALTER TABLE `Convention` DROP FOREIGN KEY `fk_Convention_Etape1` ;

--Suppression index UFR
ALTER TABLE `Convention` DROP INDEX `fk_Convention_Ufr1` ;

--Suppression index Etape
ALTER TABLE `Convention` DROP INDEX `fk_Convention_Etape1` ;

--Ajout index couple codeEtape/codeUniversiteEtape
ALTER TABLE `Convention` ADD INDEX ( `codeEtape` , `codeVersionEtape` , `codeUniversiteEtape` ) ;

--Ajout index couple codeUFR/codeUniversiteUFR
ALTER TABLE `Convention` ADD INDEX ( `codeUFR` , `codeUniversiteUFR` ) ;

--Ajout clé étrangère codeEtape/codeUniversiteEtape
ALTER TABLE Convention
ADD CONSTRAINT `fk_Convention_Etape` FOREIGN KEY ( `codeEtape` , `codeUniversiteEtape` )
REFERENCES `Etape` ( `codeEtape`, `codeVersionEtape` , `codeUniversite` ) ON DELETE NO ACTION ON UPDATE NO ACTION;

--Ajout clé étrangère codeUFR/codeUniversiteUFR
ALTER TABLE Convention
ADD CONSTRAINT `fk_Convention_Ufr` FOREIGN KEY ( `codeUFR` , `codeUniversiteUFR` ) 
REFERENCES `Ufr` ( `codeUFR` , `codeUniversite` ) ON DELETE NO ACTION ON UPDATE NO ACTION;

--Mise à jour des champs codeUniversiteUFR de toutes les conventions
UPDATE Convention C SET C.codeUniversiteUFR = (SELECT DISTINCT CG.codeUniversite from CentreGestion CG 
WHERE C.idCentreGestion = CG.idCentreGestion);

--Mise à jour des champs codeUniversiteEtape de toutes les conventions
UPDATE Convention C SET C.codeUniversiteEtape = (SELECT DISTINCT CG.codeUniversite from CentreGestion CG 
WHERE C.idCentreGestion = CG.idCentreGestion);

/* Table PersonnelCentreGestion */

--Suppression clé étrangère Affectation
ALTER TABLE `PersonnelCentreGestion` DROP FOREIGN KEY `fk_PersonnelCentreGestion_Affectation1` ;

--Suppression index Affectation
ALTER TABLE `PersonnelCentreGestion` DROP INDEX `fk_PersonnelCentreGestion_Affectation1` ;

--Ajout codeUniversiteAffectation
ALTER TABLE `PersonnelCentreGestion` ADD `codeUniversiteAffectation` VARCHAR( 50 ) NULL DEFAULT ' ';

--Ajout index couple codeAffectation/codeUniversiteAffectation
ALTER TABLE `PersonnelCentreGestion` ADD INDEX ( `codeAffectation` , `codeUniversiteAffectation` ) ;

--Mise à jour du champ codeUniversiteAffectation de tous les personnels
UPDATE PersonnelCentreGestion P SET P.codeUniversiteAffectation = P.codeUniversite;

/* Enseignant */

--Suppression clé étrangère Affectation
ALTER TABLE `Enseignant` DROP FOREIGN KEY `fk_Enseignant_Affectation1` ;

--Suppression index Affectation
ALTER TABLE `Enseignant` DROP INDEX `fk_Enseignant_Affectation1` ;

--Ajout codeUniversiteAffectation
ALTER TABLE `Enseignant` ADD `codeUniversiteAffectation` VARCHAR( 50 ) NULL DEFAULT ' ';

--Ajout index couple codeAffectation/codeUniversiteAffectation
ALTER TABLE `Enseignant` ADD INDEX ( `codeAffectation` , `codeUniversiteAffectation` ) ;

--Mise à jour du champ codeUniversiteAffectation de tous les enseignants
UPDATE Enseignant E SET E.codeUniversiteAffectation = E.codeUniversite;

/* Table Affectation */

--Sauvegarde de la table Affectation
CREATE TABLE IF NOT EXISTS `Affectation_Sauv` (
  `codeAffectation` varchar(10) NOT NULL,
  `libelleAffectation` varchar(150) NOT NULL,
  PRIMARY KEY  (`codeAffectation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO Affectation_Sauv (SELECT DISTINCT A.codeAffectation, A.libelleAffectation from Affectation A);

--Ajout des codes/libellés avec un code universite déduit des personnels
--(conservation en parallèle des précédents codes/libellés avec un code université à blanc) 
INSERT INTO Affectation (SELECT DISTINCT P.codeAffectation, A.libelleAffectation, P.codeUniversiteAffectation
FROM PersonnelCentreGestion P
LEFT OUTER JOIN Affectation A ON A.codeAffectation = P.codeAffectation
WHERE P.codeAffectation != ' '
AND P.codeUniversiteAffectation != ' ');

/* Table Personnel */

--Ajout clé étrangère sur codeAffectation/codeUniversiteAffectation
ALTER TABLE PersonnelCentreGestion
ADD CONSTRAINT `fk_PersonnelCentreGestion_Affectation` FOREIGN KEY ( `codeAffectation` , `codeUniversiteAffectation` ) 
REFERENCES `Affectation` ( `codeAffectation` , `codeUniversite` ) ON DELETE NO ACTION ON UPDATE NO ACTION;

/* Table Enseignant */

--Ajout clé étrangère sur codeAffectation/codeUniversiteAffecation
ALTER TABLE Enseignant
ADD CONSTRAINT `fk_Enseignant_Affectation` FOREIGN KEY ( `codeAffectation` , `codeUniversiteAffectation` ) 
REFERENCES `Affectation` ( `codeAffectation` , `codeUniversite` ) ON DELETE NO ACTION ON UPDATE NO ACTION;

/* >>>>>> Si la contrainte ne peut être ajoutée, lancer : <<<<<<
SELECT DISTINCT E.codeAffectation, E.codeUniversiteAffectation FROM Enseignant E;
et ajouter manuellement les affectations manquantes dans la table Affectation
*/


ALTER TABLE `Etudiant` CHANGE `codeUniversite` `codeUniversite` VARCHAR( 50 ) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ;
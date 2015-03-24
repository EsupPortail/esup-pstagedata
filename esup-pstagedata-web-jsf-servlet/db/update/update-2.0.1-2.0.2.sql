
ALTER TABLE `TypeStructure` ADD `siretObligatoire` TINYINT(1) NOT NULL DEFAULT '1' AFTER `libelleTypeStructure` ;

-- Nouvelle table TicketStructure --
CREATE TABLE IF NOT EXISTS `TicketStructure` (
`ticket` VARCHAR( 50 ) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL ,
`idStructure` INT NOT NULL ,
UNIQUE (
`ticket`
)
) ENGINE = InnoDB;

-- Nouvelle table DureeDiffusion --
CREATE TABLE IF NOT EXISTS `DureeDiffusion` (
  `idDureeDiffusion` int(11) NOT NULL,
  `libelleDureeDiffusion` varchar(20) NOT NULL,
  `adminSeulement` tinyint(4) NOT NULL default '0',
  PRIMARY KEY  (`idDureeDiffusion`)
) ENGINE = InnoDB;


-- Data for table `DureeDiffusion`
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
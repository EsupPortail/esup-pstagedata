-- --------------------------------------------------------

-- 
-- Structure de la table `theme`
-- 

CREATE TABLE `theme` (
  `idTheme` int(11) NOT NULL auto_increment,
  `libelleTheme` varchar(50) NOT NULL,
  `temEnServTheme` varchar(1) default 'O',
  PRIMARY KEY  (`idTheme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=32 ;

-- 
-- Contenu de la table `theme`
-- 

INSERT INTO `theme` (`idTheme`, `libelleTheme`, `temEnServTheme`) VALUES 
(1, 'Administration publique', 'O'),
(2, 'Agro-alimentaire', 'O'),
(3, 'Archéosciences', 'O'),
(4, 'Biologie', 'O'),
(5, 'Carrières Sociales', 'O'),
(6, 'Chimie', 'O'),
(7, 'Commerce', 'O'),
(8, 'Droit', 'O'),
(9, 'Economie', 'O'),
(10, 'Electronique', 'O'),
(11, 'Enseignement-Formation', 'O'),
(12, 'Environnement', 'O'),
(13, 'Génie civil', 'O'),
(14, 'Gestion', 'O'),
(15, 'Information-Communication-Multimédia', 'O'),
(16, 'Informatique', 'O'),
(17, 'Ingénieur', 'O'),
(18, 'Logistique', 'O'),
(19, 'Mathématiques', 'O'),
(20, 'Matériaux', 'O'),
(21, 'Mécanique', 'O'),
(22, 'Médecine', 'O'),
(23, 'Odontologie', 'O'),
(24, 'Pharmacie', 'O'),
(25, 'Philosophie', 'O'),
(26, 'Physique', 'O'),
(27, 'Production et qualité', 'O'),
(28, 'Santé publique', 'O'),
(29, 'Sciences de la terre', 'O'),
(30, 'Science politique', 'O'),
(31, 'Statistiques', 'O');

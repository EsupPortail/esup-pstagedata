-- Ajout d'une ligne concernant la césure, dans la table TypeConvention
-- A faire uniquement si vous n'avez pas déjà une ligne pour la césure 
INSERT INTO `TypeConvention` (`idTypeConvention`, `libelleTypeConvention`, `codeCtrl`, `temEnServTypeConvention`, `modifiable`) VALUES (4, 'Formation Initiale - Stage dans le cadre d\'une césure', 'CS', 'O', false);

-- si vous aviez déjà une ligne pour la césure, il faut impérativement mettre à jour son champ codeCtrl pour mettre la valeur "CS"
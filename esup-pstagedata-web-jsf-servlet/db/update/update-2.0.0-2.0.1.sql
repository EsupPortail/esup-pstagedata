-- telephone enseignant (augmentation de la taille de 20 a 30 caracteres)
ALTER TABLE `Enseignant` CHANGE `telephone` `telephone` VARCHAR( 30 ) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ;

-- ajout du champs nomReel a la table Fichiers
ALTER TABLE `Fichiers` ADD `nomReel` VARCHAR( 255 ) NULL ;
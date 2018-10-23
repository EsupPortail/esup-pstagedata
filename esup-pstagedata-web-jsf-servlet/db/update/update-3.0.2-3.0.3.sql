-- Modification du type du champs titreAvenant (mis en TEXT), au cas ou ce n'était pas déjà fait
ALTER TABLE Avenant CHANGE titreAvenant titreAvenant TEXT NULL;

-- Désactivation du choix "fo" dans LangueConvention 
UPDATE LangueConvention SET temEnServLangue = 'N' where codeLangueConvention='fo';

-- Désactivation de l'unité de gratification "Brut"
UPDATE UniteGratification SET temEnServGrat = 'N' WHERE idUniteGratification=2;
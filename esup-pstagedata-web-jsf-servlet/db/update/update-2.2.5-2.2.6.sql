
-- Augmentation de la taille du champs campus qui peut etre plus grand que 50 caractere dans certains cas
ALTER TABLE Enseignant CHANGE campus campus VARCHAR(250) NULL;

-- Passage du codeCommune de la table offre en varchar pour prendre en compte les codes de la corse
ALTER TABLE Offre CHANGE codeCommune codeCommune VARCHAR(10) NULL;

-- Passage du codeCommune de la table Service en varchar pour prendre en compte les codes de la corse
ALTER TABLE Service CHANGE codeCommune codeCommune VARCHAR(10) NULL;

-- Recreation de l'index sur la table Etape car il semblerait qu'il ne soit pas bon pour certaines universités et entraine des erreurs lors de la creation de convention
ALTER TABLE Etape DROP INDEX index_codeEtape_codeUniversite;

CREATE UNIQUE INDEX index_codeEtape_codeUniversite ON Etape (codeEtape ASC, codeVersionEtape ASC, codeUniversite ASC) ;

INSERT INTO LangueConvention (
   codeLangueConvention
  ,libelleLangueConvention
  ,temEnServLangue
) VALUES (
   'it'  -- codeLangueConvention
  ,'Italien (Convention, stage étranger)'  -- libelleLangueConvention
  ,'O'  -- temEnServLangue
);
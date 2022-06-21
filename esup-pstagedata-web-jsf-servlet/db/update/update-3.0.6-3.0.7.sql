-- Augmentation de la taille max du champ "libelleCPAM" pour pouvoir y stocker le libellé de la CPAM de rattachement  
-- ainsi que son adresse postale
ALTER TABLE Convention CHANGE libelleCPAM libelleCPAM VARCHAR(250) NULL;

-- Augmentation de la taille max des champs contenant des adresses mail  
ALTER TABLE CentreGestion CHANGE mail mail VARCHAR(100) NULL;
ALTER TABLE PersonnelCentreGestion CHANGE mail mail VARCHAR(100) NULL;
ALTER TABLE Enseignant CHANGE mail mail VARCHAR(100) NULL;
ALTER TABLE Contact CHANGE mail mail VARCHAR(100) NULL;
ALTER TABLE Structure CHANGE mail mail VARCHAR(100) NULL;
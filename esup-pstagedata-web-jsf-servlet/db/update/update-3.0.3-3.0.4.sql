-- Augmentation (à 15 caracteres max) du champ "montantGratification"
ALTER TABLE Convention CHANGE montantGratification montantGratification VARCHAR(15) NULL;
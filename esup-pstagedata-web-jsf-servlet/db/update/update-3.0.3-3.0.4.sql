-- Augmentation (à 15 caracteres max) du champ "montantGratification"
ALTER TABLE Convention CHANGE montantGratification montantGratification VARCHAR(15) NULL;

-- Mise en service du droit "ECRITURE SANS VALIDATION"
UPDATE DroitAdministration SET temEnServDroitAdmin = 'O' WHERE idDroitAdministration=4;

ALTER TABLE Structure CHANGE estValidee estValidee INT NOT NULL DEFAULT 0;

UPDATE UniteDuree SET temEnServUniteDuree='N' WHERE idUniteDuree=2 OR idUniteDuree=3 OR idUniteDuree=5;
UPDATE UniteDuree SET libelleUniteDuree='heure' WHERE idUniteDuree=1;

ALTER TABLE Convention ADD idUniteDureeGratification INT NULL DEFAULT 4;

ALTER TABLE Convention ADD monnaieGratification VARCHAR(50) NULL DEFAULT 'euros';

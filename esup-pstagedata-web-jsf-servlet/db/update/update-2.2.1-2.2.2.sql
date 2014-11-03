
ALTER TABLE Convention ADD nbConges TEXT NULL;
ALTER TABLE Convention ADD competences TEXT NULL;
ALTER TABLE CentreGestion ADD qualiteViseur VARCHAR(100) NULL after prenomViseur;

ALTER TABLE Structure CHANGE estValidee estValidee INT NOT NULL DEFAULT 0;

ALTER TABLE Avenant ADD dateRupture DATE NULL;

ALTER TABLE Avenant ADD commentaireRupture TEXT NULL;

ALTER TABLE Structure ADD temEnServStructure VARCHAR(1) DEFAULT 'O';

ALTER TABLE Convention CHANGE nbJoursHebdo nbJoursHebdo ENUM('0.5','1','1.5','2','2.5','3','3.5','4','4.5','5','5.5','6') NOT NULL DEFAULT '5';
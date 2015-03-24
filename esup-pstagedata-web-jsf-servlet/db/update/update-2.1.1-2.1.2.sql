-- Changement du code commune de INT a VARCHAR afin de ne pas perdre le 0 lorsque c'est le premier chiffre du codeCommune --
ALTER TABLE Structure CHANGE codeCommune codeCommune VARCHAR(10) NULL;
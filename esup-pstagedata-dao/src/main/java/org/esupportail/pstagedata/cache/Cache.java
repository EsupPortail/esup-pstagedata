package org.esupportail.pstagedata.cache;

/**
 * Created by Ostrowski on 02/05/2016.
 */
public enum Cache {
    ALL(),
    MODE_VALIDATION_STAGE("ModeValidationStage.cacheModeValidationStage"),
    CENTRE_GESTION("CentreGestion.cacheCentreGestion"),
    ORIGINE_STAGE("OrigineStage.cacheOrigineStage"),
    NIVEAU_CENTRE("NiveauCentre.cacheNiveauCentre"),
    CONVENTION("Convention.cacheConvention"),
    EFFECTIF("Effectif.cacheEffectif"),
    CONTRAT_OFFRE("ContratOffre.cacheContratOffre"),
    TYPE_CONVENTION("TypeConvention.cacheTypeConvention"),
    STATUT_JURIDIQUE("StatutJuridique.cacheStatutJuridique"),
    OFFRE("Offre.cacheOffre"),
    OFFRE_DIFFUSION("OffreDiffusion.cacheOffreDiffusion"),
    CAISSE_REGIME("CaisseRegime.cacheCaisseRegime"),
    TEMPS_TRAVAIL("TempsTravail.cacheTempsTravail"),
    PAYS("Pays.cachePays"),
    UFR("Ufr.cacheUfr"),
    SERVICE("Service.cacheService"),
    TICKET_STRUCTURE("TicketStructure.cacheTicketStructure"),
    OFFRE_MODE_CANDIDATURE("OffreModeCandidature.cacheOffreModeCandidature"),
    QUESTION_SUPPLEMENTAIRE("QuestionSupplementaire.cacheQuestionSupplementaire"),
    LANGUE_CONVENTION("LangueConvention.cacheLangueConvention"),
    REPONSE_EVALUATION("ReponseEvaluation.cacheReponseEvaluation"),
    ETUDIANT("Etudiant.cacheEtudiant"),
    REPONSE_SUPPLEMENTAIRE("ReponseSupplementaire.cacheReponseSupplementaire"),
    TYPE_STRUCTURE("TypeStructure.cacheTypeStructure"),
    STRUCTURE("Structure.cacheStructure"),
    AVENANT("Avenant.cacheAvenant"),
    CENTRE_GESTION_SUPERVISEUR("CentreGestionSuperviseur.cacheCentreGestionSuperviseur"),
    CONVENTION_STATISTIC_ITEM("StatisticItem.cacheStatisticItem"),
    CRITERE_GESTION("CritereGestion.cacheCritereGestion"),
    ETAPE("Etape.cacheEtape"),
    FICHE_EVALUATION("FicheEvaluation.cacheFicheEvaluation"),
    CONTACT("Contact.cacheContact"),
    STATISTIC_ITEM("StatisticItem.cacheStatisticItem"),
    ENSEIGNANT("Enseignant.cacheEnseignant"),
    NAF_N1("NAF_N1.cacheNafN1"),
    AFFECTATION("Affectation.cacheAffectation"),
    PERSONNEL_CENTRE_GESTION("PersonnelCentreGestion.cachePersonnelCentreGestion"),
    TYPE_OFFRE("TypeOffre.cacheTypeOffre"),
    FICHIERS("Fichiers.cacheFichiers"),
    CONFIDENTIALITE("Confidentialite.cacheConfidentialite"),
    ACCORD_PARTENARIAT("AccordPartenariat.cacheAccordPartenariat"),
    ADMIN_STRUCTURE("AdminStructure.cacheAdminStructure"),
    NIVEAU_FORMATION("NiveauFormation.cacheNiveauFormation");

    private String cacheName;

    Cache(String cacheName) {
        this.cacheName = cacheName;
    }

    Cache() {

    }

    @Override
    public String toString() {
        return cacheName;
    }
}

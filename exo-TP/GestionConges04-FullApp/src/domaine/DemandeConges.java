package domaine;

import java.io.Serializable;

/**
 * Classe DemandeConges.
 * @author <a href="www.ib-formation.fr">IB</a>
 */
public class DemandeConges implements Serializable{


    /**
     * La date de début du congé.
     */
    private String dateDebut;

    /**
     * La date de la demande de congé.
     */
    private String dateDemande;

    /**
     * La date de fin du congé.
     */
    private String dateFin;

    /**
     * L'état de validation du congé.
     */
    private String etatValidation;
    
    //l'employe qui a demande le conge
    
    private Employe emp=null;
    
	/**
     * Constante pour représenté l'état ACCORDE d'une demande de congés.
     * Un manager a donc <i><b>accepté</b></i> la demande
     * pour qu'elle soit dans cet état.
     */
    public static final String ACCORDE = "valide";

    /**
     * Constante pour représenté l'état REFUS d'une demande de congés.
     * Un manager a donc <i><b>refusé</b></i> la demande
     * pour qu'elle soit dans cet état.
     */
    public static final String REFUS = "refus";

    /**
      Constante pour représenté l'état REFUS d'une demande de congés.
     * La demande n'a pas encore été approuvé ni acceptée,
     * elle est donc en <i><b>attente</b></i> de traitement.
     */
    public static final String ATTENTE = "en attente";

    /**
     * Constructeur d'une demande de congés.
     * @param pDateDebut la date de début du congé
     * @param pDateFin la date de fin du congé
     * @param pEtatValidation l'état de la demande
     */
    public DemandeConges(final String pDateDebut, final String pDateFin
            , final String pEtatValidation) {
        this.dateDebut = pDateDebut;
        this.dateFin = pDateFin;
        this.etatValidation = pEtatValidation;
    }

    public DemandeConges(final String pDateDebut, final String pDateFin
            , final String pEtatValidation, Employe emp) {
        this.dateDebut = pDateDebut;
        this.dateFin = pDateFin;
        this.etatValidation = pEtatValidation;
        this.emp=emp;
    }
    /**
     * Constructeur d'une demande de congés qui par défaut est en attente.
     * @param pDateDebut la date de début du congé
     * @param pDateFin la date de fin du congé
     */
    public DemandeConges(final String pDateDebut, final String pDateFin) {
        this.dateDebut = pDateDebut;
        this.dateFin = pDateFin;
        this.etatValidation = ATTENTE;
    }

   //getter sur l'employe qui a demande le conge
    public Employe getEmp() {
		return emp;
	}
    //setter sur l'employe qui a demande le conge
	public void setEmp(Employe emp) {
		this.emp = emp;
	}
    
    /**
     * Accesseur en lecture sur la date de début du congé.
     * @return la date de début du congé
     */
    public String getDateDebut() {
        return dateDebut;
    }
    /**
     * Accesseur en lecture sur la date de la demande de congé.
     * @return la date de la demande de congé
     */
    public String getDateDemande() {
        return dateDemande;
    }
    /**
     * Accesseur en lecture sur la date de fin du congé.
     * @return la date de fin du congé
     */
    public String getDateFin() {
        return dateFin;
    }
    /**
     * Accesseur en lecture sur l'état de validation de la demande.
     * @return l'état de validation de la demande
     */
    public String getEtatValidation() {
        return etatValidation;
    }
    /**
     * Accesseur en écriture sur la date de début du congé.
     * @param pDateDebut la date de début du congé
     */
    public void setDateDebut(final String pDateDebut) {
        this.dateDebut = pDateDebut;
    }
    /**
     * Accesseur en écriture sur la date de la demande de congé.
     * @param pDateDemande la date de la demande de congé
     */
    public void setDateDemande(final String pDateDemande) {
        this.dateDemande = pDateDemande;
    }
    /**
     * Accesseur en lecture sur la date de début du congé.
     * @param pDateFin la date de fin du congé
     */
    public void setDateFin(final String pDateFin) {
        this.dateFin = pDateFin;
    }
    /**
     * Accesseur en lecture sur l'état de validation de la demande de congé.
     * @param pEtatValidation l'état de validation de la demande de congés
     */
    public void setEtatValidation(final String pEtatValidation) {
        this.etatValidation = pEtatValidation;
    }

}

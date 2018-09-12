package domaine;

import java.io.Serializable;

/**
 * Classe DemandeConges.
 * @author <a href="www.ib-formation.fr">IB</a>
 */
public class DemandeConges implements Serializable{


    /**
     * La date de d�but du cong�.
     */
    private String dateDebut;

    /**
     * La date de la demande de cong�.
     */
    private String dateDemande;

    /**
     * La date de fin du cong�.
     */
    private String dateFin;

    /**
     * L'�tat de validation du cong�.
     */
    private String etatValidation;
    
    //l'employe qui a demande le conge
    
    private Employe emp=null;
    
	/**
     * Constante pour repr�sent� l'�tat ACCORDE d'une demande de cong�s.
     * Un manager a donc <i><b>accept�</b></i> la demande
     * pour qu'elle soit dans cet �tat.
     */
    public static final String ACCORDE = "valide";

    /**
     * Constante pour repr�sent� l'�tat REFUS d'une demande de cong�s.
     * Un manager a donc <i><b>refus�</b></i> la demande
     * pour qu'elle soit dans cet �tat.
     */
    public static final String REFUS = "refus";

    /**
      Constante pour repr�sent� l'�tat REFUS d'une demande de cong�s.
     * La demande n'a pas encore �t� approuv� ni accept�e,
     * elle est donc en <i><b>attente</b></i> de traitement.
     */
    public static final String ATTENTE = "en attente";

    /**
     * Constructeur d'une demande de cong�s.
     * @param pDateDebut la date de d�but du cong�
     * @param pDateFin la date de fin du cong�
     * @param pEtatValidation l'�tat de la demande
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
     * Constructeur d'une demande de cong�s qui par d�faut est en attente.
     * @param pDateDebut la date de d�but du cong�
     * @param pDateFin la date de fin du cong�
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
     * Accesseur en lecture sur la date de d�but du cong�.
     * @return la date de d�but du cong�
     */
    public String getDateDebut() {
        return dateDebut;
    }
    /**
     * Accesseur en lecture sur la date de la demande de cong�.
     * @return la date de la demande de cong�
     */
    public String getDateDemande() {
        return dateDemande;
    }
    /**
     * Accesseur en lecture sur la date de fin du cong�.
     * @return la date de fin du cong�
     */
    public String getDateFin() {
        return dateFin;
    }
    /**
     * Accesseur en lecture sur l'�tat de validation de la demande.
     * @return l'�tat de validation de la demande
     */
    public String getEtatValidation() {
        return etatValidation;
    }
    /**
     * Accesseur en �criture sur la date de d�but du cong�.
     * @param pDateDebut la date de d�but du cong�
     */
    public void setDateDebut(final String pDateDebut) {
        this.dateDebut = pDateDebut;
    }
    /**
     * Accesseur en �criture sur la date de la demande de cong�.
     * @param pDateDemande la date de la demande de cong�
     */
    public void setDateDemande(final String pDateDemande) {
        this.dateDemande = pDateDemande;
    }
    /**
     * Accesseur en lecture sur la date de d�but du cong�.
     * @param pDateFin la date de fin du cong�
     */
    public void setDateFin(final String pDateFin) {
        this.dateFin = pDateFin;
    }
    /**
     * Accesseur en lecture sur l'�tat de validation de la demande de cong�.
     * @param pEtatValidation l'�tat de validation de la demande de cong�s
     */
    public void setEtatValidation(final String pEtatValidation) {
        this.etatValidation = pEtatValidation;
    }

}

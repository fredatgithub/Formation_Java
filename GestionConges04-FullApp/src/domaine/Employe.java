package domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Classe Employe.
 * @author <a href="www.ib-formation.fr">IB</a>
 */
public class Employe implements IPersonnel, Serializable  {
    /**
     * L'id de l'employé.
     */
    private int id;
    /**
     * Le nom de l'employé.
     */
    private String nom;
    /**
     * Le prénom de l'employé.
     */
    private String prenom;
    /**
     * Manager de l'employé.
     */
	private Manager manager=null;
	
 
    //Liste des demandes de conges de l'employe
    private Collection<DemandeConges> demConges= new ArrayList<DemandeConges>();
   
    //getter pour avoir le manager de l'employe
    public Manager getManager() {
		return manager;
	}
    //fixer le manager de l'employe
	public void setManager(Manager manager) {
		this.manager = manager;
	}


    
    //getter sur la collection de demande de conge
    public Collection<DemandeConges> getDemConges() {
		return demConges;
	}

    //setter sur la collection de demande de conge
	public void setDemConges(Collection<DemandeConges> demConges) {
		this.demConges = demConges;
	}
	//ajouter une demande a la liste
	public void ajouterDemConge(DemandeConges dem){
		this.demConges.add(dem);
	}
	/**
     * Constructeur d'Employe.
     * @param pNom le nom de l'employé
     * @param pPrenom le prénom de l'employé
     * @param pId l'id de l'employé
     */
    public Employe(final String pNom, final String pPrenom, final int pId) {
        nom = pNom;
        prenom = pPrenom;
        id = pId;
    }

    /**
    * Constructeur d'Employe avec pour valeur d'id par défaut:0.
    * @param pNom le nom de l'employé
    * @param pPrenom le prénom de l'employé
    */
   public Employe(final String pNom, final String pPrenom) {
       this(pNom, pPrenom, 0);
   }

   /**
    * Constructeur d'Employe.
    * Avec pour valeurs par défaut:
    * <li>id:0</li>
    * <li>prenom:"richard"</li>
    * @param pNom le nom de l'employé
    */
   public Employe(final String pNom) {
       this(pNom, "richard", 0);
   }

   /**
    * Constructeur d'Employe.
    * Avec pour valeurs par défaut:
    * <li>id:0</li>
    * <li>prenom:"richard"</li>
    * <li>prenom:"Durant"</li>
    */
   public Employe() {
       this("Durant", "richard", 0);
   }
    /**
     * Accesseur en lecture sur l'ID.
     * @return l'id de l'employé
     */
    public final int getId() {
        return id;
    }
    /**
     * Accesseur en écriture sur l'ID.
     * @param pId Le nouvel ID de l'employé
     */
    public final void setId(final int pId) {
        this.id = pId;
    }
    /**
     * Accesseur en lecture sur l'ID.
     * @return l'id de l'employé
     */
    public final String getNom() {
        return nom;
    }
    /**
     * Accesseur en écriture sur le nom.
     * @param pNom Le nouveau nom de l'employé
     */
    public final void setNom(final String pNom) {
        this.nom = pNom;
    }
    /**
     * Accesseur en lecture sur l'ID.
     * @return l'id de l'employé
     */
    public final String getPrenom() {
        return prenom;
    }
    /**
     * Accesseur en écriture sur le prénom.
     * @param pPrenom Le nouveau prénom de l'employé
     */
    public void setPrenom(final String pPrenom) {
        this.prenom = pPrenom;
    }

    /**
     * Poser un congé.
     * @param dateDebut la date de début du congé
     * @param dateFin la date de fin du congé
     */
  
    
    
    public void poserConge(final String dateDebut, final String dateFin) {
       System.out.println("L'employe " + prenom + " " + nom
                 + " pose un conge du " + dateDebut + " au " + dateFin);
       
       //Creation d'une demande de conge
       DemandeConges dem= new DemandeConges(dateDebut, dateFin, "en attente", this);
       //ajout de la demande à la collection des demandes de conges de l'employe
       this.demConges.add(dem);
       if (this.manager!=null){
    	   this.manager.validerConge(dem);
       }
    }

  
    
    
    /**
     * Renvoi l'employé sous forme d'une String.
     * @return String : la chaîne de caractères qui représente l'employé
     */
    public String toString() {
       return "Employé: " + this.id + " , " + this.prenom + " , " + this.nom;
    }

    /**
     * Consulter les congés d'un membre du personnel.
     * @return Collection la collection contenant les demandes de congés
     */
    public Collection<DemandeConges> consulterConges() {
        System.out.println("Consultation des congés de "
                + this.getPrenom() + " " + this.getNom());
       //Creation d'un iterateur sur la collecion des demandes de conges
        Iterator<DemandeConges> it=this.demConges.iterator();
        while (it.hasNext()){
        	DemandeConges dem=it.next();
        	System.out.println(dem.getDateDebut() + " " + dem.getDateFin()+ " " + dem.getEtatValidation());
        }
        return getDemConges();
    }
}

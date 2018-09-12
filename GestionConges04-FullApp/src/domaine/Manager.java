package domaine;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe Manager.
 * @author <a href="www.ib-formation.fr">IB</a>
 */
public class Manager extends Employe  {

  
	//Liste des employe pour lesquels il est manager
	private Collection <Employe> listeEmp=new ArrayList<Employe>();
	
	/**
     * Manager.
     * @param pNom le nom du manager
     * @param pPrenom le prénom du manager
     * @param pId l'id du manager
     */
	
    public Manager(final String pNom, final String pPrenom, final int pId) {
        super(pNom, pPrenom, pId);
    }

    /**
     * Constructeur de Manager avec pour valeur d'id par défaut:0.
     * @param pNom le nom du manager
     * @param pPrenom le prénom du manager
     */
    public Manager(final String pNom, final String pPrenom) {
        this(pNom, pPrenom, 0);
    }

    /**
     * Constructeur de Manager.
     * Avec pour valeurs par défaut:
     * <li>id:0</li>
     * <li>prenom:"richard"</li>
     * <li>nom:"Durant"</li>
     */
    public Manager() {
        this("Durant", "richard", 0);
    }

    /**
     * Constructeur de Manager.
     * Avec pour valeurs par défaut:
     * <li>id:0</li>
     * <li>prenom:"richard"</li>
     * @param pNom le nom du manager
     */
    public Manager(final String pNom) {
        this(pNom, "richard", 0);
    }

    public Collection<Employe> getListeEmp() {
		return listeEmp;
	}

	public void setListeEmp(Collection<Employe> listeEmp) {
		this.listeEmp = listeEmp;
	}

	// Rajouter un employe a la liste des employes qui sont sous la direction de ce manager
	public void ajouterEmploye(Employe emp){
		listeEmp.add(emp);
	}
    
    
    
    /**
     * Valide les congés.
     */
    public void validerConge() {
        System.out.println("Le manager " + this.getPrenom() + " "
                + this.getNom() + " valide des conges.");
    }

    //surcharge, version qui prend en compte les details de la demande de conge
    public void validerConge(DemandeConges demC) {
        System.out.print("Le manager " + this.getPrenom() + " "
                + this.getNom());
        if (demC.getDateDebut().equals("24/12/2009")){
        	System.out.println(" Ne valide pas le conge de l'employe: "+ 
        			demC.getEmp().getPrenom() + " "+ demC.getEmp().getNom()+ "!!" );
        	demC.setEtatValidation("Refuse");
        }
        else{
        	System.out.println(" valide le conge de: "+demC.getEmp().getPrenom() 
        			+ " "+ demC.getEmp().getNom()+":-)" );
        	demC.setEtatValidation("Accorde");
        }
        }
    
    /**
     * Poser un congé automatiquement validé.
     * @param dateDebut la date de début du congé
     * @param dateFin la date de fin du congé
     */
    public void poserConge(final String dateDebut, final String dateFin) {
       super.poserConge(dateDebut, dateFin);
       System.out.println("Le congé est automatiquement validé");
    }

    /**
     * Renvoi le manager sous forme d'une String.
     * @return String : la chaîne de caractères qui représente le manager
     */
    public String toString() {
       return "Manager: " + super.getId() + " , "
               + super.getPrenom() + " , " + super.getNom();
    }
}

package domaine;

import java.util.Collection;
import java.util.HashSet;

//import java.util.Collection;

public class Employe implements IPersonnel {
	private int id;
	private String nom ;
	private String prenom ;
	//private Integer age = new Integer(10);
	private HashSet<DemandeConges> demandeConges = new HashSet<DemandeConges>();
	private Manager manager = null;
	public int numberOfVacations = 0;
	public final int numberOfVacationsMax = 3;
	
	public Employe(String prenom, String nom, int id){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		//this.age = 18;
		//demandeConges = new HashSet<>();
		numberOfVacations = 0;
	}
	
	public Employe(){
		numberOfVacations = 0;
	}
	
	//getter pour avoir le manager de l'employe
    public Manager getManager() {
		return manager;
	}
    //fixer le manager de l'employe
	public void setManager(Manager manager) {
		this.manager = manager;
	}
    
    //getter sur la collection de demande de conge
    public HashSet<DemandeConges> getDemConges() {
		return demandeConges;
	}

    //setter sur la collection de demande de conge
	public void setDemConges(HashSet<DemandeConges> uneDemandeDeConges) {
		this.demandeConges = uneDemandeDeConges;
	}
	//ajouter une demande � la liste
	public void ajouterDemConge(DemandeConges uneDemande){
		this.demandeConges.add(uneDemande);
	}

	public void poserConge(String dateDebut, String dateFin){
		if (this.numberOfVacations > this.numberOfVacationsMax) {
			System.out.println("Monsieur " + prenom + " " + nom + " a essay� de poser un conge du " + dateDebut + " au " + dateFin 
					+ " mais cela est refus� car vous n'avez le droit qu'� " + this.numberOfVacationsMax + " jours maximum");
		} else {
			System.out.println("Monsieur " + prenom + " " + nom + " pose un conge du " + dateDebut + " au " + dateFin);
			this.numberOfVacations++;
		}
	}
	
	public int getId(){
		return this.id;
	}
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public String getNom(){
		return this.nom;
	}
	
	public String getPrenom(){
		return this.prenom;
	}
	
	public void setId(int pid){
		this.id = pid;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}

	@Override
	public void consulterConges() { // will return Collection
		System.out.println("Consultation des cong�s de " + prenom + " " + nom);
		//return null;
	}
}
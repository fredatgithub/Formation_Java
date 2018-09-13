package domaine.copy;

import java.util.HashSet;
//import java.util.Collection;

public class Employe implements IPersonnel {
	private int id;
	private String nom ;
	private String prenom ;
	//private Integer age = new Integer(10);
	private HashSet<String> demandeConges;
	
	public Employe(String prenom, String nom, int id){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		//this.age = 18;
		demandeConges = new HashSet<String>();
	}
	
	public Employe(){
		
	}

	public void poserConge(String dateDebut, String dateFin){
		System.out.println("Monsieur " + prenom + " " + nom + " pose un conge du " + dateDebut + " au " + dateFin);
		demandeConges.add("Demande de congé du " + dateDebut + " au " + dateFin);
	}
	
	public int getId(){
		return this.id;
	}
	
	@Override
	public String toString() {
		//return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
		return "Employe : " + prenom + " " + nom;
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
	public HashSet<String> consulterConges() { // should return Collection
		System.out.println("Consultation des congés de " + prenom + " " + nom);
		return this.demandeConges;
	}
}
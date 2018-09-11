package domaine;

public class Manager {
	private int id;
	private String nom ;
	private String prenom ;
	
	public Manager(int id, String nom, String prenom){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	public void poserConge(String dateDebut, String dateFin){
		System.out.println("Monsieur " + prenom + " " + nom + " pose un conge du " + dateDebut + " au " + dateFin);
	}
	
	public void validerConge(){
		
	}
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	public int getId(){
		return this.id;
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

}

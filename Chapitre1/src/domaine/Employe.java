package domaine;

public class Employe {
	private int id;
	private String nom ;
	private String prenom ;
	private Integer age = new Integer(10);
	
	public Employe(int id, String nom, String prenom){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = 18;
	}

	public void poserConge(String dateDebut, String dateFin){
		System.out.println("Monsieur " + prenom + " " + nom + " pose un conge du " + dateDebut + " au " + dateFin);
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
	
	
}

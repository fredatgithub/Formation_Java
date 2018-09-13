package domaine;

public class Manager extends Employe{
	private int id;
	private String nom ;
	private String prenom ;
	
	public Manager(int id, String nom, String prenom){
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Manager(String pPrenom , String pNom, int pId){
		super(pPrenom, pNom, pId);
	}
	
	public Manager(String pNom, String pPrenom){
		super(pPrenom, pNom, 0);
	}
	
	public Manager(String pNom){
		this("Richard", pNom, 0);
	}
	
	public Manager(){
		this("Richard", "Durand", 0);
	}
	
	public void poserConge(String dateDebut, String dateFin){
		
		super.poserConge(dateDebut, dateFin);
		System.out.println("Etant manager, il valide ses propres congés");
	}
		
	public void validerConge(){
		if (super.numberOfVacations > super.numberOfVacationsMax) {
			System.out.println("Congé refusé car trop en vacances, il faut bosser un peu");
		}
		else {
			super.numberOfVacations++;
		}
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
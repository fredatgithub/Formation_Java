package domaine;

public class DemandeConges {
	private String dateDebut;
	private String dateDemande;
	private String dateFin;
	private String etatValidation;
	
	public DemandeConges(String dateDebut, String dateFin, String etatValidation) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.etatValidation = etatValidation;
	}
	
	public String getDateDebut(){
		return this.dateDebut;
	}
	
	public String getDateDemande(){
		return this.dateDemande;
	}
	
	public String getDateFin(){
		return this.dateFin;
	}
	
	public String getEtatValidation(){
		return this.etatValidation;
	}
	
	public void setDateDebut(String dateDebut){
		this.dateDebut = dateDebut;
	}
	
	public void setDateDemande(String dateDemande){
		this.dateDemande = dateDemande;
	}
	
	public void setDateFin(String dateFin){
		this.dateFin = dateFin;
	}
	
	public void setEtatValidation(String etatValidation){
		this.etatValidation = etatValidation;
	}

}

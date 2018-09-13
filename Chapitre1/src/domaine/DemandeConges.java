package domaine;

public class DemandeConges {
	private String dateDebut;
	private String dateDemande;
	private String dateFin;
	private String etatValidation;
	public final static String REFUS = "refus";
	public final static String ACCORDE = "validé";
	public final static String ATTENTE = "en attente";
	
	public DemandeConges(String pDateDebut, String pDateFin, String etatValidation) {
		this.dateDebut = pDateDebut;
		this.dateFin = pDateFin;
		this.etatValidation = etatValidation;
	}
	
	public DemandeConges(String pDateDebut, String pDateFin) {
		this(pDateDebut, pDateFin, DemandeConges.ATTENTE);
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
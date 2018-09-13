package entites;

public class Contact {
  
    private int id;
  
    private String nom;
  
    private String prenom;
    
    private String email;

  
      
    public Contact(int id, String nom, String prenom, String email) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
    
    public Contact(){
    	this.id = (int) Math.random();
		this.nom = "Blanc";
		this.prenom = "Xavier";
		this.email = "Blanc.Xav@mail.com";
    }


	public final int getId() {
        return id;
    }

    
    public final void setId(final int pId) {
        this.id = pId;
    }

   
    public final String getNom() {
        return nom;
    }

   
    public final void setNom(final String pNom) {
        this.nom = pNom;
    }

 
    public final String getPrenom() {
        return prenom;
    }

   
    public void setPrenom(final String pPrenom) {
        this.prenom = pPrenom;
    }


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	}
  
	
    
}

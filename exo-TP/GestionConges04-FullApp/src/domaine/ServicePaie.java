package domaine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;

import lanceur.SerializationClass;

/**
 * Service de la Paie.
 * @author Administrateur
 */
public class ServicePaie {
		//Declaration du file writer
		FileWriter flux=null;
    /**
     * Liste les congés d'un membre du personnel.
     * @param personnel le membre du personnel dont on veut lister les congés.
     */
    public void listerCongePersonnel(final IPersonnel personnel) {
        personnel.consulterConges();
    }
    public void exporterConges(IPersonnel emp){
     Collection<DemandeConges> demConges=emp.consulterConges();
     
     File fichier=new File("exporterConges.txt");
     
     //ouverture d'un flux de donnes vers le fichier
     try {
		flux=new FileWriter(fichier, false);
		
	
		 Iterator<DemandeConges> it=demConges.iterator();
	        while (it.hasNext()){
	        	DemandeConges dem=it.next();
	        	flux.write(dem.getDateDebut() + " " + dem.getDateFin()+ " " + dem.getEtatValidation()+"\n");
	        }
		
		flux.flush();
		
		flux.close();
		
	} catch (IOException e) {
		System.out.println("Erreur lors de l'ecriture dans le fichier");
		e.printStackTrace();
	} finally {
		try {
			flux.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}	
	}    
    
    }
    //methode pour lire à partir d'un fichier
    public void importerDemConges(){
    	String ligne;
    	Reader r;
		try {
			r = new FileReader("exporterConges.txt");
	
			BufferedReader br = new BufferedReader(r);
    
			while ( (ligne = br.readLine()) != null)

			System.out.println("**** "+ligne);
			r.close(); 
		}
    	catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }
    //methode pour serialiser l'objet dans un fichier
    public void exporterCongesSerializable(IPersonnel emp){
    	  SerializationClass serClass=new SerializationClass("etat.bin");
          try {
  			
          	//sauvegarder l'état de l'objet dans un fichier 
          	serClass.sendData(emp);
  			
          	//récupérer l'état de l'objet à partir du fichier contenant son état
  			Employe eps= (Employe)serClass.getData();
  			
  			System.out.println(" ***** le manager de l employe est Mr. " + eps.getManager().getNom()+" *****");
  			//Affichage des informations concernant les conges de l'employé, encore une fois!
  			eps.consulterConges();
          }catch (Exception e) {
		
        	  e.printStackTrace();
	}
} 
    //methode pour tester la persistence avec B
    public void consulterCongesByEmploye(int idEmp){
    	//etablissement de la requete
    	//la classe utilConnexion, c'est nous qui l'avons defini, voir son code!
    	Connection cn=utilConnexion.connexionBD();
    	//formulation de la requete
    	String requeteSQL="Select * from conges where ID_employe="+idEmp;
    	//execution de la requete
    	ResultSet rs=utilConnexion.executerRequete(cn, requeteSQL);
    	//Traitement du resultat
    	System.out.println("Resultat de l'execution de la requete de selection:");
        
        try {
			while (rs.next()){
			 
			 System.out.println(rs.getString("dateDebut") +" "+ rs.getString("dateFin")+ " "+ rs.getString("etat"));
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				cn.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
    }
}

package domaine;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		
	    Test test = new Test();

	    try{	    	
	    	/*
	    	 * POUR UN FICHIER PRESENT DANS LE CLASSPATH (chemin relatif)
	    	 */
	    	String fichierIntoClasspath = "../resources/db.properties";
	    	
	    	InputStream input = test.getClass().getResourceAsStream(fichierIntoClasspath);
		
	    	Properties prop = new Properties();
	    	//Chargement du fichier dans l'objet properties
	    	prop.load(input);
		    input.close();
		
		    // Extraction des propriétés
		    String url = prop.getProperty("jdbc.url");
		    String user = prop.getProperty("jdbc.user");
		    String password = prop.getProperty("jdbc.password");
		    //Affichage
		    System.out.println("URL: " + url + " - USER: " + user + " - PWD: " + password);
	    	
	    	/*
	    	 * POUR UN FICHIER HORS DU CLASSPATH (chemin absolu)
	    	 */
	    	String fichierOutOfClasspath = "info.properties"; 
	    	String absolutePath = "C:/Documents and Settings/admin/workspace3/Configuration/";
			FileInputStream inputFile = new FileInputStream(absolutePath + fichierOutOfClasspath);
			Properties prop2 = new Properties();
	    	//Chargement du contenu du fichier dans l'objet prop2
			prop2.load(inputFile);
		    inputFile.close();
			
		    // Extraction des propriétés
		    String company = prop2.getProperty("company");
		    String employe = prop2.getProperty("employe");
		    //Affichage
		    System.out.println("ENTREPRISE: " + company + " - " + "EMPLOYE: " + employe); 
		    		
	    }catch(Exception e){
	    	e.printStackTrace();
	    }      
	}
}

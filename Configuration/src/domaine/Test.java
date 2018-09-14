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
	    	String absolutePath = "C:/FormationJava/WorkspaceJava/Configuration/";
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
		    
		    String fichierIntoClasspathfr = "../resources/fr.properties";
	    	InputStream inputfr = test.getClass().getResourceAsStream(fichierIntoClasspathfr);
		   	Properties fr = new Properties();
	    	fr.load(inputfr);
		    inputfr.close();
		    String menu_file = fr.getProperty("menu-file");
		    String menu_cut = fr.getProperty("menu-cut");
		    String menu_copy = fr.getProperty("menu-copy");
		    String menu_paste = fr.getProperty("menu-paste");
		    String error_not_authorized = fr.getProperty("error-not_authorized");
		    System.out.println("menu french:"+menu_file + " " + menu_cut  + " " + menu_copy  + " " + menu_paste + " " + error_not_authorized );
		    
		    String fichierIntoClasspathus = "../resources/us.properties";
	    	InputStream inputus = test.getClass().getResourceAsStream(fichierIntoClasspathus);
		   	Properties us = new Properties();
	    	us.load(inputus);
		    inputfr.close();
		    menu_file = us.getProperty("menu-file");
		    menu_cut = us.getProperty("menu-cut");
		    menu_copy = us.getProperty("menu-copy");
		    menu_paste = us.getProperty("menu-paste");
		    error_not_authorized = us.getProperty("error-not_authorized");
		    System.out.println("menu English:"+menu_file + " " + menu_cut  + " " + menu_copy  + " " + menu_paste + " " + error_not_authorized );

	    }catch(Exception e){
	    	e.printStackTrace();
	    }      
	}
}

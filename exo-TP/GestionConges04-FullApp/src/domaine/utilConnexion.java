package domaine;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class utilConnexion {

	public static Connection connexionBD(){
			  	
		//nom du fichier de propriétés
		String fichierOutOfClasspath = "dbInfo.properties"; 
    	//chemin vers le fichier
		String absolutePath = "C:/WorkspaceEclipses/workspaceJAVA300/GestionConges04-FullApp/src/res/";
    	//Creation d'un objet properties
    	Properties prop = new Properties();
    	
		try {
			FileInputStream inputFile = new FileInputStream(absolutePath + fichierOutOfClasspath);
			//Chargement du contenu du fichier dans l'objet prop
			prop.load(inputFile);
			inputFile.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    // Extraction des propriétés
		String driver = prop.getProperty("jdbc.driver");
		String url = prop.getProperty("jdbc.url");
	    String mysqlUser = prop.getProperty("jdbc.user");
	    String mysqlPassword = prop.getProperty("jdbc.password");
	    //Affichage
	    Connection cn = null;

        try {
            /*
             * 1.Chargement d'un driver Mysql
             */
            Class.forName(driver);

            /*
             * 2.Le driverManager tente d'instancier une connexion
             * vers la base, en utilisant le driver instancié précédemment
             */
            cn = DriverManager.getConnection(url,
                    mysqlUser, mysqlPassword);

        }catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cn;
	}
	
	public static ResultSet executerRequete(Connection cn, String requete){
		 Statement st = null;
		 ResultSet rs=null;
            try{
			/*
             * Création d'un objet Statement
             */
            st = cn.createStatement();
                      
            /*
             * L'objet statement exécute la requête et retourne
             * les résultats dans un objet ResultSet
             */
             rs=st.executeQuery(requete);                

        } catch (SQLException e) {
            e.printStackTrace();
            try {
				cn.close();
				st.close();
			} catch (SQLException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
        } 
       
        return rs;
	}
	
	public void test(){}
}

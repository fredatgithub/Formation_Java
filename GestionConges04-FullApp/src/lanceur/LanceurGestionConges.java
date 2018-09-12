package lanceur;

import domaine.DemandeConges;
import domaine.Employe;
import domaine.Manager;
import domaine.ServicePaie;

/**
 * @author <a href="www.ib-formation.fr">IB</a>
 *
 */
public final class LanceurGestionConges {

    /**
     * Méthode main qui sert de test.
     * @param args - Les arguments sont inutiles
     */
    public static void main(final String[] args) {
        
       //creer une instance manager
    	Manager manager1 = new Manager("Big", "Boss", 3);
    	
    	//creer une instance d'employe
    	Employe emp1 = new Employe("Smith", "John", 1);
   
    	//Lier l'employe a son manager et v-v
    	emp1.setManager(manager1);
    	manager1.ajouterEmploye(emp1);
    	
    	
    	
    	//faire des demandes de conges
        emp1.poserConge("19/10/2009", "26/10/2009");
        emp1.poserConge("24/12/2009", "02/01/2010");
        emp1.poserConge("14/02/2010", "15/02/2010");
        
        //consulter la liste de demandes de conges + resultats
        //cette methode retourne une collection de demandes de conges 
        emp1.consulterConges();
        
        
        //Exporter la liste des conges dans un fichier
        //penser à commenter la ligne d'avant afin d'eviter d'avoir 
        //un double affichage de la liste des conges
        ServicePaie servicePaie=new ServicePaie();
        servicePaie.exporterConges(emp1);
        servicePaie.importerDemConges();    
        
        //Test sur la serialisation
        servicePaie.exporterCongesSerializable(emp1);
			
        // Tester la persistence avec la base de donnees
        servicePaie.consulterCongesByEmploye(emp1.getId());
		
    }

    /**
     * LanceurGestionConges.
     * Pour éviter d'avoir un constructeur public par défaut
     * pour cette classe de test, on en créé un privé donc inaccessible
     */
  
}

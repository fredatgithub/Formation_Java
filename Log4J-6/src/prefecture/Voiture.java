package prefecture;

import org.apache.log4j.Logger;
import garage.Moteur;

public class Voiture {

	private Moteur moteur=null;

	private static Logger log = Logger.getLogger(Voiture.class);
	/**
	 * Constructeur
	 */
	public Voiture() {
		super();
		moteur = new Moteur(90);
		log.debug("Nouvelle Voiture:  chevaux(" + moteur.getNbChevaux() +")");
	}

	/**
	 * La puissance de la voiture
	 * @return la puissance du vehicule
	 */
	public int getPuissance()
	{
		log.trace("getPuissance()");
		return moteur.getNbChevaux();
	}
}

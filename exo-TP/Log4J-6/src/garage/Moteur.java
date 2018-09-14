package garage;

import org.apache.log4j.Logger;
import prefecture.Voiture;


public class Moteur {

	private int regime=0;
	
	private int nbChevaux=0;

	private static Logger log = Logger.getLogger(Moteur.class);
	/**
	 * Getter
	 * @return le regime du moteur
	 */
	public int getRegime() {
		log.trace("getRegime()");
		return regime;
	}
	/**
	 * Getter 
	 * @return le nomnbre de chevaux du moteur
	 */
	public int getNbChevaux() {
		log.trace("getNbChevaux()");
		return nbChevaux;
	}

	/**
	 * Constructeur de Moteur
	 * @param nbChevaux le nombre de chevaux du moteur
	 */
	public Moteur(int nbChevaux) {
		super();
		this.nbChevaux = nbChevaux;
		log.debug("Nouveau Moteur: " + "regime(" + regime + ") chevaux(" + nbChevaux +")");
	}
	/**
	 * Override toString()
	 * return le moteur sous forme de chaine de caractères
	 */
	public String toString() {
		log.trace("toString()");
		return "Moteur: " + "regime(" + regime + ") chevaux(" + nbChevaux +")" ;
	}
	
	/**
	 * Démarre le moteur
	 */
	public void demarrer(){
		log.trace("Démarrage du moteur");
		regime = 1000;
	}
	
	
}

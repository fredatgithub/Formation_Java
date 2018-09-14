package prefecture;

import garage.Moteur;

public class Voiture {

	private Moteur moteur=null;
	
	/**
	 * Constructeur
	 */
	public Voiture() {
		super();
		moteur = new Moteur(90);
		System.out.println("Nouvelle Voiture:  chevaux(" + moteur.getNbChevaux() +")");
	}

	/**
	 * La puissance de la voiture
	 * @return la puissance du vehicule
	 */
	public int getPuissance()
	{
		System.out.println("Debug getPuissance()");
		return moteur.getNbChevaux();
	}
}

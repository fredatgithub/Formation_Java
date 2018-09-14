package garage;

public class Moteur {

	private int regime=0;
	
	private int nbChevaux=0;

	/**
	 * Getter
	 * @return le regime du moteur
	 */
	public int getRegime() {
		System.out.println("Debug getRegime()");
		return regime;
	}
	/**
	 * Getter 
	 * @return le nomnbre de chevaux du moteur
	 */
	public int getNbChevaux() {
		System.out.println("Debug getNbChevaux()");
		return nbChevaux;
	}

	/**
	 * Constructeur de Moteur
	 * @param nbChevaux le nombre de chevaux du moteur
	 */
	public Moteur(int nbChevaux) {
		super();
		this.nbChevaux = nbChevaux;
		System.out.println("Nouveau Moteur: " + "regime(" + regime + ") chevaux(" + nbChevaux +")");
	}
	/**
	 * Override toString()
	 * return le moteur sous forme de chaine de caract�res
	 */
	public String toString() {
		System.out.println("Debug toString()");
		return "Moteur: " + "regime(" + regime + ") chevaux(" + nbChevaux +")" ;
	}
	
	/**
	 * D�marre le moteur
	 */
	public void demarrer(){
		System.out.println("D�marrage du moteur");
		regime = 1000;
	}
	
	
}

package serialization;

import java.io.*;

class Moteur implements Serializable {
	private static final long serialVersionUID = 428728463951888328L;
	private int puissance;
	private String marque;
	private static int nbInstance; // compteur de voitures ….
	private int nombreDeMoteur;
	
	public Moteur(String _marque, int _puissance) {
		marque = _marque;
		puissance = _puissance;
		nombreDeMoteur = 1;
	}

	public Moteur(String _marque) {
		marque = _marque;
		puissance = 4;
	}
	
	public int getPuissance() {
		return puissance;
	}
	
	public int getNombreDeMoteur() {
		return nombreDeMoteur;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public static int getNbInstance() {
		return nbInstance;
	}

	public static void setNbInstance(int nbInstance) {
		Moteur.nbInstance = nbInstance;
	}
}
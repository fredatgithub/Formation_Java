package serialization;

import java.io.*;

class Voiture implements Serializable {
	private static final long serialVersionUID = 8878690548278999834L;

	private int nbrKlm;
	private int carburant;
	private Moteur moteur;
	
	public Voiture(String m) {
		moteur = new Moteur(m);
	}

	public int getNbrKlm() {
		return nbrKlm;
	}

	public void setNbrKlm(int nbrKlm) {
		this.nbrKlm = nbrKlm;
	}

	public int getCarburant() {
		return carburant;
	}

	public void setCarburant(int carburant) {
		this.carburant = carburant;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
}
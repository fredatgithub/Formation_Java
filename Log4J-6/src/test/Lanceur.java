package test;

import prefecture.Voiture;

public class Lanceur {


	public static void main(String[] args) {
		Voiture v = new Voiture();
		System.out.println("Voiture de " + v.getPuissance() + " chevaux");
	}

}

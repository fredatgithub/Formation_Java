package elementsyntaaxiques;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String chaine;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrez une chaine de caractères au clavier");
		chaine = clavier.nextLine();
		System.out.println("Longueur de la chaine : " + chaine + " a " + chaine.length() + " charactères");
		// next exo
		int valeur1 = 0, valeur2 = 0, resultat = 0;
		System.out.println("Entrer 2 entiers");
		valeur1 = clavier.nextInt();
		valeur2 = clavier.nextInt();
		if (valeur1 > valeur2) {
			resultat = valeur1;
		}
		else{
			resultat = valeur2;
		}
		System.out.println("Valeur Max : " + resultat);
		clavier.close();
		
		}
	}

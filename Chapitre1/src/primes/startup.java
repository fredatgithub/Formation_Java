package primes;

import java.util.ArrayList;

public class startup {

	public static void main(String[] arguments) {
		// List nbPremiers = Prime.class.Giv

		for (int i = 0; i < 2; i++) {
			if (IsPrime(i)) {
				System.out.print(i + " ");
			}
			
			System.out.println("usage of Prime method");
			ArrayList<String> premierNombrePremiers = (ArrayList<String>) Prime.GiveMePrimeBetween(3,  7);
			for (String nombre : (ArrayList<String>) premierNombrePremiers) {
				System.out.println(nombre);
			}
		}
	}

	private static boolean IsPrime(int number) {
		// process false numbers first
		if (number < 2)
			return false;
		if (number == 2 || number == 3 || number == 5)
			return true;
		if (number % 2 == 0)
			return false;
		if (number % 3 == 0)
			return false;
		if (number % 5 == 0)
			return false;
		for (int i = 3; i < Math.abs(Math.sqrt(number)); i = i + 2) {
			if (number % i == 0)
				return false;
		}

		return true;
	}

}

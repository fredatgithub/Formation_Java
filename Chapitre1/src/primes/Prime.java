package primes;

import java.util.ArrayList;

public class Prime {
	public static ArrayList<String> GiveMePrimeBetween(int startingNumber, int endingNumber) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = startingNumber; i <= endingNumber; i++) {
			if (IsPrime(i)) {
				result.add(Integer.toString(i));
			}
		}
		
		return result;
	}

	public static boolean IsPrime(int number) {
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

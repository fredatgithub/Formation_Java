package primes;

public class startup {

	public static void main(String[] args) {
		// List nbPremiers = Prime.class.Giv

		for (int i = 0; i < 200; i++) {
			if (IsPrime(i)) {
				System.out.print(i + " ");
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

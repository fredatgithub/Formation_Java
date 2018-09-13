package Exception2;

public class Lanceur {

	public static void main(String[] args) {
		int divisor = 0;
		System.out.println("Trying to divide by zero");
		System.out.println(3 / divisor);

	}
	
	@SuppressWarnings("finally")
	private int Divide(int number, int divisor) throws Exception{
		int result;
		try {
			result = number / divisor;
		} catch (Exception e) {
			throw new Exception("Cannot divide by zero : " + e.getMessage());
		}
		
		return result;
	}
}
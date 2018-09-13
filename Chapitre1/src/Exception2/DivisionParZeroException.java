package Exception2;

public class DivisionParZeroException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private int divisor = 3;
	
	public void divide(int nombre) throws Exception{
		if (nombre == 0) {
			throw new Exception("Division par zéro erreur");
		}
	}
	
	public void divide(String chaine) throws Exception{
		throw new Exception(chaine);
		}
}
package Exceptions;

public class PlusDeVacanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private int nombreDeVacancesMax = 3;
	
	public void poserVacances(int nombre) throws Exception{
		if (nombre > nombreDeVacancesMax) {
			throw new Exception("Vous avez pris trop de vacances");
		}
	}
}
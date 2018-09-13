package exceptions;

public class MonException extends Exception{
	
	private static final long serialVersionUID = -732890105668592772L;
	
	private int x;
	private String message="valeur incorrecte: ";
	
	public MonException(int x) {
		this.x=x;
	}
	@Override
	public String toString(){;
		return "valeur incorrecte: "+x; 
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message+x;
	}
}
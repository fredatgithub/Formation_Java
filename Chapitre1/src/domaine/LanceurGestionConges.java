package domaine;

public class LanceurGestionConges {

	public static void main(String[] args) {
		Employe freddy = new Employe(1, "freddy", "the geek");
		Manager Reda = new Manager(1, "Reda", "The boss");
		
		freddy.poserConge("11/09/2018", "12/09/2018");
		Reda.poserConge("17/09/2018", "21/09/2018");
		Reda.validerConge();
		System.out.println("Reda a validé les de congés de Freddy et il peut partir à Bora-Bora");

	}

}

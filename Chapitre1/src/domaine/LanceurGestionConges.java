package domaine;

public class LanceurGestionConges {

	public static void main(String[] args) {
		Employe fred = new Employe("fred", "the geek", 1);
		Manager Reda = new Manager("Reda", "The boss", 1);
		ServicePaie servicePaie = new ServicePaie();
		servicePaie.listerCongePersonnel(fred);
		servicePaie.listerCongePersonnel(Reda);
		
		fred.poserConge("11/09/2018", "12/09/2018");
		Reda.poserConge("17/09/2018", "21/09/2018");
		Reda.validerConge();
		System.out.println("Reda a validé les de congés de Fred et il peut partir en pause");

	}

}

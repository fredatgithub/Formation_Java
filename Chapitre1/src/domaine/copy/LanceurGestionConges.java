package domaine.copy;

public class LanceurGestionConges {

	public static void main(String[] args) {
		Employe fred = new Employe("fred", "the geek", 1);
		Manager Reda = new Manager("Reda", "The boss", 1);
		
		ServicePaie servicePaie = new ServicePaie();
		
		servicePaie.listerCongePersonnel(fred);
		servicePaie.listerCongePersonnel(Reda);
		
		fred.poserConge("11/09/2018", "12/09/2018");
		fred.poserConge("11/09/2019", "12/09/2019");
		fred.poserConge("11/09/2020", "12/09/2020");
		fred.poserConge("11/09/2021", "12/09/2021");
		Reda.poserConge("17/09/2022", "21/09/2022");
		Reda.validerConge();
		fred.consulterConges();
		for (String unConge : fred.consulterConges()) {
			System.out.println(unConge);
		}
		
		System.out.println("Reda a validé les de congés de Fred et il peut partir en pause");
	}
}
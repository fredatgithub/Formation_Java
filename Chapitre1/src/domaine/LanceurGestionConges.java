package domaine;

public class LanceurGestionConges {

	public static void main(String[] args) {
		Employe fred = new Employe("fred", "the geek", 1);
		Manager Reda = new Manager("Reda", "The boss", 1);
		
		ServicePaie servicePaie = new ServicePaie();
		
		servicePaie.listerCongePersonnel(fred);
		
		fred.poserConge("11/09/2018", "12/09/2018");
		fred.poserConge("11/09/2019", "12/09/2019");
		fred.poserConge("11/09/2020", "12/09/2020");
		fred.poserConge("11/09/2021", "12/09/2021");
		servicePaie.listerCongePersonnel(Reda);
		Reda.poserConge("17/09/2022", "21/09/2022");
//		Reda.poserConge("17/09/2022", "21/09/2022");
//		Reda.poserConge("17/09/2022", "21/09/2022");
//		Reda.poserConge("17/09/2022", "21/09/2022");
		
		Reda.validerConge();
		System.out.println("Reda a valid� les de cong�s de Fred et il peut partir en pause");
	}
}
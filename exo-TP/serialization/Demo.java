package serialization;

import java.io.*;

public class Demo {
	public static void main(String[] args) {
		Voiture voiture = new Voiture("V6");
		voiture.setCarburant(98);
		voiture.setNbrKlm(3000);
		FileOutputStream ficSortie = null;
		FileInputStream ficEntree = null;
		try {
			ficSortie = new FileOutputStream("garage.ser");

			ObjectOutputStream oSortie = new ObjectOutputStream(ficSortie);
			oSortie.writeObject(voiture);
			oSortie.close();
			voiture = null;
			System.gc();
			ficEntree = new FileInputStream("garage.ser");
			ObjectInputStream oEntree = new ObjectInputStream(ficEntree);
			voiture = (Voiture) oEntree.readObject();
			oEntree.close();
			System.out.println(
					"marque voiture=" + voiture.getMoteur().getMarque() + ", carburant=" + voiture.getCarburant());
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			try {
				ficSortie.close();
				ficEntree.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}
}

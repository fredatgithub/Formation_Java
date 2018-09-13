package Exception2;

import java.io.*;

public class TFichier {
	public static void main(String[] args) {
		String str = null;
		String fileName = "FichierSource.txt";
		try {
			FileReader entree = new FileReader(fileName);
			//FileReader entree = new FileReader("AtelierLast.pdf");
			BufferedReader in = new BufferedReader(entree);
			while ((str = in.readLine()) != null)
				System.out.println(str);
			in.close();
			entree.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		testRandomAccess("FichierSource.txt");
	}
	
	public  static void  testRandomAccess(String fileName){	
		try {
			RandomAccessFile fic;
			fic = new RandomAccessFile (fileName, "rw");
			fic.seek (10) ;
			while (fic.getFilePointer() < fic.length())
			System.out.println (fic.readLine());
			fic.close();
			}
			catch ( IOException e ) {
			System.out.println ( e.getMessage () ) ;
			e.printStackTrace () ;
			}
	}
}
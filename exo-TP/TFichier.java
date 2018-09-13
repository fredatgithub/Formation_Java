package exceptions;

import java.io.*;

public class TFichier {
	public static void main(String[] args) {
		String str = null;
		try {
			FileReader entree = new FileReader("FichierSource.txt");
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
		testRandomAccess();
	}
	
	public  static void  testRandomAccess(){
		
		try {
			RandomAccessFile fic;
			fic = new RandomAccessFile ("FichierSource.txt", "rw");
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
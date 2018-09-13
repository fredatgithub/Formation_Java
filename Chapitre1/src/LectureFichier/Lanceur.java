package LectureFichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Lanceur {

	public static void main(String[] args) {
		String str = null;
		String fileName = "toto.txt";
		try {
			FileReader entree = new FileReader(fileName);
			BufferedReader in = new BufferedReader(entree);
			while ((str = in.readLine()) != null)
				System.out.println("Lecture");
				System.out.println(str);
			in.close();
			entree.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		//testRandomAccess(fileName);
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
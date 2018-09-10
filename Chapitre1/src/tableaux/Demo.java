package tableaux;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int tab[] = {1, 5, 4, 2, 3};
		int pos;
		Arrays.sort(tab);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		
		pos = Arrays.binarySearch(tab, 5);
		System.out.println("position = " + pos);
		Arrays.fill(tab, 0);
		for (int i = 0; i < 5; i++) {
			System.out.println(tab[i]);
		}
	}
}

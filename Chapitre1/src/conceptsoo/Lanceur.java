package conceptsoo;

import java.util.ArrayList;
import java.util.List;

public class Lanceur {

	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point> ();
		Point p1 = new Point(10, 20);
		list.add(p1);
		list.add(new Point(20, 40));
		list.add(new Point(60,50));
		if (list.contains(p1)) System.out.println("ok");
		else System.out.println("non ok");
		
		if (list.contains(new Point(20, 40))) System.out.println("ok");
		else System.out.println("non ok");
	}
}
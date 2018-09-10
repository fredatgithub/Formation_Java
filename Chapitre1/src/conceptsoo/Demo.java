package conceptsoo;

public class Demo {

	public static void main(String[] args) {
		Point p1 = null;
		p1 = new Point();
		p1.modifier(3,  6);
		p1.print();
		
		Point p2 = new Point();
		p2.print();
		p2.modifier(3,  6);
		p1.modifier(30, 0);
		p1.print();
		p2.print();
		
	}

}

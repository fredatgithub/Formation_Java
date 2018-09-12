package conceptsoo;

public class Point {
	private int x;
	private int y;

	public void modifier(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public void print() {
		System.out.println("x : " + x + " y: " + y);
	}
	
	public void modifier(Point p){
		modifier(p.x, p.y);
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		super();
	}
}
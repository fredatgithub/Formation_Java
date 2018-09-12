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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		System.out.println("le hascode est " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
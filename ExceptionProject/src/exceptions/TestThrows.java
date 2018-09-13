package exceptions;

public class TestThrows {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		TestThrows ts=new TestThrows();
		
		try {
			ts.testThrows(-1);
		} catch (MonException e) {
		
		System.out.println(e.getMessage());
		}
	}
	
	public void testThrows(int _x) throws MonException {
			int x = _x;
			if (x < 0)
				throw new MonException(x);
			System.out.println(x = x + 3);
	}
}
package exceptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = -1;
			if (x < 0)
				throw new MonException(x);
			System.out.println(x = x + 3);
		} catch (MonException e) {
			System.out.println(e);
			//ou, si vous avez redefini getMessage()
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("au revoir!");
		}
		
		

	}

}

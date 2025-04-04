package Exception_Handling;

public class correct_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		
		try {
			int c=a/(a-b);
			System.out.println("a is "+ a);
		}
		catch(java.lang.ArithmeticException i) {
			System.out.println("C value is wrong");
		}
		finally {
			System.out.println("Error is fixed");
		}
		
		
	}

}

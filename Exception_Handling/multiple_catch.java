package Exception_Handling;

public class multiple_catch {

	public static void main(String[] args) {
		int a=10,b=1,i=1,c;
		int[] arr= {21,1,34,97,0,-1};		
		
		try {
			c=a/(a-b);
			System.out.println("a is "+ c);
			
			System.out.println(arr[7]);
		}
		catch(java.lang.ArithmeticException ui) {
			System.out.println("C value is wrong");
		}
		
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Array is out of bound");
		}
		
		catch(Exception ai) {
			System.out.println("Array is working");
		}
		
		finally {
			System.out.println("Error is fixed");
		}
		// TODO Auto-generated method stub

	}

}

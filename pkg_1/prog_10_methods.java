package pkg_1;

public class prog_10_methods {

	public static int add(int a,int b) {
		return a+b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		x=add(13,20);
		System.out.println("Sum = " + x);
		
		y=multiply(3,9);
		System.out.println("Product = " + y);
	}

}

package POLYMORPHISM;

public class math_operations {
	int add(int a,int b) {
		System.out.println("add method with 2 input parameters ");
		return a+b;
	}
	
	int add(int a,int b,int c) {
		System.out.println("add method with 3 input parameters ");
		return a+b+c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		math_operations obj=new math_operations();
		System.out.println(obj.add(6,7));
		System.out.println(obj.add(1,2,4));
		
	}

}

package OOPS_Abstraction;

public class working_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b=new hdfc();
		System.out.println("HDFC Bank Rate of Interest is : " + b.getrateofinterest() + " %");
		
		b=new icici();
		System.out.println("ICICI Bank Rate of Interest is : " + b.getrateofinterest() + " %");

	}

}

package OOPS_Polymorphism;

public class poly_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b=new bob();
		System.out.println("BOB : ROI " + b.getrateofinterest());
		b=new citibank();
		System.out.println("CITI : ROI" + b.getrateofinterest());
		b=new canara();
		System.out.println("Canara : ROI " + b.getrateofinterest());
	}

}

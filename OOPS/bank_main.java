package OOPS;

public class bank_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank_account aman=new bank_account(1234,"aman",500000);
		aman.show_details();
		aman.deposit(10000);
		aman.show_details();
		aman.wthdrawl(5000);
		aman.show_details();
		
		
		
	}

}

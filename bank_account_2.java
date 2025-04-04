
public class bank_account_2 {
	int acc_no;
	String acc_name;
	float balance;
	
	public void deposit(float amt) {
		balance =balance + amt;
		System.out.println(this.acc_name + " : Deposit of " + amt + "successfull");
		
	}
	public void wthdrawl(float amt) {
		balance = balance - amt;
		System.out.println(this.acc_name + "Withdrawl of " + amt + "successfll");
	}
	
	// constructor
	public bank_account_2(int acc_no,String acc_name, float balance) {
		this.acc_no=acc_no;
		this.acc_name=acc_name;
		this.balance=balance;
	}
	
	public void show_details() {
		System.out.println("============================================");
		System.out.println(
				" Account No. : " + acc_no
				+ "\n Account name. :" + acc_name
				+"\n Balance." + balance) ;
	}
}

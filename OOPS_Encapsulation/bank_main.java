package OOPS_Encapsulation;

public class bank_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank_account_en acc1=new bank_account_en();
		acc1.setAccount_number(1234);
		acc1.setAccout_name("John");
		System.out.println("Account no. : " + acc1.getAccount_number() + "  Account name : " + acc1.getAccout_name() + "  Account balance is. " + acc1.getBalance());
	}

}

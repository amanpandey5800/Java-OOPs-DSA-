package OOPS;

public class bankk_mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankk_account_2[] acc_list=new bankk_account_2[3];
		
		acc_list[0] =new bankk_account_2();
		
		acc_list[0].acc_name="Priya";
		acc_list[0].acc_no=12131;
		acc_list[0].balance=10000;
		
		acc_list[0].show_details();
		acc_list[0].deposit(1000);
		acc_list[0].show_details();
		
		acc_list[1]=new bankk_account_2();
		
		acc_list[1].acc_no=12161;
		acc_list[1].balance=40000;
		acc_list[1].acc_name="Sahil";
		
		acc_list[1].show_details();
		acc_list[1].deposit(1000);
		acc_list[1].show_details();
		
		acc_list[2]=new bankk_account_2();
		
		acc_list[2].acc_name="Aman";
		acc_list[2].acc_no=12348;
		acc_list[2].balance=8756426;
		
		acc_list[2].show_details();

	}

}

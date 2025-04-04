package pkg_1;
import java.util.Scanner;
public class prog_9_ATMtransactionsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m_balance=5000;
		int p=1408;
		int pin;
		int num;
		do {
			System.out.println("Enter the operation u want to do between \n 1. check balance \n 2. Withdraw money \n 3. Deposit money \n 4. Exit\n");
			num=sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("Enter the pin");
				pin=sc.nextInt();
				if(pin==p) {
					System.out.println(m_balance);
				}
				else {
					System.out.println("Sorry! you have entered the wrong balance ");
				}
			break;
			
			case 2:
				System.out.println("enter the amount of money to withdraw ");
				int w_balance=sc.nextInt();
				if(w_balance<=m_balance) {
					System.out.println("Enter the pin ");
						pin=sc.nextInt();
						if(pin==p) {
							System.out.println("Withdrawl Successfull ");
							m_balance=m_balance-w_balance;
							
						}else {
							System.out.println("Wrong pin ");
						}
				}
				break;
				
			case 3:
				System.out.println("enter the amount of money you want to deposit ");
				int d_money=sc.nextInt();
				System.out.println("Enter the pin ");
				pin=sc.nextInt();
				if(pin==p) {
					m_balance=d_money+m_balance;
				}else {
					System.out.println("Wrong pin");
				}
			break;
			
			case 4:
				System.out.println("Thankyou");
				break;
			
		}		
	}while(num!=4);

}
}

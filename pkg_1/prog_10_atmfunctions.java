package pkg_1;

import java.util.Scanner;
public class prog_10_atmfunctions {
	static int m_balance;
	

	public static void menu() {
		System.out.println("Enter the operation u want to do between \n 1. check balance \n 2. Withdraw money \n 3. Deposit money \n 4. Exit\n");
		
	}
	
	public static void check(int pin) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin");
		int p=sc.nextInt();
		if(pin==p) {
			System.out.println(m_balance);
		}
		else {
			System.out.println("Sorry! you have entered the wrong balance ");
		}
	}
	
	public static void withdrawl(int pin) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter the amount of money to withdraw ");
		int w_balance=sc.nextInt();
		if(w_balance<=m_balance) {
			System.out.println("Enter the pin ");
				int p=sc.nextInt();
				if(pin==p) {
					System.out.println("Withdrawl Successfull ");
					m_balance=m_balance-w_balance;
					
				}else {
					System.out.println("Wrong pin ");
				}
		}
	}
	
	public static void deposit(int pin) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount of money you want to deposit ");
		int d_money=sc.nextInt();
		System.out.println("Enter the pin ");
		int p=sc.nextInt();
		if(pin==p) {
			m_balance=d_money+m_balance;
		}else {
			System.out.println("Wrong pin");
		}
		
	}
	
	public static void exit() {
		System.out.println("thankyou for using this atm");
		return;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		m_balance=5000;
		int pin=1408;
		Scanner sc=new Scanner(System.in);
		
		do {
			menu();
			System.out.println("Enter the Operation ");
			int n=sc.nextInt();			
			switch (n) {
			case 1:
				check(pin);
				break;
			case 2:
				withdrawl(pin);
				break;
			case 3:
				deposit(pin);
				break;
			case 4:
				exit();
			
			
			}
			
		}
		
	}

}

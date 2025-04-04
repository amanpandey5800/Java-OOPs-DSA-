package pkg_1;
import java.util.Scanner;
public class prog_7_switch1_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=15,d=0;
		System.out.println("Entert the arithmetic operator you want to do : ");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		switch(c) {
		case '+':
		d=a+b;
		System.out.println("Addition");
		break;
		
		case '-':
		d=a-b;
		System.out.println("Subtraction");
		break;
		
		case '*':
		d=a*b;
		System.out.println("Multiplication");
		break;
		
		case '/':
		d=a/b;
		System.out.println("Division");
		break;
		
		}
		System.out.println(a + " " + c + " " + " " + b + " = " + d);
	}

}

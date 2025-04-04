package pkg_1;
import java.util.Scanner;
public class prog_8_fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] fact_array=new int[5][2];
		Scanner sc=new Scanner(System.in);
		int num,fact=1;
		
		
		
		System.out.println("Enter the numbers for calculating factorial ");
		for(int i=0;i<5;i++) {	
			System.out.print("enter the numbers");
			 fact_array[i][0]=sc.nextInt();
		}
		for(int j=0;j<=fact_array[5][2];j++) {
			fact=fact*j;
			fact_array[5][2]=fact_array[5][fact];
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(fact_array[i][j]);
		}
		}
		}
	}



package Busticketbooking;
import java.util.*;
import java.sql.SQLException;
import java.util.HashMap;

	public class bus_main extends data_functions {
//		static HashMap<Integer,busroute> hm1;
		
		
//	static HashMap<Integer,busroute> hm2;
	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		data_functions.getdata();
		
		ticketbooking.display(hm1);
		Scanner sc=new Scanner(System.in);
//		System.out.println("If u want to buy tickets for some more routes press anykey other wise click 0");
//		int choice=sc.nextInt();
		int choice;
		do {
			
		data_functions.userchoice();
		data_functions.putdata();
		System.out.println("If u want to buy tickets for some more routes press anykey other wise click 0");
		choice=sc.nextInt();
		}while(choice !=0);
		ticketbooking.display(hm1);

	}

}

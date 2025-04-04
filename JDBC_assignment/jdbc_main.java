package JDBC_assignment;
import java.sql.*;
import java.util.*;
public class jdbc_main {

	public static void main(String[] args)throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("If you want to insert data press any key otherwise press 0 ");
		int choice=sc.nextInt();
		//int choice;
		if(choice!=0) {
			JDBC_functions.insertData();
			JDBC_functions.getData();
			JDBC_functions.storedataavg();
		
		}

	}

}

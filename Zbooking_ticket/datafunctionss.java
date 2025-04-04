package Zbooking_ticket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;

import Busticketbooking.busroute;

public class datafunctionss extends booking_main {
	static String StartingPoint,Endpoint;
	static int routeid,Available_seats,Cost,booking_id,no_of_seats,total_amount;
	static HashMap<Integer,bookingroute> hm1;
	static HashMap<Integer,bookingroute> hm2;
	
	
	public void getdata() throws SQLException, ClassNotFoundException{
		String jdbcURL="jdbc:mysql://localhost:3306/assigntest";
		String dbuname="root";
		String dpwd = "Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dpwd);
		
		Statement stmt=con.createStatement();
		
		String q="select * from busroute";
		ResultSet rs=stmt.executeQuery(q);
		hm1=new HashMap<Integer,bookingroute>();
		
		while(rs.next()) {
			routeid=rs.getInt("routeid");
			StartingPoint=rs.getString("StartingPoint");
			Endpoint = rs.getString("Endpoint");
			Available_seats=rs.getInt("Available_seats");
			Cost=rs.getInt("Cost");
			
			bookingroute b=new bookingroute(routeid,StartingPoint,Endpoint,Available_seats,Cost);
			hm1.put(b.routeid, b);
			
		}
		con.close();
	}
	
	
	
	
	public void putdata(HashMap<Integer,bookingroute> hm2)throws SQLException, ClassNotFoundException {
		hm2=new HashMap<Integer,bookingroute>();
		
		String jdbcURL="jdbc:mysql://localhost:3306/assigntest";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);	
		
		Statement stmt=con.createStatement();
	
	}
}

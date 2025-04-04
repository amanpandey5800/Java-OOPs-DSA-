package Busticketbooking;
import java.sql.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*
;public class data_functions
{
		static String StartingPoint,Endpoint;
		static int routeid,Available_seats,Cost,booking_id,no_of_seats,total_amount;
		
		static HashMap<Integer,busroute> hm1;

		static HashMap<Integer,booking> hm2;
		static int qt;
		static int pid;
		static int percost;
		static busroute bookdata;

		public static  void getdata()throws SQLException, ClassNotFoundException {
		String jdbcURL="jdbc:mysql://localhost:3306/assigntest";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);	
		
		Statement stmt=con.createStatement();
		
		
		String q = "select * from busroute";
		ResultSet rs=stmt.executeQuery(q);
	
			hm1=new HashMap<Integer,busroute>();
		while(rs.next()) {
			routeid=rs.getInt("routeid");
			StartingPoint=rs.getString("StartingPoint");
			Endpoint=rs.getString("Endpoint");
			Available_seats=rs.getInt("Available_seats");
			Cost=rs.getInt("Cost");
			
			
			busroute b=new busroute(routeid,StartingPoint,Endpoint,Available_seats,Cost);
			hm1.put(b.routeid, b);		
		}
		con.close();
	}
		
		static Scanner sc=new Scanner(System.in);
		public static void userchoice() {
			hm2=new HashMap<Integer,booking>();
			
			
			System.out.println("Enter the product Id you want to book tickets for = ");
			pid=sc.nextInt();
			System.out.println("Enter the number of quantity = ");
			qt=sc.nextInt();
			bookdata=hm1.get(pid);
			if(hm1.containsKey(pid)) {
				if(qt<=Available_seats) {
					Available_seats=Available_seats-qt;
					System.out.println("For Booking Pay the Amount given below \n");
					percost=bookdata.Cost*qt;
					System.out.println("percost");
					
				}else {
					System.out.println("Seats not available = ");
				}
				
			}
			else {
				System.out.println("Sorry this route is not available");
			}
			booking bo=new booking(booking_id,pid,qt,percost);
			hm2.put(bo.booking_id,bo);
			
		
		}
		
		public static void putdata ()throws SQLException, ClassNotFoundException {
			
				String jdbcURL="jdbc:mysql://localhost:3306/assigntest";
				String dbuname = "root";
				String dbpwd="Password@12";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);	
				
				Statement stmt=con.createStatement();
				
				
				
				
				String q="insert into booking values(?,?,?,?);";
				PreparedStatement pstmt=con.prepareStatement(q);
				pstmt.setInt(1,booking_id);
				pstmt.setInt(2, pid);
				pstmt.setInt(3, qt);
				pstmt.setInt(4, percost);
				
				int rowinserted=pstmt.executeUpdate();
				if(rowinserted > 0) {
					System.out.println("A new Employee was inserted successfully ");
				}
				con.close();

				
				
		}
}

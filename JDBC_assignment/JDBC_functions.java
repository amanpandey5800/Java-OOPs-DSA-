package JDBC_assignment;
import java.sql.*;
import java.util.*;

public class JDBC_functions {
		static HashMap<Integer,student> hm;
		static int avg;
		static int phy;
		static int chem;
		static int sid;
	public static void getData() throws SQLException, ClassNotFoundException {
		hm=new HashMap<Integer,student>();
		String jdbcURL="jdbc:mysql://localhost:3306/assignmentt";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		
		Statement stmt=con.createStatement();
		String q="select * from studentt";
		ResultSet rs=stmt.executeQuery(q);

		while(rs.next()) {
			sid=rs.getInt("sid");
			String sname=rs.getString("sname");
			phy=rs.getInt("phy");
			chem=rs.getInt("chem");
			avg=student.average(phy,chem);
			
			student s1=new student(sid,sname,phy,chem,avg);
			hm.put(s1.sid,s1);
			
		}
			System.out.println("average is "+ avg);
		
		con.close();
		
	}
	
	public static void insertData() throws SQLException, ClassNotFoundException {
		String jdbcURL="jdbc:mysql://localhost:3306/assignmentt";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		String q="insert into studentt(sid,sname,phy,chem) values(?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(q);
		
		pstmt.setInt(1, 001);
		pstmt.setString(2, "Vladimir");
		pstmt.setInt(3,50);
		pstmt.setInt(4, 40);
		
		
		int rowinserted=pstmt.executeUpdate();
		
		if(rowinserted > 0) {
			System.out.println("A new Student was inserted successfully ");
		}
		con.close();
			
	}
		
	public static void storedataavg() throws ClassNotFoundException, SQLException {
		String jdbcURL="jdbc:mysql://localhost:3306/assignmentt";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		String q="update studentt set average = ? where sid=?; ";
		PreparedStatement pstmt=con.prepareStatement(q);
		pstmt.setInt(1, avg);
		pstmt.setInt(2, sid);
		int rowinserted=pstmt.executeUpdate();
		
		if(rowinserted > 0) {
			System.out.println("A new average was inserted successfully ");
		}
		con.close();
		
		
	}
	}


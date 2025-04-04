package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_data {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		
		// 
		String q="insert into student(sid, sname) values(?,?);";
		PreparedStatement pstmt=con.prepareStatement(q);
		
		pstmt.setInt(1,140);
		pstmt.setString(2,"Vijay");
		pstmt.setInt(1,130);
		pstmt.setString(2, "Chaman");
		
		// Execute the querry

		int rowinserted=pstmt.executeUpdate();
		if(rowinserted > 0) {
			System.out.println("A new Employee was inserted successfully ");
		}
		con.close();

	}
	

}

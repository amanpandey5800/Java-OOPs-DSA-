package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete_data {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);	
		String updatesql = "delete from student where marks = ?";
		PreparedStatement pstmt = con.prepareStatement(updatesql);
		
		pstmt.setInt(1, 10);
		
		int rowDeleted = pstmt.executeUpdate();
		if(rowDeleted>0) {
			System.out.println("Employee deleted successfully = ");
		}
		con.close();
	}

}

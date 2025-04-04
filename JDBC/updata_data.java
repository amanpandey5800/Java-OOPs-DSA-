package JDBC;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class updata_data {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		
		String updatesql1="update student set mgrid = ? where sid = ? ";
		PreparedStatement pstmt=con.prepareStatement(updatesql1);
		
		pstmt.setInt(1, 114);
		pstmt.setInt(2, 113);
		
		// execute querry
		int rowupdated = pstmt.executeUpdate();
		if(rowupdated>0) {
			System.out.println("A new employee has updated successfullt ");
		}
		con.close();
	}
	


}

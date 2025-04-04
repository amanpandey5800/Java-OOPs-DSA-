package JDBC;
import java.sql.*;

public class select1 {
	public static void main(String[] args)throws SQLException, ClassNotFoundException{
		String jdbcURL="jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL,dbuname,dbpwd);	
		
		Statement stmt=con.createStatement();
		
		
		String q = "select * from student";
		
		ResultSet rs=stmt.executeQuery(q);
        
		
		while(rs.next()) {
			int id=rs.getInt("sid");
			String n=rs.getString("sname");
			int m=rs.getInt("marks");
			System.out.println(id+ " " + n + " " + m);
		}
		con.close();
		
	}
}

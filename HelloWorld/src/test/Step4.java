package test;
// Step 1 Import SQL Packages
// import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Step4 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	//Step 2 JDBC Driver Load
	String driverClass = "com.mysql.cj.jdbc.Driver";
	Class.forName(driverClass);
	
	//Step 3 Connect Object
	String url = "jdbc:mysql://localhost:3306/univ";
	String id = "root";
	String pw = "000000";
	Connection conn = DriverManager.getConnection(url, id, pw);
	
	//Step 4 Statement Object
	
	String sql ="SELECT * FROM student";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	}
}

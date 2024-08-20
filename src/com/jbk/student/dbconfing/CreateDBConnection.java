package com.jbk.student.dbconfing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDBConnection {

	public static Connection getDbConnection() throws SQLException 
	{
		String url = "jdbc:mysql://localhost:3306/studentdb" ;
		String username = "root" ;
		String password = "root" ;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		return con ;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

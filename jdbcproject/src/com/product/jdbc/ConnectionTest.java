package com.product.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	Connection con = null;
	private static ConnectionTest connection = new ConnectionTest();
	public ConnectionTest()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///vtalentdatabase","root","keerthi@19");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getInstanceOf(){
		
		return connection.con;
		
		
		
	}

}

package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
	private static ConnectionTest connetion = new ConnectionTest();
	Connection con = null; 
	private ConnectionTest(){
		try {
			//register jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			con = DriverManager.getConnection("jdbc:mysql:///vtalentdatabase","root","keerthi@19");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Connection getInstacneOf(){
		
		return connetion.con;
		
	}

}

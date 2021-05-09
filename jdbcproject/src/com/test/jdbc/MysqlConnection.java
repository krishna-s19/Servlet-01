package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//singletone class
public class MysqlConnection {
	//private constructor
	Connection con = null;
	//Statement st= null;
	//ResultSet rs = null;
	private static MysqlConnection connection = new MysqlConnection();
	private MysqlConnection(){
		try {
			// register jdbc driver s/w 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection 
			con = DriverManager.getConnection("jdbc:mysql:///vtalentdatabase","root","keerthi@19");
			if(con == null)
				System.out.println("Connection is not Establish");
			else
				System.out.println("Connection is found");
		}//try 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}//constructor 
	public static Connection getInstanceOfMysql(){
		
		return  connection.con;
	}//getInstancOf

	
}//class

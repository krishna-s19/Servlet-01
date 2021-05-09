package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnTest {

	public static void main(String[] args) {
		
		Connection con = null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Krishna123");
		if(con==null){
			System.out.println("connection not establish");
			}
		else{
			System.out.println("Connection establsih");
			}
		}//try
		catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}//catch
	}//main
}//class

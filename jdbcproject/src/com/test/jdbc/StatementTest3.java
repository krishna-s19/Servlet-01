package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection  con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			//Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Register driver
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Krishna123");
			//creating Statement
		st =con.createStatement();
		String query = "select * from book";
		// Send and execute query
		rs= st.executeQuery(query);
		boolean tag =false;
		while (rs.next()!=false){
			tag =true;
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t\t\t"+rs.getDouble(3));
		}//while
		if(tag==false){
			System.out.println("No record Found");
		}else{
			System.out.println("Record found and executed");
			}	
		}//try
		catch (SQLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		catch (ClassNotFoundException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
					rs.close();
			} catch (Exception e4) {
				// TODO: handle exception
			e4.printStackTrace();
				}
			try {
				if(st!=null)
					st.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(con!=null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
				}
			}//finally 
	}//main	
}//class

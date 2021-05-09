package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementTest {
public static void main(String[] args) {
	Connection con =null;
	Statement st =null;
	ResultSet rs =null;
	try {
		// Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//connection is established 
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Krishna123");
		//create statement object
		st =con.createStatement();
		String query ="SELECT * FROM STUDENT ";
		System.out.println(query);
		//send and execute query
		 rs =st.executeQuery(query);
		 boolean flag = false;
		 while(rs.next()==true){
			 flag = true;
			// System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getDouble(4));
			 System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
		 }//while
		 if(flag==false){
			 System.out.println("Record not found for display");
		 	}
		 else{
			 System.out.println("Record found and display");
		 	}
	}//try 
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
				}//catch
	}//main
}//class

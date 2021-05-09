package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementTest4 {
public static void main(String[] args) {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	Scanner sc = null;
	try{
		sc = new Scanner(System.in);
		System.out.println("Enter Product Name :");
		String  name = sc.next().toUpperCase();
		name = "'"+name+"'";		
		//System.out.println(name);
		//Loading driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection established
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Krishna123");
		// Creating statement
		st = con.createStatement();
		//creating query
		String query = " SELECT PNAME,PMDATE,PRICE FROM PRODUCTS1 WHERE PNAME = "+name;
		System.out.println(query);
		// send and execute the query
		rs = st.executeQuery(query);
		// process the result set object
		boolean flag = false;
			while(rs.next()==true){
				flag = true;
				System.out.println(rs.getString("pname")+"\t"+rs.getString("pmdate")+"\t"+rs.getString("price"));
			}//while
			if(flag == true){
				System.out.println("Record found and Display");
			}else{
				System.out.println("Record Not found ");
			}
		}//try
	
		catch(SQLException e1){
			e1.printStackTrace();
		}
	catch(ClassNotFoundException e2){
		e2.printStackTrace();
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
	finally {
		try{
			if(rs!=null)
				rs.close();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			if(st!=null)
				st.close();
		} catch (SQLException e2) {
			// TODO: handle exception
		e2.printStackTrace();
		}
		try {
			if(con!=null)
				con.close();
		} catch (SQLException e3) {
			// TODO: handle exception
			e3.printStackTrace();
		}
	}//finally
	}//main
}//class

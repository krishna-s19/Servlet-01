package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest2 {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs =null;
		try {
			//loading JDBC driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection is establishing
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Krishna123");
			if(con!=null){
				System.out.println("connction is  establish");
			}else{
				System.out.println("Connection is not establish");
			}
			//Create statement
			st = con.createStatement();
			String query = " select * from emp";
			System.out.println(query);
			//send and exute query
			rs = st.executeQuery(query);
			
			boolean flag =false;
			while(rs.next()==true){
				flag =true;
		//		System.out.println("----------------------------------------------------------------------------------------");
			//	System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
				 System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
			}// while
			if(flag==false){
				System.out.println( "  Record Not found");
			}
			else{
				System.out.println("Record found");
			}
		}//try
			catch (SQLException  e2) {
			// TODO: handle exception
				e2.printStackTrace();
		}
		catch (ClassNotFoundException e3) {
			// TODO: handle exception
			e3.printStackTrace();
		}
		 catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		 }
		finally {
			try {
				if(rs!=null)
					rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			e2.printStackTrace();
			} 
			try {
				if(st!=null)
					st.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			e2.printStackTrace();
			}
		}//finally
	}//main
}//class

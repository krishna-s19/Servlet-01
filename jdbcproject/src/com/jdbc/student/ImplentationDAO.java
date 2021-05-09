package com.jdbc.student;

import java.sql.Connection;
import java.sql.Statement;

public class ImplentationDAO implements DAO{
	Connection con = null;
	Statement st = null;
	public  ImplentationDAO() {
		con =  ConnectionTest.getInstacneOf();
	}

	@Override
	public int createStudent(Student student) {
		int count=0;
		String query = "insert into Student_table values("+student.getSno()+","+"'"+student.getSname()+"'"+","+"'"+student.getCourse()+"'"+
		","+student.getSfee()+")";
		try {
			st=con.createStatement();
			count =st.executeUpdate(query);	
		} catch (Exception e) {
				e.printStackTrace();
			}
		return count;
	}

	@Override
	public int updateStudent(Student student) {
		return 0;
	}

	@Override
	public int deleteStudent(int sno) {
		int count = 0;
		// delete from product_table where pno= 200;
		String query ="delete from student_table  where sno="+sno;
		try{
		st = con.createStatement();
		count = st.executeUpdate(query);
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}

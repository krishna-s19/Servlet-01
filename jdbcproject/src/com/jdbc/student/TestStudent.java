package com.jdbc.student;

public class TestStudent {

	public static void main(String[] args) {
		Student stud =new Student();
		stud.setSno(200);
		stud.setSname("Swami");
		stud.setCourse("AdobiManager");
		stud.setSfee(20000.00);
		DAO dao = new ImplentationDAO();
		int count =dao.createStudent(stud);
		System.out.println(count+"   Record Inserted Successfully");
		//int result = dao.deleteStudent(200);
		//System.out.println(result+"   Records deleted Successfully");
		
		
	}

}

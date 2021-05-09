package com.jdbc.student;

public interface DAO {
	public int createStudent(Student student);
	public int updateStudent(Student student);
	public int deleteStudent(int sno);  

}

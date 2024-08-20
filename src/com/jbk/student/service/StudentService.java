package com.jbk.student.service;

import java.sql.SQLException;
import java.util.List;

import com.jbk.student.dao.StudentDao;
import com.jbk.student.model.Student;

public class StudentService {

	public void insertStudentinfo(Student obj) throws SQLException
	{
		StudentDao dao = new StudentDao();
		dao.insertStudentData(obj);
	}
	
	public void updateStudentinfo(Student obj) throws SQLException
	{
		StudentDao dao = new StudentDao();
		dao.updateStudentData(obj);
		 
	}
	
	public void deleteStudentinfo(Student obj) throws SQLException
	{
		StudentDao dao = new StudentDao();
		dao.deleteStudentData(obj);
		 
	}
	
	public List<Student> fetchStudentinfo() throws SQLException
	{
		StudentDao dao = new StudentDao();
		List<Student> list  = dao.fetchStudentData();
		return list ;
	}
}

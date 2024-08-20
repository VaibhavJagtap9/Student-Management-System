package com.jbk.student.controller;

import java.sql.SQLException;
import java.util.List;

import com.jbk.student.model.Student;
import com.jbk.student.service.StudentService;

public class StudentController {

	public void inserStudentRecord(Student obj) throws SQLException {
		
		StudentService service = new StudentService ();
		service.insertStudentinfo(obj);
	}
	
	public void updateStudentRecord(Student obj) throws SQLException {
		
		StudentService service = new StudentService ();
		service.insertStudentinfo(obj);
	}
	
	public void deleteStudentRecord(Student obj) throws SQLException {
		
		StudentService service = new StudentService ();
		service.deleteStudentinfo(obj);
	}
	
	public List<Student> fetchStudentRecord() throws SQLException {
		
		StudentService service = new StudentService ();
		List<Student> list = service.fetchStudentinfo();
		
		return list ;
	}
}

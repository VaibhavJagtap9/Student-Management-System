package com.jbk.student.main;


import java.sql.SQLException;
import java.util.List;

import com.jbk.student.controller.StudentController;
import com.jbk.student.model.Student;

public class Main {
//Consider This file as "Frontend" part
	
	public static void main(String[] args) throws SQLException {
		
		StudentController controller = new StudentController();
		Student s1 = new Student("Kedar Patil", 90, 15);
		controller.inserStudentRecord(s1);
		//controller.upda66teStudentRecord(s1);
		//controller.deleteStudentRecord(s1);
		
		List<Student> list = controller.fetchStudentRecord();
		
		for( Student obj : list) {
			System.out.println("Student Name    : " + obj.getName());
			System.out.println("Student Marks   : " + obj.getMarks());
			System.out.println("Student RollNum : " + obj.getRollNum());
			System.out.println(" _____________________________________________________");
		}
	}
}

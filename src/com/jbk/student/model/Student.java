package com.jbk.student.model;

public class Student {

	private String name;
	private double marks;
	private int rollNum ;
	
	public Student(String name, double marks, int rollNum) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollNum = rollNum;
	}
	
	public Student( int rollNum) {
		super();
		this.rollNum = rollNum;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", rollNum=" + rollNum + "]";
	}
	
	
	
}

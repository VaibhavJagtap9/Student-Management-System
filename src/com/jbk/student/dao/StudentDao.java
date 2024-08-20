package com.jbk.student.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jbk.student.dbconfing.CreateDBConnection;
import com.jbk.student.model.Student;

public class StudentDao {

	public void insertStudentData(Student obj) throws SQLException
	{
		// create db connection is static method so called it by class name 
		
				Connection con = null ;	// local variable must be  
				PreparedStatement stm = null ;
				
				try
				{
					String query = "insert into Student(name , marks , rollNum) values(?,?,?)";
					con = CreateDBConnection.getDbConnection();
				    stm = con.prepareStatement(query);
					stm.setString(1, obj.getName());
					stm.setDouble(2, obj.getMarks());
					stm.setInt(3, obj.getRollNum());
					int row =  stm.executeUpdate();
					System.out.println(row + " Student Record Inserted ...  ");
					
				}
				catch(Exception e)
				{
					System.out.println("something went wrong");
				}
				finally
				{
					con.close();
					stm.close();
					
				}

	}
	
	public void updateStudentData(Student obj) throws SQLException
	{
		// create db connection is static method so called it by class name 
		
				Connection con = null ;	// local variable must be initialze 
				PreparedStatement stm = null ;
				
				try
				{
					String query = "update Student set name=? where rollNum=?" ;
					con = CreateDBConnection.getDbConnection();
				    stm = con.prepareStatement(query);
					stm.setString(1, obj.getName());
					stm.setInt(3, obj.getRollNum());
					int row =  stm.executeUpdate();
					System.out.println(row + " Student Record updated ...  ");
					
				}
				catch(Exception e)
				{
					System.out.println("something went wrong ");
				}
				finally
				{
					con.close();
					stm.close();
					
				}

	}
	
	public void deleteStudentData(Student obj) throws SQLException
	{
		// create db connection is static method so called it by class name 
		
				Connection con = null ;	// local variable must be initialze 
				PreparedStatement stm = null ;
				
				try
				{
					String query = "delete from Student where rollNum=?" ;
					con = CreateDBConnection.getDbConnection();
				    stm = con.prepareStatement(query);
					stm.setInt(1, obj.getRollNum());
					int row =  stm.executeUpdate();
					System.out.println(row + " Student Record deleted...  ");
					
				}
				catch(Exception e)
				{
					System.out.println("something went wrong ");
				}
				finally
				{
					con.close();
					stm.close();
					
				}

	}
	
	public List<Student> fetchStudentData() throws SQLException
	{
		// create db connection is static method so called it by class name 
		
				Connection con = null ;	// local variable must be initialze 
				PreparedStatement stm = null ;
				
				List<Student> students = new ArrayList<Student>();
				try
				{
					String query = "select * from Student " ;
					con = CreateDBConnection.getDbConnection();
				    stm = con.prepareStatement(query);
					ResultSet result =  stm.executeQuery();
					
					while(result.next()) {
						String name = result.getString("name");
						double marks = result.getDouble("marks");
						int rollNum = result.getInt("rollNum");
						
						Student s = new Student(name, marks, rollNum);
						students.add(s); // store in arryalist 
					}
					
				}
				catch(Exception e)
				
				{
					System.out.println("something went wrong ");
				}
				finally
				{
					con.close();
					stm.close();
					
				}
				
				return students ;

	}



}

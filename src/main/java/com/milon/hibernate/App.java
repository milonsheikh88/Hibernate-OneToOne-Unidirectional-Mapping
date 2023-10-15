package com.milon.hibernate;

import com.milon.hibernate.dao.CourseDao;
import com.milon.hibernate.dao.StudentDao;
import com.milon.hibernate.entity.Course;
import com.milon.hibernate.entity.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started...");
		
		StudentDao studentDao = new StudentDao();
		CourseDao courseDao = new CourseDao();
		
		// Create Course Object
		Course cou=new Course("Android", "6 Month");

		// Create Student Object
		Student stu=new Student("Milon", "Dhaka",cou);

		
        // Save the student object.
        // This will also save the StudentGfgDetail
        // object as we have used CascadeType.ALL
		
		studentDao.saveStudent(stu);

		System.out.println("Insert Done...");
		
		
		Student student = studentDao.getStudent(1);
		System.out.println(student.getName()+" --- "+student.getCourse().getCourseName()+" --- "+student.getCourse().getDuration());
		

		System.out.println("Get Done...");

	}
}

package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class SaveStudent {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(4);
		student1.setName("Advaith");
		student1.setEmail("advaith@mail.com");

		StudentDao studentDao = new StudentDao();
		Student student = studentDao.saveStudent(student1);
		if (student != null)
			System.out.println("Student " + student.getName() + " added successfully");

	}
}

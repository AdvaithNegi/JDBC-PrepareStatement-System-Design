package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class UpdateStudent {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(4);
		student1.setName("Sejal");
		student1.setEmail("sejal@mail.com");

		StudentDao studentDao = new StudentDao();
		Student student = studentDao.updateStudent(student1);
		if (student != null)
			System.out.println("Record Updated");
		else
			System.out.println("Record Not Found");

	}
}

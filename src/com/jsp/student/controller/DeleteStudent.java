package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class DeleteStudent {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.deleteStudent(3);
		if (flag == true)
			System.out.println("Record Deleted");
		else
			System.out.println("Record Not Found");
	}
}

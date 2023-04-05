package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class GetAllStudent {

	public static void main(String[] args) {

		StudentDao studentDao = new StudentDao();
		studentDao.getAllStudent();

	}
}

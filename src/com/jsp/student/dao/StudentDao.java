package com.jsp.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student.dto.Student;
import com.jsp.student.util.HelperClass;

public class StudentDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;

	public Student saveStudent(Student student) {

		connection = helperClass.getConnection();
		String sql = "insert into student values(?,?,?)";
		try {
			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());

			// Execute Statement
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;

	}

	public boolean deleteStudent(int id) {

		connection = helperClass.getConnection();
		String sql = "delete from student where id=?";

		try {
			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			// Execute Statement
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public Student updateStudent(Student student) {

		connection = helperClass.getConnection();
		String sql = "update student set name=?,email=? where id=?";
		try {

			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(3, student.getId());
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmail());

			// Execute Statement
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close Connection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return student;

	}

	public void getAllStudent() {

		connection = helperClass.getConnection();
		String sql = "select * from student";
		try {
			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Execute Statement
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("================================================");
				System.out.println("Student ID    : " + resultSet.getInt(1));
				System.out.println("Student Name  : " + resultSet.getString(2));
				System.out.println("Student Email : " + resultSet.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void getByIdStudent(int id) {

		connection = helperClass.getConnection();
		String sql = "select * from student where id=?";
		try {
			// Create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			// Execute Statement
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("================================================");
				System.out.println("Student ID    : " + resultSet.getInt(1));
				System.out.println("Student Name  : " + resultSet.getString(2));
				System.out.println("Student Email : " + resultSet.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// Close COnnection
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	
	
	
}

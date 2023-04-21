package br.com.ExemploJDBC.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.ExemploJDBC.model.Student;

public class CRUDStudent<T> extends AbstractCRUD<T> {
	
	@Override
	public boolean create(T o) throws SQLException {
		Student student = (Student) o;
		String query = 
				"INSERT INTO student (name_student, id_department) "
				+ "VALUES (?, ?)";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setString(1, student.getName_student());
		stmt.setInt(2, student.getId_department());
		int rows = stmt.executeUpdate();
		if(rows > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "DELETE FROM student WHERE id_student = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setInt(1, id);
		int rows = stmt.executeUpdate();
		return rows > 0;
	}

	@Override
	public boolean update(T o) throws SQLException {
		Student student = (Student) o;
		String query = "UPDATE student "
				+ "SET name_student = ?, id_department = ? "
				+ "WHERE id_student = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setString(1, student.getName_student());
		stmt.setInt(2, student.getId_department());
		stmt.setInt(3, student.getId_student());
		int rows = stmt.executeUpdate();
		return rows > 0;
		
	}

	@Override
	public T getById(int id) throws SQLException {
		
		String query = "SELECT * FROM student WHERE id_student = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setInt(1, id);
		ResultSet result = stmt.executeQuery();
		result.next();
		Student student = new Student();
		student.setId_student(result.getInt(1));
		student.setName_student(result.getString(2));
		student.setId_department(result.getInt(3));
		
		return (T) student;
	}

	@Override
	public ArrayList<T> listAll() throws SQLException {
		String query = "SELECT * FROM student";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		ResultSet result = stmt.executeQuery();
		ArrayList<Student> students = new ArrayList<Student>();
		while(result.next()) {
			Student student = new Student();
			student.setId_student(result.getInt(1));
			student.setName_student(result.getString(2));
			student.setId_department(result.getInt(3));
			students.add(student);
		}
		return (ArrayList<T>) students;
	}
	
	

}

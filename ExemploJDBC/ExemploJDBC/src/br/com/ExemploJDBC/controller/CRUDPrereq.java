package br.com.ExemploJDBC.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.ExemploJDBC.model.Course;
import br.com.ExemploJDBC.model.Department;
import br.com.ExemploJDBC.model.Prereq;

public class CRUDPrereq<T> extends AbstractCRUD<T>{
	
	@Override
	public boolean create(T o) throws SQLException {
		Prereq prereq = (Prereq) o;
		String query = 
				"INSERT INTO prereq (id_prereq, id_course) "
				+ "VALUES (?, ?)";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setInt(1, prereq.getIdPrereq());
		stmt.setInt(2, prereq.getIdCourse());
	
		int rows = stmt.executeUpdate();
		if(rows > 0) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public boolean delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "DELETE FROM prereq WHERE id_prereq = ? and id_course = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setInt(1, id);
		int rows = stmt.executeUpdate();
		return rows > 0;
	}
	
	@Override
	public boolean update(T o) throws SQLException {
		Prereq prereq = (Prereq) o;
		String query = "UPDATE prereq "
				+ "SET id_prereq = ?, id_course = ?"
				+ "WHERE id_prereq = ? and id_course = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setInt(1, prereq.getIdPrereq());
		stmt.setInt(2, prereq.getIdCourse());
	
		int rows = stmt.executeUpdate();
		return rows > 0;
		
	}
	
	@Override
	public T getById(int id) throws SQLException {
		
		String query = "SELECT * FROM prereq WHERE id_prereq = ? and id_course = ?";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		stmt.setInt(1, id);
		ResultSet result = stmt.executeQuery();
		result.next();
		Prereq prereq = new Prereq();
		prereq.setIdPrereq(result.getInt(1));
		prereq.setIdCourse(result.getInt(2));
		
		return (T) prereq;
	}
	
	@Override
	public ArrayList<T> listAll() throws SQLException {
		String query = "SELECT * FROM prereq";
		PreparedStatement stmt = super.connection.prepareStatement(query);
		ResultSet result = stmt.executeQuery();
		ArrayList<Prereq> prereqs = new ArrayList<Prereq>();
		while(result.next()) {
			Prereq prereq = new Prereq();
			prereq.setIdPrereq(result.getInt(1));
			prereq.setIdCourse(result.getInt(2));
			prereqs.add(prereq);
		}
		return (ArrayList<T>) prereqs;
	}
	
	
}

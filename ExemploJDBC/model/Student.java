package br.com.ExemploJDBC.model;

public class Student {
	
	/*
	 
	 CREATE TABLE STUDENT(
    ID_STUDENT SERIAL PRIMARY KEY,
    NAME_STUDENT VARCHAR(50) NOT NULL,
    ID_DEPARTMENT SERIAL NOT NULL,
    FOREIGN KEY (ID_DEPARTMENT) REFERENCES DEPARTMENT(ID_DEPARTMENT)
	);

	 
	 */
	
	private int id_student;
	private String name_student;
	private int id_department;
	
	public int getId_student() {
		return id_student;
	}
	public void setId_student(int id_student) {
		this.id_student = id_student;
	}
	public String getName_student() {
		return name_student;
	}
	public void setName_student(String name_student) {
		this.name_student = name_student;
	}
	public int getId_department() {
		return id_department;
	}
	public void setId_department(int id_department) {
		this.id_department = id_department;
	}

	
}

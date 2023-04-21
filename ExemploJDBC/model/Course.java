package br.com.ExemploJDBC.model;

public class Course {
	
	/*
	 
	CREATE TABLE COURSE(
    ID_COURSE SERIAL PRIMARY KEY,
    TITLE VARCHAR(50) NOT NULL,
    ID_DEPARTMENT SERIAL NOT NULL,
    CREDIT NUMERIC NOT NULL,
    FOREIGN KEY (ID_DEPARTMENT) REFERENCES DEPARTMENT(ID_DEPARTMENT)
	);

	 
	 */
	
	private int id_course;
	private String title;
	private int id_department;
	private float credit;
	
	public int getId_course() {
		return id_course;
	}
	public void setId_course(int id_course) {
		this.id_course = id_course;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId_department() {
		return id_department;
	}
	public void setId_department(int id_department) {
		this.id_department = id_department;
	}
	public float getCredit() {
		return credit;
	}
	public void setCredit(float credit) {
		this.credit = credit;
	}
	
	

}

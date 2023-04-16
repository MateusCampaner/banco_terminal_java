package br.com.ExemploJDBC.model;

public class Course {
	/*
	CREATE TABLE COURSE(
	
    ID_COURSE SERIAL PRIMARY KEY,
    TITLE VARCHAR(50) NOT NULL,
    ID_DEPT SERIAL NOT NULL,
    CREDIT NUMERIC NOT NULL,
    FOREIGN KEY (ID_DEPT) REFERENCES DEPARTMENT(ID_DEPT)
);
	*/
	
	private int idCourse;
	private String title;
	private String deptName;
	private double credit;
	public int getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	

}

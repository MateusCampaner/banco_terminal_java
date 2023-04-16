package br.com.ExemploJDBC.model;

public class Prereq {
	
	/*
	 CREATE TABLE PREREQ(
    ID_PREREQ VARCHAR(50) PRIMARY KEY,
    ID_COURSE SERIAL,
    FOREIGN KEY (ID_COURSE) REFERENCES COURSE(ID_COURSE)
);

	 */
	
	private int idPrereq;
	private int idCourse;
	
	public int getIdPrereq() {
		return idPrereq;
	}
	public void setIdPrereq(int idPrereq) {
		this.idPrereq = idPrereq;
	}
	public int getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(int idCourse) {
		this.idCourse = idCourse;
	}
	
	
}

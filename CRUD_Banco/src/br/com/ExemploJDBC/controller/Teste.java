package br.com.ExemploJDBC.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.ExemploJDBC.model.Department;
import br.com.ExemploJDBC.model.Course;
import br.com.ExemploJDBC.model.Student;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		AbstractCRUD<Department> department;
		AbstractCRUD<Course> course;
		AbstractCRUD<Student> student;
		
		department = new CRUDDepartment<Department>();
		course = new CRUDCourse<Course>();
		student = new CRUDStudent<Student>();
		
		int opcao = 0;
		
		try {
			System.out.println(department.open() + " Deparment open");
			System.out.println(course.open() + " Course open");
			System.out.println(student.open() + " Student open");
			
			 while (opcao != 9){
		            System.out.println("--------------------");
		            System.out.println("UNIFIL 2");
		            System.out.println("--------------------");
		            System.out.println("(1) Tabela Department");
		            System.out.println("(2) Tabela Course");
		            System.out.println("(3) Tabela Student");
		            System.out.println("(9) Fim");
		            opcao = scanner.nextInt();
		            
		            switch (opcao){
		           
	                case 1:
	                	
	                	int numDepartment = 0;
	                    
	                    while(numDepartment != 9) {
	                    	
	                    System.out.println("--Tabela Department--");
	                    System.out.println("Escolha a operação");
	                    System.out.println("(1) Criar Departamento");
	                    System.out.println("(2) Deletar Departamento");
	                    System.out.println("(3) Atualizar Departamento");
	                    System.out.println("(4) Buscar Departamento");
	                    System.out.println("(5) Mostrar todos os departamentos");
	                    System.out.println("(9) Voltar");
	                    
	                    numDepartment = scanner.nextInt();
	                   	
	                    switch(numDepartment) {
	                    
	                    case 1:
	                    	System.out.println("--Criar Departamento--");
	                    	Department dCreate = new Department();
	                    	System.out.println("--Nome do Departamento--");
	            			dCreate.setNameDepartment(scanner.next());
	            			System.out.println("--Nome do Predio--");
	            			dCreate.setBuildingDepartment(scanner.next());
	            			System.out.println("--Quantidade de Budget--");
	            			dCreate.setBudgetDepartment(scanner.nextFloat());
	            			
	            			boolean d_res_create = department.create(dCreate);
	            			System.out.println(d_res_create + " DEPARTAMENTO CRIADO");
	            			System.out.println("");
	            			
	            			break;
	            			
	                    case 2:
		                	System.out.println("--Deletar Departamento--");
		                	System.out.println("--Informe o ID do departamento--");
		                	
		                	boolean d_res_delete = department.delete(scanner.nextInt());
		                	System.out.println(d_res_delete + " DEPARTAMENTO DELETADO");
		                	System.out.println("");
		                	
		                    break;
		                    
	                    case 3:
		                	System.out.println("--Atualizar Departamento--");
		                	Department dUpdate = new Department();
		                	System.out.println("--Informe o ID do departamento--");
		        			dUpdate.setIdDepartment(scanner.nextInt());
		        			System.out.println("--Atualize o nome do departamento--");
		        			dUpdate.setNameDepartment(scanner.next());
		        			System.out.println("--Atualize o predio do departamento");
		        			dUpdate.setBuildingDepartment(scanner.next());
		        			System.out.println("--Atualize o budget do departamento");
		        			dUpdate.setBudgetDepartment(scanner.nextFloat());
		        			
		        			boolean d_res_update = department.update(dUpdate);
		        			System.out.println(d_res_update + " DEPARTAMENTO ATUALIZADO");
		        			System.out.println("");
		        			
		                    break;
		                    
	                    case 4:
		                	System.out.println("--Buscar Departamento--");
		                	
		  		            System.out.println("--Informe o ID do departamento--");
		  		            Department dSelect = department.getById(scanner.nextInt());
		  		            System.out.println("");
		  		            System.out.println("---------------");
		  		            System.out.println("Nome do departamento: " + dSelect.getNameDepartment());
		  		            System.out.println("Nome do predio: " + dSelect.getBuildingDepartment());
		  		            System.out.println("Quantidade de budget: " + dSelect.getBudgetDepartment());
		  		            System.out.println("---------------");
		  		            System.out.println("");
		                    break;
		                    
	                    case 5:   
		                    ArrayList<Department> departments = department.listAll();
		        			for(Department d : departments) {
		        				System.out.println("");
			  		            System.out.println("---------------");
			  		            System.out.println("ID do Departamento: " + d.getIdDepartment());
			  		            System.out.println("Nome do departamento: " + d.getNameDepartment());
			  		            System.out.println("Nome do predio: " + d.getBuildingDepartment());
			  		            System.out.println("Quantidade de budget: " + d.getBudgetDepartment());
			  		            System.out.println("---------------");
			  		            System.out.println("");
		        			}
		        			
		        			break;
		                    
	                    default:
		                    System.out.println("ERRO INESPERADO!!!");  
	                  
	                    }
	                    
	                    }
	                
	                    
	                    
	                    
	                case 2: 
	                	
	                	int numCourse = 0;
	                    
	                    while(numCourse != 9) {
	                    	
	                    	System.out.println("Tabela Course");
		                    System.out.println("Escolha a operação");
		                    System.out.println("(1) Criar Curso");
		                    System.out.println("(2) Deletar Curso");
		                    System.out.println("(3) Atualizar Curso");
		                    System.out.println("(4) Buscar Curso");
		                    System.out.println("(5) Mostrar todos os cursos");
		                    System.out.println("(9) Voltar");
		                   
		                    numCourse= scanner.nextInt();
		                   
		                    switch(numCourse) {
		                    
		                    case 1:
		                    	System.out.println("--Criar Curso--");
		                    	Course cCreate = new Course();
		                    	System.out.println("--Nome do Curso--");
		            			cCreate.setTitle(scanner.next());
		            			System.out.println("--ID do Departamento--");
		            			cCreate.setId_department(scanner.nextInt());
		            			System.out.println("--Valor do curso--");
		            			cCreate.setCredit(scanner.nextFloat());
		            			
		            			boolean c_res_create = course.create(cCreate);
		            			System.out.println(c_res_create + " CURSO CRIADO");
		            			System.out.println("");
		            			
		            			break;
		            			
		                    case 2:
			                	System.out.println("--Deletar Curso--");
			                	System.out.println("--Informe o ID do curso--");
			                	
			                	boolean c_res_delete = course.delete(scanner.nextInt());
			                	System.out.println(c_res_delete + " CURSO DELETADO");
			                	System.out.println("");
			                	
			                    break;
			                    
		                    case 3:
			                	System.out.println("--Atualizar Curso--");
			                	Course cUpdate = new Course();
			                	System.out.println("--Informe o ID do curso--");
			        			cUpdate.setId_course(scanner.nextInt());
			        			System.out.println("--Atualize o titulo do curso--");
			        			cUpdate.setTitle(scanner.next());
			        			System.out.println("--Atualize o ID do departamento--");
			        			cUpdate.setId_department(scanner.nextInt());
			        			System.out.println("--Atualize o valor do curso--");
			        			cUpdate.setCredit(scanner.nextFloat());
			        		
			        			boolean c_res_update = course.update(cUpdate);
			        			System.out.println(c_res_update + " CURSO ATUALIZADO");
			        			System.out.println("");
			        			
			                    break;
			                    
		                    case 4:
			                	System.out.println("--Buscar Curso--");
			                	
			  		            System.out.println("--Informe o ID do Curso--");
			  		            Course cSelect = course.getById(scanner.nextInt());
			  		            System.out.println("");
			  		            System.out.println("---------------");
			  		            System.out.println("Nome do Curso: " + cSelect.getTitle());
			  		            System.out.println("ID do departamento: " + cSelect.getId_department());
			  		            System.out.println("Valor do curso: " + cSelect.getCredit());
			  		            System.out.println("---------------");
			  		            System.out.println("");
			                    break;
			                    
		                    case 5:   
			                    ArrayList<Course> courses = course.listAll();
			        			for(Course c : courses) {
			        				System.out.println("");
				  		            System.out.println("---------------");
				  		            System.out.println("ID do Curso: " + c.getId_course());
				  		            System.out.println("Nome do Curso: " + c.getTitle());
				  		            System.out.println("ID do departamento: " + c.getId_department());
				  		            System.out.println("Valor do curso: " + c.getCredit());
				  		            System.out.println("---------------");
				  		            System.out.println("");
			        			}
			        			
			        			break;
			                    
		                    default:
			                    System.out.println("ERRO INESPERADO!!!");  
		                  
		                    }
		                    
	                    }
	                    
	                    
	                case 3:
	                	
	                	int numStudent = 0;
	                	
	                	while(numStudent != 9) {
	                		
	                		System.out.println("Tabela Student");
		                    System.out.println("Escolha a operação");
		                    System.out.println("(1) Criar Estudante");
		                    System.out.println("(2) Deletar Estudante");
		                    System.out.println("(3) Atualizar Estudante");
		                    System.out.println("(4) Buscar Estudante");
		                    System.out.println("(5) Mostrar todos os estudantes");
		                    System.out.println("(9) Voltar");
		           
		                    numStudent= scanner.nextInt();
		                   
		                    switch(numStudent) {
		                    
		                    case 1:
		                    	System.out.println("--Criar Estudante--");
		                    	Student sCreate = new Student();
		                    	System.out.println("--Nome do Estudante--");
		            			sCreate.setName_student(scanner.next());
		            			System.out.println("--ID do Departamento--");
		            			sCreate.setId_department(scanner.nextInt());
		            			
		            			
		            			boolean s_res_create = student.create(sCreate);
		            			System.out.println(s_res_create + " ESTUDANTE CRIADO");
		            			System.out.println("");
		            			
		            			break;
		            			
		                    case 2:
			                	System.out.println("--Deletar Estudante--");
			                	System.out.println("--Informe o ID do estudante--");
			                	
			                	boolean s_res_delete = student.delete(scanner.nextInt());
			                	System.out.println(s_res_delete + " ESTUDANTE DELETADO");
			                	System.out.println("");
			                	
			                    break;
			                    
		                    case 3:
			                	System.out.println("--Atualizar Estudante--");
			                	Student sUpdate = new Student();
			                	System.out.println("--Informe o ID do estudante--");
			        			sUpdate.setId_student(scanner.nextInt());
			        			System.out.println("--Atualize o nome do estudante--");
			        			sUpdate.setName_student(scanner.next());
			        			System.out.println("--Atualize o ID do departamento--");
			        			sUpdate.setId_department(scanner.nextInt());
			        		
			        			boolean s_res_update = student.update(sUpdate);
			        			System.out.println(s_res_update + " ESTUDANTE ATUALIZADO");
			        			System.out.println("");
			        			
			                    break;
			                    
		                    case 4:
			                	System.out.println("--Buscar Estudante--");
			                	
			  		            System.out.println("--Informe o ID do Estudante--");
			  		            Student sSelect = student.getById(scanner.nextInt());
			  		            System.out.println("");
			  		            System.out.println("---------------");
			  		            System.out.println("Nome do Estudante: " + sSelect.getName_student());
			  		            System.out.println("ID do departamento: " + sSelect.getId_department());
			  		            System.out.println("---------------");
			  		            System.out.println("");
			                    break;
			                    
		                    case 5:   
			                    ArrayList<Student> students = student.listAll();
			        			for(Student s : students) {
			        				System.out.println("");
				  		            System.out.println("---------------");
				  		            System.out.println("ID do Estudante: " + s.getId_student());
				  		            System.out.println("Nome do Estudante: " + s.getName_student());
				  		            System.out.println("ID do departamento: " + s.getId_department());
				  		            System.out.println("---------------");
				  		            System.out.println("");
			        			}
			        			
			        			break;
			                    
		                    default:
			                    System.out.println("ERRO INESPERADO!!!");  
		                  
		                    }
	                	}
	                    
	                    
	                default:
	                    System.out.println("ERRO INESPERADO!!!");    
	                
		            }
			 }
			
			
			
			
			System.out.println(department.close() + " Department close");
			System.out.println(course.close() + " Course close");
			System.out.println(student.close() + " Student close");
			
			
			}catch (SQLException e) {
				e.printStackTrace();
		}
		
		
	}
}

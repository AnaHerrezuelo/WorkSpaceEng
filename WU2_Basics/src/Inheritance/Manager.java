package Inheritance;

import java.util.Scanner;

public class Manager extends Employee{
	String department;
	String degree;

//	public void setname (String name) { //to use a private variable 
//		super.setName(name); 
//	}                                                   
	public Manager(){
	}	
	public Manager(String name, float salary2, String department, String degree) {
		super(name, salary2);
		this.department = department;
		this.degree = degree;
	}
	
	public void askManData(Scanner keyboard) {
		super.askEmpData(keyboard);
		
		System.out.println("give me the deparment: ");
		department=keyboard.next();
		
		System.out.println("Give me the degree: ");
		degree=keyboard.next();
}
	
	
	
	//GETTERS AND SETTERS 
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}

	
	public String toString() {
		String result=" Department: "+department+", degree: " + degree + "\n";
		result=super.toString()+result;
		return result;
	}
	
}// end public class manager

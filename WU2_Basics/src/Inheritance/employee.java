package Inheritance;

import java.util.Scanner;

public class employee {
	String name;
	int salary;
	
//	employee(){
//		
//	}
//	
//	public employee(String name, int salary) {
//		super();
//		this.name = name;
//		this.salary = salary;
//	}

	public void askEmpData(Scanner keyboard) {
			System.out.println("give me the name: ");
			name=keyboard.next();
			
			System.out.println("Give the salary of the employee: ");
			setSalary(keyboard.nextInt());
	}
	
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary<0) {
			System.out.println("It cannot be negative");
			this.salary = 0;
		}else {
			this.salary = salary;			
		}

	}



	//PRINT
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

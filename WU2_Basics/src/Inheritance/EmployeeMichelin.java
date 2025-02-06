package Inheritance;

import java.util.Scanner;

public class EmployeeMichelin {
	static Scanner keyboard = new Scanner(System.in); 
	
	private String nameEmp, nameCom;
	private float age, salaryInc, salary;
	private float salaryBase;
	private boolean full;
	
	public EmployeeMichelin () {
		
	}
	
	public EmployeeMichelin(String nameEmp, String nameCom, float age, float salaryInc, float salaryBase) {
		this.nameEmp = nameEmp;
		this.nameCom = nameCom;
		this.age = age;
		this.salaryInc = salaryInc;
		//this.SALARYBASE = salaryBase;
	}
	   
	
	public void askData() {

		
		System.out.println("give me the name: ");
		nameEmp=keyboard.next();
		
//		System.out.println("Give the age: ");
//		age=keyboard.nextInt();
		

			System.out.println("give me the name of the company: ");
			nameCom=keyboard.next();
			
//			System.out.println("Give the salary base: "); 
//			salaryBase=keyboard.nextInt();
			
//		System.out.println("Give the salary increase: ");
//		salaryInc=keyboard.nextInt();
	}
	
	
	
	
	
	
	
	//GETTERS AND SETTERS 
	public String getNameEmp() {
		return nameEmp;
	}

	public void setNameEmp(String nameEmp) {
		this.nameEmp = nameEmp;
	}

	public String getNameCom() {
		return nameCom;
	}

	public void setNameCom(String nameCom) {
		this.nameCom = nameCom;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public float getSalaryInc() {
		return salaryInc;
	}

	public void setSalaryInc(float salaryInc) {
		this.salaryInc = salaryInc;
	}

	public float getSalaryBase() {
		return salaryBase;
	}

	public void setSalaryBase(float salaryBase) {
		this.salaryBase = salaryBase;
	}
	
	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	//PRINT
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "EmployeeMichelin [nameEmp=" + nameEmp + ", nameCom=" + nameCom + ", age=" + age + ", salaryInc="
				+ salaryInc + ", salary=" + salary + ", SALARYBASE=" + salaryBase + "]";
	}
	

}

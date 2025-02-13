//main Employee, Manager
package Inheritance;

import java.util.Scanner;


public class mainEmployee {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		

		
		final int MAX=1;
		Employee [] employees = new Employee[MAX];
		Manager [] manager = new Manager[2];
		
		
		
//		Manager man = new Manager();
//		man.askManData(keyboard);
//		man.printToString();
		
		
		for(int i=0;i<employees.length;i++) {
			System.out.println("employee " + (i+1));
			employees[i]= new Employee();
			employees[i].askEmpData(keyboard);
			
		}	
		for(int i=0;i<manager.length;i++) {
			System.out.println("manager " + (i+1));
			manager[i]= new Manager();
			manager[i].askManData(keyboard);
		}
		
		
		for(int i=0;i<employees.length;i++) {
			employees[i].printToString();
		}
		for(int i=0;i<manager.length;i++) {
			manager[i].printToString();
		}
		
		
//		employee aa = new employee("aaa", 234);
//		manager bb = new manager("bbb", 234, "BB", "BB");
//		manager cc = new manager("ccc", 234, "CC", "CC");	
//		
//		
//		aa.printToString();
//		bb.printToString();
//		cc.printToString();
		
		
		

	}//	end public static void main(String[] args)
	
	
}// end public class mainEmployee

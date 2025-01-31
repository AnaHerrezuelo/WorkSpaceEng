package Inheritance;

import java.util.Scanner;


public class mainEmployee {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		final int MAX=2;
		employee [] employees = new employee[MAX];
		
		for(int i=0;i<employees.length;i++) {
			System.out.println("employee " + (i+1));
			employees[i]= new employee();
			employees[i].askEmpData(keyboard);
			
		}
		
		for(int i=0;i<employees.length;i++) {
			employees[i].printToString();
		}
		

		

	}//	end public static void main(String[] args)
	
	
}// end public class mainEmployee

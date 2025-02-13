//main EmployeeMichelin, boss
package Inheritance;

public class mainExercise12 {
	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
		
		final int MAX=2;
		EmployeeMichelin [] employees = new EmployeeMichelin [MAX];
		
		for(int i=0;i<employees.length;i++) {
			System.out.println("employee " + (i+1));
			employees[i]= new EmployeeMichelin();
			employees[i].askData();
		}	
		for(int i=0;i<employees.length;i++) {
			employees[i].printToString();
		}

		 
		
	}//	end public static void main(String[] args)
}// end public class mainExercise12
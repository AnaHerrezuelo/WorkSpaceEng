package Objects;

import java.util.Scanner;

public class MainActClas {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name = null, group = null;
		//int grade;
		int [] grades  = new int [4];
		
//		Alumno [] students  = new Alumno [4];
		
		Alumno account = new Alumno(); 
		
		
        //introduce information
//	        account.introduceInfo(keyboard);

        	
        
        
        //mostrar information
        account.printToString();        
	}//end main
	
	
//	public static void introduceInfo (String name, String group, Scanner keyboard, int [] grades) {
//		System.out.print("gave me the name:");
//		name = keyboard.next();
//		
//		System.out.print("gave me the group:");
//		group = keyboard.next();
//		
//		for(int i=0; i<grades.length;i++) {
//			System.out.print("gave me the Grades of the student "+ i +"/"+ grades.length +":");
//			grades[i]= keyboard.nextInt();
//		}//end introduceInfo
//	}

}
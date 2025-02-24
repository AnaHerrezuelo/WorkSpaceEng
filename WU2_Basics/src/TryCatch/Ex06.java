package TryCatch;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int num;
		
		System.out.println("Insert a number ");
		
		try {
			num=pedirEntero();
			System.out.println("has inserted: " + num);
		}catch(NumberFormatException e) {
			System.out.println("you has inserted letters instead of numbers");
		}
		
		
		
	}//end public static void main(String[] args) 
	static String askString() {
		String cadena="";
		Scanner keyboard = new Scanner(System.in);
		try {
			cadena=keyboard.next();
		}catch(Exception e) {
			System.out.println("Exit, error");
			System.exit(0);
		}
		keyboard.close();
		return cadena;
	}
	
	static  int pedirEntero() {
		String cadena;
		int num;
		
		cadena=askString();
		num=Integer.parseInt(cadena);
		
		return num;
	}
	public static void askInterger(Scanner keyboard, String mesage) {
		int num;
	//	String cad=askString(keyboard, mesage);
		
		
				
	}
}//end class Ex06

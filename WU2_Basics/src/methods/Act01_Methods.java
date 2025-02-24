package methods;

import java.util.Scanner;

public class Act01_Methods {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int aux=askInt(keyboard);
		System.out.print(aux);
		
		
		
		
	}//end of public static void main 
	
	public static int askInt(Scanner keyboard) {
		int number;
		System.out.print("give me a number: ");
		number=keyboard.nextInt();
		return number;
	}
}//end of public class

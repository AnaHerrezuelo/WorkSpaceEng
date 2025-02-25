package OwnExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OwnExceptionExample {

	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		int num;
		int num1, num2;
		num=askInterger(keyboard,"give me the num");

		
		try {
			num(num);	
		}catch(IntervalException e) {
			
		}
		
	}//end public static void main(String[] args) 
	
	public static int askInterger(Scanner keyboard, String message) {
		int num = -1;
		boolean exit=true;
		
		do {
		try {
			System.out.println(message);
			num=keyboard.nextInt();
		}catch(InputMismatchException e) {
			System.err.println("Need an Interger");
			keyboard.nextLine();
			exit=true;
			
		}
		}while(exit);
		return num;
	}//end AskInterger
	
	
	
	public static void num (int num) throws IntervalException{
		if(num>=1 && num<21) {
			System.out.println("a");
		}else {
			throw new IntervalException("b");
		}
	}

}

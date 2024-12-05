package Methods;

import java.util.Scanner;

public class Act05_Methods {
	public static void main (String [] arg) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Give me the num1: ");
		int num1=keyboard.nextInt();
		
		System.out.print("Give me the num2: ");
		int num2=keyboard.nextInt();
		
		addition(num1, num2);
		
	}//main
	
	public static void addition (int num1, int num2) {
		if(num1<num2) {
			if(num2%num1 == 0) {
				System.out.print("es divisor");
			}else {
				System.out.print("no es divisor");
			}
		}else {
			if(num1%num2 == 0) {
				System.out.print("es divisor");
			}else {
				System.out.print("no es divisor");
			}
		}
	};
	
	
}//public
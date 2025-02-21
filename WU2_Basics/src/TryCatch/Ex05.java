package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int div, divisor, count=0;
		boolean keep;
		
		do {
			try {
				System.out.println("Give me the nummber  1: ");
				div=keyboard.nextInt();
				System.out.println("Give me the nummber  2: ");
				divisor=keyboard.nextInt();
				
				int result=div/divisor;
				System.out.println("result: " + result);
			}catch(ArithmeticException e) {
				System.out.println("You cannot insert 0 as the divisor");
				count=3;
			}catch(InputMismatchException obj) {
				System.out.println("you cannot insert letters");
				System.out.println(obj.toString());
				count++;
				System.out.println(count);
			}catch(Exception e) {
				System.out.println("unexpected error");
			}finally {
				keyboard.nextLine();
				System.out.println("we closed the program, There are too many wrong entries");
			}	
		}while(count<3);

	}//end public static void main(String[] args) 

}




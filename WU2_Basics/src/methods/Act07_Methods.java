package methods;

import java.util.Scanner;

public class Act07_Methods {
	public static void main (String [] arg) {
		table();
	}//main
	
	public static int askNumber () {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Gimme a number: ");
		int num = keyboard.nextInt();
		System.out.println(num);
		return num;
	}//ask num
	
	
	public static void table () {
		int num=askNumber();

		for(int i=1; i<11; i++) {
			
			System.out.println(i + "x" + num + " = " + (i*num));
		}
	}// table
}

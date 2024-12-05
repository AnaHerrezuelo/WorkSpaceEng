package Methods;

import java.util.Scanner;

public class Act04_Methods {
	public static void main (String [] arg) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give me the max: ");
		float max=keyboard.nextFloat();
		
		addition(max);
		
	}//main
	
	public static void addition (float max) {
		float sum = 0;
		for(int i=1; i<max+1;i++) {
			System.out.print(i);
			sum = sum + i;
		}
		System.out.print(sum);
	};
	
	
}//public

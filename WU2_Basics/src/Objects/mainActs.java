package Objects;

import java.util.Scanner;

public class mainActs {
	public static void main(String[] args) {
		/* ACT07 
		it works */
			int side1, side2;
			Scanner keyboard = new Scanner(System.in);
			
			
			
			System.out.print("give me the side1: ");
			side1=keyboard.nextInt();
			System.out.print("give me the side2: ");
			side2=keyboard.nextInt();
			
			
			Act07 rectangle = new Act07 (side1, side2);
			rectangle.area(side1, side2);
			
	}//end void main
}//end public class

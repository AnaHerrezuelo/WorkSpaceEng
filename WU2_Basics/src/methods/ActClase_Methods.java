package methods;

import java.util.Scanner;

public class ActClase_Methods {
	public static void main (String [] arg) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Choose an option: ");
		System.out.println("1: Circle");
		System.out.println("2: Square");
		System.out.println("3: Triangle");
		String sel = keyboard.nextLine();
		
		if(sel.equalsIgnoreCase("circle")) {
			circle(keyboard);
		}else if(sel.equalsIgnoreCase("square")) {
			//square(keyboard);
		}else if(sel.equalsIgnoreCase("triangle")) {
			
		}
	}//end main
	
	public static void circle (Scanner keyboard) {
		System.out.println("give me the radio :");
		int radio = keyboard.nextInt();	
		double area= (Math.PI * (radio*radio));
		//System.out.println(radio);
		//return area;
		printCircle(area);
	}
	
	public static void printCircle (double areaCircle) {
		System.out.println(areaCircle + " cms²");
	}
	
//	public static void square (Scanner keyboard) {
//		System.out.println("give me the side :");
//		int side = keyboard.nextInt();	
//		double area= (side*side);
//		//System.out.println(radio);
//		//return area;
//		printSquare(area);
//	}
//	
//	public static void printSquare (double square) {
//		System.out.println(square + " cms²");
//	}
	
}

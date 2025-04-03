package Objects;

//import java.util.Scanner;

/*
 * Write a program that asks for the sides of a rectangle 
 * and offers the possibility to choose between calculating 
 * the area or the perimeter of the rectangle, 
 * returning on the screen the value of these
 */

//public class MainRectangleTeacher {

//	public static void main(String[] args) {
//		int sideA = 0, sideB = 0;
//		int opt = 0;
//		Scanner keyboard = new Scanner(System.in);
//
//		String[] options = { "1-Perimeter", "2-Area", "3-Change dimensions", "4-Exit" };
//		
//		Rectangle rect = askSides(keyboard);
//		System.out.println("<<>> "+rect);
//		do {
//			opt = printMenu(options, keyboard);
//
//			switch (opt) {
//				case 1:
//					System.out.print("The perimeter is: ");
//					System.out.println(rect.perimeter());
//					break;
//				case 2:
//					System.out.print("The area is: ");
//					System.out.println(rect.area());
//					break;
//				case 3:
//					rect = askSides(keyboard);
//					System.out.println(rect);
//					break;
//				case 4:
//					System.out.println("BYE");
//					break;
//				default:
//					System.err.println("From 1 to 4 Little STUPID");
//					break;
//			}
//		} while (opt != 4);
//	}

//	public static Rectangle askSides(Scanner keyboard) {
//		boolean repeat = true;
//		int sideA=0, sideB=0;
//		Rectangle rect;
//		
//		while (repeat) {
//			System.out.println("give first side");
//			sideA = keyboard.nextInt();
//			System.out.println("give second side");
//			sideB = keyboard.nextInt();
//			if (sideA <= 0 | sideB <= 0) {
//				System.err.println("you give me a negative value");
//				repeat = true;
//			} else
//				repeat = false;
//		}
//		rect = new Rectangle(sideA, sideB);
//		return rect;
//	}
//
//	public static int printMenu(String[] options, Scanner keyboard) {
//		int opt;
//		for (int i = 0; i < options.length; i++) {
//			System.out.println(options[i]);
//		}
//		System.out.println("give me an option");
//		opt = keyboard.nextInt();
//		return opt;
//	}
//
//}

package Warehouse_Ana_Exceptions;

//import java.util.Scanner;

public class appliances_App {

	public static void main(String[] args) throws NumberFormatexception, negativeNumberException {
//		Scanner keyboard = new Scanner(System.in);

		final int MAX = 10;

		Machines machine[] = new Machines[MAX];
		try {
			machine[0] = new Machines('a', "4");
			machine[1] = new Machines('a', "5");
			machine[2] = new Dishwashers('a', "3", 3, 45);
			machine[3] = new Dishwashers('a', "3", 3, 45);
			machine[4] = new WashingMachines('a', "3", 3, 45);
			machine[5] = new WashingMachines('a', "3", 3, 45);
			machine[6] = new Refrigerator('a', 3, true);
			machine[7] = new Refrigerator('a', 3, true);
			machine[8] = new WaterWasters('a', "3", 5);
			machine[9] = new WaterWasters('a', "3", 6);
		} catch (NumberFormatException e) {
			System.err.println("no letters");
		} catch (negativeNumberException e) {
			System.err.println("no negative numbers");
		}
		
		
		

		try {
			for (int i = 0; i < machine.length; i++) {
				machine[i].printToString();
			}
		} catch (NullPointerException e) {
			System.err.println("null error");
		}
		
		
//		for (int i = 0; i < machine.length; i++) {
//			try {
//				machine[i].printToString();
//			} catch (NullPointerException e) {
//				System.err.println("null error");
//			}		
//		}
		
		
		
		
		
		
		

	}// end public static void main(String[] args)
}// end public class appliances_App

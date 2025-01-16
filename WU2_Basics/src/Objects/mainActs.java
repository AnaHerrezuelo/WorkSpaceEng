package Objects;

import java.util.Scanner;

public class mainActs {
	public static void main(String[] args) {
		/* ACT07 
		it works 
			int side1, side2;
			int sel;
			Scanner keyboard = new Scanner(System.in);
			
			
			
			System.out.print("give me the side1: ");
			side1=keyboard.nextInt();
			System.out.print("give me the side2: ");
			side2=keyboard.nextInt();
			
			System.out.println("what do u want to get?: ");
			System.out.println("deal 1 for the area: "
					+ "\ndeal 2 for the perimeter: "
					+ "\ndeal 3 for change the dimensions"
					+ "\ndeal 4 for exit");
			sel=keyboard.nextInt();			
			
			Act07 rectangle = new Act07 (side1, side2);
			
			switch(sel) {
			case 1:
				System.out.print("The area is: " + rectangle.area());
				break;
			case 2:
				System.out.print("The perimeter is: " + rectangle.perimeter());
				break;
			case 4:
				System.err.println("exit");
			default:
				System.out.println("not valid");
			}
			
			
//			It just shows the area and the perimeter
//			System.out.print("the Area is: ");
//			System.out.print(rectangle.area());
//			
//			System.out.println();
//			
//			System.out.print("The perimeter is: ");
//			System.out.print(rectangle.perimeter());
			
		*/
		
		
		
		
		/* ACT09 
		IT WORKS */
		//String [] students = new String [];
		Act09 [] students  = new Act09 [4];
		students[0]= new Act09("Aaaa",(short) 10);
		students[1]= new Act09("Bbbb",(short) 15);
		students[2]= new Act09("Cccc",(short) 20);
		students[3]= new Act09("Dddd",(short) 89);
		
		/* it works it compares 2 students
		Act09 anselmo = new Act09 ("anselmo", (short)93);
		Act09 maca = new Act09 ("maca", (short)83);
		anselmo.isOlderThan(maca);
		System.out.println(anselmo.isOlderThan(maca));
		*/
		
		
		
//		public static int oldestStudent (Act09 group []){
//			int maxAge=group[0].getAge();
//			int pos =0;
//			for(int i=1; i< group.length;i++) {
//				if(maxAge<group[i].getAge()) {
//					maxAge = group[i].getAge();
//					pos=i;
//				}
//			}
//			return = i;
//		}
		
		
		
		
//		public static Act09 giveMeOldestOne (Act09 group []) {
//			
//		}

		

		
		
		
		
	}//end void main
}//end public class

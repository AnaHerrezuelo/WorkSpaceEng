package Examen2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int max;
		int sel;
		
//		Pants pant = new Pants();
//		pant.askData();
//		pant.printToString();		
		
		
		System.out.println("How many pants would you like to introduce?: ");
		max=keyboard.nextInt();
//		max=2;
		
		Pants [] pants  = new Pants [max];
//		pants[0]=new Pants(32, "green");
//		pants[1]=new Pants(32, "blue");
		
		do {
			System.out.println("Menu: "
					+ "\n1 for insert pants"
					+ "\n2 for show all the pants"
					+ "\n3 for show all the pants by color"
					+ "\n4 count pants by size"
					+ "\n5 for exit");
			sel=keyboard.nextInt();
			switch(sel) {
			case 1:				
				for(int i=0;i<pants.length;i++) {
					pants[i]=new Pants();
					pants[i].askData();
				}
				break;
			case 2:
				for(int i=0;i<pants.length;i++) {
					pants[i].printToString();;
				}
				break;
			case 3:
				System.out.println("Give me the color: ");
				String color = keyboard.next();
				
				for(int i=0;  i<pants.length;i++ ) {
					if(pants[i].color.equals(color)) {
						System.out.println(pants[i]);
					}
				}
				break;
			case 4:
				System.out.println("Give me the size: ");
				int size = keyboard.nextInt();
				int count=0;
				
				for(int i=0;  i<pants.length;i++ ) {
					if(pants[i].size==size) {
						count++;	
					}
				}
				System.out.println("ther are " + count + " pants of these size");
				break;
			}
			
		}while(sel!=5);
		
		keyboard.close();
	}


}

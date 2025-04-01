package Examen2;

import java.util.Scanner;

enum PantsColors {
	GREEN ("Brillant"),
	BLUE ("Navy"),
	BLACK ("night"),
	ORANGE ("Fruit");
	
	String description;
	PantsColors(String string){
		this.description=string;
	}

}

public class EnumApp {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
//		Pants2 pant = new Pants2 (30,PantsColors.BLUE);
//		System.out.println(pant.toString());	
//		
//		Pants2 pant2 = new Pants2 (30,PantsColors.BLUE.description);
//		System.out.println(pant.toString());
		
		
		
		
		
//		System.out.println("gimme the color description: ");
//		String color=keyboard.next();
//		
//		if(color.equalsIgnoreCase(PantsColors.BLUE.description)) {
//			System.out.println("good");
//		}
		
		
		Pants2 pant3 = new Pants2 (30,PantsColors.BLUE);
		switch(pant3.getColor()) {
		case BLUE:
			System.out.println("it works");
			System.out.println(pant3.toString());
			break;
		
		case GREEN:
			System.out.println("it works");
			System.out.println(pant3.toString());
			break;
			
		case BLACK:
			System.out.println("it works");
			System.out.println(pant3.toString());
			break;
			
		}
		keyboard.close();
		
	}
}

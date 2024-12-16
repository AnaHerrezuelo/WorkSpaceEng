package Methods;
	import java.util.Scanner;
	import java.util.Arrays;
	
public class examen {




		public static void main(String[] args) {
			Scanner keyboard = new Scanner (System.in);
			int selection = 0;
			boolean value1 = false;
			String array [] = null;
			

			do {
				System.out.println("choose an option: ");
				System.out.println("1: Insert values");
				System.out.println("2: Print the copy");
				System.out.println("3: Create Copy in reverse");
				System.out.println("4: Show the larguest character");
				System.out.println("5: How many times appear the the character");
				System.out.println("6: Exit");
				selection = keyboard.nextInt();
				
						if(selection<1 || selection>6) {
							System.out.println("You must choose and existing option!! ");
						}else if(selection != 1 && value1==false) {
							System.out.println("You must choose the option 1 first!! ");
						}else{
							value1=true;
							switch (selection) {
							case 1:
								//array=insertValues(keyboard);
								break;
							case 2:

								break;
							case 3:
								break;
							case 4:

								break;
							case 5:
								break;
							}//end switch
						}//end ifs
						
						
				
			}while(selection!=6);
			
			

		}//end main
		
		public static String []  insertValues () {	
			Scanner keyboard = new Scanner (System.in);
			System.out.println("how many values?: ");
			int size = keyboard.nextInt();
			keyboard.nextLine();
			
			String [] array  = new String [size];
			
			for(int i=0;i<array.length;i++) {
				System.out.println("Insert values into the array " + i);
				array[i] = keyboard.nextLine();
			}
			
//			for(int i=0;i<array.length;i++) {
//				System.out.println(array[i]);
//
//			}
			//keyboard.nextLine();
			//printVector(array);
			return array;
		}//end one
		
		
		public static String []  printVector (String [] array) {
			
			//array  = new String [array.length];
//			System.out.println(array[i]);
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);

			}

			return array;
		}
		
		

}


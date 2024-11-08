import java.util.Scanner;

public class ArraysExercices {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/* SUPERCUTRE 
		int grades [] =new int[4] ;
		grades[0] = 1;
		grades[1] = 6;
		grades[2] = 7;
		grades[3] = 3;
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		 
		*/
		
		
		/* INPUT DATA INTO THE VECTOR FROM KEYBOARD 
		
		int count = 0;
		
		System.out.print("how many grades do u want? ");
		count = keyboard.nextInt();
		
		int grades [] = new int[count];
		int students [] = new int[count];
		
		for(int i=0; i<count; i++){
			System.out.print("add a grade: ");
			grades[i] = keyboard.nextInt(); 
		};
		
		for(int i=0; i<count; i++){
			students[i] = i; 
		};
		
		
		for(int s=0; s<count; s++){
			System.out.print("Student" + students[s] + ": ");
			System.out.println(grades[s]);
		};
		
		*/
		
		
		
		
		
		
		
		/*
		int count = 0;
		int sum;
		int avg;
		int max;
		int min;
		
		System.out.print("how many numbers do u want? ");
		count = keyboard.nextInt();
		
		int numbers [] = new int[count];
		
		for(int i=0; i<count; i++){
			System.out.print("add a number: ");
			numbers[i] = keyboard.nextInt(); 
		};
		*/
		
		
		
		
		
		/* REVERSE ARRAY TRAVEL
		int count = 0;;
		
		System.out.print("how many numbers do u want? ");
		count = keyboard.nextInt();
		
		int numbers [] = new int[count];
		
		for(int i=0; i<count; i++){
			System.out.print("add a number: ");
			numbers[i] = keyboard.nextInt(); 
		};
		
		
		//  array fácil
		//int [] numbers = {1,2,3, 8};
		//for(int i=0; i<numbers.length; i++){
		//	System.out.println(numbers[i]);
		//};
		
		

		for(int i=count-1; i>=0; i--){
			System.out.println(numbers[i]);
			//System.out.println(i);
		};
		
		 */
		
		
		
		
		/* SIZE IN A CONSTANT AND IN A VARIABLE 
		final int numbers [] = new int [3];
		int numbers2 [] = new int [4];
		
		for(int i=0; i<3; i++){
			System.out.print("add a number: ");
			numbers[i] = keyboard.nextInt(); 
		};
		for(int i=0; i<4; i++){
			System.out.print("add a number: ");
			numbers2[i] = keyboard.nextInt(); 
		};
		*/
		
		
		
		/* COPY THE CONTENT OF AN ARRAY IN ANOTHER */
		
		int [] original  = {3,5,7,3};
		int copy[] = new int [original.length];
		
		
		for(int i=0; i<copy.length; i++){
			copy[i]=original[i];
		};
		for(int i=0; i<copy.length; i++){
			System.out.print(copy[i] + " ");
		};
		
		
		System.out.println(" ");
		
		for(int i=0; i<original.length; i++){
			System.out.print(original[i] + " ");
		};
		

	}
}

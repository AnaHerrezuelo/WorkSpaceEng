import java.util.Scanner;
//1,2,4,5,7.8
public class UT5ExercisesArrays {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	/*EXERCISE 1
		int numbers [] = new int[4];
		
		for(int i=0; i<4;i++){
			System.out.print("Give me 4 numbers: ");
			numbers[i] = keyboard.nextInt();
		};
		
		for(int i=0; i<4; i++) {
			System.out.print(numbers[i]+ ", ");
		};
	*/
		
		
		
		
	/*EXERCISE 2	
		int size;
		
		do {
			System.out.print("Give me the size (must be +1): ");
			size = keyboard.nextInt();	
		}while(size<1);
		
		int numbers [] = new int[size];
		
		for(int i=0; i<size;i++){
			System.out.print("Give me the numbers: ");
			numbers[i] = keyboard.nextInt();
		};
		
		for(int i=0; i<size; i++) {
			System.out.print(numbers[i]+ " ");
		};
	*/
		
		
		
	/*EXERCISE 4 
		int size = 3;
		String students [] = new String[size];
		int grades [] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Give me the name: ");
			students[i] = keyboard.nextLine();
			
			System.out.println("Give me the grade: ");
			grades[i] = keyboard.nextInt();
			
			//System.out.println(students[0] + " " + students[1]);
		};
		

		for(int i=0; i<size; i++) {
			System.out.println(students[i]+ " - " + grades[i]);
		};
	*/	
		
		
		
		
		
	/*EXERCISE 5 
		int size=7;
		int num;
		String [] names = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "sunday"};
		
		System.out.println("give me a number: ");
		num = keyboard.nextInt();
		
		if(num<1 || num>7){
			System.out.println("error");
		}else{
			System.out.println(names[num]);
		}
		
		//for(int i=0; i<size; i++) {
		//	System.out.println(names[i]);
		//};
	*/	
		
		
	/*EXERCISE 7
		int size=3;
		int grades [] = new int[size];
		int order[] = new int [grades.length];
		int max=0;
		int pos=0;
		
		for(int i=0; i<size; i++) {
			System.out.print("Give me a number: ");
			grades[i] = keyboard.nextInt();
		};
		
		for(int j=0; j<size; j++) {
			max=0;
			for(int k=0; k<grades.length; k++) {
				if(max<grades[k]) {
					max=grades[k];
					pos=k;
				}
			};
			order[j]=max;
			grades[pos]=-1;
		}
		
		
		for(int i=0; i<size; i++) {
			System.out.print(grades[i] + ", ");
		};
		
		System.out.println( " ");
		for(int i=0; i<size; i++) {
			System.out.print(order[i] + ", ");
		};
	*/	
		
		
	/* EXERCISE 8 */
		int dni;
		int num;
		String [] letra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D","X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E", "O"};
		//String [] letra2 = {"TRWAGMYFPDXBNJZSQVHLCKEO"};
		
		System.out.print("Give me a number: ");
		dni = keyboard.nextInt();
		
		
		num=dni/23;
		num=num*23;
		num=dni-num;
		
		//System.out.println(letter);
		System.out.println(num);
		System.out.println(letra[num]);
		//System.out.print(letter=letra2.charAt(dni%23));
		
		
	} // end of public static void main (String [] args)
} //end of public class



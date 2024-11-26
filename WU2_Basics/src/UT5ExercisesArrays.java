import java.util.Scanner;
import java.util.Arrays;
//1,2,4,5,7.8
public class UT5ExercisesArrays {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/* UT5 & WU3 EXERCISES */
		
		
		
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
		
		
		
		
		
		
		/* EXERCISE 3 
		 IT WORKS
		 
		int grades [][];
		int rows=4;
		int columns=3;
		String students[] = new String[rows];
		
		grades = new int[rows][columns];


		for(int i=0;i<rows;i++) {
			System.out.print("give me the name: ");
			students[i] = keyboard.nextLine();
			//System.out.println(" ");
		}
		
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print("give me the grades for "+ students[i] + ": ");
				grades[i][j] = keyboard.nextInt();
			}
		}
		
		for(int i=0;i<rows;i++) {
			int avg=0;
			System.out.print(students[i]);
			System.out.print(" - ");
			for(int j=0;j<columns;j++) {
				avg=avg+grades[i][j];
				//System.out.print(grades[i][j]);
			}
			avg=avg/3;
			System.out.print(avg);
			System.out.println(" ");
		}
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
		
		
		
		
		
	/* EXECISE 6 
		    WORKS 

		int rows;
		int columns;
		int num=1;
		
		 System.out.print("Enter the number of rows and columns: ");
	        rows = keyboard.nextInt();
	        columns = rows;

	        
	        float[][] table = new float[rows][columns];

	        //System.out.println("Enter the elements of the matrix (decimal values):");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                //System.out.print("Give me the number r/c " + i + "/" + j + ": ");
	            	System.out.print("Give me the number " + num + ": ");
	                table[i][j] = keyboard.nextFloat();
	                num++;
	            }
	        }

	        // Display the matrix row by row
	        System.out.println("The matrix is:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                //System.out.print(table[i][j] + "  ");
	                System.out.printf("%.2f",table[i][j]);
	                System.out.print("  ");
	            }
	            System.out.println(" "); // Move to the next row
	        }
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
		
		
		
		
		
		
		
	/* EXERCISE 8 
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
	*/	
		
		
		
		
		
		/* Buscar estos ejercicios x teams */
		/* EXERCISE 9 */
		
		
		/*  LINEAR SEARCH EX9  
		
			int size=6;
			int grades [] = new int [size];
			int num;
			int max=grades[0];
			int shortgrades [] = new int [grades.length];
			int pos;
			
			
			
			for (int i = 0; i < size; i++) {
				System.out.print("Enter the grade: ");
		        grades[i]=keyboard.nextInt();
		    }
			
			for (int j = 0; j < size; j++) {
				//System.out.print(grades[j]);
		    };
		    
		    
		    System.out.print("What grade?: ");
	        num=keyboard.nextInt();
		    for (int k = 0; k < size; k++) {
		    	if(grades[k] == num ) {
		    		pos=k;
		    	}
		    };

		*/
		
		
		
		
		
		
		/*  EXERCISE 10 */
		//float height;
		
		int  size;
		
		
		System.out.print("Enter the size: ");
	    size=keyboard.nextInt();
	    
	    float heights [] = new float [size];
	    float[] originalHeights = new float[size];
	    
	    for (int i = 0; i < heights.length; i++) {
			System.out.print("Enter the height: ");
	        heights[i]=keyboard.nextFloat();
	    }
	    
	    Arrays.sort(heights);
		
		
	    for (int i = 0; i < heights.length; i++) {
			System.out.print(heights[i]);
			System.out.println();
	    }
		
		
		
	    
	    
	    
		
		
	} // end of public static void main (String [] args)
} //end of public class




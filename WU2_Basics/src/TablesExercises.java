import java.util.Scanner;

public class TablesExercises {
	public static void main (String [] Args) {
		Scanner keyboard = new Scanner(System.in);
		
	/*	
		int students [][];
		int rows=2;
		int columns=6;
		
		String [] Module ={"Computer System", "Databases", "Programming", "ML", "DataAccess"};
		students = new int[rows][columns];
		int secondVector[]= {23,24,25,26,27,28};
		
		
		students[0][0]=13;
		students[0][1]=27;
		students[0][2]=25;
		students[0][3]=21;
		students[0][4]=19;
		students[0][5]=16;
		students [1]=secondVector;
		
		
		
		//int students1 [][]= {{13,14,15,16,17,18},{21,17,24,26,30,30}};
		
		//System.out.println(students[0][3]);
		for(int i=0; i<columns; i++) {
			System.out.print(students1[0][i] + ", ");
		};
	*/		
		
		
		
	/*	
		int students [][];
		int rows=2;
		int columns=6;
		
		String [] Module ={"Computer System", "Databases", "Programming", "ML", "Development Enviroment", "DataAccess"};
		students = new int[rows][columns];
		int secondVector[]= {23,24,25,26,27,28};
		
		
		
		int students1 [][]= {{13,14,15,16,17,18},{21,17,24,26,30,30}};
		
		System.out.println(students1.length);
		System.out.println(students1[0].length);
		
		
		 SACA TODA LA DATA EN FILAS
		for(int row=0;row<students1.length;row++) {
			for(int column=0;column<students1[row].length;column++) {
				System.out.print(students1[row][column] + ", ");
			}
			System.out.println(" ");
		}
		
		
		SACA TODA LA DATA POR COLUMNAS
		for(int column=0;column<columns;column++) {
			for(int row=0;row<students1.length;row++) {
				System.out.print(students1[row][column] + ", ");
			}
			System.out.println(" ");
		}
	*/	
		
		
		
		
		
		/* EXERCISE 3 OF THE WORD DOCUMENT WU3 EXERCISES 
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
		
		
		
		/* EXECISE 6 OF THE WORD DOCUMENT  WU3 EXERCISES   WORKS 

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
		
		
		
		/* EXERCISE 9 */
		
		
		
		
		
		
		
		
		
		/*  LINEAR SEARCH EX9  
		
		int size=6;
		int grades [] = new int [size];
		
		
		System.out.print("Enter the grade: ");
		for (int i = 0; i < size; i++) {
            grades[i]=keyboard.nextInt();
        }

		*/
		keyboard.close();
		
	} // end of public static void main (String [] args)
} //end of public class


import java.util.Scanner;

public class ArraySearching {
	public static void main (String [] Args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		/*  LINEAR SEARCH EX9  */
		
		int size=6;
		int grades [] = new int [size];
		int num;
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
		
		

		
		
		
		
	};
};

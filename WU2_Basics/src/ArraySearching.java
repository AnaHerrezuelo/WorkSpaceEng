import java.util.Scanner;

public class ArraySearching {
	public static void main (String [] Args) {
		Scanner keyboard = new Scanner(System.in);
		
		
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
		
		
		
		
		
		
		
		
		
		
		/* EXAMPLE EXERCISE (44)

		int [] numbers = {1, 2, 3, 4 };
		int searchValue = 2;
		boolean keepGoing=true;
		
		
		for (int position = 0; position < numbers.length && keepGoing==true; position++) {
			if(numbers[position] == searchValue) {
				System.out.print("position: " + position);
			}else {
				if(numbers[position]>searchValue) { 
					keepGoing=false;
				}
			}
			System.out.print("*");
		}
		
		*/
		
		
		
	
		
		
		
		
		
		/* EXERCISE 12 BINARY SEARCH 
		
		//int size=6;
		//int grades [] = new int [size];
		int grades [] = {1,2,3,4,5,6};
		int num;
		
		
//		for (int i = 0; i < size; i++) {
//			System.out.print("Enter the grade " + i + ": ");
//	        grades[i]=keyboard.nextInt();
//	    }
		
		System.out.print("Enter the number you want to search: ");
        num=keyboard.nextInt();

        
        
      int up,low,mid;
      low=0; up=grades.length-1; mid=(low+up)/2;
      
      while(low<up && grades[mid]!=num) {
    	  if(grades[mid]>num){
    		  up=mid-1;  
    	  }else {
    		  low=mid+1;
    	  }
    	  mid=(low+up)/2;
      }
      
      
      if(grades[mid]==num){
    	  System.out.print("position: "+ mid);
	  }else {
		  System.out.print("it is not in the vector");
	  }
		
	*/	
		
		

      
      
		keyboard.close();
		
		
		
		
	} // end of public static void main (String [] args)
} //end of public class

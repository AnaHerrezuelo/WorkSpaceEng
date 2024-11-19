import java.util.Scanner;

public class ArrayOrdenation {
	public static void main (String [] Args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		/* BUBBLE METHOD ORDENATION*/
		int array [] = {1,2,3,4,5,6};
		int max, aux;
		
		for (int i=0; i<array.length;i++) {
			for (int j=0; j<array.length-1;j++) {
				if(array[i]>array[i+1]) {
					aux=array[i];
				
				}
			}
		}
		
		for(int k=0;k<array.length;k++) {
			System.out.print(array[k]);
		}
		
		
		
	} // end of public static void main (String [] args)
} //end of public class
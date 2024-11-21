import java.util.Scanner;

public class ArrayOrdenation {
	public static void main (String [] Args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		/* BUBBLE METHOD ORDENATION it works
		int array [] = {5,2,4,3,8,9};
		int max, aux;
		
		for (int i=0; i<array.length;i++) {
			for (int j=0; j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
			}//for-j
			
			for(int k=0;k<array.length;k++) {
			System.out.print(array[k]+" ");
			}//for-k
			System.out.println(" ");
		}//for-i
		*/
		
		
		
		
		
		
		 
		/* BUBBLE METHOD ORDENATION */
		int array [] = {5,2,4,3,8,9};
		int max, aux;
		
		for (int i=0; i<array.length;i++) {
			for (int j=0; j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
			}//j
			
			for(int k=0;k<array.length;k++) {
			System.out.print(array[k]+" ");
			}//k
			System.out.println(" ");
		}//i
		
		
		
		
		
		
		
	} // end of public static void main (String [] args)
} //end of public class
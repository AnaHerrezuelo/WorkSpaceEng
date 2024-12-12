package Exercises;
import java.util.Scanner;

public class Act50 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num;
		int rem;
		int sum = 0;
		

		
		 do{
			System.out.print("Give me a number1: ");
			num=keyboard.nextInt();
			if(num<0) {
				System.out.print("The number cannot be under 0");
			}
		}while(num<0);
		 
		 for(int i=1; i<num+1; i++){
			System.out.print(i + " ");
			rem=i%2;
			//System.out.print(rem);
				if(rem!=0) {
					sum = sum + i;
					//System.out.print("impar");
					//System.out.print(i + " ");
				}else {
					System.out.print(" pair");
				}
				
			System.out.println(" ");
		};
		System.out.print(sum + " it is the odds sum");	
		
	}
}

package TryCatch;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String strNum;
		int num, total=0, times=0;
		
		do {
			try {
				System.out.println("give me a number: ");
				num=keyboard.nextInt();
				total+=num;
				times++;
			}catch(InputMismatchException e) {
				System.out.println("bye");
				break;
			}
		}while(times<3);
		System.out.println("total= " + total);
		
		keyboard.close();
	}//end public static void main(String[] args) 
}//end class Ex09

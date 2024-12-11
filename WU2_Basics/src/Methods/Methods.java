package Methods;
import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/* EXXERCISE 9 (ptt WU4 {pg 19}) 
		it works  */
		
			String bigstr;
			String smallstr;
			
			printData();
			
			System.out.print("give me a word: ");
			bigstr=keyboard.nextLine();
			
			System.out.print("give me a word 2: ");
			smallstr=keyboard.nextLine();
			
	//		smallstr=smallstr.toUpperCase();
			
	
			String sol=bigstr.replace(smallstr, smallstr.toUpperCase());
			
			System.out.print(sol);
	} // end of public static void main (String [] args)	
	
			static void printData () {
				System.out.print(">>");
			}
				
			

		
	
} //end of public class

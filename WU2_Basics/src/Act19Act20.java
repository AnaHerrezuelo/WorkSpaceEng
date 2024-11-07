import java.util.Scanner;

public class Act19Act20 {
	public static void main(String[] args) {
		/*
		 * ACTIVITY 19 
		 * 
		 * int num;
		 * Scanner keyboard = new Scanner(System.in);
		 * System.out.print("Enter a number between 1 to 7: ");
		 * num=keyboard.nextInt();
		 * 
		 * switch(num) { 
			 * case 1: System.out.println(num + " is one"); break;
			 * case 2: System.out.println(num + " is two"); break; 
			 * case 3: System.out.println(num + " is three"); break; 
			 * case 4: System.out.println(num + " is four"); break; 
			 * case 5: System.out.println(num + " is five"); break; 
			 * case 6: System.out.println(num + " is six"); break; 
			 * case 7: System.out.println(num + " is seven"); break; 
			 * default: System.out.println("this is not between 1 to 7");
		 * };
		 */

		
		//ACTIVITY 20
		
		int num;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number between 1 to 7: ");
		num = keyboard.nextInt();
/*
		switch (num) {
			case 1 :
				System.out.println(num + " is Monday, working day");
				break;
			case 2 :
				System.out.println(num + " is Tuesday, working day");
				break;
			case 3 :
				System.out.println(num + " is Wednesday, working day");
				break;
			case 4 :
				System.out.println(num + " is Thursday, working day");
				break;
			case 5 :
				System.out.println(num + " is Friday, working day");
				break;
			case 6 :
				System.out.println(num + " is Saturday, weekend day");
				break;
			case 7 :
				System.out.println(num + " is Sunday, weekend day");
				break;
			default :
				System.out.println("this is not between 1 to 7");
		};
*/
		switch (num) {
			case 1 :
			case 2 :
			case 3 :
			case 4 :
			case 5 :
				System.out.println(num + " working day");
				break;
			case 6 :
			case 7 :
				System.out.println(num + " weekend day");
				break;
			default :
				System.out.println("this is not between 1 to 7");
		};
		
	};
}

import java.util.Scanner;

public class Act26 {
	public static void main(String[] args) {
/* CON  WHILE
		int num;

		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give me a number: ");
		num=keyboard.nextInt();

		while(num<10){
			System.out.println(num);
			System.out.print("Give me another number: ");
			num=keyboard.nextInt();
		};
		System.out.print("you gave +10 number");
*/
		
		
/* CON DO WHILE */
		int num;
		
		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.print("Give me a number: ");
			num=keyboard.nextInt();
			
		}while(num<10);
		
		System.out.print("you gave +10 number");
		
	
	};
}

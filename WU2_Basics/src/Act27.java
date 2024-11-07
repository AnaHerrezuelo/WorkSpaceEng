import java.util.Scanner;

public class Act27 {
	public static void main(String[] args) {
		int num;
		int total = 0;
		int count = 0;
		
		Scanner keyboard = new Scanner(System.in);

		do {

			System.out.print("Give me a number: ");
			num=keyboard.nextInt();
			if(num>0) {
				total = total + num;
				count++;
			}else if (num<0) {
				count++;
			};
		}while(count<10);
		
		System.out.print("Positive total: " + total + "\nYou inserted: " +count + " numbers");
	};
	
};

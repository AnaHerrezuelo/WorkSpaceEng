import java.util.Scanner;

public class Act17 {
	public static void main(String[] args) {
		float num;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=keyboard.nextFloat();
		
			if(num<0) {
				System.out.println(num + " is negative");
			}else if(num>0) {
				System.out.println(num + " is positive");
			}else {
				System.out.println(num + " is 0");
			};
	};
}

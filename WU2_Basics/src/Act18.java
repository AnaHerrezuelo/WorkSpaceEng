import java.util.Scanner;

public class Act18 {
	public static void main(String[] args) {
		float num, num2, num3;

		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=keyboard.nextFloat(); // entran con un espacio, ej: 11 12 13
		//System.out.print("Enter another number: "); 
		num2=keyboard.nextFloat();
		//System.out.print("Enter another number: ");
		num3=keyboard.nextFloat();

		/*
		if(num>num2) {
			if(num>num3) {
				System.out.println(num + " is the bigger number");
			}else {
				System.out.println(num3 + " is the bigger number");
			}
		}else {
			if(num2>num3) {
				System.out.println(num2 + " is the bigger number");
			}else  {
				System.out.println(num3 + " is the bigger number");
			}
		};
		*/
		
		if(num>num2) {
			if(num>num3) {
				System.out.println(num + " is the bigger number");
			}else {
				System.out.println(num3 + " is the bigger number");
			}
		}else {
			if(num2>num3) {
				System.out.println(num2 + " is the bigger number");
			}else  {
				System.out.println(num3 + " is the bigger number");
			}
		};
	};
}

import java.util.Scanner;

public class Act25 {
	public static void main(String[] args) {
		int num;
		int remainder;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give me a number: ");
		num=keyboard.nextInt();
		remainder = num%2;
		//System.out.print(num+"-"+remainder );
		while(remainder != 0){
			System.out.println(num);
			System.out.print("Give me another number: ");
			num=keyboard.nextInt();
			remainder = num%2;
		};
		System.out.print("You gave me an even number");

	};
}

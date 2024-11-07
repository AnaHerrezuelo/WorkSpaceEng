import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		int num;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=keyboard.nextInt();
		
		switch(num) {
		case 1:
			System.out.println(num + " is one");
			break;
		case 2:
			System.out.println(num + " is two");
			break;
		case 3:
			System.out.println(num + " is three");
		break;
		default:
			System.out.println(num + " more");
		};
	};
}

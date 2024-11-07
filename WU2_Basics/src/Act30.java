import java.util.Scanner;

public class Act30 {
	public static void main(String[] args) {
		int num = 0;
		int num2 = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("give me 6 numbers ");
		
		for(int i=0; i<6; i++){
			//System.out.print(i + " ");
			//System.out.print("give me a number ");
			num2=keyboard.nextInt();
			num = num + num2;
			//System.out.println(num);
		};
		System.out.println("the total is: " + num);

	};
}

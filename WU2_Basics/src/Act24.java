import java.util.Scanner;

public class Act24 {
	public static void main(String[] args) {
		int num = 0;
		int total = 1;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("give me a number: ");
		num=keyboard.nextInt();
		if (num==0) {
			System.out.println("First number cannot be 0");
		}else {
			while(num !=0){
				System.out.println("Tell me another number: ");
				total =total*num;
				num=keyboard.nextInt();
			};
			System.out.print(total + "\n");
		};
	};
}

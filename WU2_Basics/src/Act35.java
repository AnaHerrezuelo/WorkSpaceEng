import java.util.Scanner;

public class Act35 {
	public static void main(String[] args) {
		int num;
		int num2;
		
		Scanner keyboard = new Scanner(System.in);
		

		
		do{
			System.out.print("Give me a number: ");
			num=keyboard.nextInt();
			num2=num%5;
			if(num2==0) {
				System.out.println(num);
			}
		}while(num!=5);
		
	};
}

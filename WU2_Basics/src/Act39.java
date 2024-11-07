import java.util.Scanner;

public class Act39 {
	public static void main(String[] args) {
		int num;
		int neg = 0;
		int count = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(count<10) {
			System.out.print("Give me 10 numbers: ");
			num=keyboard.nextInt();
			if(num<0) {
				neg++;
			};
			count++;
		};
		System.out.print("There are " + neg + " negatives numbers");
	}
}

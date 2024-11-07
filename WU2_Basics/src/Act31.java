import java.util.Scanner;

public class Act31 {
	public static void main(String[] args) {
		int lim = 0;
		int total = 0;
		int num2 = 0;
		int even = 0;
		// boolean isEven=false -- flag variable
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many numbers do u want to enter?: ");
		lim=keyboard.nextInt();
		//System.out.println(lim);
		if(lim==0) {
			System.out.println("error" );
		}else {
			for(int i=0; i<lim; i++){
				System.out.print("Enter the numbers: ");
				num2=keyboard.nextInt();
				total = total + num2;
				num2=num2%2;
				if(num2==0) {
					even++;
				}else{};
			};
			total = total/lim;
			//System.out.println(num2);
			System.out.println("average: " + total);
			System.out.println("even numbers: " + even);
		};
		
	};
}


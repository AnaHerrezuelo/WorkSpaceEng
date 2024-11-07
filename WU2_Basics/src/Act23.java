import java.util.Scanner;

public class Act23 {
	public static void main(String[] args) {
		
		/* EJEMPLO
		 		int number, sum=0;
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Go tell me the numbers and I'll add them up");
		System.out.println("If you give me a 0 I'm out");
		number=keyboard.nextInt();
		while(number !=0){
		  sum =sum+number;
		  System.out.println("Tell me another number, remember that with 0 I get out");
		  number=keyboard.nextInt();
		}
		System.out.println("The sum of all numbers is: " +sum);
		keyboard.close();
		 */
		
		
		
		int num = 0;
		int total = 0;
		int count = 0;
		Scanner keyboard = new Scanner(System.in);
		
			while(count<10) {
				System.out.print("Enter the number " + count+ ": ");
				num=keyboard.nextInt();
				total = total + num;
				//System.out.println(num +", " + count + ", " + total);
				
				count++;
				//System.out.print(count);
			};
		total = total/10;
		System.out.print(total + "\n");

	};
}

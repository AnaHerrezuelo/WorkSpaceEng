import java.util.Scanner;

public class Act34 {
	public static void main(String[] args) {
		int month;
		int year;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Give me a month: ");
		month=keyboard.nextInt();
		System.out.println("Give me a year (yyyy): ");
		year=keyboard.nextInt();
		//System.out.println(month);
		//System.out.println(year);
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("The month has 31 days"); break;	
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("The month has 30 days"); break;
			case 2:
				if ((year%4==0 && year%100!=0) || (year%100==0 && year%400==0)){ 
					System.out.println("The month has 29 days"); break; // bisiesto
			    }else {
			    	System.out.println("The month has 28 days"); break; //no bisiesto
			    }
		};

	};

}

import java.util.Scanner;

public class Act38 {
	public static void main(String[] args) {
		float hours;
		float rest;
		float salary;
		String ans;
		boolean bol = true;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(bol == true) {
			System.out.print("Give me the hours: ");
			hours=keyboard.nextFloat();
				if(hours < 0) {
					System.out.println("You cant enter lower than 0");
				}else {
					rest = hours - 35;
					if(rest<=0) {
						salary = hours*15;
						System.out.println(salary + "€");
					}else if(rest!=0) {
						salary = (rest*22) + (35*15);
						System.out.println(salary + "€");
					}
				}
			
			System.out.print("do u want to calculate another salary? (y/n): ");
			ans=keyboard.next();
			
			char answer;
			answer=ans.charAt(0);
			
			int answerr=answer;
			if(answerr == 'n') {
				bol = false;
			}
		}
	}

}

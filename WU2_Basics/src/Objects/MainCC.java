package Objects;

import java.util.Scanner;

public class MainCC {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

        CuentaCorriente account = new CuentaCorriente();
		
		
		int dni, balance, sel, amount;
		String name;
		
		do {
			System.out.println("what do u want to get?: ");
			System.out.println("deal 1 for introduce a new costumer: "
					+ "\ndeal 2 to get some cash out: "
					+ "\ndeal 3 for make a deposit"
					+ "\ndeal 4 for show info"
					+ "\ndeal 5 for exit");
			sel=keyboard.nextInt();
			
			switch(sel) {
			case 1:
		        account.insertCostumerName(keyboard);
		        account.insertCostumerDni(keyboard); 
		        
		        
//				System.out.print("gave me the name:");
//				name = keyboard.next();
//				System.out.print("gave me the dni:");
//				dni = keyboard.nextInt();
//				CuentaCorriente deal1 = new CuentaCorriente(name,dni);
	
				
				break;
				
			case 2:
				account.getCashOut(keyboard); 
				
//				CuentaCorriente deal1 = new CuentaCorriente();
//				System.out.print("you have this balance: "+ deal1.balance +", how much do you want to take?:");
//				balance = keyboard.nextInt();
				break;
				
			case 3:
				account.makeDeposit(keyboard);
			
				break;
			case 4:
				account.printToString();
				break;
			case 5:
				System.out.println("Bye");
				break;
				
			case 6:
		        CuentaCorriente account1 = new CuentaCorriente("Juan", 500);
		        CuentaCorriente account2 = new CuentaCorriente("Ana", 12345678, 1000);
		        
		        System.out.println("Cuenta 1:");
		        account1.showAccount();
		        System.out.println("Cuenta 2:");
		        account2.showAccount();
				break;
				
			default:
				System.out.println("Try again");
			}
			
			//account.printToString();
			
		}while(sel!=5);
		
		
		
		
		//CuentaCorriente [] students  = new CuentaCorriente [4];
		
		
		
		//account.printToString();
		
	}
}

package Objects;

import java.util.Scanner;

public class MainCC {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

        CuentaCorriente account = new CuentaCorriente();
        CuentaCorrienteGestor gestor = new CuentaCorrienteGestor();
		
		int sel;

		
		do {
			System.out.println("what do u want to get?: ");
			System.out.println("deal 1 for introduce a new costumer: "
					+ "\ndeal 2 to get some cash out: "
					+ "\ndeal 3 for make a deposit"
					+ "\ndeal 4 for show info"
					+ "\ndeal 5 for exit"
					+ "\ndeal 6 for ");
			sel=keyboard.nextInt();
			
			switch(sel) {
			case 1:
		        account.insertInfo(keyboard); 
//		        gestor.insertInfo(keyboard); 
				break;
				
			case 2:
				account.getCashOut(keyboard); 
				break;
				
			case 3:
				account.makeDeposit(keyboard);
			
				break;
			case 4:
				account.printToString();
				gestor.printToString();
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
		//account.printToString();
		
	}
}

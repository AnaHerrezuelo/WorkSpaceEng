package Objects;

import java.util.Scanner;

public class CuentaCorriente {
	
	String name;
	int dni, balance, amount, interesttype;
	boolean correct, outdone, depositdone;

	
	public CuentaCorriente() {

	}

	public CuentaCorriente( String name, int balance) {
		this.name=name;
		this.balance=balance;
	}
	
	public CuentaCorriente( String name, int dni, int balance) {
		this.name=name;
		this.dni=dni;
		this.balance=0;
	}

	
    public void showAccount() {
        System.out.println("Name: " + name);
        System.out.println("DNI: " + dni);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }
	
    
    public boolean insertInfo(Scanner keyboard) {
    	
		System.out.print("gave me the name of the costumer:");
		this.name = keyboard.next();
		
		System.out.print("gave me the dni of the costumer:");
		this.dni = keyboard.nextInt();	
		
    	return correct;
    }
	
	public boolean getCashOut (Scanner keyboard) {
		if(this.balance<1) {
			System.out.println("You have: " + this.balance + "€, you must introduce cash");
		}else {
			do {
				System.out.println("You have: " + this.balance + "€");
				System.out.print("How much do you want to get out:");
				this.amount = keyboard.nextInt();	
				setAmount(this.amount);
				outdone=false;
				System.out.println(outdone + " You can't spend more money than what's in your account");
			}while(this.balance<this.amount);
			this.balance = this.balance - this.amount;
			outdone =true;
		}
        return outdone;
	}
	
	public int makeDeposit (Scanner keyboard) {
		System.out.print("gave me the the amount of deposit:");
		this.amount = keyboard.nextInt();	
		setAmount(this.amount);
		this.balance = this.balance + this.amount;
		depositdone=true;
		
        return balance;
	}
	
	
	
	
	
	
	//GETTERS AND SETTERS
	
	public String getName() {
		return name;
	}
	public void setName(String nombre) {
		this.name = nombre;
	}

	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
//			if(balance<0) {
//				this.balance = balance;
//			}else {
//				this.balance = -1*balance;
//			}
			this.balance = balance;
	}

	
	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		if(amount>0) {
			this.amount = amount;
		}else {
			this.amount = -1*amount;
		}
	}

	
	

	public void printToString() {
		System.out.println(toString());
	}







	
	
	
	
	
	
}

package Objects;

import java.util.Scanner;

public class CuentaCorriente {
	String name;
	int dni, balance, amount;
	
	public CuentaCorriente() {

	}

	
	public CuentaCorriente( String name, int balance) {
//		this.name="aa";
//		this.balance=123;
		this.name=name;
		this.balance=balance;
	}
	
	public CuentaCorriente( String name, int dni, int balance) {
//		this.name="bb";
//		this.dni=123;
//		this.balance=200;
		this.name=name;
		this.dni=dni;
		this.balance=balance;
	}
	
    public void showAccount() {
        System.out.println("Nombre: " + name);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + balance);
        System.out.println("-------------------------");
    }
	
	
//	public String insertCostumer (Scanner keyboard) {
//		System.out.print("gave me the name:");
//		this.name = keyboard.next();
//		System.out.print("gave me the dni:");
//		this.dni = keyboard.nextInt();
//		
//        return (name,dni);
//	}

	
	public String insertCostumerName (Scanner keyboard) {
		System.out.print("gave me the name:");
		this.name = keyboard.next();
		
        return name;
	}
	
	public int insertCostumerDni (Scanner keyboard) {
		System.out.print("gave me the dni:");
		this.dni = keyboard.nextInt();	
		
        return dni;
	}
	
	public int getCashOut (Scanner keyboard) {
		if(this.balance<1) {
			System.out.println("You have: " + this.balance + "€, you must introduce cash");
		}else {
			do {
				System.out.println("You have: " + this.balance + "€");
				System.out.print("How much do you want to get out:");
				this.amount = keyboard.nextInt();	
				setAmount(this.amount);
				System.out.println("You can't spend more money than what's in your account");
			}while(this.balance<this.amount);
			this.balance = this.balance - this.amount;
		}

		
        return balance;
	}
	
	public int makeDeposit (Scanner keyboard) {
		System.out.print("gave me the the amount of deposit:");
		this.amount = keyboard.nextInt();	
		setAmount(this.amount);
		this.balance = this.balance + this.amount;
		
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

	@Override
	public String toString() {
		return "CuentaCorriente [name=" + name + ", dni=" + dni + ", balance=" + balance + "]";
	}





	
	
	
	
	
	
}

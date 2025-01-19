package Objects;

import java.util.Scanner;

public class CuentaCorriente {
	String name;
	int dni, balance, amount;
	
	public CuentaCorriente() {

	}

	
//	public CuentaCorriente( String name, int dni) {
//		this.name=name;
//		this.dni=dni;
//		this.balance=0;
//	}
	
	
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
		System.out.print("gave me the the amount of cash:");
		this.amount = keyboard.nextInt();	
		setAmount(this.amount);
		this.balance = this.balance - this.amount;
		
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

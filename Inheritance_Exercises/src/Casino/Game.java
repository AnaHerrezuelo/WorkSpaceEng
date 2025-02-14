package Casino;

import java.util.Scanner;

public class Game {
	Scanner keyboard = new Scanner(System.in);
	
	private String name;
	private final float MAXBET=20000;
	private final float MINBET=1;
	private float bet, balance;
	
	
	public Game() {
		
	}
	public Game(String name) {
		super();
		this.name = name;
	}
	public Game(String name, float bet) {
		super();
		this.name = name;
		this.bet = bet;
	}
	
	public void askData() {
		System.out.println("Give me your name");
		this.name=keyboard.next();
		
		System.out.println("Give me your balance ");
		this.balance=keyboard.nextFloat();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBet() {
		return bet;
	}
	public void setBet(float bet) {
		this.bet = bet;
	}
	
	//PRINT
	public void printToString() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Game [name=" + name + ", balance=" + balance + "]";
	}
	


	
	
	
}

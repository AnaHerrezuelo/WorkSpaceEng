package boatSol;

import java.util.Arrays;
import java.util.Scanner;

public class Rental {
	Scanner key = new Scanner(System.in);
	String name, dni;
	int rentalDays;
	final int PRBASE=15;
	int [][] mooringPos;
	Boat boat;
	
	public Rental() {
		super();
	}
	
	public Rental(String name, String dni, int rentalDays) {
		super();
		this.name = name;
		this.dni = dni;
		this.rentalDays = rentalDays;
	}
	
	
		

	public Rental(String name, String dni, int rentalDays, Boat boat) {
		super();
		this.name = name;
		this.dni = dni;
		this.rentalDays = rentalDays;
		this.boat = boat;
	}

	public Rental(String name, String dni, int rentalDays, int[][] mooringPos) {
		super();
		this.name = name;
		this.dni = dni;
		this.rentalDays = rentalDays;
		this.mooringPos = mooringPos;
	}
	

	public void askData() {
		System.out.println("Give me the name: ");
		this.name=key.next();
		System.out.println("Give me the dni: ");
		this.dni=key.next();
		System.out.println("How many days do you want to rent? : ");
		this.rentalDays=key.nextInt();
		
//		System.out.println("Where is the boat? : ");
//		for (int i = 0; i < mooringPos.length; i++) {
//			
//		}
	}
	
	//GETTES AND SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getRentalDays() {
		return rentalDays;
	}

	public void setRentalDays(int rentalDays) {
		this.rentalDays = rentalDays;
	}

	public int[][] getMooringPos() {
		return mooringPos;
	}

	public void setMooringPos(int[][] mooringPos) {
		this.mooringPos = mooringPos;
	}

	public int getPRBASE() {
		return PRBASE;
	}

	@Override
	public String toString() {
		return "Rental [ name=" + name + ", dni=" + dni + ", rentalDays=" + rentalDays + ", PRBASE="
				+ PRBASE + ", mooringPos=" + Arrays.toString(mooringPos) + ", boat=" + boat + "]";
	}
	
//	public void printToString() {
//		System.out.println();
//	}


	
	
	
	
	
	
}

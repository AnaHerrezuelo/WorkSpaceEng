package Warehouse_Ana_Exceptions;

import java.util.Scanner;
import OwnExceptions.IntervalException;


public class Machines {
	Scanner keyboard = new Scanner(System.in); 
	int id, Wconsumption;
	char energyRating;
	
	public Machines() {
		
	}
	
	public Machines(char energyRating, int wconsumption) {
		super();
		setId(id);
		this.energyRating = energyRating;
		this.Wconsumption = wconsumption;
//		setWconsumption(wconsumption);
	}

	public Machines(char energyRating, String wconsumption) throws NumberFormatexception {
		super();
		setId(id);
		this.energyRating = energyRating;
//		this.Wconsumption = wconsumption;
		setWconsumption(wconsumption);
	}
	
	public void askData() {
		System.out.println("give me the energy rating: ");
//		energyRating=keyboard.next();
		
		System.out.println("give me the W consumption: ");
		Wconsumption=keyboard.nextInt();
	}
	
	
	
	
	public int getId() {
		return id;
	}

//	public void setId(int id, Machines [] machine ) {
//		for(int i=0;i<machine.length;i++) {
//			machine[i].id=i;
//		}
//	}
	
	public void setId(int id ) {
//		this.id = id;
		this.id=3;

	}

	public int getEnergyRating() {
		return energyRating;
	}

	public void setEnergyRating(char energyRating) {
		this.energyRating = energyRating;
	}

	public int getWconsumption() {
		return Wconsumption;
	}
	

//	public void setWconsumption(int wconsumption) throws NumberFormatexception {
//		this.Wconsumption = wconsumption;
//	}
	
	
	
	public void setWconsumption(String wconsumption) throws NumberFormatexception {
		if(Integer.parseInt(wconsumption)>0) {
			this.Wconsumption = Integer.parseInt(wconsumption);
		}else {
			throw new NumberFormatexception("error");
		}
	}

	
	
	
	//PRINT
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Machines [id=" + id + ", energyRating=" + energyRating + ", Wconsumption=" + Wconsumption + "]";
	}
	
	
}

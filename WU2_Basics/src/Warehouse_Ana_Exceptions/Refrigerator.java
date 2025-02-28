package Warehouse_Ana_Exceptions;

public class Refrigerator extends Machines {
	boolean froze=false;
	
	public Refrigerator(){
		
	}

	public Refrigerator(char energyRating, int wconsumption, boolean froze) {
		super(energyRating, wconsumption);
		this.froze = froze;
	}
	
//	public void askData() {
////		super.askData();
//		
//	}
	
	//GETTERS AND SETTERS
	public boolean isFroze() {
		return froze;
	}

	public void setFroze(boolean froze) {
		this.froze = froze;
	}
	
	
	
	//PRINT
	public void printToString() {
		System.out.println(toString());
	}



	@Override
	public String toString() {
		String result =  "Refrigerator [froze=" + froze + "]";
		result=result + super.toString();
		return result;
	}
	
	
	
	
	
}

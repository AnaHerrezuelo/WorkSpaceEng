package Warehouse_Ana;

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

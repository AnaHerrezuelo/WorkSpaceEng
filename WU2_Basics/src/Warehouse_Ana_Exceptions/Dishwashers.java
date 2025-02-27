package Warehouse_Ana_Exceptions;

public class Dishwashers extends WaterWasters{
	int maxServices;
	
	public Dishwashers(){
		
	}
	public Dishwashers(char energyRating, int wconsumption, int waterConsumption, int maxServices) {
		super(energyRating, wconsumption, waterConsumption);
		this.maxServices = maxServices;
	}
	
//	public void askData() {
//		super.askData();
//		System.out.println("give me the energy rating: ");
//		maxServices=keyboard.nextInt();
//	}
	
	
	
	//PRINT
	public void printToString() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		String result = "Diswashers [maxServices=" + maxServices + "]";
		result=result + super.toString();
		return result;
	}
	
}

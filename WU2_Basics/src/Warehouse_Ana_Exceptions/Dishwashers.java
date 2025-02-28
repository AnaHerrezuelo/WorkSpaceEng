package Warehouse_Ana_Exceptions;

public class Dishwashers extends WaterWasters{
	int maxServices;
	
	public Dishwashers(){
		
	}
	public Dishwashers(char energyRating, int wconsumption, int waterConsumption, int maxServices) {
		super(energyRating, wconsumption, waterConsumption);
		this.maxServices = maxServices;
	}
	
	
	
	public Dishwashers(char energyRating, String wconsumption, int waterConsumption, int maxServices)
			throws NumberFormatexception, negativeNumberException {
		super(energyRating, wconsumption, waterConsumption);
//		this.maxServices = maxServices;
		setMaxServices(maxServices);
	}
	
//	public void askData() {
//		super.askData();
//		System.out.println("give me the energy rating: ");
//		maxServices=keyboard.nextInt();
//	}
	
	public int getMaxServices() {
		return maxServices;
	}
	public void setMaxServices(int maxServices) throws negativeNumberException{
//		this.maxServices = maxServices;
		if(maxServices>0) {
			this.maxServices = maxServices;
		}else {
			throw new negativeNumberException("error");
		}
	}
	
	
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

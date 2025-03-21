package Warehouse_Ana_Exceptions;

public class WashingMachines extends WaterWasters{
	int maxLaundry;
	
	public WashingMachines () {
		
	}


	public WashingMachines(char energyRating, int wconsumption, int waterConsumption, int maxLaundry) {
		super(energyRating, wconsumption, waterConsumption);
		this.maxLaundry = maxLaundry;
	}
	
	public WashingMachines(char energyRating, String wconsumption, int waterConsumption, int maxLaundry)
			throws NumberFormatexception, negativeNumberException {
		super(energyRating, wconsumption, waterConsumption);
//		this.maxLaundry = maxLaundry;
		setMaxLaundry(maxLaundry);
	}



//	public void askData() {
//		super.askData();
//		System.out.println("give me the energy rating: ");
//		maxLaundry=keyboard.nextInt();
//	}
	
	




	public int getMaxLaundry() {
		return maxLaundry;
	}

	public void setMaxLaundry(int maxLaundry) throws negativeNumberException {
//		this.maxLaundry = maxLaundry;
		
		if(maxLaundry>0) {
			this.maxLaundry = maxLaundry;
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
		String result = "WashingMachines [maxLaundry=" + maxLaundry + "]";
		result=result + super.toString();
		return result;
	}
	
	
	
}

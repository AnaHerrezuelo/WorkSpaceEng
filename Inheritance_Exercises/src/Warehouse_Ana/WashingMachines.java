package Warehouse_Ana;

public class WashingMachines extends WaterWasters{
	int maxLaundry;
	
	public WashingMachines () {
		
	}


	public WashingMachines(char energyRating, int wconsumption, int waterConsumption, int maxLaundry) {
		super(energyRating, wconsumption, waterConsumption);
		this.maxLaundry = maxLaundry;
	}




//	public void askData() {
//		super.askData();
//		System.out.println("give me the energy rating: ");
//		maxLaundry=keyboard.nextInt();
//	}
	
	

	public int getMaxLaundry() {
		return maxLaundry;
	}

	public void setMaxLaundry(int maxLaundry) {
		this.maxLaundry = maxLaundry;
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

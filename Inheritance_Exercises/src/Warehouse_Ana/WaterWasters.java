package Warehouse_Ana;

public class WaterWasters extends Machines{
	int waterConsumption;
	
	public WaterWasters () {
		
	}

	public WaterWasters(char energyRating, int wconsumption, int waterConsumption) {
		super(energyRating, wconsumption);
		this.waterConsumption = waterConsumption;
	}
	
//	public void askData() {
//		super.askData();
//		System.out.println("give me the water consumption: ");
//		waterConsumption=keyboard.nextInt();
//	}
	
	
	
	public int getWaterConsumption() {
		return waterConsumption;
	}

	public void setWaterConsumption(int waterConsumption) {
		this.waterConsumption = waterConsumption;
	}
	
	

	//PRINT
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		String result = "WaterWasters [waterConsumption=" + waterConsumption + "]";
		result=super.toString()+result;
		return result;
	}
	
	
	

}

package Warehouse_Ana_Exceptions;

public class WaterWasters extends Machines{
	int waterConsumption;
	
	public WaterWasters () {
		
	}

	public WaterWasters(char energyRating, int wconsumption, int waterConsumption) {
		super(energyRating, wconsumption);
		this.waterConsumption = waterConsumption;
	}
	
	public WaterWasters(char energyRating, String wconsumption, int waterConsumption) throws NumberFormatexception, negativeNumberException {
		super(energyRating, wconsumption);
		setWaterConsumption(waterConsumption);
//		this.waterConsumption = waterConsumption;
	}
	
//	public void askData() {
//		super.askData();
//		System.out.println("give me the water consumption: ");
//		waterConsumption=keyboard.nextInt();
//	}
	
	
	


	public int getWaterConsumption() {
		return waterConsumption;
	}

	public void setWaterConsumption(int waterConsumption)throws negativeNumberException {
		if(waterConsumption>0) {
			this.waterConsumption = waterConsumption;
		}else {
			throw new negativeNumberException("no negative numbers");
		}
//		try {
//			
//		}catch(negativeNumberException e) {
//			
//		}

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

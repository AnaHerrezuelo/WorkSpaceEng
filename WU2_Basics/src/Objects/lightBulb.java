package Objects;

public class lightBulb {
	int power;
	boolean state;
	final static boolean ON=true;
	final static boolean OFF=false;
	
	public lightBulb () {
		
	}
	
	public  lightBulb (int power) {
		this.power=power;
		this.state=true;
	}
	public  lightBulb (boolean state) {
		this.power=0;
		this.state=state;
	}
	public  lightBulb (int power,boolean state) {
		this.power=power;
		this.state=state;
	}

	//GETTERS AND SETTERS
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
	//PRINT
	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "lightBulb [power=" + power + ", state=" + state + "]";
	}
	
	
	
	
	
}

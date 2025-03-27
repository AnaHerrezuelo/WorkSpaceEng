package boatSol;

public class Yachts extends Boat {
	int horsepower, cabinsNum;

	public Yachts() {
		super();
	}

	public Yachts(int horsepower, int cabinsNum) {
		super();
		this.horsepower = horsepower;
		this.cabinsNum = cabinsNum;
	}

	public Yachts(int registrationNum, int length, int year, int horsepower, int cabinsNum) {
		super(registrationNum, length, year);
		this.horsepower = horsepower;
		this.cabinsNum = cabinsNum;
	}

	@Override
	public String toString() {
		return super.toString() + "Yachts [horsepower=" + horsepower + ", cabinsNum=" + cabinsNum + "]";
	}
	
	
	
}

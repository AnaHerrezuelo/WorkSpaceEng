package boatSol;

public class SportsBoats extends Boat{
	int horsepower;

	public SportsBoats() {
		super();
	}

	public SportsBoats(int horsepower) {
		super();
		this.horsepower = horsepower;
	}

	public SportsBoats(int registrationNum, int length, int year, int horsepower) {
		super(registrationNum, length, year);
		this.horsepower = horsepower;
	}

	@Override
	public String toString() {
		return super.toString() + "SportsBoats [horsepower=" + horsepower + "]";
	}
	
	
}

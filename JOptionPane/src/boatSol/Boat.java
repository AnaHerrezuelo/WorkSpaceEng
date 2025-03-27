package boatSol;

public class Boat {
	int registrationNum, length, year;
	Rental ren;
	double val;
//		val= (this.length * ren.PRBASE * 10);
	

	public Boat() {
		super();
	}

	public Boat(int registrationNum, int length, int year) {
		super();
		this.registrationNum = registrationNum;
		this.length = length;
		this.year = year;
	}

	public Boat(int registrationNum, int length, int year, Rental ren) {
		super();
		this.registrationNum = registrationNum;
		this.length = length;
		this.year = year;
		this.ren = ren;
		this.val= (this.length * ren.PRBASE * 10);
		
	}

	public void valAlquiler() {
		double val;
		val= (this.length * ren.PRBASE * 10);
	}

	// GETTERS AND SETTERS
	public int getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(int registrationNum) {
		this.registrationNum = registrationNum;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
//	@Override
//	public String toString() {
//		return "Boat [registrationNum=" + registrationNum + ", length=" + length + ", year=" + year + "]";
//	}
	@Override
	public String toString() {
		return "Boat [registrationNum=" + registrationNum + ", length=" + length + ", year=" + year + ", ren=" + ren
				+ ", val=" + val + "]";
	}
	




}

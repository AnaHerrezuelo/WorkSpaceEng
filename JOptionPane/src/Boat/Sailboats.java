package boat;

public class Sailboats extends Boat {
	int mastsNum;
	double val;

	public Sailboats() {
		super();
	}

	public Sailboats(int mastsNum) {
		super();
		this.mastsNum = mastsNum;
	}

	public Sailboats(int registrationNum, int length, int year, int mastsNum) {
		super(registrationNum, length, year);
		this.mastsNum = mastsNum;
	}
	
	public Sailboats(int registrationNum, int length, int year, Rental ren, int mastsNum) {
		super(registrationNum, length, year, ren);
		this.mastsNum = mastsNum;
		this.val= (this.length * ren.PRBASE * 10 + mastsNum);
	}

//	public void valAlquiler() {
//		double val;
//		val= (this.length * ren.PRBASE * 10 + mastsNum);
//	}

	
	@Override
	public String toString() {
		return super.toString() + "Sailboats [mastsNum=" + mastsNum + " val=" + val +"]";
	}
	
	
}

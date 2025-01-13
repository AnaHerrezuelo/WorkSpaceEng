package Objects;

public class Act07 {
	int side1, side2;

	
	public Act07(int side1, int side2) {
		setSide1(side1);
		setSide2(side2);
	}
	
	public void area(int side1, int side2) {
		System.out.print("The área is: " + (side1*side2) );
	}

	
	
//GETTERS AND SETTERS
	public int getSide1() {
		
		return side1;
	}
	

	public void setSide1(int side1) {
		if(side1>0) {
			this.side1 = side1;
		}else {
			this.side1=-1*side1;
		}
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		if(side1>0) {
			this.side2 = side2;
		}else {
			this.side2=-1*side2;
		}
		this.side2 = side2;
	}
	
	
	
	
	
	
}//end class Act07

package Objects;

public class Act09DNI {
	private int dniNum;
	private char dniLetter;
	

	public Act09DNI (int dn) {
		if(dn<0 || dn>99999999) {
			System.err.println("Error!!");
			dniNum=-1;
		}else {
			this.dniNum=dn;	
			this.dniLetter=giveDniLetter(dn);
		}

	}
	


	public char giveDniLetter(int num) {
		int remainder=num%23;
		String cad="TRWAGMYFPDXBNJZSQVHLCKEO";
		
		return cad.charAt(remainder);
	}
	
	public boolean checkLetter(int num, char let) {
		if(let==giveDniLetter(num)) {
			return true;
		}
		return false;
	}
	
	
	
	// GETTERS AND SETTERS
	
	public int getDniNum() {
		return dniNum;
	}

	public void setDniNum(int dniNum) {
		this.dniNum = dniNum;
	}

	public char getDniLetter() {
		return dniLetter;
	}

	public void setDniLetter(char dniLetter) {
		this.dniLetter = dniLetter;
	}
	
	
	
	
	@Override
	public String toString() {
		return " [Num=" + dniNum + ", Letter=" + dniLetter + "]";
	}






}//end class Act09DNI 

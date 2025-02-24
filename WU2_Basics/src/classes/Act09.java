package classes;

public class Act09 {
	int power;
	boolean state;
	final static boolean oon=true;
	final static boolean oof=false;
	
	public  Act09 () {
		//power=16;
		//state = true;
	}
	public  Act09 (int power) {
		this.power=power;
		this.state=true;
	}
	public  Act09 (boolean state) {
		this.power=0;
		this.state=state;
	}
	public  Act09 (int power,boolean state) {
		this.power=power;
		this.state=state;
	}
	
//	public void changeState() {
//		if(state==oon) {
//			state=oof;
//		}else {
//			state=oon;
//		}
//	}
//	
	
	public void printAct () {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Act09 [power=" + power + ", on=" + state + "]";
	}


}

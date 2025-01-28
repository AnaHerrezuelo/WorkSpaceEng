package Objects;

import java.util.Scanner;

public class radio {
	int sel;
	final float MAX=108;
	final float MIN=80;
	double frequency;
	
	public radio() {
		this.frequency=MIN;
	}
	public radio(int sel) {
		this.sel=sel;
	}
	
	
//	public void operation(Scanner keyboard) {
//		System.out.println("1 to up, 0 to down");
//		this.sel=keyboard.nextInt();
//		
//		if(frequency>MAX) {
//			this.frequency=80;
//			
//		}else if(frequency<MIN) {
//			this.frequency=108;
//			
//		}
//		
//		if(sel==0) {
//			this.frequency=this.frequency-0.5;
//		}else if(sel==1){
//			this.frequency=this.frequency+0.5;
//		}
//	}
	
	public double increase (Scanner keyboard) {
		if(frequency>MAX) {
			this.frequency=80;
		}else if(frequency<MIN+0.5) {
			this.frequency=108;
		}
		this.frequency=this.frequency+0.5;
		return frequency;
	}
	
	public double decrease (Scanner keyboard) {
		if(frequency>MAX) {
			this.frequency=80;
		}else if(frequency<MIN) {
			this.frequency=108;
		}
		this.frequency=this.frequency-0.5;
		return frequency;
	}
	
	
	public int getSel() {
		return sel;
	}
	public void setSel(int sel) {
		this.sel = sel;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	public void printToString() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "radio [frequency=" + frequency + "]";
	}
	
	
	
	
	
}//end public class radio

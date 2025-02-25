package TryCatch;

import java.util.Scanner;

public class Pants {
	Scanner keyboard = new Scanner (System.in);
	int size;
	String color;
	private double waistC;
	private boolean correctColor;
	
	public Pants() {
		this.size = 38;
		this.color = "black";
	}

	public Pants(int size) {
		super();
		setSize(size);
		this.color = "black";
	}

	public Pants(int size, String color) {
		super();
		setSize(size);
		setColor(color);
	}
	
	public void calculateSize() {
//		double waistC;
		System.out.println("Give me your waist circumference: ");
		this.waistC=keyboard.nextDouble();
		this.size=(int) (waistC/2);	
	}
	
	public boolean validColor() {
		if(this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("green") || this.color.equalsIgnoreCase("blue") ) {
			this.correctColor=true;
		}else {
			this.correctColor=false;
		}
		return correctColor;
	}
	
	public void askData() {
		calculateSize();
		System.out.println("Give me the color");
		setColor(keyboard.next());
	}
	
	

	
	


//GETTERS AND SETTERS
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size<0) {
			this.size = 0;
		}else {
			this.size = size;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color.equalsIgnoreCase("black") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue") ) {
			this.color = color;
		}else {
			this.color = "black";
//			this.color = color;
		}
	}

	//PRINTERS
	public void printToString() {
		System.out.println(toString());
	}

//	@Override
//	public String toString() {
//		return "Pants [size=" + size + ", color=" + color + "]";
//	}
	
	

	@Override
	public String toString() {
		return "Pants [size=" + size + ", color=" + color + ", waistC=" + waistC + ", correctColor=" + correctColor
				+ "]";
	}
	
	
}

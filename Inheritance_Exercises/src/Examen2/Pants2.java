package Examen2;

import java.util.Scanner;

public class Pants2 {
	Scanner keyboard = new Scanner (System.in);
	int size;
//	String color;
	private PantsColors color;
	private double waistC;
	private boolean correctColor;
	
	public Pants2() {
		this.size = 38;
//		this.color = "black";
	}

	public Pants2(int size) {
		super();
		setSize(size);
//		this.color = "black";
		this.color = PantsColors.BLACK;
	}

	public Pants2(int size, String color) {
		super();
		setSize(size);
//		setColor(color);
	}
	public Pants2(int size, PantsColors color) {
		super();
		setSize(size);
		this.color = color;
	}
	
	public void calculateSize() {
		System.out.println("Give me your waist circumference: ");
		this.waistC=keyboard.nextDouble();
		this.size=(int) (waistC/2);	
	}
	
//	public boolean validColor() {
//		if(this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("green") || this.color.equalsIgnoreCase("blue") ) {
//			this.correctColor=true;
//		}else {
//			this.correctColor=false;
//		}
//		return correctColor;
//	}
	
//	public void askData() {
//		calculateSize();
//		System.out.println("Give me the color");
//		setColor(keyboard.next());
//	}
	
	

	
	


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

	public PantsColors getColor() {
		return color;
	}

//	public void setColor(String color) {
//		if(color.equalsIgnoreCase("black") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue") ) {
//			this.color = color;
//		}else {
//			this.color = "black";
////			this.color = color;
//		}
//	}
	

	//PRINTERS
	public void printToString() {
		System.out.println(toString());
	}

	
	

	@Override
	public String toString() {
		return "Pants [size=" + size + ", color=" + color + " description -> "+ color.description + ", waistC=" + waistC + ", correctColor=" + correctColor
				+ "]";
	}
	
	
}

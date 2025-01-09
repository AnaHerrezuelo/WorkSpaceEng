package Object;

public class printer3D {
	private int height;
	int lenght, width;
	String brand, model;
	
	public printer3D(int height, int l, String b, String m){
		setHeight(height); 
		//this.height=height;
		lenght=l;
		brand=b;
		model=m;
	}
	
	public void printPrinter() {
		System.out.println(this.toString());
	}
	
	public void setHeight(int height) {
		if(height<0) {
			height=height*-1;
		}
		this.height=height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public String toString() {
		return brand +" printer3D [height=" + height + ", lenght=" + lenght + ", width=" + width 
				+ ", brand=" + brand + ", model=" + model + "]";
	}//end toString
	
	
}//end public class printer3D

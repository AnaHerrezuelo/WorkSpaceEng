package Objects;

public class bucket {
	private int capacity, capFill;
	private String color, material;
	private boolean handle = true;
	
	
	public bucket(int capacity, String color, String material, boolean handle) {
		super();
		setCapacity(capacity);
		this.color = color;
		this.material = material;
		this.handle = handle;
	}
	
	public bucket( String color, String material, boolean handle) {
		super();
		this.color = color;
		this.material = material;
		this.handle = handle;
	}
	
	public void showBucket() {
		System.out.println("#      #");
//		for(int i=0; i < capacity; i++) {
//			//System.out.println("#      #");
//			if(capFill>i) {
//				System.out.println("#~~~~~~#");
//			}
//		}
		
		for(int i=0; i < capacity; i++) {
			if(capFill>=capacity-i) {
				System.out.println("#~~~~~~#");
			}else {
				
			}
		}
		System.out.println("########");
	}
	
	public void fillBucket() {
		capFill=capacity;

	}
	
	public void extractLiquid(int drain){
		setCapFill(capFill-drain);
	}	

	
	
	
	
	
	//GETTERS AND SETTERS
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		if(capacity>0) {
			this.capacity=capacity;
		}else {
			System.err.println("Negative");
			this.capacity = 0;			
		}

	}
	public int getCapFill() {
		return capFill;
	}
	public void setCapFill(int capFill) {
		if(capFill>0) {
			this.capFill=capFill;
		}else {
			System.err.println("Not enought liquid");
			this.capFill = 0;			
		}
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public boolean isHandle() {
		return handle;
	}
	public void setHandle(boolean handle) {
		this.handle = handle;
	}
	
	
	
	//PRINT
	public void printToString() {
		System.out.println(toString());
	}

	
	@Override
	public String toString() {
		return "bucket [capacity=" + capacity + ", capFill=" + capFill + ", color=" + color + ", material=" + material
				+ ", handle=" + handle + "]";
	}
	
	
	
	
	
	
	
	

}// end public class bucket 

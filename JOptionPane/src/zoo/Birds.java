package zoo;

public class Birds extends Animal{
	boolean canFly;

	public Birds() {
		super();
	}

	public Birds(boolean canFly) {
		super();
		this.canFly = canFly;
	}
	
	

	public Birds(String name, int age, boolean canFly) {
		super(name, age);
		this.canFly = canFly;
	}
	
	//GETTERS AND SETTERS

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	

	@Override
	public String toString() {
		return super.toString() + " Birds [canFly=" + canFly + "]";
	}
	
	

}

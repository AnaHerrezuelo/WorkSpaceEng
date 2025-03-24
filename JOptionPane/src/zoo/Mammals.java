package zoo;

public class Mammals extends Animal{
	String diet;

	public Mammals() {
		super();
	}

	public Mammals(String diet) {
		super();
		this.diet = diet;
	}

	public Mammals(String name, int age, String diet) {
		super(name, age);
		this.diet = diet;
	}

	//GETTERS AND SETTERS
	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	@Override
	public String toString() {
		return super.toString() + " Mammals [diet=" + diet + "]";
	}
	
	
	
	

}

package zoo;

public class Animal {
	String name;
	int age;
	
	public Animal() {
		super();
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		
	}
	
	public void displayInfo() {
		System.out.println(toString());
	}
	
	//GETTERS AND SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	

	
	

}

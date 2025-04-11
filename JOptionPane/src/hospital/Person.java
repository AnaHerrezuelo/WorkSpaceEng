package hospital;

public class Person {
	private String name, address;
	private int dni;

	public Person() {
		super();
	}

	public Person(String name, String address, int dni) {
		super();
		this.name = name;
		this.address = address;
		this.dni = dni;
	}
	
// GETTERS AND SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}



	//PRINTERS
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", dni=" + dni + "]";
	}

}// end public class Person

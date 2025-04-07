package files.employee;

public class Employee {
	private int age;
	private String name;
	private int id;
	private boolean drivingLicense;
	private float shoeSize;
	private static int countEmp=0;
	
	public Employee() {
		this.age = -10;
		this.name = "Give me a name";
	}
	
	public Employee(String name) {
		this.age = 20;
		this.name = name;
	}
	
	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	public Employee(int age, String name, boolean drivingLicense, float shoeSize) {
		super();
		this.age = age;
		this.name = name;
		this.drivingLicense = drivingLicense;
		this.shoeSize = shoeSize;
		this.id=countEmp++;
	}
	
	
	//GETTERS AND SETTERS
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(boolean drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public float getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(float shoeSize) {
		this.shoeSize = shoeSize;
	}

	
	
	//PRINTERS
	public void print() {
		System.out.println(this.toString());
	}
	

//	public String tooString() {
//		return name + " has "+age+" years";
//	}

	@Override
	public String toString() {
		return "Employee [ id="+ id +" age=" + age + ", name=" + name + ", id=" + id + ", drivingLicense=" + drivingLicense
				+ ", shoeSize=" + shoeSize +  "]";
	}

	public String toFileString() {
		return "id="+ id +" age=" + age + ", name=" + name + ", drivingLicense=" + drivingLicense
				+ ", shoeSize=" + shoeSize +  "";
	}


	
	
	
	
	
	
}

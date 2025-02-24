package classes;

public class Act03 {
	private int age;
	private String name;
	
	public Act03 (){
		this.age= -10;
		this.name = "Alv";
	}

	public Act03 (int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public Act03 (String name){
		this.age = 20;
		this.name = name;
	}
	
	public void printEmp() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return   "Act03 [name=" + name + ", age=" + age + "]";
	}
}

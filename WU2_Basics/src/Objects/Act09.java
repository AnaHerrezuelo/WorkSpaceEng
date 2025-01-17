package Objects;

public class Act09 {
	private final int NUM=10;
	private final String NAME;
	private short age;
	Act09DNI identifier;
	
	public Act09() {
		NAME="namee";
		age=0;
		identifier = new Act09DNI(12345678);
	}
	
	public Act09(String name, short age,  int numDNI  ) {
		this.NAME=name;
		setAge(age);
		identifier = new Act09DNI(numDNI);
	}

	
//	itworks
//	public int isOlderThan (Act09 auxStudent) {
//		if(this.age<auxStudent.getAge()) {
//			//System.out.println("this is younger");
//			return -1;
//		}else if(this.age>auxStudent.getAge()){
//			//System.out.println("this is older");
//			return 1;
//		}else /* equals*/ {
//			return 0;
//		}
//	}

	
	
	//GETTERS AND SETTERS
	public String getName() {
		return NAME;
	}
//	public void setName(String name) {
//		//this.NAME = name;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(short age) {
		if(age>0) {
			this.age = age;
		}else {
			this.age = (short)(-1*age);
		}
		
	}
	

	

	
	
	@Override
	public String toString() {
		return "Act09 [NUM=" + NUM + ", NAME=" + NAME + ", age=" + age + ", DNI=" + identifier.toString() + "]";
	}
	

//	public  void printAct () {
//		System.out.println(toString());
//	}
	
	
}//end class Act09

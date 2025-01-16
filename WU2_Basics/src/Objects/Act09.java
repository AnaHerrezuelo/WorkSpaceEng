package Objects;

public class Act09 {
	private final int NUM=10;
	private final String NAME;
	private short age;
	
	public Act09() {
		NAME="namee";
		age=0;
	}
	public Act09(String name, short age) {
		this.NAME=name;
		setAge(age);
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
	public void setName(String name) {
		//this.NAME = name;
	}
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
	
//	public  void printAct () {
//		System.out.println(this.toString());
//	}
	
	@Override
	public String toString() {
		return "Act09 [NUM=" + NUM + ", NAME=" + NAME + ", age=" + age + "]";
	}
	

	
	
}//end class Act09

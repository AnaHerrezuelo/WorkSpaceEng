package DinamicStructure;

public class Students implements Comparable {
	String name;
	int id;
	
	
	public Students(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Students() {
		super();
		this.name = "default";
		this.id = -1;
	}
	
	
	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		int aux=this.id-((Students)o).id;
		return aux;
	}	
	
	
//	public static void main(String[] args) {
//		
//	}// end public static void main(String[] args) 
}//end public class Students

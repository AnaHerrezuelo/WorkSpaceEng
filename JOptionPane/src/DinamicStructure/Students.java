package DinamicStructure;

import java.util.Objects;

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
	
	
	
	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		int aux=this.id-((Students)o).id;
		return aux;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return id == other.id && Objects.equals(name, other.name);
	}	
	
	
//	public static void main(String[] args) {
//		
//	}// end public static void main(String[] args) 
}//end public class Students

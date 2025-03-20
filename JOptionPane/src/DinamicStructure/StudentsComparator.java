package DinamicStructure;

import java.util.Comparator;

public class StudentsComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//from the class Students
		Students s1 = (Students) o1;
		Students s2 = (Students) o2;
		String name1=s1.name;
		String name2=s2.name;
		
		int aux=name1.compareTo(name2);
		
		return aux;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}// end public static void main(String[] args) 
}//end public class StudentsComparator

package DinamicStructure;

import java.util.Comparator;

public class StudentsCompNameID implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//from the class Students
		Students s1 = (Students) o1;
		Students s2 = (Students) o2;
		String name1=s1.name;
		String name2=s2.name;
		
		int aux=name1.compareTo(name2);
		if(aux==0) {
//			aux=s1.id-s2.id;
			aux=s1.compareTo(s2); //we can do it because it is done in Students
		}
		return aux;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}// end public static void main(String[] args) 
}//end public class StudentsComparator

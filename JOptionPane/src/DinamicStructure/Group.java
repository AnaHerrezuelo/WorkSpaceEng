package DinamicStructure;

import java.util.ArrayList;

public class Group {
	public static void main(String[] args) {
		
		ArrayList <Students>studentsList = new ArrayList();
		String groupName="A";
		
		//from the class Students
		studentsList.add(new Students ());
		studentsList.add(new Students ("APepe", 2));
		studentsList.add(new Students ("Juan", 1));
		studentsList.add(new Students ("Juan", 4));
		studentsList.add(new Students ("Chema", 3));
		
		//it works because of the comparable
//		studentsList.sort(null);
		
		//it works because of the StudentsComparator
//		studentsList.sort(new StudentsComparator());
		
		//it works because of the StudentsComparator
		studentsList.sort(new StudentsCompNameID());

		//print all the students
		for (Students students : studentsList) {
			System.out.println(students);
		}
		
		

	}// end public static void main(String[] args) 
}//end public class Group

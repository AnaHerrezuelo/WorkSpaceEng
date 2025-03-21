package DinamicStructure;

import java.util.HashSet;
import java.util.Iterator;

public class setMain {

	public static void main(String[] args) {
		HashSet <Students>group = new HashSet();
		
		group.add(new Students());
		group.add(new Students("Asldkjfo", 2));
		group.add(new Students("Bsldjf", 1));
		group.add(new Students("Dksejh", 4));
		group.add(new Students("Cshfoe", 3));
		
//		System.out.println(group.toString());

//		System.out.println(group.add(new Students("Bsldjf", 1)));
//		group.remove(new Students("Bsldjf", 1)); // it deletes because it has the same hascode
		
//		Iterator iter = group.iterator();
		Iterator <Students> iter = group.iterator();
		
		//print the first line
//		System.out.println(iter.next());
		
		//print true if there's an object
//		System.out.println(iter.hasNext());
		
		
		//it doesn't work
//		while(iter.hasNext()) {
//			Students auxStudent = iter.next();
//			if(auxStudent.getId()==2) {
//				group.remove(auxStudent);
//			}
//		}
		
		
		while(iter.hasNext()) {
			Students auxStudent = iter.next();
			if(iter.next().getId()==2) {
				iter.remove();
			}
		}
		
		System.out.println(group.toString());
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}// end public static void main(String[] args) 
}//end public class setMain

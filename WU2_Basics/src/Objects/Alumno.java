package Objects;

import java.util.Arrays;
import java.util.Scanner;

public class Alumno {
	String name, group;
	boolean correct;
	int [] grades  = new int [5];
	
	public Alumno () {
		
	}
	public Alumno (String name) {
		this.name=name;
	}
	
	public Alumno (String name, String group) {
		this.name=name;
		this.group=group;;
	}
	
	public Alumno (String name, String group, int [] grades  ) {
		this.name=name;
		this.group=group;
		for(int i=0; i<grades.length;i++) {
			this.grades[i]=grades[i];
		}
	}
	
	public boolean introduceInfo (Scanner keyboard) {
		System.out.print("gave me the name:");
		this.name = keyboard.next();
		
		System.out.print("gave me the group:");
		this.group = keyboard.next();
		
		for(int i=0; i<grades.length;i++) {
		System.out.print("gave me the Grades of the student "+ i +"/"+ grades.length +":");
			this.group[i]= keyboard.next();
		}
		
	    return (correct);
	}
	
	
	
//	public String introduceAlumn (Scanner keyboard) {
//		System.out.print("gave me the name:");
//		this.name = keyboard.next();
//		
//        return (name);
//	}
//	
//	public String introduceGroup (Scanner keyboard) {
//		System.out.print("gave me the group:");
//		this.group = keyboard.next();
//		
//		return (group);
//	}
//	
//	public int []  introduceGrades (Scanner keyboard) {
//		for(int i=0; i<grades.length;i++) {
//			System.out.print("gave me the Grades of the student "+ i +"/"+ grades.length +":");
//			this.group[i]= keyboard.next();
//		}
//		return (group);
//	}
	
	
	
	
	
	public void printToString() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Alumno [name=" + name + ", group=" + group + ", grades=" + Arrays.toString(grades) + "]";
	}
	
	
	
	
}//end public class Alumno

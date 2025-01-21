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
		
<<<<<<< HEAD
//		for(int i=0; i<grades.length;i++) {
//		System.out.print("gave me the Grades of the student "+ i +"/"+ grades.length +":");
//			this.group[i]= keyboard.next();
//		}
=======
		for(int i=0; i<grades.length;i++) {
		System.out.print("gave me the Grades of the student "+ i +"/"+ grades.length +":");
			this.grades[i]= keyboard.nextInt();
		}
		this.correct=true;		
		System.out.println("you have enter all the data");
>>>>>>> f3aad36b4fa3da08bfc4a59d394d0878a49c0a59
		
	    return (correct);
	}
	
	public int average () {
		int avg=0;
		for(int i=0; i<grades.length;i++) {
			avg=avg + this.grades[i];
		}
		avg=avg/5;
		//System.out.println("AVERAGE: " + avg);
		return avg;
	}
	public void printAvg() {
		System.out.println("AVERAGE: " +average());
	}
	
	public int [] failed () {
//		int [] failedgrades  = new int [grades.length];
		for(int i=0; i<grades.length;i++) {
			if(grades[i]<5) {
				System.out.print(grades[i]);
			}
			
		}
		return grades;
	}
	
	public void printFailed() {
		System.out.println("FAILED grades: " +failed());
	}
	
	
	
	
	
	
	
	
	
	public void printToString() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Alumno [name=" + name + ", group=" + group + ", grades=" + Arrays.toString(grades) + "]";
	}
	
	
	
	
}//end public class Alumno

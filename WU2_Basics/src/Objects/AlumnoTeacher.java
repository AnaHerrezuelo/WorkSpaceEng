package Objects;

import java.util.Scanner;

public class AlumnoTeacher {
	private final int SIZE=5;
  private String name, group;
  private int[] marks=new int[SIZE];
  private static String school;
	
  public AlumnoTeacher() {
		super();
		name="No Name";
		group="No group";
		for (int i = 0; i < SIZE; i++) {
			marks[i]=-1;
		}
  }
  public AlumnoTeacher(String name) {
  	this();
  	this.name=name;
  }
  public AlumnoTeacher(String name,String group) {
    this(name);
    this.group=group;
  }
  public AlumnoTeacher(String name, String group, int[] marks) {
		this(name,group);
		this.marks = marks;
  }
	
	public void askingData() {
		Scanner keyboard = new Scanner(System.in);
		  int auxMark = 0;
		  String auxName;
		  
			System.out.print("gime me Student name: ");
		  auxName=keyboard.nextLine();
		  setName(auxName);
		  
		  System.out.print("gime me Student gruop: ");
		  setGroup(keyboard.nextLine());
		  
		  System.out.println("let's go whit marks");
		  for (int i = 0; i < marks.length; i++) {
		  	
		  		marks[i]=auxMark;
		  }
	}
	//}
	
	public void printData() {
		System.out.println("name= "+name);
		System.out.println("group= "+group);
		System.out.print("marks= ");
		for (int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]+" - ");
		}
		System.out.println();
	}
	
	public double maksAverage() {
		double total=0;
		for (int i = 0; i < marks.length; i++) {
			total+=marks[i];
		}
		return total/SIZE;
	}
	
	public int failMarks() {
		int count=0;
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]<5) {
				count++;
			}
		}
		return count;
	}
	
	public int honorMarks() {
		int count=0;
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]==10)
				count++;
		}
		return count;
	}
	public int sobresalientesMarks() {
		int count=0;
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]==9)
				count++;
		}
		return count;
	}
	public int notableMarks() {
		int count=0;
		for (int i = 0; i < marks.length; i++) {
			if(marks[i]==7 || marks[i]==8)
				count++;
		}
		return count;
	}
	public void changeOneMark(){
	// changing one mark
			System.out.println("give the number of the mark from 1 to " + SIZE);
			Scanner keyboard = new Scanner(System.in);
			int markNumber = keyboard.nextInt();
			markNumber--;
			while (markNumber < 0 || markNumber > SIZE - 1) {
				System.err.println("Really, give that again");
				markNumber = keyboard.nextInt();
			}
			int mark = askMark(keyboard);

			setOneMark(markNumber, mark);
	}
	public int askMark(Scanner keyboard) {
		System.out.println("new mark");
		int mark = keyboard.nextInt();
		while (mark < 0 || mark > 10) {
			System.err.println("Really, give that again");
			mark = keyboard.nextInt();
		}
		return mark;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public void setOneMark(int pos, int mark) {
		marks[pos]=mark;
	}
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		AlumnoTeacher.school = school;
	}
	
	
	public int getSIZE() {
		return SIZE;
	}
 
}

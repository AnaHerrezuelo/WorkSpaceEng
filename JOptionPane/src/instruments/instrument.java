package instruments;


import java.util.Scanner;

public class instrument {
	private notes notes;
	
	int max;
	String melody [] = new String [max];
	boolean correct;
	
	public  boolean insertMelody () {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("How long is the melody going to be? : ");
		this.max= keyboard.nextInt();
		keyboard.nextLine();
		
//		int max= keyboard.nextInt();
//		String melody [] = new String [max];
		
		System.out.println("inset the notes: ");
		for(int i=0;i<melody.length;i++) {
			melody[i]=keyboard.next();
		}
		
		//
		for(int i=0;i<melody.length;i++) {
			if(melody[i].equals(notes)) {
				System.out.println("correct");
			}else {
				System.out.println("false");
			}
		}
		
		this.correct=true;
		
		return correct;
		
	}//end insertMelody () 
	
	
	
	public void printMelody(String [] melody) {
		for(int i=0;i<melody.length;i++) {
			System.out.println(melody[i]);
		}
	}
	
	String melody2 [] = {"DO", "RE"};
	
	
	public void notes(notes notes) {
//		System.out.println(notes.MI);
//		System.out.println(notes.LA);
		
		for(int i=0;i<melody2.length;i++) {
			if(melody2[i].equals(notes)) {
				System.out.println("correct");
			}else {
				System.out.println("false");
			}
		}
		
	}
	

	
	
	
}//end public class instrument

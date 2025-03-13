package instruments;

import java.util.Arrays;
import java.util.Scanner;

public class Instrument2 {
	Scanner keyboard= new Scanner(System.in);
	boolean correct=false;
	String [] melody = new String [7];
	String [] notes = {"DO", "RE", "MI", "FA", "SOL", "LA", "SI"};

	
	public Instrument2() {
		
	}
	
//	public boolean introMelody(String [] melody) {
//		for(int i=0; i<melody.length;i++) {
//			System.out.println("Insert the note "+(i+1));
//			melody[i]=keyboard.next();
//		}
//		
//
//		for(int i=0; i<melody.length;i++) {
//			System.out.print(melody[i] + " ");
//		}
//		
//		return correct;
//	}
	
	
	public boolean introMelody () {
		int notEquals=0;
		for 	(int i=0; i<melody.length;i++) {
			System.out.println("Insert the note "+(i+1));
			melody[i]=keyboard.next();
		}
		
//		for(int i=0; i<melody.length;i++) {
//			if(melody[i].equalsIgnoreCase(notes[i])) {
//				//this.correct=true;
//			}else {
//				//this.correct=false;
//				notEquals++;
//			}
//		}
		
		for(int i=0; i<melody.length;i++) {
			for(int j=0; j<melody.length;j++) {
				if(melody[j].equalsIgnoreCase(notes[i])) {
					notEquals++;
				}else {
				}
			}
		}	
		if(notEquals==7) {
			this.correct=true;
		}
		System.out.println(correct);
		return correct;
	}
	
	
	public void showNotes() {
		for(int i=0; i<melody.length;i++) {
			System.out.print(melody[i] + " ");
		}
	}
	
	public void duration () {
			System.out.println("the melody has" + melody.length + "notes");
	}
	
	public void eachNote () {
		int appears=0;
		System.out.println("Give me the note you want to search: ");
		String note=keyboard.next();
		
		for(int i=0; i<melody.length;i++) {
			//System.out.print(melody[i] + " ");
			if(melody[i].equalsIgnoreCase(note)) {
				appears++;
			}
		}
		
		System.out.println("It appears " + appears + " times");
	}
	
	
	// PRINTTERS
	public void printToString() {
		System.out.println(toString()); 
	}

	@Override
	public String toString() {
		return "Instrument [keyboard=" + keyboard + ", correct=" + correct + ", melody=" + Arrays.toString(melody)
				+ ", notes=" + Arrays.toString(notes) + "]";
	}
	
	
	
}

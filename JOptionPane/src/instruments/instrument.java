package instruments;

import java.util.Arrays;
import java.util.Scanner;

public class instrument {
	Scanner keyboard = new Scanner(System.in);
//	private notes notes;

	int max;
	String[] melody;
	String[] notes = { "DO", "RE", "MI", "FA", "SOL", "LA", "SI" };
	boolean correct;
	int CountCorrectNotes = 0;

	public boolean insertMelody() {
		String melAux;
		System.out.println("How long is the right melody going to be? : ");
		max = keyboard.nextInt();
		keyboard.nextLine();

		melody = new String[max];

//		int max= keyboard.nextInt();
//		String melody [] = new String [max];
		
		
//		System.out.println("insert the notes: ");

//			melAux = keyboard.next();
//			for (int j = 0; j < notes.length; j++) {
//				if (melAux.equalsIgnoreCase(notes[j])) {
//					melody[i] = melAux;
//					CountCorrectNotes++;
//					System.out.println("valid");
//				}else {
//					System.out.println("not valid");
//				}
//			}
//		}

		System.out.println("insert the notes: ");
		for (int i = 0; i < melody.length; i++) {
			melody[i] = keyboard.next();
		}
		for (int i = 0; i < melody.length; i++) {
			for (int j = 0; j < notes.length; j++) {
				if (melody[i].equalsIgnoreCase(notes[j])) {
					CountCorrectNotes++;
				}
			}
		}


		if (CountCorrectNotes == melody.length) {
			this.correct = true;
		} else {
			this.correct = false;
		}

		System.out.println(correct);
		return correct;

	}// end insertMelody ()
	
	

	public void printMelody() {
		System.out.println("the right melody is: ");
		for (int i = 0; i < melody.length; i++) {
			System.out.print(melody[i] + " ");
		}
		System.out.println("");
	}

	public void duration() {
//		System.out.println("the melody has " + melody.length + " notes");
		System.out.println("the right melody has " + CountCorrectNotes + " notes");
	}

	public void countNote() {
		int appears = 0;
		System.out.println("Give me the note you want to search on the right melody: ");
		String noteS = keyboard.next();

		for (int i = 0; i < melody.length; i++) {
			// System.out.print(melody[i] + " ");
			if (melody[i].equalsIgnoreCase(noteS)) {
				appears++;
			}
		}

		System.out.println("It appears " + appears + " times");
	}
	
	
	
	//GETTERS AND SETTERS

	public String[] getMelody() {
		return melody;
	}

	public void setMelody(String[] melody) {
		this.melody = melody;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	// printers

	public void printToString() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "instrument [melody=" + Arrays.toString(melody) + ", correct=" + correct + "]";
	}
	
	
	
	

//	String melody2 [] = {"DO", "RE"};
//	
//	
//	public void notes(notes notes) {
////		System.out.println(notes.MI);
////		System.out.println(notes.LA);
//		
//		for(int i=0;i<melody2.length;i++) {
//			if(melody2[i].equals(notes)) {
//				System.out.println("correct");
//			}else {
//				System.out.println("false");
//			}
//		}
//		
//	}

}// end public class instrument

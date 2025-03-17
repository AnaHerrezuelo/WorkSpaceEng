package instrumentsArrayList;

import java.util.InputMismatchException;

public class piano extends instrument {
	int max;
	String[] melodyLeft;
	boolean correct;
	int CountCorrectNotes = 0;
	
	public boolean insertMelody() throws InputMismatchException {
		super.insertMelody();
		
		System.out.println("How long is the left melody going to be? : ");
		max = keyboard.nextInt();
		keyboard.nextLine();
		
		melodyLeft = new String[max];

		System.out.println("inset the notes: ");
		for (int i = 0; i < melodyLeft.length; i++) {
			melodyLeft[i] = keyboard.next();
		}

		for (int i = 0; i < melodyLeft.length; i++) {
			for (int j = 0; j < notes.length; j++) {
				if (melodyLeft[i].equalsIgnoreCase(notes[j])) {
					CountCorrectNotes++;
				}
			}
		}

		if (CountCorrectNotes == melodyLeft.length) {
			this.correct = true;
		} else {
			this.correct = false;
		}

		System.out.println(correct);
		return correct;

	}// end insertMelody ()
	
	
	public void printMelody() {
		super.printMelody();
		System.out.println("the left melody is: ");
		for (int i = 0; i < melodyLeft.length; i++) {
			System.out.print(melodyLeft[i] + " ");
		}
		System.out.println("");
	}
	
	public void duration() {
		super.duration();
//		System.out.println("the melody has " + melody.length + " notes");
		System.out.println("the left melody has " + CountCorrectNotes + " notes");
	}

	public void countNote() {
		super.countNote();
		int appears = 0;
		System.out.println("Give me the note you want to search on the left side: ");
		String noteS = keyboard.next();

		for (int i = 0; i < melodyLeft.length; i++) {
			// System.out.print(melody[i] + " ");
			if (melodyLeft[i].equalsIgnoreCase(noteS)) {
				appears++;
			}
		}

		System.out.println("It appears " + appears + " times on the left melody");
	}
	
	
	
	
	
}//end public class piano 

package instrumentsArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InstrumentStr {
	String validNotes[] = { "DO", "RE", "MI", "FA", "SOL", "LA", "SI" };
	ArrayList list;
	String melody[];
	Scanner keyboard = new Scanner(System.in);

	public InstrumentStr() {
		super();
		this.melody = new String[3];
	}

	public boolean checkNote(String note) {
		for (int i = 0; i < validNotes.length; i++) {
			if (note.equalsIgnoreCase(validNotes[i]))
				return true;
		}
		return false;
	}
	public String [] askMelody() {
		String [] auxMelody =new String[melody.length];
		for (int i = 0; i < melody.length; i++) {
			System.out.println("give a note");
			String auxNote = keyboard.nextLine();
			if (checkNote(auxNote))
				auxMelody[i] = auxNote;
			else
				throw new IllegalArgumentException();
		}
		return auxMelody;
	}
	
	public boolean insetMelody() {
		try{
		melody=askMelody();
		}catch (IllegalArgumentException e) {
		return false;
		}
		return true;
	}

	public void playMelody() {
		for (int i = 0; i < melody.length; i++) {
			System.out.println(melody[i]+",");
		}
	}
	
	public int duration() {
		return melody.length;
	}
	
	public int coutnNote(String note) {
		int count=0;
		
		for (int i = 0; i < melody.length; i++) {
			if(melody[i].equalsIgnoreCase(note)) {
				count++;
			}
		}
		return count;
	}
}

package instrumentsArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class InstrumentStr {
	String notes[] = { "DO", "RE", "MI", "FA", "SOL", "LA", "SI" };
	ArrayList melody;
	Scanner keyboard = new Scanner(System.in);

	public InstrumentStr() {
		super();
//		this.melody = new String[3];
		
	}

	public boolean checkNote(String note) {
		for (int i = 0; i < notes.length; i++) {
			if (note.equalsIgnoreCase(notes[i]))
				return true;
		}
		return false;
	}
	
//	public String [] askMelody() {
//		String [] auxMelody =new String[melody.length];
//		for (int i = 0; i < melody.length; i++) {
//			System.out.println("give a note");
//			String auxNote = keyboard.nextLine();
//			if (checkNote(auxNote))
//				auxMelody[i] = auxNote;
//			else
//				throw new IllegalArgumentException();
//		}
//		return auxMelody;
//	}
	
	
	public ArrayList askMelody() {
		ArrayList auxMelody=new ArrayList();
		
			System.out.println("give a note");
			String auxNote = keyboard.nextLine();
			if (checkNote(auxNote)) {
				auxMelody.add(auxNote);
			}else {
				throw new IllegalArgumentException();
			}
			
		return auxMelody;
	}
	
	public boolean insertMelody() {
		try{
//			melody.addAll(askMelody());
			melody= askMelody();
//			askMelody(melody);
		}catch (IllegalArgumentException e) {
			return false;
		}
		return true;
	}

	public void playMelody() {
//		for (int i = 0; i < melody.size(); i++) {
//			System.out.println(melody.get(i)+",");
//		}
		
//		for (Object object : melody) {
//			System.out.println(object);
//		}
		
		Iterator iter=melody.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public int duration() {
		return melody.size();
	}
	
	public int coutnNote() {
		int count=0;
		
		System.out.println("Give me the note you want to search on the right melody: ");
		String noteS = keyboard.next();
		
//		for (int i = 0; i < melody.size(); i++) {
//			String auxStr=(String) melody.get(i);
//			if(auxStr.equalsIgnoreCase(noteS)) {
//				count++;
//			}
//		}
		
		for (Object melodyNote : melody) {
			String auxStr=(String) melodyNote;
			if(auxStr.equalsIgnoreCase(noteS)) {
				count++;
			}
		}
		
		System.out.println(count);
		return count;
	}
	
	
	
	public void printNotes() {
		for (int i = 0; i < notes.length; i++) {
			System.out.print(notes[i]+" ");
		}
	}
	
}

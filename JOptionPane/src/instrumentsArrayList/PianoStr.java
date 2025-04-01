package instrumentsArrayList;

import java.util.ArrayList;

public class PianoStr extends InstrumentStr {

	ArrayList<String> leftMelody ;

	public PianoStr() {
		super();
//		this.leftMelody = new String[melody.length];
	}

	@Override
	public boolean insertMelody() {
		try {
			melody = askMelody();
			System.out.println("Give the other hand Melody");
			leftMelody = askMelody();
		} catch (IllegalArgumentException e) {
			return false;
		}
		return true;
	}

	
	@Override
	public void playMelody() {
		System.out.println("rightHand: ");
		for (int i = 0; i < melody.size(); i++) {
			System.out.print(melody.get(i)+" ");
		}
		System.out.println();
//		System.out.println("leftHand: "+leftMelody.toString());
		System.out.println("leftHand: ");
		for (int i = 0; i < leftMelody.size(); i++) {
			System.out.print(leftMelody.get(i)+" ");
		}
		
	}
	
	
	
}

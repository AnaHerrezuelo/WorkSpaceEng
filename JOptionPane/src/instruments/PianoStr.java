package instruments;

public class PianoStr extends InstrumentStr {

	String leftMelody[];

	public PianoStr() {
		super();
		this.leftMelody = new String[melody.length];
	}

	@Override
	public boolean insetMelody() {
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
		for (int i = 0; i < melody.length; i++) {
			System.out.println(melody[i]+",");
		}
//		System.out.println("leftHand: "+leftMelody.toString());
		for (int i = 0; i < leftMelody.length; i++) {
			System.out.println(leftMelody[i]+",");
		}
		
	}
	
	
	
}

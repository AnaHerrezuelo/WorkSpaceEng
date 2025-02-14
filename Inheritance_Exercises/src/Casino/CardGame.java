package Casino;

public class CardGame extends Game {

	
	private int players, totalcards, dealtCards ;


	
	
	public CardGame() {
		
	}
	public CardGame(String name, int players, int totalcards, int dealtCards) {
		super(name);
		this.players = players;
		this.totalcards = 0;
		this.dealtCards = 0;
	}

	

	public void printToString() {
		System.out.println(toString());
	}
	
	
	@Override
	public String toString() {
		return super.toString()
				+ "CardGame [players=" + players + ", totalcards=" + totalcards + "]" + super.toString();
	}
	
	
	
	
	
}

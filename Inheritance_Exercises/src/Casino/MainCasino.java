package Casino;

public class MainCasino {
	public static void main(String[] args) {

		Game game = new Game();
		game.askData();
		game.printToString();
		
		CardGame cards = new CardGame();
		cards.printToString();
		
		DiceGame dice = new DiceGame();
		

		
		

	}//	end public static void main(String[] args)
}// end public class MainCasino

/*
Casino
  atributos
	nombre
	puja máxima
	puja mínima

juegos de cartas
	número de jugadores
	número de cartas
	cartas dadas(cartas de los jugadores)

juegos de dados (class)
	número de dados

	dado (class)
		tiro de dados (roll dice)
		tipo de dados(número de caras)
tragaperras
	3 ruedas
	símbolos --> array of Strings
	jackpot

*/






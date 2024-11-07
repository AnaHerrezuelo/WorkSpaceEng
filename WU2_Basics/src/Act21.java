import java.util.Scanner;

public class Act21 {
	public static void main(String[] args) {
		char letter;
		String auxString;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("gimme a vowel: ");
		auxString=keyboard.next();
		//System.out.println(auxString);
		
		letter=auxString.charAt(0);
		System.out.println(letter);
		
		int asciiValue = letter;
		
		switch(asciiValue) {
			case'a':
			case'A':
				System.out.println("a is 1"); break;
			case'e':
				System.out.println("e is 2"); break;
			case'i':
				System.out.println("i is 3"); break;
			case'o':
				System.out.println("o is 4"); break;
			case'u':
				System.out.println("u is 5"); break;
		};
	};
}

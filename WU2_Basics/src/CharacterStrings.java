import java.util.Scanner;

public class CharacterStrings {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		/* EXXERCISE 1 (ptt WU4{pg 12}) 
		it works
		String word = "patatas";
		
		for(int i=0; i<word.length(); i++) {
			System.out.print(word.charAt(i)+ " ");
		}
		*/
		
		
		
		
		/* EXXERCISE 2 (ptt WU4 {pg 12})
		 	it works 
		
		String word;
		int vowels=0;
		//String [] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
		
		System.out.print("give me a word: ");
		word=keyboard.nextLine();
		
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == 'a'  || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'|| word.charAt(i) == 'u') {
				//System.out.print("a");
				vowels++;
			}
		}
		System.out.print(vowels);
		
		*/
		
		
		
		
		/* EXXERCISE 3 (ptt WU4 {pg 12}) 
		it works
		String word;

		System.out.print("give me a word: ");
		word=keyboard.nextLine();

		for(int i=word.length()-1; i>=0; i--) {
			System.out.print(word.charAt(i)+ " ");
		}
		*/

		
		
		
		
		
		
		
		/* EXXERCISE 4 (ptt WU4 {pg 12}) 
		it works
		
		String word;
		String character;
		int vowels=0;

		System.out.print("give me a word: ");
		word=keyboard.nextLine();
		
		System.out.print("give me a character: ");
		character=keyboard.nextLine();
		
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == character.charAt(0)) {
				//System.out.print("a");
				vowels++;
			}
		}
		System.out.print(vowels);
		*/
		
		
		
		
		
		
		
		
		
		/* COMPARE STRINGS 
		it works
		
		String word;
		String word2;
		

		System.out.print("give me a word: ");
		word=keyboard.nextLine();
		
		System.out.print("give me a character: ");
		word2=keyboard.nextLine();
		
		
		boolean result=word.equals(word2);
		boolean resultIgnore=word.equalsIgnoreCase(word2); //ignore the uppercase

		System.out.println(result);
		System.out.println(resultIgnore);
		
		*/
		
		
		
		
		
		/* INDEXOF 
		it works
		String word="buenos días";
		
//		System.out.print("give me a word: ");
//		word=keyboard.nextLine();
		
		int pos=-95;
		
		pos=word.indexOf('o', 5); //('o', 5) si busco la posición, me lo pone en negativo, ya q la o está en la  posición 4
		
		System.out.println("position: " + pos);
		
		*/
		
		
		
		/* CompareTo 
		
		String word="hello";
		String word2="hello";
		
		 word="aaa";
		 word2="zzz";
		
		 int resultInt=word.compareTo(word2);
		
		 System.out.println(resultInt);
		*/
		
		
		
		
		
		
		/* EXXERCISE 5 (ptt WU4 {pg 12}) 
		it works */
		
		int position;
		
		
		
		
		
		
		
		
		
	} // end of public static void main (String [] args)
} //end of public class

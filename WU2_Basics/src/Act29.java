import java.util.Scanner;

public class Act29 {
	public static void main(String[] args) {
		String sentence;
		
		Scanner keyboard = new Scanner(System.in);
		

		for(int i=1; i>0 && i<5; i++){
			//System.out.print(i + " ");
			System.out.print("give me a sentence: ");
			sentence=keyboard.nextLine();
			System.out.println(sentence);
		};

	};
}

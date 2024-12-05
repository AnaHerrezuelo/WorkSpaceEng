package Methods;
import java.util.Scanner;

public class Act06_Methods {
	public static void main (String [] arg) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Gimme the c: ");
		double celsius = keyboard.nextDouble();
		
		Fahrenheit(celsius);
		
	}//main
	
	public static void Fahrenheit (double celsius) {
		double farenheit = (celsius + 32 * 1.8) ;
		System.out.print(farenheit + " ºF");
		
	};
}//class

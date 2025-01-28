package Objects;

import java.util.Scanner;

public class mainRadio {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		radio f = new radio();
		int sel;
		
		do {
			System.out.println("Frecuencia " + f.frequency);
			
			System.out.println("1 to up, 0 to down");
			sel=keyboard.nextInt();
			
			if(sel==1) {
				f.increase(keyboard);
			}else if(sel==0) {
				f.decrease(keyboard);
			}
			f.printToString();
			
		}while(sel==0 || sel==1);
		
		
//		f.operation(keyboard);
		f.printToString();
		

		
		
	}//	public static void main(String[] args)
}//end public class mainRadio

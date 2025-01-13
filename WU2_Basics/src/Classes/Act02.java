package Classes;

public class Act02 {
	public Act02 (int limit) {
		for(int i=0; i<limit; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	public Act02 (int limit, char ch) {
		for(int i=0; i<limit; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}	
}

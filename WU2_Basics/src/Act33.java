import java.util.Scanner;

public class Act33 {
	public static void main(String[] args) {
		int students = 0;
		int grades = 0;
		int pass = 0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		do{
			System.out.println("Enter the grades of the students: ");
			grades=keyboard.nextInt();
			if(grades >= 5 && grades <= 10) {
				pass++;
				students++;
			}else if(grades<5 && grades <10){
				students++;
			};
		}while(grades>0 && grades<10);
		
		System.out.println("students pass "+pass);
		System.out.println("number total "+students);
	};
}

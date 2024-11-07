import java.util.Scanner;

public class Act32 {
	public static void main(String[] args) {
		int students = 0;
		int grades = 0;
		int pass = 0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		/*
		
		while(students<3){
			System.out.println("Enter the grades of the students: ");
			grades=keyboard.nextInt();
			students++;
			if(grades<0 || grades>10) {
				System.out.println("Notas no válidas");
			}else if(grades == 5) {
				pass++;
				students++;
			}else {
				students++;
			};
		};
		*/
		
		do{
			System.out.println("Enter the grades of the students: ");
			grades=keyboard.nextInt();
			if(grades<0 || grades>10) {
				System.out.println("Notas no válidas");
			}else if(grades >= 5) {
				pass++;
				students++;
			}else {
				students++;
			};
		}while(students<10);
		
		System.out.print(pass);
		//System.out.print(students);
	};
}

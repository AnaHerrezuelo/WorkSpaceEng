package hospital;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Doctor  doc = new Doctor ("aaa", "aaa", 3, "aaa");
		Doctor  doc1 = new Doctor ("bbb", "bbb",8, "bbb");
		
		Patient  pat = new Patient ("ccc", "ccc", 3, 6);
		Patient  pat1 = new Patient ("ddd", "ddd", 3, 6);
		
		ArrayList <Appointment> book = new ArrayList <Appointment>();
		
		LocalDate day = LocalDate.now();
		
		book.add(new Appointment(doc, pat, day));
		book.add(new Appointment(doc1, pat1, day));
		
		for (Appointment appointment : book) {
			System.out.println(appointment);
		}
		
		
		final String PATH="C:\\Files";
		File file= new File(PATH, "Employee.txt");
		FileInputStream fiInput;
		ObjectOutputStream datOutput ;
		
		try {
			fiInput = new FileInputStream(file);
			
//			datOutput.writeObject(fiInput);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}// end public static void main(String[] args)
}//end class Main

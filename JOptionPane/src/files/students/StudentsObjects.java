package files.students;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class StudentsObjects {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File file;

		try {
			file= new File(PATH, "StudentObject.txt");			
			
			FileOutputStream fileOutputS= new FileOutputStream(file);
			
			ObjectOutputStream obOutS= new ObjectOutputStream(fileOutputS);
			
			StudentsFiles auxStudent= new StudentsFiles("pepe", 3);
			
			obOutS.writeObject(auxStudent);
			
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}// end public static void main(String[] args) 	
}//end public class MainApp

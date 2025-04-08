package files.employee;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadingEmployeeApp3 {

	public static void main(String[] args) {
		
		final String PATH="C:\\Files";
		File file;
		
		try {
			
			file= new File(PATH, "EmployeeObject.txt");
			FileInputStream fiInput= new FileInputStream(file);
			ObjectInputStream objInput= new ObjectInputStream(fiInput);
			
			Employee auxEmp;

			ArrayList  list = (ArrayList) objInput.readObject();
			for (Object object : list) {
				System.out.println(object.toString());
			}
			
			

			
			fiInput.close();
			objInput.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(EOFException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}// end public static void main(String[] args) 	
	

	
}//end public class MainApp
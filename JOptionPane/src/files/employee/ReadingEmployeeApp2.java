package files.employee;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadingEmployeeApp2 {

	public static void main(String[] args) {
		
		final String PATH="C:\\Files";
		File file;
		boolean keep= true;
		
		try {
			
			file= new File(PATH, "EmployeeObject.txt");
			FileInputStream fiInput= new FileInputStream(file);
			ObjectInputStream objInput= new ObjectInputStream(fiInput);
			
			Employee auxEmp;
			ArrayList <Employee> staff = new ArrayList <Employee>();
			
//			HashMap <Integer, Employee> map = new HashMap <Integer, Employee>();
			
//			while(objInput.available()>0) {
			while(keep) {	
				auxEmp= (Employee)objInput.readObject();
				staff.add(auxEmp);
				
//				System.out.println(auxEmp);
				
//				map.put(auxEmp.getId(), auxEmp);
//				staff.add(auxEmp);
			}

//			System.out.println("a" + map.get(2));

			//print
			for (Employee sta : staff) {
				System.out.println(sta.toString());
			}
			
//			fiInput.close();
//			objInput.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(EOFException e) {
			keep=false;
//			try {
//				
//			}catch (IOException e1) {
//				e.printStackTrace();
//			}
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}// end public static void main(String[] args) 	
	

	
}//end public class MainApp
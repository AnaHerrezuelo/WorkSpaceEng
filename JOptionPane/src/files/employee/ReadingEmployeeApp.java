package files.employee;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadingEmployeeApp {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File file;
		int age;
		String name;
		int id;
		boolean drivingLicense;
		float shoeSize;
		
		try {
			file= new File(PATH, "Employee.txt");
			FileInputStream fiInput= new FileInputStream(file);
			DataInputStream daInput= new DataInputStream(fiInput);
			Employee auxEmp;
			ArrayList <Employee> staff = new ArrayList <Employee>();
//			HashMap <Integer, Emloyee> map = new HashMap <Integer, Emloyee>();
			
			while(daInput.available()>0) {
				id = daInput.readInt();
				age = daInput.readInt();
				name=daInput.readUTF();
				drivingLicense=daInput.readBoolean();
				shoeSize=daInput.readFloat();
				auxEmp=new Employee(age, name, drivingLicense, shoeSize);
				staff.add(auxEmp);
				
//				map.put(id, auxEmp);
			}
			
//			System.out.println(map.get(2));

			//print
//			for (Employee emp : staff) {
//				System.out.println(emp.toString());
//			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}// end public static void main(String[] args) 	
}//end public class MainApp
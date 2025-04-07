package files.employee;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//import java.util.HashMap;

public class mainEmployeeApp2 {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File file;

		
		
		ArrayList <Employee> employeeList = new ArrayList <Employee>();
		employeeList.add(new Employee(12, "aaa", true, 3.5f ));
		employeeList.add(new Employee(12, "bbb", false, 6f ));
		employeeList.add(new Employee(12, "ccc", true, 3f ));
			
			
		try {
			file= new File(PATH, "EmployeeObject.txt");
			
			FileOutputStream fileOutputS= new FileOutputStream(file);
			ObjectOutputStream obOutS= new ObjectOutputStream(fileOutputS);
			
			
			
			//insert the data on the file
			for (Employee emp : employeeList) {
				obOutS.writeObject(emp);
			}
			
			//print the array
//			printList(employeeList);
			
			
			fileOutputS.close();
			obOutS.close();
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}// end public static void main(String[] args) 
	
	public static void printList(ArrayList <Employee>employeeList) {
		for (Employee emp : employeeList) {
				System.out.println(emp.toFileString());
			}
	}
	
	
}//end public class Students

package files.employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//import java.util.HashMap;

public class WriteEmployeeAppObject {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File file;
		
		FileOutputStream fileOutputS;
		ObjectOutputStream obOutS;
		
		
		ArrayList <Employee> employeeList = new ArrayList <Employee>();
		employeeList.add(new Employee(4, "ddd", true, 3.5f ));
		employeeList.add(new Employee(3, "fff", false, 45f ));
		employeeList.add(new Employee(6, "ggg", true, 93478f ));
			
			
		try {
			file= new File(PATH, "EmployeeObject.txt");
			
			if(file.isFile()) {
				fileOutputS= new FileOutputStream(file, true);
				obOutS= new myObjectOutputSteam(fileOutputS);
			}else {
				fileOutputS= new FileOutputStream(file);
				obOutS= new ObjectOutputStream(fileOutputS);
			}
			
			
			
			
						
			//insert the data on the file
			for (Employee emp : employeeList) {
				obOutS.writeObject(emp);
			}
			
			//print the array
//			printList(employeeList);
			
			
			fileOutputS.close();
//			obOutS.close();
			
			
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

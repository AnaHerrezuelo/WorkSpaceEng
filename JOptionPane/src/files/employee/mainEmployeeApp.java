package files.employee;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.HashMap;

public class mainEmployeeApp {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File file;
//		DataInputStream DataInS;
//		FileOutputStream FileOuS;
//		DataOutputStream DataOuS;
		
		
			
			
		try {
			file= new File(PATH, "Employee.txt");
			FileWriter fileWri= new FileWriter(file);
			BufferedWriter fileBuffW = new BufferedWriter(fileWri);
			
			FileOutputStream fileOutputS= new FileOutputStream(file);
			DataOutputStream daOutputS= new DataOutputStream(fileOutputS);
			
//			HashMap <int> map = new HashMap();
			
			ArrayList <Employee> employeeList = new ArrayList <Employee>();
			employeeList.add(new Employee(12, "aaa", true, 3.5f ));
			employeeList.add(new Employee(12, "bbb", false, 6f ));
			employeeList.add(new Employee(12, "ccc", true, 3f ));
			
			
			
			printList(employeeList);
			
//			for (Employee emp : employeeList) {
//				daOutputS.writeUTF(employeeList);
//			}
			
//			for (Employee emp : employeeList) {
//				fileBuffW.write(emp.toFileString());
//				fileBuffW.newLine();
//			}
			
			for (Employee emp : employeeList) {
				
			}
			
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

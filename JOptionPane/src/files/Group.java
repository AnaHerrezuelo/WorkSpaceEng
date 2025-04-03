package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Group {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File file;
		
//		FileWriter fileWri;
//		BufferedWriter fileBuffW;
		
		FileReader fileRead;
		BufferedReader fileBufR;
		
		int c;

		try {
			file=new File(PATH, "Students.txt");
//			fileWri= new FileWriter(file);
//			fileBuffW = new BufferedWriter(fileWri);
			
			
			//from the class Students
//			ArrayList <Students>studentsList = new ArrayList<Students>();
//			studentsList.add(new Students ("Pepe", 2));
//			studentsList.add(new Students ("Juan", 1));
//			studentsList.add(new Students ("Juan", 4));
//			studentsList.add(new Students ("Chema", 3));
			
			
			//print the ArrayList
//			for (Students students : studentsList) {
//				System.out.println(students);
//			}
			
			
			//insert the students
//			for (Students student : studentsList) {
//				fileBuffW.write(student.toFileString());
//				fileBuffW.newLine();
//			}
			
			//insert the students
//			if(file.exists()) {
//			}else {
//				fileWri= new FileWriter(file);
//			}
			
			
//			fileBuffW.close();
//			fileWri.close();
			
		
			ArrayList <String>studentsList = new ArrayList<String>();
			
			
			fileRead = new FileReader(file);
			fileBufR = new BufferedReader(fileRead);
			
			//does not work (it suppose to change the output)
			String readed;
			String split[];
			readed = fileBufR.readLine();
			while (readed != null) {
				split=readed.split(" ");
//				studentsList.add(readed);
				System.out.println(">>> " + split[0] + "-" + split[1]);
				readed = fileBufR.readLine();
			}
			
			
//			String readed, name, idStr;
//			String split[];
//			int id;
//			readed = fichBufR.readLine();
//			while (readed != null) {
//				split=readed.split(":");
//				
//				idStr=split[0];
//				name=split[1];
//				
//				id=Integer.parseInt(idStr);
//				
//				
//				
//				System.out.println(">>> " + split[0] + "-" + split[1]);
//				readed = fichBufR.readLine();
//			}
			
			
			
			
			fileBufR.close();
			fileRead.close();
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}// end public static void main(String[] args) 	
}//end public class MainApp

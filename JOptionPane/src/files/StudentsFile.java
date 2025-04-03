package files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class StudentsFile {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File file;
		
		try {
			file=new File(PATH, "StudentsData.txt");
//			FileOutputStream fileOut = new FileOutputStream(file);
//			DataOutputStream datOut = new DataOutputStream(fileOut);
//			
//			ArrayList <Students>studentsList = new ArrayList<Students>();
//			studentsList.add(new Students ("Pepe", 2));
//			studentsList.add(new Students ("Juan", 1));
//			studentsList.add(new Students ("Juan Pedro", 4));
//			studentsList.add(new Students ("Chema", 3));
//			studentsList.add(new Students ("Leo", 5));
//			studentsList.add(new Students ("Dav", 6));
//			studentsList.add(new Students ("Nathaniel", 7));
//			studentsList.add(new Students ("Cast", 8));
//			
//			
//			for (Students student : studentsList) {
////				datOut.writeInt(student.getId());
////				datOut.writeChars(student.getName());
//				datOut.writeInt(student.getId());
//				datOut.writeUTF(student.getName());
//			}
//			
//			fileOut.close();
//			datOut.close();
			
			
			ArrayList <Students> studentsRead = new ArrayList<Students>();
			
			FileInputStream fileIn = new FileInputStream(file);
			DataInputStream datIn = new DataInputStream(fileIn);
			
			int id;
			String name;
			while(true) {
				id=datIn.readInt();
				name= datIn.readUTF();
				Students auxStuden=new Students(name,id);
				System.out.println(auxStuden.toString());				
			}
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(EOFException e) {
			System.out.println("end");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}// end public static void main(String[] args) 	
}//end public class MainApp

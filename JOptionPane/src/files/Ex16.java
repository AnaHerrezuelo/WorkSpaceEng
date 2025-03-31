package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		final String PATH="C:\\Files";
		File fichero;
//		FileWriter fileWri;
		FileReader fileRead;
		BufferedReader fichBuf;
//		BufferedWriter fichBuf;
		
		String readed;
		char c;
		
		try {
//			fichero=new File(PATH, "1.txt");
			fichero=new File(PATH, "quijote.txt");
			fileRead = new FileReader(fichero);
			fichBuf = new BufferedReader(fileRead);
			
			ArrayList <String>quijote = new ArrayList<String>();
			
			
			//it works
//			readed= fichBuf.readLine();
//			while(readed != null) {
//				System.out.println(readed);
//				readed = fichBuf.readLine();
//			}
			
			
			//it shows a null
//			do {
//				readed = fichBuf.readLine();
//				System.out.println(readed);
//			}while(readed!=null);
			
			
			//onlu shows the first line and whitout the first letter
//			c=(char)fichBuf.read();
//			readed = fichBuf.readLine();
//			System.out.println(readed);
			
			readed= fichBuf.readLine();
			while(readed != null) {
				quijote.add(readed);
				readed = fichBuf.readLine();
			}
			
//			printQuijote(quijote);
			
//			printLength(quijote);
			
			printLines(quijote);
			
			
			fichBuf.close();
			fileRead.close();
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("the file doesn't exist");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}// end public static void main(String[] args) 
	
	private static void printQuijote(ArrayList<String> quijote) {
		for (String readStr : quijote) {
			System.out.println(readStr);
		}
		
	}//end printQuijote
	
	private static void printLength(ArrayList<String> quijote) {
		for (String readStr : quijote) {
			System.out.println(readStr.length());
		}
		
	}//end printLength
	
	private static void printLines(ArrayList<String> quijote) {
		for (String readStr : quijote) {
			for (int i = 0; i < readStr.length(); i++) {
				if(readStr.charAt(i)== '.') {
					System.out.println();
				}
			}
		}
		
	}//end printLength
	
	
	
	
	
}//end public class Ex16

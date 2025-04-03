package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;




public class HangedMan {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		final String PATH="C:\\Files";
		FileReader fileRead;
		BufferedReader fichBuf;
		File file;
		String readed;
		
		HashSet words = new HashSet();
		
		
		file=new File(PATH, "words.txt");
		
		int c;
		
		
	try {
		fileRead = new FileReader(file);
		fichBuf = new BufferedReader(fileRead);
		
		
		//read the document
//		FileInputStream fichInStream = new FileInputStream(file);
//		do {
//			c=fichInStream.read();
//			System.out.print((char)c);
//		}while(c!=-1);
//		fichInStream.close();
		
		
		//insert the file in a hashset
		words.add(fichBuf.readLine());
		readed= fichBuf.readLine();
		while(readed != null) {
			words.add(readed);
			readed = fichBuf.readLine();
		}
		
		
//		System.out.println(words.size());
//		System.out.println(words.toString());
		
//		printWords(words);
		
		//it does not work
//		printRandomWords(words);
		
		
		fichBuf.close();
		fileRead.close();
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("the file doesn't exist");
	}catch(IOException e) {
		e.printStackTrace();
	}
	key.close();
	}// end public static void main(String[] args) 
	
	public static void printWords(HashSet words) {
		int cont=0;
		Iterator <String>iter = words.iterator();
		while(iter.hasNext()) {
			System.out.println(cont + "-"+ iter.next());
			cont++;
		}
	}//end printWords()
	
	
	//does not work
	public static String printRandomWords(HashSet <String>words) {
		String auxStr="";
		Iterator <String>iter = words.iterator();
		int rand= (int) (Math.random()*words.size()-1);
		int cont=0;
		
		while(iter.hasNext()) {
			auxStr=iter.next();
			if(cont==rand) {
				return auxStr;
			}
			cont++;
		}
		return auxStr;
	}//end printRandom()
	
	
	
	
}//end public class HangedMan

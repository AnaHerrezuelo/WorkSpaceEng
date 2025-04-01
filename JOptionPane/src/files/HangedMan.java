package files;

import java.io.BufferedReader;
import java.io.File;
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
	try {
		fileRead = new FileReader(file);
		fichBuf = new BufferedReader(fileRead);
		words.add(fichBuf.readLine());
		
		
		readed= fichBuf.readLine();
		while(readed != null) {
			words.add(readed);
			readed = fichBuf.readLine();
		}
//		System.out.println(words.size());
//		System.out.println(words.toString());
		
		printWords(words);
		
		
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
		int cont=-1;
		Iterator <String>iter = words.iterator();
		while(iter.hasNext()) {
			System.out.println(cont + "-"+ iter.next());
			cont++;
		}
	}//end printWords()
	
//	public static void printRandomWords(HashSet words) {
//		int cont=0;
//		int rand= (int) (Math.random()*words.size()-1);
//		Iterator <String>iter = words.iterator();
//		while(iter.hasNext()) {
//			auxStr=iter.next();
//			if(cont==rand)
//			cont++;
//		}
//	}//end printRandom()
	
}//end public class HangedMan

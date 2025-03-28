package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FiInputReader {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File fichero;
		
		int c;

		try {
			fichero=new File(PATH, "1.txt");
			FileInputStream fichInStream = new FileInputStream(fichero);
			do {
				c=fichInStream.read();
				System.out.print((char)c);
//				System.out.println(c);
			}while(c!=-1);
			fichInStream.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}// end public static void main(String[] args) 
}//end public class FiInputReader

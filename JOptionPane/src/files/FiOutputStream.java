package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FiOutputStream {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File fichero;
		FileOutputStream fileOutS;
		int c;

		try {
			fichero=new File(PATH, "1.txt");
			fileOutS= new FileOutputStream(fichero, true);
//			fileOutS= new FileOutputStream(fichero);
			
			fileOutS.write(65);
//			fileOutS.write(32);
			fileOutS.write(65);
			
			FileReader fReader = new FileReader(fichero);
			do {
				c=fReader.read();
				System.out.print((char)c);
			}while(c!=-1);
			
			
			 
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}// end public static void main(String[] args) 
}//end public class FiInputReader
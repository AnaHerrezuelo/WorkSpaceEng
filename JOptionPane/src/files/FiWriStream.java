package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FiWriStream {

	public static void main(String[] args) {
		final String PATH="C:\\Files";
		File fichero;
		FileWriter fileWri;
		int c;

		try {
			fichero=new File(PATH, "1.txt");
			fileWri= new FileWriter(fichero, true);
			if(fichero.exists()) {
				fileWri= new FileWriter(fichero, true);
			}else {
				fileWri= new FileWriter(fichero);
			}
			
			fileWri.write(65);
//			fileOutS.write(32);
			fileWri.write(65);
			
			//to read the file
//			FileReader fReader = new FileReader(fichero);
//			do {
//				c=fReader.read();
//				System.out.print((char)c);
//			}while(c!=-1);
			
			fileWri.close();
			 
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}// end public static void main(String[] args) 
}//end public class FiWriStream
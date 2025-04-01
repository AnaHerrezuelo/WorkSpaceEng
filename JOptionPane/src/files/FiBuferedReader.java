package files;
//teacher's exercisec (16)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FiBuferedReader {

	public static void main(String[] args) {
		final String PATH = "C:\\Users\\abraham.perbar\\Files";
		File fichero,fileCopy;
		FileReader fileRead;
		BufferedReader fichBuf;
		ArrayList<String> lista = new ArrayList<String>();

		FileWriter fileWrite;
		BufferedWriter fileBuffWriter;
		String readed;
		char c;
		try {
			fichero = new File(PATH, "quijote.txt");
			fileRead = new FileReader(fichero);
			fichBuf = new BufferedReader(fileRead);

			fileCopy = new File(PATH, "quijoCopy.txt");
			fileWrite= new FileWriter(fileCopy);
			fileBuffWriter = new BufferedWriter(fileWrite);
			
			lista=readFile(fichBuf);
			copingInLines(lista, fileBuffWriter);
		
	//Closing files to work with the copy file. 		
			fileBuffWriter.close();
			fichBuf.close();
			fileRead.close();
			
			fileRead = new FileReader(fileCopy);
			fichBuf = new BufferedReader(fileRead);		
			
			
			lista=readFile(fichBuf);
			
			reversePrintingCharbyChar(lista);
	//		printList(lista);
				
	//		printLines(lista);
			

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void reversePrintingCharbyChar(ArrayList<String> lista) {
		for (int i=lista.size()-1;i>=0;i--) {
			String auxStr=(lista.get(i));
			for (int j = auxStr.length()-1;j>=0; j--) {
				System.out.print(auxStr.charAt(j));
			}
			System.out.println();
			
		}
	}
	public static void copingInLines(ArrayList<String> lista, BufferedWriter fileBuffWriter) throws IOException {
		String aux;
		for (String line : lista) {
			aux=line.replace(".",".\n");
			aux=aux.replace(";",".\n");
			fileBuffWriter.write(aux);
		}
	}
	
	
	public static ArrayList<String> readFile(BufferedReader fichBuf) throws IOException {
		ArrayList<String> lista= new ArrayList<String>();
		String readed;
		readed = fichBuf.readLine();
		while (readed != null) {
			lista.add(readed);
			readed = fichBuf.readLine();
		}
		return lista;
		
//	do {
//		readed = fichBuf.readLine();
//		System.out.println(readed);
//	} while (readed != null);

	}
	public static void printLines(ArrayList<String> lista) {
		int cont=0;
		for (String readStr : lista) {
	//		readStr.replace(".",".\n");
			cont=0;
			for(int i=0;i<readStr.length();i++) {
				System.out.print(readStr.charAt(i));
				cont++;
			  if(readStr.charAt(i)== '.'||cont==50) {
			  	System.out.println();
			  	cont=0;
			  }
			}	
		}
	}

	public static void printList(ArrayList<String> lista) {
		for (String readStr : lista) {
			System.out.println(readStr);
		}
	}
	
	public static void printLength(ArrayList<String> lista) {
		for (String readStr : lista) {
			System.out.println(readStr.length());
		}
	}

	
}

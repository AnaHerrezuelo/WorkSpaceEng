package jdbc;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class FileWorking {
	
	public static boolean writeFile(File file, ArrayList <Client> clients) {
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);
			
			for (Client client2 : clients) {
				objectOutput.writeObject(client2);
			}
			
			return true;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public static ArrayList <Client> readFile(File file) {
		ArrayList <Client> clientArray = new ArrayList<Client>();
		boolean keep = true;
		Client auxCli;
		try {
			FileInputStream inputStream = new FileInputStream(file);
			ObjectInputStream objectInput = new ObjectInputStream(inputStream);
			
			while(keep) {	
				auxCli= (Client)objectInput.readObject();
				clientArray.add(auxCli);
//				System.out.println(auxCli);
			}
			
		} catch(EOFException e) {
			System.out.println("end of the file");
			keep=false;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch ( ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return clientArray;
	}
	
	public static void insertClients() {
		
	}
	
	public static void main(String[] args) {
	}// end public static void main(String[] args) 
}//end public class FileWorking

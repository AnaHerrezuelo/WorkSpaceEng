package jdbc;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainApp {
	static ArrayList <Client> clientAr = new ArrayList<Client>();
		
	final static String PATH="C:\\Files";
	static File file;
	
	public static void main(String[] args) {
		int id;
		String name, city;
		Client auxClient;
		
		try {
			file = new File (PATH, "Clients.txt");
			
			//getConexion()
			java.sql.Statement stmnt = getConexion();
			
			//read the clients from the DB and inserting it in the file
//			readingClientsFromDB(stmnt);
			
			//inserts the db to the file
//			FileWorking.writeFile(file, clientAr);
			
			
			//read the clients from the file
//			ArrayList <Client> auxClientAr = FileWorking.readFile(file);
//			for (Client client : auxClientAr) {
//				System.out.println(client);
//			}
			
			//inserts new Clients to the DB
//			InsertIntoDB(stmnt);
			
			//read the DB
			readDB(stmnt);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end public static void main(String[] args) 






	private static void readingClientsFromDB(java.sql.Statement stmnt) throws SQLException {
		int id;
		String name;
		String city;
		Client auxClient;
		String query = "SELECT * FROM `clientes`";
		ResultSet result = stmnt.executeQuery(query);
		
		while(result.next()) {
			id=result.getInt(1);
			name=result.getString(2);
			city=result.getString(3);
			
			auxClient = new Client(id, name, city);
			clientAr.add(auxClient);
		}
	}

	private static java.sql.Statement getConexion() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://10.195.136.95:3306/tienda", "root", "");
		java.sql.Statement stmnt = connection.createStatement();
		return stmnt;
	}
	
	private static void InsertIntoDB(java.sql.Statement stmnt) throws SQLException {
		for (int i = 50; i < 60; i++) {
			String sqladd = "INSERT INTO clientes (id, nombre, direccion) VALUES ("+ i +", 'Aaaa', 'Bbbb');";
			stmnt.execute(sqladd);
		}
//		String sqladd = "INSERT INTO clientes (id, nombre, direccion) VALUES (5, 'Aaaa', 'Bbbb');";
//		stmnt.execute(sqladd);
		
	}
	
	
	private static void readDB(java.sql.Statement stmnt) throws SQLException {
		String query = "SELECT * FROM `clientes`";
		ResultSet result = stmnt.executeQuery(query);
		while(result.next()) {
			System.out.print(result.getString(1) + " - ");
			System.out.print(result.getString(2) + " - ");
			System.out.println(result.getString(3));
		}
	}
}//end public class MainApp

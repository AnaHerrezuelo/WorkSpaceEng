package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainApp {
	public static void main(String[] args) {
		getConexion();
		
//		ArrayList <Cliente> Cliente = new ArrayList<Cliente>();
		

	}// end public static void main(String[] args) 
	
	public static void getConexion() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://10.195.136.95:3306/tienda", "root", "");
			java.sql.Statement stmnt = connection.createStatement();
			System.out.println("connect");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}//end public class MainApp

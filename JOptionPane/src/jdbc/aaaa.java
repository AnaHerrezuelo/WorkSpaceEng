package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class aaaa {
	public static void main(String[] args) {
		
		String connector = "com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql://10.195.136.234:3306/tienda";
		String url = "jdbc:mysql://10.195.136.234:3306/jardineria";
		String user = "root";
		String pass = "";
		
		try {
			Connection connection = DriverManager.getConnection(url, user, pass);
			java.sql.Statement stmnt = connection.createStatement();
//			System.out.println("connect");
			
			
//			String query = "SELECT * FROM `clientes`";
//			ResultSet result = stmnt.executeQuery(query);
//
//			while(result.next()) {
//				System.out.print(result.getString(1) + " - ");
//				System.out.print(result.getString(2) + " - ");
//				System.out.println(result.getString(3));
//			}
			
			
			
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}// end public static void main(String[] args) 
}//end public class aaaa

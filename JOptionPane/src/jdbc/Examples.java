package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Examples {
	public static void main(String[] args) {
		
		String connector = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://10.195.136.95:3306/tienda";
//		String url = "jdbc:mysql://10.195.136.95:3306/jardineria";
		String user = "root";
		String pass = "";
		
		try {
			Connection connection = DriverManager.getConnection(url, user, pass);
			java.sql.Statement stmnt = connection.createStatement();
//			System.out.println("connect");
			
			
//			String sqlUpdate = "UPDATE `clientes` SET direccion='Aaaaaaaaaa' WHERE id=5; ";
//			String sqladd = "INSERT INTO clientes (id, nombre, direccion) VALUES (5, 'Aaaa', 'Bbbb');";
//			String sqlDelete = "DELETE FROM `clientes` WHERE id=5;";
			String query = "SELECT * FROM `clientes`";
//			String query = "SELECT table_name FROM information_schema.tables WHERE table_schema = 'tienda';";
//			stmnt.executeUpdate(sqlUpdate);
//			stmnt.execute(sqladd);
//			stmnt.execute(sqlDelete);
			
			ResultSet result = stmnt.executeQuery(query);

//			while(result.next()) {
//				System.out.println(result.getString(1));
//			}
			
			//shows the information of the columns 1, 2 and 3
			while(result.next()) {
				System.out.print(result.getString(1) + " - ");
				System.out.print(result.getString(2) + " - ");
				System.out.println(result.getString(3));
			}
			
			ResultSetMetaData metaData = result.getMetaData();

			
			int columnCount = metaData.getColumnCount();			
			//shows the total columns of the table
//			System.out.println("totalcolumns: " + columnCount);
			
			System.out.println(" - - - - - ");
			//shows the name of the columns
			System.out.println("Column Names:");
			for (int i = 1; i <= columnCount; i++) {
				String columnName = metaData.getColumnName(i);
				System.out.println("column" + i + " :"+ columnName);
			}
			
			
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}// end public static void main(String[] args) 
}//end public class Examples

package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		File fichero;
//		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		Scanner teclado = new Scanner(new InputStreamReader(System.in));
		final String PATH="C:\\Files";
		String nombre;
		System.out.print("Indica el nombre de un fichero: ");
		nombre = teclado.next();
		fichero = new File(nombre);
		
		 
		if (fichero.exists()) {
		    System.out.println("El fichero o directorio existe.");
		    if (fichero.isFile()) { // getName() muestra el nombre del fichero o directorio buscado
		        System.out.println(fichero.getName() + " es un fichero.");
		    } else {
		        System.out.println(fichero.getName() + " es un directorio.");
//		        System.out.println(fichero.list());
		        
		        
		    }
		} else { // getPath() muestra el camino completo
		    System.out.println(fichero.getPath() + " no existe");
		}

	}// end public static void main(String[] args) 
}//end public class Example1

package zoo;

import java.util.HashMap;

public class TranslationDic {
	static HashMap <String, String> words  = new HashMap ();
	 
	public static void main(String[] args) {
		words.put("Hello", "Hola");
		words.put("Bye", "Adios");
		
		System.out.println(words.toString());
		
		System.out.println(words.get("Hello"));
		
		words.put("Hello", "hi");
		
		System.out.println(words.get("Hello"));
		
		
		System.out.println(words.get("Hell"));
		
		

	}// end public static void main(String[] args) 
}//end public class TranslationDic

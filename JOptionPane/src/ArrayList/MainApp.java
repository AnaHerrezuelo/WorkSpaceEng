package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class MainApp {
	public static void main(String[] args) {
		
		ArrayList <String>list = new ArrayList<String>();
		int auxArray;
		
		list.add("String");
		list.add("Holaa");
		list.add("Bye");
		list.add("aaa");
		list.add("Bbbb");
		
//		System.out.println(list.toString());
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		
		
//		list.set(2, "ccc");
		
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		
		
//		if(list.contains("Holaa")) {
//			System.out.println("spanish");
//		}
		
		
		//order the array, but cannot order the numbers
//		list.sort(null); 
		
		
		
		//Iterator
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			String auxStr=iter.next();
//			System.out.println(iter.next());
			if(auxStr.equalsIgnoreCase("Bye")) {
				iter.remove();
			}
		}
		

		
		String total;
		total="";
		for (Object object : list) {
			total= total+" - "+object;
		}
		System.out.println(total);
		
		
//		System.out.println(list.toString());		
		
	}// end public static void main(String[] args) 
}//end public class MainApp

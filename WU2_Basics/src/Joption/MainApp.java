package Joption;

public class MainApp {

	public static void main(String[] args) {
//		try {
//			int age = Dialoge.dialogeInt("eee");
//			if(age<18) {
//				System.err.println("not allow");
//			}
//		}catch(NumberFormatException e) {
//			 System.err.println("bad");
//			 System.err.println(e.getMessage());
//		}
		
//		String [] array = {"Pizza", "Hamburger", "fish"};
//		Dialoge.dialogOptions("a", array);
		
//		Dialoge.dialogWarning("messageeeee");
		
		
		
		try {
			float num=Dialoge2.dialogFloat();
			System.out.println(num);
		}catch(NumberFormatException e) {
			System.err.println("bad");
			System.err.println(e.getMessage());
		}
		
		
	}//end  public static void main(String[] args
}//end public class MainApp

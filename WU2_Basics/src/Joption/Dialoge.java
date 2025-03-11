package Joption;

import javax.swing.Icon;
import javax.swing.JOptionPane;

//class CancelButtonException extends RuntimeException{
//	public CancelButtonException(String string) {
//		
//	}//end public CancelButtonException(String string)
//}// private class CancelButtonException extends RuntimeException

public class Dialoge extends JOptionPane {
	public static void main(String[] args) {
//			 dialogeInt();
//		 Object [] array = {"Pizza", "Hamburger", "fish"};
//		 dialogOptions(null, args);
	} //end  public static void main(String[] args
	
	
	
//	public static int dialogeInt() {
//		 String answer;
//		 answer=JOptionPane.showInputDialog("Give me a number");
//		 try {
//			 int num=Integer.parseInt(answer);
//			 return num;
//		 }catch(NumberFormatException e){
//			 System.err.println("bad");
//			 System.err.println(e.getMessage());
////			 e.printStackTrace();
//		 }
//		 return 0;
//	}

	
	public static int dialogeInt(String message) throws NumberFormatException, CancelButtonException {
		String answer;
//		answer=JOptionPane.showInputDialog(null, message, "interger in", JOptionPane.QUESTION_MESSAGE);
		answer=(String) JOptionPane.showInputDialog(null, message, "interger in", JOptionPane.QUESTION_MESSAGE );

		if(answer==null) {
//			throw new NullPointerException("press cancel");
			throw new CancelButtonException("press cancel");
		}
		
		int num=Integer.parseInt(answer);
		return num;
	}
	
	public static int dialogOptions(String message, String [] array) {
		return JOptionPane.showOptionDialog(null, 
					 message, 
					 "spaisekerte!!!", 
					 JOptionPane.YES_NO_OPTION, 
					 JOptionPane.WARNING_MESSAGE, 
					 null, 
					 array, 
					 array[0]
				 );
	}
	
	public static void dialogWarning(String message) {
		JOptionPane.showMessageDialog(null, message, "warning", JOptionPane.WARNING_MESSAGE, null);
	}
	
	
	
//	public static int dialogeInt() throws NumberFormatException {
//		String answer;
//		answer=JOptionPane.showInputDialog("Give me the number");
//		int num=Integer.parseInt(answer);
//		return num;
//	}

	
	
	
}// end public class Dialoge

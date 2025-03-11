package Joption;

import javax.swing.JOptionPane;

class CancelButtonException extends RuntimeException{
	public CancelButtonException(String string) {
		
	}//end public CancelButtonException(String string)
}// private class CancelButtonException extends RuntimeException

public class Dialoge2 extends JOptionPane{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static float dialogFloat() throws  CancelButtonException{
		String numStr;
		numStr = showInputDialog("give me a num");
		
		if(numStr==null) {
			throw new CancelButtonException("press cancel");
		}
		float num=Float.parseFloat(numStr);
		return num;
	}
	
	
	public static void dialogString() {
		String Str = (String) showInputDialog(null, "a", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void dialogWarning(String message) {
		JOptionPane.showMessageDialog(null, message, "warning", JOptionPane.WARNING_MESSAGE, null);
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

}// end public class Dialoge2

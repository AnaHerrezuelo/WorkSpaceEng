package dialog;

import javax.swing.JOptionPane;


public class dialogTypes extends JOptionPane {

	public static void main(String[] args) {
		dialogFloat();
		dialogString();
		dialogOptions();

	}
	
	//asks for a float	
	public static float dialogFloat(){
		String numStr;
		numStr = showInputDialog("give me a num");
//		if(numStr==null) {
//			throw new CancelButtonException("press cancel");
//		}
		
		numStr= numStr.replace(',', '.');
		float num=Float.parseFloat(numStr);
		return num;
	}
	
	
	public static void dialogString() {
		String Str = (String) showInputDialog(null, "give me a letter","Strings",  JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void dialogWarning(String message) {
		JOptionPane.showMessageDialog(null, message, "warning", JOptionPane.WARNING_MESSAGE, null);
	}
	
	
	public static int dialogOptions() {
		String [] array = {"Pizza", "Hamburger", "fish"};
		return JOptionPane.showOptionDialog(null, 
					 "OPTIONS", 
					 "spaisekerte!!!", 
					 JOptionPane.YES_NO_OPTION, 
					 JOptionPane.WARNING_MESSAGE, 
					 null, 
					 array, 
					 array[0]
				 );
	}

}

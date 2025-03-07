package Joption;

import java.awt.Component;

import javax.swing.JOptionPane;

public class exercises {

	public static void main(String[] args) {
		 Component parentComponent=null;
		 Object message="what do u want to say?";
		 String title="title";
		 int message_type=JOptionPane.INFORMATION_MESSAGE;
		 String answer;
		 int opt=0;
		 
		//YES OR NOT  
//		 do {
//			 answer=JOptionPane.showInputDialog(parentComponent, "give me the name", "aaaaa");
//			 JOptionPane.showMessageDialog(parentComponent, answer, "Answer", message_type);
//			 opt=JOptionPane.showConfirmDialog(parentComponent, "repeat? ", "repeat??", JOptionPane.YES_NO_OPTION);
//
//			 if(opt==1) {
//				 JOptionPane.showMessageDialog(parentComponent, "bye");
//			 }else {
//				 JOptionPane.showMessageDialog(parentComponent, "Process canceled");
//			 }
//		 }while(opt== JOptionPane.YES_OPTION);
		 
		 
		 //Variety of options
		 Object [] array = {"Pizza", "Hamburger", "fish"};
		 JOptionPane.showOptionDialog(parentComponent, 
					 "What do u want to eat? ", 
					 "eatt??", 
					 JOptionPane.YES_NO_OPTION, 
					 JOptionPane.WARNING_MESSAGE, null, array, 
					 array[2]
				 );
		 
		 
		 
		 
	} //end  public static void main(String[] args
}// end public class Dialoge


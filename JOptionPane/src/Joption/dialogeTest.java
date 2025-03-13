package Joption;

import java.awt.Component;

import javax.swing.JOptionPane;

public class dialogeTest {

	public static void main(String[] args) {
		 
		//convert the answer into a integer
		 String answer;
		 answer=JOptionPane.showInputDialog("Give me a number");
		 int num=Integer.parseInt(answer);
		 System.out.println(num+2);
		 
		 
	} //end  public static void main(String[] args
	
	public static void askingNames() {
//		 JOptionPane.showMessageDialog(null, "this is a first lot");
		 
		 Component parentComponent=null;
		 Object message="what do u want to say?";
		 String title="title";
//		 int message_type=2;
		 int message_type=JOptionPane.INFORMATION_MESSAGE;
//		 JOptionPane.showMessageDialog(parentComponent, message, title, message_type);
		 
		 
		 //print what you ask for
		 String answer;
		 answer=JOptionPane.showInputDialog(parentComponent, "give me the name", "a");
//		 System.out.println(answer);
		 JOptionPane.showMessageDialog(parentComponent, answer, "Answer", message_type);
		 
		 
		 int opt=JOptionPane.showConfirmDialog(parentComponent, "this is your name?: " + answer);
		 System.out.println(opt);
	}
}// end public class Dialoge


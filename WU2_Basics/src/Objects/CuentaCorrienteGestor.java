package Objects;

import java.util.Scanner;

public class CuentaCorrienteGestor {
	String nameG;
	int mvl;
	boolean mvlDone=false;
	int impMax;
	boolean correct;
	
	public CuentaCorrienteGestor () {
		
	}
	
	public CuentaCorrienteGestor (	String nameG, int mvl, int impMax) {
		this.nameG=nameG;
		this.mvl=mvl;
		this.impMax=10000;
	}
	
    public boolean insertInfo(Scanner keyboard) {
		System.out.print("gave me the name of the gestor:");
		this.nameG = keyboard.next();
		
		if(this.mvlDone==true) {
			System.out.println("You already has introduce the mvl");
		}else {
			System.out.print("gave me the mvl of the gestor:");
			this.mvl = keyboard.nextInt();	
			this.mvlDone=true;
		}
		
		
		System.out.print("gave me the maximun import:");
		this.impMax = keyboard.nextInt();	
		if(this.impMax==0) {
			this.impMax = 10000;
		}
		
    	return correct;
    }
    
    public void printToString() {
    	System.out.println(toString());
    }

	@Override
	public String toString() {
		return "CuentaCorrienteGestor [name=" + nameG + ", mvl=" + mvl + ", impMax=" + impMax 
				+ "]";
	}
    

}

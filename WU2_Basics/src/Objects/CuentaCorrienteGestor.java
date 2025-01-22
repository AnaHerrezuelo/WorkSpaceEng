package Objects;

import java.util.Scanner;

public class CuentaCorrienteGestor {
	String name;
	int mvl;
	boolean mvlDone=false;
	int impMax;
	boolean correct;
	
	public CuentaCorrienteGestor () {
		
	}
	
	public CuentaCorrienteGestor (	String name, int mvl, int impMax) {
		this.name=name;
		this.mvl=mvl;
		this.impMax=10000;
	}
	
    public boolean insertInfo(Scanner keyboard) {
		System.out.print("gave me the name of the gestor:");
		this.name = keyboard.next();
		
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
		return "CuentaCorrienteGestor [name=" + name + ", mvl=" + mvl + ", impMax=" + impMax 
				+ "]";
	}
    

}

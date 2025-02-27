package Warehouse_Ana_Exceptions;


//import java.util.Scanner;

public class appliances_App {

	public static void main(String[] args) throws NumberFormatexception {
//		Scanner keyboard = new Scanner(System.in);
		
		final int MAX=2;
		
		Machines machine []= new Machines [MAX];
		try {
		machine[0]=new Machines('a', "r");
		machine[1]=new Machines('a', "5");
//		machine[2]=new Dishwashers('a',3, 3, 45);
//		machine[3]=new Dishwashers('a',3, 3, 45);
//		machine[4]=new WashingMachines('a',3, 3, 45);
//		machine[5]=new WashingMachines('a',3, 3, 45);
//		machine[6]=new Refrigerator('a',3, true);
//		machine[7]=new Refrigerator('a',3, true);
		}catch(NumberFormatException e){
			System.err.println("no letters");
		}
		
		
		
//		for(int i=0;i<machine.length;i++) {
//			System.out.println("Machine " + (i+1));
//			machine[i]= new Machines();
//			machine[i].askData();	
//			machine[i].id=i;
//		}	
		
		
		
		for(int i=0;i<machine.length;i++) {
			machine[i].printToString();
			machine[i].toString();
		}
		
		
		
		
		
//		WaterWasters machine2 []= new WaterWasters [MAX];
//		machine2[0]=new WaterWasters(1,3, 3);
//		machine2[1]=new WaterWasters(1,3, 4);
//		
//		for(int i=0;i<machine2.length;i++) {
//			machine2[i].printToString();
//		}
		
		
		
//		WashingMachines machine3 []= new WashingMachines [MAX];
//		machine3[0]=new WashingMachines('a',3, 3, 45);
//		machine3[1]=new WashingMachines('a',3, 4, 34);
		
//		for(int i=0;i<machine3.length;i++) {
//			machine3[i].printToString();
//			machine3[i].id=i;
//		}
		
		
		
		
		
//		Dishwashers Diswasher []= new Dishwashers [MAX];
//		Diswasher[0]=new Dishwashers('a',3, 3, 2);
//		Diswasher[1]=new Dishwashers('a',3, 4, 12);
		
//		for(int i=0;i<Diswasher.length;i++) {
//			Diswasher[i].id=i;
//		}
		
//		for(int i=0;i<Diswasher.length;i++) {
//			Diswasher[i].printToString();
//		}
		
		
		
		
		
	}//	end public static void main(String[] args)
}// end public class appliances_App

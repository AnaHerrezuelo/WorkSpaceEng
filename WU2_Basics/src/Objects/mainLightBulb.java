package Objects;


public class mainLightBulb {
	
//	public static void main(String[] args) {

		int NUM=5;
		lightBulb [] flat= new lightBulb[NUM];
		
		public void inici () {
			flat[0]= new lightBulb(100);
			flat[1]= new lightBulb(100);
			flat[2]= new lightBulb(100);
			flat[3]= new lightBulb(100);
			flat[4]= new lightBulb(100);			
		}// end inici
		
		
		
	public void inici (lightBulb [] flat) {
		flat[0]= new lightBulb(100);
		flat[1]= new lightBulb(100);
		flat[2]= new lightBulb(100);
		flat[3]= new lightBulb(100);
		flat[4]= new lightBulb(100);
	}// end inici	
	
//	}	public static void main(String[] args)
	
	
	
	public static void printFlat (lightBulb [] flat){
		for(int i=0; i < flat.length; i++) {
			flat[i].printToString();
		}
	}	
	
	public static void turnAllOff (lightBulb [] flat) {
		for(int i=0; i < flat.length; i++) {
			flat[i].setState(lightBulb.OFF);
		}
	}
	public static void turnAllOn (lightBulb [] flat) {
		for(int i=0; i < flat.length; i++) {
			flat[i].setState(lightBulb.ON);
		}
	}
	
	public static void totalConsumption (lightBulb [] flat) {
		long a=0;
		for(int i=0; i < flat.length; i++) {
			
		}
	}
	
	
	
	
	//FLOOR
	public static void printFlat (){
		for(int i=0; i < flat.length; i++) {
			flat[i].printToString();
		}
	}	
//	
//	public static void turnAllOff () {
//		for(int i=0; i < flat.length; i++) {
//			flat[i].setState(lightBulb.OFF);
//		}
//	}
//	public static void turnAllOn () {
//		for(int i=0; i < flat.length; i++) {
//			flat[i].setState(lightBulb.ON);
//		}
//	}
//	
//	public static void totalConsumption () {
//		long a=0;
//		for(int i=0; i < flat.length; i++) {
//			
//		}
//	}
	
	
	
	
	
}//end public class mainRadio

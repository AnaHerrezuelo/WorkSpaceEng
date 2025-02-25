package TryCatch;

public class Clock {

	public static void main(String[] args) {
		try {
			clock();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		

	}//end public static void main(String[] args) 
	public static void clock() throws InterruptedException {
		int sec=0,min=0,h=0;
		
		for(h=0; h<24;h++) {
			for(min=0; min<60;min++) {
				for(sec=0; sec<60;sec++) {
					System.out.println(h + " : " + min + " : " + sec);
					Thread.sleep(1000); 
				}
			}
		}
//		sec=0;
//		min++;
//		h++;
		//System.out.println(min);
	}
}//end class Clock

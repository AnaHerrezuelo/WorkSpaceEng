package TryCatch;


public class Ex08 {
	public static void main(String[] args) throws InterruptedException {
		int numbers [] = new int [5];

		try{
			for(int i=0; i<=numbers.length; i++) {
				System.out.println(i);
				numbers[i]=(10+1);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			Thread.sleep(10000); 
			System.err.println("error index out");
		}
		
		
	}//end public static void main(String[] args) 

}//end class Ex08

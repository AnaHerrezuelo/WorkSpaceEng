package jar_files;
//java -jar eje.jar 

public class eje {

	
	public void add (int num1, int num2) {
		int res=num1+num2;
		System.out.println("Result is " + res);
	}
	
	public static void main(String[] args) {
		eje obj = new eje();
//		obj.add(4, 6);
		obj.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]) );
	}
}

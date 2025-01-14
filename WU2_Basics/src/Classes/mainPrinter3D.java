package Classes;

public class mainPrinter3D {
	public static void main(String[] args) {
		printer3D ender = new printer3D(-85,43,"ender","v3");
		printer3D leon = new printer3D(56,43,"leon","cube");
		
//		ender.setHeight(-3246);
//		ender.lenght=0;		
//		ender.brand="aaa";
//		ender.model="bbb";


		//System.out.println(ender.toString());
		ender.printPrinter();
		leon.printPrinter();
		System.out.println("ender height: " + ender.getHeight());
	}//end main
}

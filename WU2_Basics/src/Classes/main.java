package Classes;

public class main {
	public static void main(String[] args) {
		Mouse lenovo=new Mouse(4, "gold", 45.7f);
		Mouse hp=new Mouse(6, "pink", 34.35f);
		

		System.out.println(lenovo.getNumBot());
		lenovo.setNumBot(-87);
		lenovo.printMouse();
		//hp.printMouse();
		
		float peso=-45f;
		lenovo.weight=peso;
		System.out.println(lenovo.weight);
		
		
	}//end main
}//end class

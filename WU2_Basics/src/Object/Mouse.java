package Object;

public class Mouse {
	private int numBot;
	String color;
	float weight;
	
	public  Mouse(int num, String col, float wei) {
		numBot=num; //setNumBot(num);
		color=col;
		weight=wei;
	}

	@Override
	public String toString() {
		return "Mouse [numBot=" + numBot + ", color=" + color + ", weight=" + weight + "]";
	}
	
	public void printMouse () {
		System.out.println(toString());
	}
	
	
	public int getNumBot() {
		return numBot;
	}
	
	public void setNumBot (int num) {
		if(num>0) {
			numBot=num;
		}else {
			numBot=num*-1;
		}
		
	}
	
}//end class Mouse

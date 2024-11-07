
public class Act11 {
	public static void main (String[] args) {
		//int i = -3;
		float a=5, b=10,c=20;
		boolean res1,res2;
		res1=(a<b)||(b<c);
		res2=(a==b)&&(b>c);
		System.out.println("The result of the OR operator is: " + res1);
		System.out.println("The result of the AND operator: " + res2);	
	};
};


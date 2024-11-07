import java.util.Scanner;

public class Act22 {
	public static void main(String[] args) {
		
		int num1, num2;
		char oper;
		String operator;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		num1=keyboard.nextInt();
		num2=keyboard.nextInt();
		//System.out.println(num1+ " " + num2);
		
		System.out.print("Operator: ");
		operator=keyboard.next(); //recoge el valor operator en String
		oper=operator.charAt(0); //recoge el primer valor q está escrito en operator  se convierte en char para poder transformarlo luego en int
		//System.out.println(operator);
		//System.out.println(oper);
		
		int operValue = oper;
		
		switch(operValue) {
			case'*':
				System.out.println(num1 + "*" + num2 + "=" + (num1*num2)); break;
			case'+':
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2)); break;
			case'-':
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2)); break;
			case'/':
				System.out.println(num1 + "/" + num2 + "=" + (num1/num2)); break;
			case'%':
				System.out.println(num1 + "%" + num2 + "=" + (num1%num2)); break;
			default:
				System.out.println("Ha habido algún error" ); break;
		};
		

		
		
	};
}

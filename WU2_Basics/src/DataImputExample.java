import java.util.Scanner;

public class DataImputExample {
	public static void main(String[] args) {
        String name;
        int num;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a name: ");
        
        name=keyboard.nextLine( ); //esto hace que te escriba toda la línea que has escrito
        System.out.println("The inserted name is: " + name);
        

        //name=keyboard.next( ); Esto hace que te escriba solo la primera palabra de la línea que has escrito
        //System.out.println("The inserted name is: " + name);
        
        System.out.print("Enter a number: ");
        num=keyboard.nextInt();
        System.out.println("The inserted number is: " + num);
        System.out.println(name + " has " + num + " years old");
        
    }
}

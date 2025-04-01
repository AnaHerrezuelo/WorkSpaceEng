//EXERCISES 1,2, 3 AND 4.
package TryCatch;

import java.util.Scanner;
import java.util.InputMismatchException;

public class div {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int div, divisor;
		
//		while(true) {
//			try {
//				System.out.println("Me dê o número 1: ");
//				div=keyboard.nextInt();
//				System.out.println("Me dê o número 2: ");
//				divisor=keyboard.nextInt();
//			
////			int result=div/divisor;
////			System.out.println("result: " + result);
//				
//				int result=div/divisor;
//				System.out.println("resultado: " + result);
//			}catch(ArithmeticException e) {
//				System.out.println("Você não pode dividir por 0");
//			}catch(InputMismatchException obj) {
//				System.out.println("Você não pode digitar letras");
//				System.out.println(obj.toString());
//				break;
//			}catch(Exception e) {
//				System.out.println("erro inesperado");
//			}finally {
//				System.out.println("bloco finally");
//			}			
//		}
		
		while(true) {
		    try {
		        System.out.println("请给我数字 1: ");
		        div = keyboard.nextInt();
		        System.out.println("请给我数字 2: ");
		        divisor = keyboard.nextInt();

		        // int result = div / divisor;
		        // System.out.println("result: " + result);

		        int result = div / divisor;
		        System.out.println("结果: " + result);
		    } catch (ArithmeticException e) {
		        System.out.println("不能除以 0");
		    } catch (InputMismatchException obj) {
		        System.out.println("不能输入字母");
		        System.out.println(obj.toString());
		        break;
		    } catch (Exception e) {
		        System.out.println("意外错误");
		    } finally {
		        System.out.println("这是最终语句");
		    }            
		}
		keyboard.close();
	}
}

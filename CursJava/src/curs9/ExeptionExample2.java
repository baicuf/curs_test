package curs9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionExample2 {

	public static void main(String[] args) {
		
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Introdu num1: ");
				int num1 = scan.nextInt();
				System.out.println("Introdu num2: ");
				int num2 = scan.nextInt();
				int division = num1/num2;
				num2 = (Integer) null;
				System.out.println("Division : " + division);
		}catch(ArithmeticException e){
			System.out.println("Nu impati la 0!");
		}catch(InputMismatchException e) {
			System.out.println("Introdu doar numere!");
		}catch(NullPointerException e) {
			System.out.println("A iesit cu Null Pointer");
		}catch(Exception e) {
			System.out.println("Something wrong happened!");
		}

	}
}

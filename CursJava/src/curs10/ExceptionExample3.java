package curs10;

import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		ExceptionExample3 obj = new ExceptionExample3();
		obj.division();

	}
	
	public void division() {
		Scanner scan = new Scanner(System.in);
		double num1, num2, result;
		
		do {
			try {
				System.out.println("Introdu numarul 1: ");
				try {
					num1 = Double.parseDouble(scan.next());
				}catch(NumberFormatException e) {
					System.out.println("Te rog sa introduci doar numere!");
					continue;
				}
				
				System.out.println("Introdu numarul 2: ");
				try {
					num2 = Double.parseDouble(scan.next());
				}catch(NumberFormatException e) {
					System.out.println("Te rog sa introduci doar numere!");
					continue;
				} 
				if(num1 == 0 || num2 == 0) {
					throw new ArithmeticException("One of the numbers is 0. Try again!");
				}
				
				result = num1/num2;
				System.out.println("Rezultatul impartirii este: " + result);
				
				break;
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		
		}while(true);
	}

}

package curs4;

import java.util.Scanner;

//Program care citeste doua numere si verifica:
//	- verifica fiecare numar daca este pozitiv si printeaza
//	- verifica ambele numere daca sunt pozitive
//	- verifica care numar este mai mic sau mai mare sau daca sunt egale

public class ConditionalOperator {

	public static void main(String[] args) {
		
		int nr1, nr2;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		nr1 = scan.nextInt();

		System.out.println("Please enter second number: ");
		nr2 = scan.nextInt();

//		verificam daca nr1 este pozitiv
		if(nr1 > 0) {
			System.out.println("Nr1 este pozitiv");
		}else {
			System.out.println("Nr1 este negativ");
		}
		
//		variabila = conditie ? expresie true : expresie false;
		String result = nr1 > 0 ? "Nr1 este pozitiv!" : "Nr1 este negativ!";
		System.out.println(result);
			
		result = nr2 > 0 ? "Nr2 este pozitiv!" : "Nr2 este negativ!";
		System.out.println(result);
		
//		- verifica ambele numere daca sunt pozitive
		result = (nr1 > 0) && (nr2 > 0) ? "Ambele numere sunt pozitive!" : "Cel putin un numar este negativ!";
		System.out.println(result);
		
//		- verifica care numar este mai mic sau mai mare sau daca sunt egale
		if(nr1==nr2) {
			System.out.println("Sunt egale!");
		}else if(nr1>nr2){
			System.out.println("Nr1 mai mare ca Nr2 !");	
		} else {
			System.out.println("Nr2 mai mare ca Nr1 !");
		}
		
		result = nr1 == nr2 ? "Sunt egale!" : (nr1>nr2) ? "Nr1 este mai mare ca Nr2!" : "Nr2 mai mare ca Nr1!";

	}

}

package curs3;

import java.util.Scanner;

//Program care citeste 3 numere de la tastatura si verifica care este cel mai mare
//printeaza sub forma "Second number is the greatest"
//daca avem doua numere egale si sunt cele mai mari printam Equal numbers!

public class GreatestOfThreeNumbers {
	
	//int nr1, nr2, nr3
	
	int nr1;
	int nr2;
	int nr3;
	
	public void askTheUserForANumber() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number:" );
		nr1 = scan.nextInt();
		
		System.out.println("Please enter the second number:" );
		nr2 = scan.nextInt();
		
		System.out.println("Please enter the third number:" );
		nr3 = scan.nextInt();
	}
	
	public void checkGratestNumber() {
		
		askTheUserForANumber();
		
		if(nr1>nr2 && nr1>nr3) {
			System.out.println("First number is the greatest!");
			
		} else if(nr2>nr1 && nr2>nr3){
			System.out.println("Second number is the greatest!");
			
		} else if(nr3>nr1 && nr3>nr2) {
			System.out.println("Third number is the greatest!");
			
		} else {
			System.out.println("Equal numbers!");
		}
		
	}

}

package curs3;

import java.util.Scanner;

//Program care citeste un numar de la tastatura si verifica daca este o zi lucratoare sau este weekend
//EX: Citeste 1 --> It's a working day!
//	Citeste 7 --> It's weekend!!!
//	Citeste 9 --> Invalid day!
 
public class CheckWorkingDay {
	
	int zi;
	
	public void askTheUserForANumber() {
		System.out.println("Please enter a day:" );
		Scanner scan = new Scanner(System.in);
		zi = scan.nextInt();
	}
	
	public void checkDay() {
		askTheUserForANumber();
		if(zi <=1 && zi <= 5) {
			System.out.println(" It's a working day! :( ");
		} else if (zi == 6 || zi ==7 ) {
			System.out.println("It's weekend!!!");
		} else {
			System.out.println("Invalid day!");
		}
		
	}

}

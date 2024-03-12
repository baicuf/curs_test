package Tema2;

// Scriem un program care intreaba utilizatorul ce varsta are.
// Daca utilizatorul introduce o valoare sub 18 , printeaza ”Esti minor”
// Daca utilizatorul introduce o valoare intre 18 si 65, printeaza ”Esti adult” (conditii multiple deci folosim if ((conditie 1)&&(conditie 2)))
// Daca utilizatorul introduce o valoare peste 65 , printeaza ”Esti batran”

import java.util.Scanner;

public class VarstaUtilizator {
	
	int age;
	
	public void askTheUserForAge() {
		System.out.println("Please enter your age:" );
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
	}
	
	public void checkAge() {
		
		askTheUserForAge();
		
		if(age < 18) {
			System.out.println("You are a minor!");
			
		} else if (age >= 18 && age <= 65 ) {
			System.out.println("You are an adult!");
			
		} else if (age < 0 || age > 120 ) {
			System.out.println("Age is incorrect!");
			
		} else {
			System.out.println("You are old!");
		}
		
	}

}

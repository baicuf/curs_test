package Tema6;

import java.util.Scanner;

//Scriem un program care simuleaza validarea unui cod PIN.
//Programul primeste input de la utilizator un PIN si il compara cu un PIN default care are valoarea 2244.
//Are trei incercari de acces
//Atata timp cat incearca de trei ori si PIN este gresit programul va printa : “Maximum attempts reached. Card blocked”
//Pentru fiecare incercare gresita programul printeaza : “Wrong PIN”
//Daca PIN este valid programmul printeaza : “Acces granted”

public class VerificarePin {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int pin = 2244;
		int userPin;
		int i =0;
		
		do {
			System.out.println("Introdu pinul:");
			userPin = scan.nextInt();
			
			if (userPin == pin) {
				System.out.println("Access granted!");
			} else {
				System.out.println("Wrong PIN!");
				i++;
			}
		}while(i<3 && userPin != pin);
		
		if (i == 3) {
			System.out.println("Maximum attempts reached. Card blocked!");
		}
	}

}

package curs3;

import java.util.Scanner;

/*
 * Program care verifica daca un caracter introdus este litera sau nu
 * Daca este litera, printam : Character is a letter
 * Daca nu este litera printam : Character is not a letter
*/ 

public class CheckLetter {
	
	// masina --> String --> lista de caractere
	// 012345 --> masina.CharAt(3) == i
	// String litera = "a";
	//char literaA = 'a';
	
	char caracter;
	
	public void askTheUserForAChar() {
		System.out.println("Please enter a character:" );
		Scanner scan = new Scanner(System.in);
		caracter = scan.next().charAt(0);
	}
	
	public void checkIfCharacterIsLetter() {
		askTheUserForAChar();
		
		if(Character.isLetter(caracter)) {
			System.out.println("Character is letter!");			
		}else {
			System.out.println("Character is not a letter!");
		}
	}

}

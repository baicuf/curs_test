package Tema2;

import java.util.Scanner;

//Scriem un program care intreaba utilizatorul punctajul unui test.
//Daca utilizatorul introduce o valoare intre 0 si 65 atunci printeaza ”Ai picat. Mai incearca”
//Daca utilizatorul introduce o valoare mai mare sau egala cu 66 atunci printeaza ”Felicitari, Ai trecut”

public class PunctajTest {
	
	int score;
	
	public void askTheUserForAScore() {
		System.out.println("Please enter the score number:" );
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
	}
	
	public void checkPassOrFail() {
		
		askTheUserForAScore();
		
		if( score >=0 && score <= 65) {
			System.out.println("Ai picat :(  Mai incearca!");
			
		}else if(score < 0 || score > 100){
			System.out.println("Scorul este incorect");
			
		} else {
			System.out.println("Felicitari! Ai trecut!");
		}
	}
	
}


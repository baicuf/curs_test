package curs5;

import java.util.Scanner;

//Facem un program care citeste un text de la tastatura si
//cauta in textul respectiv litera "a"
//daca o gasim printam "Litera A exista in text"
//daca nu o gasim printa "Litera A nu extista in text"


public class LetterSearch {

	public static void main(String[] args) {
		
//		boolean existaA = false;
		int counter = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String text = scan.next();
		
		
		// radar
		// 01234
		// daca caracter de pe pozitia 0 = 'A' daca nu, trec la urmatorul caracter si verific daca este egal cu 'A'
		// text = radar radar.length
		
		for (int i=0;i < text.length();i++) {
			
			if (text.charAt(i)=='a') {
//				System.out.println("Textul contine litera 'A'!");
//				existaA=true;
				counter++;
//				break;
		} 
			
//			System.out.println(text.charAt(i));
			
		}
		
		if (counter > 0) {
			System.out.println("Textul contine litera 'A'de " + counter + "ori");
		} else {
			System.out.println("Textul nu contine litera 'A'!");
		}
		

	}

}

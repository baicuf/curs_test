package Tema5;

//Scriem un program care calculeaza suma cifrelor unui numar.
//Numarul in primim de la tastatura.
//
//Ex; Daca user-ul introduce numarul : 334
//Suma numerelor este 10

import java.util.Scanner;

public class SumaCifreNumar {

	public static void main(String[] args) {


		// Dupa cum ne-ai spus la inceput, String reprezinta un array format din caracterele introduse. Int este vazut ca un numar
		// Ar trebui sa privim numarul ca string, apoi putem sa luam fiecare cifra vazuta ca un caracter nenumeric si sa il transformam din nou in caracter numeric
		
		// Intrebam userul sa introduca un numar, pe care il vom considera String
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numarul :" );
		String numar = scan.nextLine();
		
		
		// Folosind While
		
		System.out.println("\nFolosind metoda 'While' ... \n");
		
		int i = 0;
		int suma = 0;
		
		while (i <= numar.length()-1) {
			char string_cifra = numar.charAt(i); // aici am folosit ce am facut la cursul 3 - CheckLetter
			int numeric_cifra = string_cifra - '0'; // aici am cautat pe google.. nu stiam sa fac asta
			System.out.println("Cifra " + (i + 1)  + " este: " + numeric_cifra);
			suma = suma + numeric_cifra;
			i++;
		}
		
		System.out.println("\nSuma tuturor cifrelor este: " + suma);
		
		
		// Folosind DoWhile
		
		System.out.println("\nFolosind metoda 'DoWhile' ... \n");

		int j = 0;
		int sumaDoWhile = 0;
		do {
			char string_cifra = numar.charAt(j);
			int numeric_cifra = string_cifra - '0';
			System.out.println("Cifra " + (j + 1)  + " este: " + numeric_cifra);
			sumaDoWhile = sumaDoWhile + numeric_cifra;
			j++;
		}while (j <= numar.length()-1);

		System.out.println("\nSuma tuturor cifrelor este: " + suma);

	}

}

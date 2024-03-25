package curs6;

import java.util.Scanner;

//simulam o retragere de la un bancomat
//avem un sold initial 1500
//intreb userul cat vrea sa retraga si verific daca suma nu este mai mare decat soldul
//daca suma este mai mare ii printez fonduri insuficiente si il rog sa incerce din nou
//la final printez retragere cu succes si noul sold



public class RetragereAtm {

	public static void main(String[] args) {
		
		int sold = 1500;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu suma : ");
		int suma = scan.nextInt();
		
		while (suma > sold || suma <=0) {
			
			if(suma > sold) {
				System.out.println("Fonduri insuficiente!");
			} else {
				System.out.println("Suma invalida!");
			}
			
			System.out.println("Introdu suma: ");
			suma = scan.nextInt();
		}
		
		sold = sold - suma;
		System.out.println("Retragere cu succes! Sold: " + sold);

	}

}

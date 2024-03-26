package curs6;

import java.util.Scanner;

//facem un program care calculeaza salariul pe o saptamana
//intrebam userul cate ore a lucrat
//calculam doar daca a lucrat minim 1 ora sau maxim 40 de ore
//daca introduce numar invalid il rugam sa introduca numar valid de ore
//salariul il calculam cu formula ore lucrate * ratePerHour
//ratePerHour = 25


public class CalculSalariuSaptamanal {

	public static void main(String[] args) {
		
		int ratePerHour = 25;
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu nr de ore:");
		int nrOreLucrate = scan.nextInt();
		
		while(nrOreLucrate < 1 || nrOreLucrate > 40) {
			System.out.println("Nr invalid de ore. Introdu un numar intre 1 si 40");
			System.out.println("Introdu nr de ore valid:");
			nrOreLucrate = scan.nextInt();
		}
		
		int salariu = nrOreLucrate * ratePerHour;
		System.out.println("Salariul tau este: " + salariu);

	}

}

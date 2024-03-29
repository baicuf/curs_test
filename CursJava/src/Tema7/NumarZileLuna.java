package Tema7;

import java.util.Scanner;

//Scriem un program care verifica cate zile are o luna pe care o citim de la tastatura
//Intrebam userul o luna si un an
//Ex: userul cere februarie 2024 à printam 29 zile
//Daca cere februarie 2023 à printam 28 de zile
//Etc
//Tratam toate lunile anului si conform exemplului de mai sus tratam si daca este sau nu an bisect 



public class NumarZileLuna {

	public static void main(String[] args) {
		
		// definim variabilele pe care le vom folosi
		String month;
		int year;
		int isLeap = 0;
		
		// definim metoda scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu luna: ");
		month = scan.next().toLowerCase();
		System.out.println("Te rog introdu anul: ");
		year = scan.nextInt();
		
		// determinam daca este an bisect
		if(year!=0 && year % 4 == 0) {
			isLeap = 1;
		}
		
		System.out.println("----------------- Rezolvare cu switch ---------------------");
		
		switch(month) {
			case "ianuarie" :
			case "martie" :
			case "mai" :
			case "iulie" :
			case "august" :
			case "octombrie" :
			case "decembrie" :
				System.out.println("Luna " + month + " a anului " + year + " are 31 de zile");
				break;
			case "aprilie" :
			case "iunie" :
			case "septembrie" :
			case "noiembrie" :
				System.out.println("Luna " + month + " a anului " + year + " are 30 de zile");
				break;
			case "februarie" :
				switch(isLeap) {
					case 1 :
					System.out.println("Luna " + month + " a anului " + year + " are 29 de zile");
					break;
					case 0 :
					System.out.println("Luna " + month + " a anului " + year + " are 28 de zile");
					break;
				}
				break;
			default: 
				System.out.println("Luna sau Anul au valori invalide!");
	}
		
		System.out.println("----------------- Rezolvare cu array/for/if ---------------------");
		
		int has31 = 0;
		int has30 = 0;
		
		String[] luniCu31 = {
		"ianuarie",
		"martie",
		"mai",
		"iulie",
		"august",
		"octombrie",
		"decembrie"
		};
		
		String[] luniCu30 = {
		"aprilie",
		"iunie",
		"septembrie",
		"noiembrie"
		};
		
        for(int i = 0; i < luniCu31.length; i++) {
            if(month.equals(luniCu31[i])) {
            	has31 = 1;
            } else if (i < luniCu30.length && month.equals(luniCu30[i])) {
            	has30 = 1;	
                }
            }
        
        if(month.equals("februarie") && isLeap == 1) {
        	System.out.println("Luna " + month + " a anului " + year + " are 29 de zile");
        } else if(month.equals("februarie") && isLeap == 0) {
        	System.out.println("Luna " + month + " a anului " + year + " are 28 de zile");
        }
        
        if(has31 == 1) {
        	System.out.println("Luna " + month + " a anului " + year + " are 31 de zile");
        } else if(has30 == 1) {
        	System.out.println("Luna " + month + " a anului " + year + " are 30 de zile");
        } else if(has31 == 0 && has30 == 0 && !month.equals("februarie")){
        	System.out.println("Luna sau Anul au valori invalide!");
        }

	}
}

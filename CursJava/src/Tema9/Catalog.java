package Tema9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalog {

	public static void main(String[] args) {
		
		String nume;
		int nota;
		int notaCatalog = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu numele tau: ");
		nume = scan.next();
		System.out.println("Introdu nota ta: ");
		nota = scan.nextInt();
		
		Map<String, Integer> map = new HashMap<>();

		map.put("Andrei", 10);
		map.put("Bogdan", 9);
		map.put("Costel", 8);
		map.put("Darius", 9);
		
		if(map.containsKey(nume)) {
			notaCatalog = map.get(nume);
			
		}else {
			map.put(nume, nota);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
		}
		
		if(nota <= notaCatalog) {
			System.out.println("Nu ai nevoie de alta nota");
		} else if (nota > notaCatalog) {
			map.replace(nume, nota);
		}
		
		System.out.println(map);
		
		
	}

}

package Tema10;

import java.util.Scanner;

public class CheckVegetable {

	public static void main(String[] args) {
		VegetableProperties obj = new VegetableProperties();
		obj.writePropertiesFile();
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu leguma: ");
		String leguma = scan.next();
		
	    String calorii = obj.readPropertiesFile(leguma);	
		
		try {

		    if (calorii != null) {
		        System.out.println("Leguma aleasa de tine are " + calorii + " calorii.");
		    } else {
		        System.out.println("Nu vindem aceasta leguma!");
		    }
		} catch (Exception e) {
		    System.out.println("A aparut o eroare: " + e.getMessage());
		}
			
		}

	}


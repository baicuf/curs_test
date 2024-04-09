package Tema10;

import java.util.Scanner;

public class CheckVegetableAndAdd {

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
		        System.out.println("Doresti sa adaugam aceasta leguma in aprozarul nostru? (true/false)");
				Scanner scanRaspuns = new Scanner(System.in);
				boolean raspuns = scan.nextBoolean();
					while(raspuns) {
						System.out.println("Introdu numarul de calorii pentru " + leguma);
						Scanner scanCalorii = new Scanner(System.in);
						String caloriiNew = scan.next();
						try {
							Integer.parseInt(caloriiNew);
							obj.updatePropertiesFile(leguma, caloriiNew);
							System.out.println("Leguma: " + leguma + " a fost adaugata cu success!");
							break;
						} catch(NumberFormatException e) {
							System.out.println("Te rugam sa introduci un numar valid de calorii.");
						}
					}
		    }
		} catch (Exception e) {
		    System.out.println("A aparut o eroare: " + e.getMessage());
		}
	}
}
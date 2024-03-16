package Tema3;

import java.util.Scanner;

//Scriem un program care aplica un discount unei facturi.
//Daca factura este mai mare decat 100 aplica un dsicount de 10%
//Daca factura este mai mica decat 100 aplica un discount de 5%
//Printam rezultatul

public class DiscountFactura {
	
	int factura;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter invoice value: ");
		factura = scan.nextInt();
		scan.close();
	}
	
	public void calculateDiscounted() {
	
		askTheUser();
		
	double discounted = (factura > 100) ? (factura*0.9) : (factura*0.95);
	String discount = (factura > 100) ? "Discountul aplicat este 10%" : "Discountul aplicat este 5%";
	System.out.println(discount);
	System.out.println("Factura cu discount-ul aplicat este : " + discounted);
	}

}

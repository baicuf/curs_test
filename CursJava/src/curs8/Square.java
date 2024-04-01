package curs8;

public class Square extends Shape {
	
	String nume = "Cerc";
	String culoare = "Verde";

	public Square(String culoare, String nume) {
		super(culoare, nume);
	}
	
	public Square() {
		
	}
	public void printDetails() {
		System.out.println("Numele este: " + super.nume);
		System.out.println("Culoarea este: " + super.culoare);
	}
	
	public void printNameLenght() {
		System.out.println("Lungime numelui este: " + nume.length());
	}

}

package curs1;
//comentariu pe o singura linie
/*
 * Ceva si dau
 * enter
 */

// Clasele le denumim folosind conventia UpperCamelCase --> ExempluClasa
// metode si variabile folosind conventia lowerCamelCase --> exempluVariabila

public class FirstClass {

	public static void main(String[] args) {
		
		System.out.println("Test");
		FirstClass object = new FirstClass();
		object.greetings();

	}
	
	public void greetings() {
		
		System.out.println("Salut");
	}

}

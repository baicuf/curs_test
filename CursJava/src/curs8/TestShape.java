package curs8;

public class TestShape {

	public static void main(String[] args) {
		Square patrat = new Square("Galben", "Patrat");
		System.out.println(patrat.nume);
		System.out.println(patrat.culoare);
		patrat.printDetails();
		patrat.printNameLenght();
		
		System.out.println("-------------------------");
		
		Square altPatrat = new Square();
		altPatrat.culoare = "Rosu";
		System.out.println(altPatrat.culoare);
		System.out.println(altPatrat.nume);
		altPatrat.printDetails();
		altPatrat.printNameLenght();
	}

}

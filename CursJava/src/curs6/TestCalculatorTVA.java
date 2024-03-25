package curs6;

public class TestCalculatorTVA {

	public static void main(String[] args) {

		CalculatorTVA calc1 = new CalculatorTVA(5);
		CalculatorTVA calc2 = new CalculatorTVA(9);
		CalculatorTVA calc3 = new CalculatorTVA(19);
		
		double rezultat1 = calc1.adunaTVA(70);
		double rezultat2 = calc2.adunaTVA(50.9);
		double rezultat3 = calc3.adunaTVA(170);
		
		System.out.println("Rezultat adunare calc1: " +rezultat1 );
		System.out.println("Rezultat adunare calc2: " +rezultat2 );
		System.out.println("Rezultat adunare calc3: " +rezultat3 );

		
		System.out.println("Contor global : " + CalculatorTVA.getNrTotalDeCalcul());
		
	}

}
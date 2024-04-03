package Tema8;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	
    public Vehicul(String brand, int nivelPoluare, int vitezaMedie) {
        this.brand = brand;
        this.nivelPoluare = nivelPoluare;
        this.vitezaMedie = vitezaMedie;
    }
	
	public String nume() {
		return "Nume generic";
	}

	public String motorizare() {
		return "Motorizare generica";
	}
	
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina " + this.brand + " este : " + this.nivelPoluare + " si viteza medie atinsa este de " + this.vitezaMedie + " km/h" );
	}


}

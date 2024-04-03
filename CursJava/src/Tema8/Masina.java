package Tema8;

public class Masina extends Vehicul {
	
    public Masina(String brand, int nivelPoluare, int vitezaMedie) {
        super(brand, nivelPoluare, vitezaMedie);
    }
    
    @Override
    public String nume() {
        return "Masina";
    }

    @Override
    public String motorizare() {
        return "Motorizare pe benzina";
    }

    @Override
    public void detaliiVehicul() {
        super.detaliiVehicul();
    }
}


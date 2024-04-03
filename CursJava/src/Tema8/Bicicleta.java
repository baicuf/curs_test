package Tema8;

public class Bicicleta extends Vehicul{
	
    public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
        super(brand, nivelPoluare, vitezaMedie);
    }
    
    @Override
    public String nume() {
        return "Bicicleta";
    }

    @Override
    public String motorizare() {
        return "Fara motorizare";
    }

    @Override
    public void detaliiVehicul() {
        super.detaliiVehicul();
    }
}


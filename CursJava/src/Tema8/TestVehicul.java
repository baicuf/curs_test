package Tema8;

public class TestVehicul {

	public static void main(String[] args) {
		
        Vehicul bicicleta = new Bicicleta("Pegas", 0, 20);
        Vehicul masina = new Masina("Dacia", 5, 180);


        verificaMotorizarea(bicicleta);
        verificaMotorizarea(masina);

        bicicleta.detaliiVehicul();
        masina.detaliiVehicul();
    }

    public static void verificaMotorizarea(Vehicul vehicul) {
        System.out.println(vehicul.nume() + " : " + vehicul.motorizare());
    }
}

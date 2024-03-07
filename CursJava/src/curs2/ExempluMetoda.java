package curs2;

public class ExempluMetoda {

	public static void main(String[] args) {
		ExempluMetoda obj = new ExempluMetoda();
		
		int lungime = 5;
		int latime = 3;
		
		//int arieRoom = lungime * latime;
		System.out.println("Arie camera1 : " + obj.calculArie(lungime,  latime));
		
		int lungime2 = 2;
		int latime2 = 3;
		
		int arieRoom2 = lungime2 * latime2;
		System.out.println("Arie camera2 : " + arieRoom2);

	}
	
	
	public int calculArie(int lungime, int latime) {
		int arie = lungime * latime;
		return arie;
	}
	
	public void calculPerimetru (int lungime, int latime) {
		int perimetru = 2 * (lungime + latime);
		System.out.println(perimetru);
		
	}
	


}

package curs7;

public class ForEachExample {

	public static void main(String[] args) {
		
		String[] orase = {"Alba", "Iasi", "Cluj", "Ploiesti", "Oradea"};
	//	index               0       1        2        3          4
		
		for (int i = 0; i<orase.length; i++) {
			System.out.println(orase[i]);
		}
		
		System.out.println("------------------------------------------");
		
		for(String city  : orase) {
			System.out.println(city);
		}

		System.out.println("------------------------------------------");
		int[] numbers = {1, 3, 5, 7, 9};
		for(int nr : numbers) {
			System.out.println(nr);
		}
	}

}

package curs2;

public class TestRoom {

	public static void main(String[] args) {
		
		Room baie = new Room(4, 2);
		System.out.println("Perimetru baie este : " + baie.calculPerimetru());
		System.out.println("Arie baie este : " + baie.calculArie());
		System.out.println("Culoare baie este : " + baie.afiseazaCuloareDreptunghi());
		
		Room birou = new Room(4, 2, "albastru");
		System.out.println("Perimetru birou este : " + birou.calculPerimetru());
		System.out.println("Arie birou este : " + birou.calculArie());
		System.out.println("Culoare birou este : " + birou.afiseazaCuloareDreptunghi());

	}

	
}

package curs9;

//Method overrride - suprascrierea metodei
//- implica relatia de mostenire pentru ca suprascrierea se face in clasa copil(subclasa),
//si presupune scrierea identica a metodei din clasa parinte (superclasa) DAR cu o alta implementare
//- este best practice ca metoda suprascrisa sa aiba adnotarea "@Oevrride"

public class TestWildAnimal {

	public static void main(String[] args) {
		Lion simba = new Lion();
		simba.makeSound(); // metoda suprascrisa
		simba.whereDoesItLive();
		simba.eatMeat();
		
		System.out.println("-----------------------------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound(); //method override
		bambi.whereDoesItLive();
		bambi.eatGrass();

	}

}

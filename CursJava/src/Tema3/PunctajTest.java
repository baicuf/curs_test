package Tema3;

//Scriem un program care intreaba utilizatorul un punctaj.
//Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii
//atribuim FB
//Daca utilizatorul introduce o valoare mai mare sau egala cu 80 ii
//atribuim B
//Daca utilizatorul introduce o valoare mai mica decat 80 ii atribuim S
//Daca a luat calificativ FB printam : “Ai primit : FoarteBine”
//Daca a luat calificativ FB printam : “Ai primit : Bine”
//Daca a luat calificativ FB printam : “Ai primit : Suficient”

import java.util.Scanner;

public class PunctajTest {
	int score;
	String result;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter score value: ");
		score = scan.nextInt();
		scan.close();
	}
	
		public void calculateScore() {
			
			askTheUser();
			
			System.out.println("------ Using IF ------------");
			
			if(score >= 90) {
				result = "FB";
			} else if (score >= 80) {
				result = "B";
			} else {
				result = "S";
			}
			
			if (result == "FB") {
				System.out.println("Ai primit : FoarteBine");
			} else if (result == "B") {
				System.out.println("Ai primit : Bine");
			} else {
				System.out.println("Ai primit : Suficient");
			}
			
			System.out.println("------ Using Ternary Operators ------------");
			
			result = score >=90 ? "FB" : score >= 80 ? "B" : "S";
			String message = result == "FB" ? "Ai primit : FoarteBine" : result == "B" ? "Ai primit : Bine" : "Ai primit : Suficient";
			System.out.println(message);
		}

}

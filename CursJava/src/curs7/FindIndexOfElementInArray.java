package curs7;

public class FindIndexOfElementInArray {
	
	int[] number = {3, 4, 5, 8, 7, 9, 10};
	
//	Vrem sa printam care este elementul si indexul la care se afla
//	ex: elementul 8 se afla la index 3

	public static void main(String[] args) {
		FindIndexOfElementInArray obj = new FindIndexOfElementInArray();
		System.out.println("Rezolvare cu for :");
		obj.rezolvareCuFor(7);
		obj.rezolvareCuForEach(7);
	}
	
	public void rezolvareCuFor(int element) {
		
		for(int i = 0; i<number.length; i++) {
			if(element == number[i]) {
				System.out.println("index pentru element " + element + " este " + i);
			}
		}
	}
	
	public void rezolvareCuForEach(int element) {
		
		int i = 0;
		for (int nr : number) {
			if(element == nr) {
				System.out.println("index pentru element " + element + " este " + i);
			}
			i++;
		}
	}

}

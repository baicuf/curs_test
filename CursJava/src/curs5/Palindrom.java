package curs5;

//palindrom: ex radar

public class Palindrom {

	public static void main(String[] args) {
		
		String cuvant = "radar";
		String cuvantIntors="";
		//cuvantIntors = cuvant.charAt(4)=r
		//cuvantIntors = cuvant.charAt(3)=a
		//cuvantIntors = cuvantIntor + cuvantCharAt(i)
		
		for(int i=cuvant.length()-1;i>=0;i--) {
			
			cuvantIntors = cuvantIntors + cuvant.charAt(i);
			System.out.println(cuvantIntors);
			
		}
		
		if(cuvant.equals(cuvantIntors)) {
			
			System.out.println("Cuvantul este palindrom!");
			
		} else {
			System.out.println("Cuvantul nu este palindrom!");
		}
		

	}

}

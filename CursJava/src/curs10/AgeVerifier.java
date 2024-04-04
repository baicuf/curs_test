package curs10;

public class AgeVerifier throws InvalidAgeException {
	
	public void checkAgeLimit(int age) {
		if(age < 18) {
			throw new InvalidAgeException("Invalid age to proceed!");
		}
	}

}

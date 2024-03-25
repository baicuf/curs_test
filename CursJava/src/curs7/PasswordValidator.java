package curs7;

import java.util.Scanner;

//Facem un program care valideaza o parola pe baza unor reguli:
//1. Parola trebuie sa fie minim 10 chars
//2. Parola trebuie sa contina cel putin un upper case
//3. Parola nu trebuie sa fie la fel ca username
//
//La rulare
//- intrebam utilizatorul un username si o parola
//-- informam care sunt regulile parolei
//
//Daca parola este valida atunci printam parola valida
//Daca nu, il informam care dintre reguli nu au fost respectate
//si il tinem in loop pana ce parola este valida.

public class PasswordValidator {
	
	Scanner scan = new Scanner(System.in);
	String username;
	String password;
	boolean isInvalid;
	
	public void PrintPasswordRules() {
		System.out.println("Regulile parolei sunt: ");
		System.out.println("Parola trebuie sa fie minim 10 chars!");
		System.out.println("Parola trebuie sa contina cel putin un upper case!");
		System.out.println("Parola nu trebuie sa fie la fel ca username!");
	}
	
	public void getUsername() {
		System.out.println("Introdu un username: ");
		username = scan.next();
	}
	
	public void getPassword() {
		System.out.println("Introdu password: ");
		password = scan.next();
	}
	
	public void checkPasswordRules() {
		
		isInvalid = false;
		
		if(password.length() < 10) {
			System.out.println("Parola trebuie sa fie minim 10 chars!");
			isInvalid = true;
		}
		
		if(password.equals(password.toLowerCase())) {
			System.out.println("Parola trebuie sa contina cel putin un upper case!");
			isInvalid = true;
		}
		
		if(password.equals(username)) {
			System.out.println("Parola nu trebuie sa fie la fel ca username!");
			isInvalid = true;
		}
	}
		
	public void validatePassword() {
		
		do {
			getPassword();
			checkPasswordRules();
			
		}while(isInvalid);
		
		System.out.println("Parola valida!");
		
	}
		

}

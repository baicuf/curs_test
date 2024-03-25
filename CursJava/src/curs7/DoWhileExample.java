package curs7;

import java.util.Scanner;

//intrebam un username
//validam ca nu este null si ca nu este mai mic de 6

public class DoWhileExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Rezolvare cu while: ");
		System.out.println("Introdu un username: ");
		String username = scan.next();
		
		while(username.equals(null) || username.length()<6 ) {
			System.out.println("Introdu un username: ");
			username = scan.next();
		}
		
		System.out.println("----------Rezolvarea potrivita -------------------");
		System.out.println("Rezolvare cu do while: ");
		String username2;
		do {
			System.out.println("Introdu un username: ");
			username2 = scan.next();
			
		} while(username2.equals(null) || username2.length()<6 );
	}

}

package curs11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		set.add("alb");
		set.add("mov");
		set.add("rosu");
		set.add("negru");
		set.add("galben");
		set.add("roz");
		
		for(String culoare : set) {
			System.out.println(culoare);
		}
		
		System.out.println(set);
		System.out.println(set.size());
		set.add("rosu");
		System.out.println(set.size());
		System.out.println(set);
		//set nu permite duplicate, in cazul in care se incearca se ignora adaugarea
		
		System.out.println(set.contains("verde"));
		System.out.println(set.contains("mov"));
		set.add("Rosu");
		
		System.out.println("----------------");
		set.remove("Rosu");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
	}

}

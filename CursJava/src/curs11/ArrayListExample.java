package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
//		ArrayList<String> list = newArrayList<>();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Oana");
		list.add("Ion");
		list.add("Gabriel");
		list.add("Maria");

		System.out.println(list.size());
		System.out.println(list.isEmpty());
		// (Oana, Ion, Gabriel, Maria)
		//   0     1      2       3
		System.out.println("---------------------------");
		
		System.out.println("get element: " + list.get(0));
		
		System.out.println("---------------------------");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("---------------------------");
		
		list.add("Ioana");
		// (Oana, Ion, Gabriel, Maria, Ioana)
		//   0     1      2       3      4
		System.out.println(list);
		
		list.add(2, "Carmen");
		System.out.println(list);
		// (Oana, Ion, Carmen, Gabriel, Maria, Ioana)
		//   0     1      2       3      4       5
		
		System.out.println("---------------------------");
		System.out.println(list.size());
		
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list);
		
		list.remove("Gabriel");
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("---------------------------");

		list.add("Maria");
		System.out.println(list);
		System.out.println(list.size());

		list.remove("Maria"); //sterge primul element din lista
		// (Oana, Ion, Carmen, Gabriel, Ioana, Maria)
		//   0     1      2       3      4       5
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("---------------------------");

		System.out.println(list.subList(0, 3));
		
		System.out.println("---------------------------");
		
		System.out.println(list.contains("Alina"));
		System.out.println(list.contains("Carmen"));
		System.out.println(list.indexOf("Ioana"));
		
		System.out.println("---------------------------");
		System.out.println(list);
		// (Ion, Carmen, Ioana, Maria)
		//   0     1      2       3   
		list.set(2, "Marian");
		System.out.println(list);
		// (Ion, Carmen, Marian, Maria)
		//   0     1      2       3  

	}

}

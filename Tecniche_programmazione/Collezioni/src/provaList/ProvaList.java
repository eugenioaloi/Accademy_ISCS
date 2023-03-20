package provaList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProvaList {
	public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<>();
		
		hash.add("c");
		hash.add("a");
		hash.add("b");
		hash.add("b");
		
		System.out.println(hash);
		
		for (String s: hash) {
			System.out.println(s);
		}
		
		Iterator it = hash.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		hash.forEach(s->System.out.println(s));
		
		hash.forEach(System.out::println);
		
		System.out.println(hash.size());
		
		for(String s:hash) {
			if(s.equals("a")) {
				System.out.println(" trovato");
			}else {
				System.out.println("non trovato");
			}
		}
		
		System.out.println(hash.contains("a"));
		
		hash.remove("b");
		
		System.out.println(hash);
		
		hash.clear();//svuoto l'hashset
		
		//******************************
		
		HashSet<Integer> numeri = new HashSet<>();
		numeri.add(4);
		numeri.add(7);
		numeri.add(8);
		
		for(Integer numero:numeri) {
			System.out.println(numero);
		}
		
		//********** Array as list **********
		
		String [] arrS = {"cane","gatto","topo","cane"};
		
		Set<String> arrNoDup = new HashSet(Arrays.asList(arrS));
		System.out.println(arrNoDup);
		
		//******************** Il treeset è sempre ordinato
		
		TreeSet ts = new TreeSet();
		
		ts.add(9);
		ts.add(1);
		ts.add(4);
		ts.add(15);
		ts.add(7);
		
		System.out.println(ts);
		
	}//main
}//classe

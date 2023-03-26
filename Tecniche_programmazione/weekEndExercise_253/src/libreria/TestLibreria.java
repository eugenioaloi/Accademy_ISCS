package libreria;

import java.util.ArrayList;

public class TestLibreria {
	
	public static void main(String[] args) {
		
		Libro l1 = new Libro("abc", "Pippo", 10.0);
		Libro l2 = new Libro("123", "Paperino", 15.0);
		Libro l3 = new Libro("zxy", "Pluto", 20.0);
		Libro l4 = new Libro("Java per principianti", "Pippo", 25.0);
		
		ArrayList<Libro> scaffale = new ArrayList<>();
		
		scaffale.add(l1);
		scaffale.add(l2);
		scaffale.add(l3);
		scaffale.add(l4);
		
		Libreria libre = new Libreria();
		
		libre.trova("Pippo", scaffale);
		
	}
	
}

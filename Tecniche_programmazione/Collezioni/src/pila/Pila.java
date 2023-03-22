package pila;

import java.util.Stack;

public class Pila {
	
	public static void main(String[] args) {
		
		//LIFO last in, first out
		Stack st = new Stack<>();
		st.push(1);//aggiunge elementi sopra la pila
		st.push("cane");
		st.push(true);
		st.push(4.5);//l'ultimo elemento inserito è quello in cima
		
		System.out.println(st.peek());//ritorna l'elemento in cima alla lista -4.5
		
		st.push("ciao");
		System.out.println(st.peek());//-ciao
		
		System.out.println(st.size());//dimensione dello stack
		
		System.out.println(st);//stampa dello stack
		
		//si può stampare anche con un ciclo for
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
		
		System.out.println("l'elemento 1 è in posizione " + st.search(1)+ " e vale " );
				//st.get(1));//-1 se non trovato -> controllare il metodo st.get
		
		System.out.println(st.empty());//controlla se lo stack è vuoto o meno
		
		st.pop();//elimina un elemento dalla cima della lista
		
		// st.clear();//cancella tutto
		
		
		
		
		
		
		
		
		
	}
}

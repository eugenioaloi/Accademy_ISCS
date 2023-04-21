package arrayGenerico;

import java.util.ArrayList;

public class ArrayGenerico<E> {

	private ArrayList<E> lista;

	public ArrayGenerico() {
		this.lista = new ArrayList();
	}
	
	public void add(E generico){
		lista.add(generico);
	}
	
	public void remove(int num) {
		lista.remove(num);
	}
	
	public E get(int num) {
		return lista.get(num);
	}
	
	public int size() {
		return lista.size();
	}
	
	public boolean isEmpty() {
		return lista.size()==0;
	}
	
	@Override
	public String toString() {
		String s ="";
		
		for(E el:lista) {
			s+=el;
		}
		return s;
	}
	
}

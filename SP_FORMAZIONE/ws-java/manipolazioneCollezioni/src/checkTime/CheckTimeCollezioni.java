package checkTime;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CheckTimeCollezioni {
	
	public static void main(String[] args) {
		
		CheckTimeCollezioni test = new CheckTimeCollezioni();
		
		test.run();
		
	}
	
	private void run() {
		
		LinkedList<Integer> LinkedListNumeri = new LinkedList<>();
		
		long inizioLinked = System.nanoTime();
		
		
		for (int i = 0; i < 20_000; i++) {
			LinkedListNumeri.add(i);
		}
		
		long time1 = (System.nanoTime()-inizioLinked)/10_000;
		
		
		List<Integer> ArrayListNumeri = new ArrayList<>();
		
		long inizioArrayList = System.nanoTime();
		
		for (int i = 0; i < 20_000; i++) {
			ArrayListNumeri.add(i);
		}
		
		
		long time2 = (System.nanoTime()-inizioArrayList)/10_000;
		
		System.out.println("Il programma con La linkedList ha impiegato " + time1 + "ms");
		
		System.out.println("Il programma  con l'Arraylist ha impiegato " + time2 + " ms");	
		
		String msg = time1<time2?"linkedlist + veloce":"arraylist + veloce";
		
		System.out.println(msg);
		
	}
}

package exercise3;

import java.util.Random;

public class FibonacciSeq {
	
	public static void main(String[] args) {

		//fibonacci da 0 a numero casuale (1-20)
		Random r = new Random();
		int limite = r.nextInt(1,20);
		
		//il primo termine noto è 0
	    int primo = 0;
	    
	    //il secondo termine noto è 1
	    int secondo = 1;
	    
	    //stampa dei numeri stampati nella sequenza
	    System.out.println("Serie Fib -> " + limite + " termini:");

	    
	    for (int i = 1; i <= limite; ++i) {
	      System.out.print(primo + ", ");
	      
	      //numero sucessivo alla sequenza
	      int prossimo = primo + secondo;
	      
	      //salto di una posizione
	      primo = secondo;
	      
	      //salto di una posizione in avanti valorizzata a prossimo
	      secondo = prossimo;
	    }
		
	}//main
}//class

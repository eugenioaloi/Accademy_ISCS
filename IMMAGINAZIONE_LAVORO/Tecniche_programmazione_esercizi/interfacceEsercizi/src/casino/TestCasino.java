package casino;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCasino {
	public static void main(String[] args) {
		

		Lanciabile[] lanci = {new Moneta(), new Moneta(),new Dado(), new Dado()};
		
		Arrays.asList(lanci);
		
		ArrayList<Integer> risultati = new ArrayList<>();
		
		for(Lanciabile lancio : lanci) {
			risultati.add(lancio.lancia());
			System.out.println(lancio);
		}
		
		check(risultati);
		
	}
	static void check(ArrayList<Integer> arrInt) {
		if(arrInt.get(0)== 0 && arrInt.get(1)==0 ||
				arrInt.get(2)==6 && arrInt.get(3) ==6) 
		{
			System.out.println("Hai vinto, complimenti");
		}else {
			System.out.println("Hai perso, mi dispiace");
		}
		
	}
	
}

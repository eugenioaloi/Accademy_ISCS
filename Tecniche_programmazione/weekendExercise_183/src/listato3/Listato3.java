package listato3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Listato3 {
	public static void main(String[] args) {
	//Creare un array di 10 numeri casuali da 1 a 10. Visualizzare i valori degli array senza duplicati.
	//Output: {2 6 10 8 10 10 4 5 5 5} ris [2,6,10,8,4,5]
		
		Random r = new Random();
		
		//***** METODO 1: utilizzare uno stream con la classe Arrays *****
		
		int [] arrNum = new int[10];
		
		for(int i=0;i<arrNum.length;i++) {
			arrNum[i] = r.nextInt(1,11);
		}
		
		System.out.println(Arrays.toString(arrNum));
		
		int[] noDuplArr = Arrays.stream(arrNum).distinct().toArray(); //utilizzo dello stream
		System.out.println(Arrays.toString(noDuplArr));//stampa dell'arr senza duplicati
		
		
		//***** METODO 2: utilizzare un set che non prevede duplicati *****
		
		Set<Integer> setNum = new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
			int num = r.nextInt(1,11);
			setNum.add(num);
			System.out.print(num + ", ");
		}
		
		System.out.println("\n Con l'utilizzo di Set:" + setNum);
		
	}
}

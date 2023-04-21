package exercise5;

import java.util.Arrays;
import java.util.Random;

public class Listato2 {
	
	static int checkArr(int a) {
		int [] arr = new int[10];
		Random r = new Random();
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(21);
		}
		
		System.out.println(Arrays.toString(arr));
		
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==a){
				pos = i;
				break;
			}else {
				pos = -1;
			}
		}
		return pos;
	}
	
	public static void main(String[] args) {
		//input arr di 10 num casuali da 0 a 20 ed un num intero
		//il metodo restituisce la posizione dell'arr del numero intero
		//se il numero non è presente restituire -1
		
		int numMagico = 1;
		System.out.println("numero magico: " + numMagico);
		System.out.println("numero magico trovato alla pos: " + checkArr(numMagico));
		
	}

}

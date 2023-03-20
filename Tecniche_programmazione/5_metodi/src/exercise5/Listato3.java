package exercise5;

import java.util.Arrays;

public class Listato3 {
	
	static int[] checkArr(int [] a1,int [] a2) {
		int[] arrConcat = new int[a1.length+a2.length];
		
		if(a1.length==a2.length) {
			int count = 0;
			for(int i=0;i<a1.length;i++) {
				arrConcat[count] = a1[i];
				count++;//0,2, etc
				arrConcat[count] = a2[i];
				count++;//1,3, etc
			}
			return arrConcat;
		}else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		//creare un metodo in grado di accettare due arr = a1,a2 di uguale lunghezza
		//restituire un nuovo arr con gli elementi in seq= a1[0],a2[1],a1[2],a2[3]etc
		//se i due arr non sono di uguale lunghezza, restituire null;
		
		int [] a1  = {1,2,3};
		int [] a2  = {4,5,6};
		
		int [] arrConc = checkArr(a1 , a2);
		System.out.println(Arrays.toString(arrConc));
		
	}
}

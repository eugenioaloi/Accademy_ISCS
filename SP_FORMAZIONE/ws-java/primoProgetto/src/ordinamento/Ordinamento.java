package ordinamento;

import java.util.Arrays;

public class Ordinamento {
	public static void main(String[] args) {
		
		int [] numeri = {8,7,9,2,3,1,5,4};
		
		OrdinaArray.ordinaArray(numeri);
		
		System.out.println(Arrays.toString(numeri));
	}
}

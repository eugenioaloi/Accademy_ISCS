package cercaNumero;

public class CercaNumero {
	
public static void main(String[] args) {
		
		int [] num = {1, 2, 3, 4, 5, 7, 8, 9};
		
		int numMagico = 7;

		boolean trovato = ricercaBinaria(num,numMagico);

		System.out.println(trovato ? "numero trovato " : "numero non trovato");
	}	

	public static boolean ricercaBinaria(int[] arr, int target) {
		boolean trovato = false;
		int basso= 0;
		int alto = arr.length-1;
		
		while(basso<=alto) {
			int meta = basso + (alto-basso)/2;
			int elemento = arr[meta];
			
			if(elemento<target) {
				basso = meta+1; 
			}else if(elemento>target) {
				alto = meta-1;
			}else {
				trovato = true;
				break;
			}
		}
		return trovato;
	}

}

package ricercaInterpolata;

public class RicercaInterpolata {
	
	/** Ricerca interpolata = implementazione della ricerca binaria per strutture dati uniformi.  Indovina dove il valore 
	potrebbe essere in base alla ricerca fatta ogni singola volta.
	Se la prima ricerca è sbagliata, l'area di ricerca viene rimpicciolita e viene fatta una nuova ricerca fino 
	a che non trova l'elemento **/
	
	
	public static void main(String[] args) {
		
    	int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    	int numSegreto = 8;
    	
    	int index = ricercaInterpolata(arr, numSegreto);
    	
    	if(index != -1) {
    		System.out.println("elemento trovato all'indice: "+ index);
    	}
    	else {
    		System.out.println("elemento non trovato");
    	}
    }

	private static int ricercaInterpolata(int[] arr, int value) {
		
		int alto = arr.length - 1;
		int basso = 0;
		
		while(value >= arr[basso] && value <= arr[alto] && basso <= alto) {
			
			int ricerca = basso + (alto - basso) * (value - arr[basso]) / 
					    (arr[alto] - arr[basso]);
			
			if(arr[ricerca] == value) {
				return ricerca;
			}
			else if(arr[ricerca] < value) {
				basso = ricerca + 1;
			}
			else {
				alto = ricerca -1;
			}
		}
		
		return -1;
	}
}


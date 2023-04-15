package selectionSort;

public class SelectionSort {
	/* Selection sort = cerca in un array e tiene traccia in ogni iterazione del valore minimo.
	 * alla fine scambia le variabili alla fine di ogni iterazione
	 * Algoritmo poco performante con data set grandi
	 * */
	
	public static void main(String[] args) {
		
		int arr []= {8,7,9,2,3,1,5,4,6};
		
		selectionSort(arr);
		
		for (int n: arr) {
			System.out.print(n);
		}
			
		
	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int posMin = i;
			for (int j = i+1; j< arr.length-1; j++) {
				if(arr[posMin]>arr[j]) {//basta cambiare il verso per cambiare l'ordine da asc a desc
					posMin = j;
					
				}
			}
			int temp = arr[i];
			arr[i] = arr[posMin];
			arr[posMin] = temp;
		}
	}
}

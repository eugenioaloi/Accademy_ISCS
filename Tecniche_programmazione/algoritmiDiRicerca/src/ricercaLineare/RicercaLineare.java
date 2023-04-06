package ricercaLineare;

public class RicercaLineare {
	//iterazione sulla collezione un elemento alla volta
	
	//complessità: O(n)
	//Svantaggi: lento per un data set grande
	//Vantaggi: - veloce per data set piccoli - non ha bisogno di essere ordinato
	
	public static void main(String[] args) {
		
		
		int arr[] = {9,1,8,2,7,3,6,4,5};
		int index = cercaLineare(arr, 7);
		
		String msg = index!=-1 ? "Trovato all'indice " + index : "Non trovato";
		System.out.println(msg);//trovato all'indice 4
		
	}
	

	private static int cercaLineare(int[] arr, int num) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}

}

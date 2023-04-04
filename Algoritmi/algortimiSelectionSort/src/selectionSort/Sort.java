package selectionSort;

public class Sort {
	
	//per ogni el dell'array i, trova il minimo nei sucessivi i+1 el
	//scambia il min trovato con l'elemento i
	
	public void selSort(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min].compareTo(arr[j])>0) {//restituisce -1 se lessicamente la stringa confrontata precede l'altra
					min = j;
				}
			}
			String s = arr[i];
			arr[i] = arr[min];
			arr[min] = s;
		}
	}

}
